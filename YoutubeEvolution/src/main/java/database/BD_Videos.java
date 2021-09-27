package database;
import java.sql.Date;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.TreeMap;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import com.vaadin.ui.TextArea;

public class BD_Videos {
	public BD_general _bd_PrincipalVideos;
	public Vector<Videos> _contieneVideo = new Vector<Videos>();

	
	public List<Videos> Cargar_Videos_Megusta() throws PersistentException {
		
		ArrayList<Videos> listaVideos= new ArrayList<Videos>();
		TreeMap<Integer, Videos> treemap = new TreeMap();
		PersistentTransaction transaccion = ProyectoMDSPersistentManager.instance().getSession().beginTransaction();
		try {
			for(Videos video :VideosDAO.listVideosByQuery(null, null)) {
				if(video.usuarios_que_dan_me_gusta!=null)
				treemap.put(video.usuarios_que_dan_me_gusta.size(), video);
				else
					treemap.put(0,video);
			}
			for(Videos video : treemap.values()) {
				listaVideos.add(video);
			}
			transaccion.commit();
		} catch(Exception e) {
			transaccion.rollback();			
		}
		return listaVideos;
	}
	
	public List<Videos> Cargar_Videos_Recientes() throws PersistentException {
		List<Videos> listaVideos=null;
		PersistentTransaction transaccion = ProyectoMDSPersistentManager.instance().getSession().beginTransaction();
		try {
			
			listaVideos =VideosDAO.queryVideos("fecha LIKE '%"+Calendar.MONTH+"%'", null);
			transaccion.commit();
		} catch(Exception e) {
			transaccion.rollback();			
		}
		return listaVideos;
	}

	@SuppressWarnings("unchecked")
	public List<Videos> Cargar_Videos_Relacionados(int aIDUsuario) throws PersistentException {
		List<Videos> listaVideos= new ArrayList<Videos>();
		List<Categorias> listaCategorias = new ArrayList<Categorias>();
		PersistentTransaction transaccion = ProyectoMDSPersistentManager.instance().getSession().beginTransaction();
		try {
		  Usuario_registrado user= Usuario_registradoDAO.loadUsuario_registradoByQuery("ID = "+aIDUsuario, "1");
		  for(Videos videosLike : user.videos_que_gustan.toArray()) {
			  if(!listaCategorias.contains(videosLike.getCategoria()))
			  listaCategorias.add(videosLike.getCategoria());
		  }
		  
		  for(Categorias cat : listaCategorias) {
			  for(Videos video : cat.videos.toArray()) {
				  if(!listaVideos.contains(video))
					  listaVideos.add(video);
			  }
		  }
	      transaccion.commit();
		} catch(Exception e) {
			transaccion.rollback();			
		}
		return listaVideos;
	}

	@SuppressWarnings("unchecked")
	public List<Videos> Cargar_Videos_Suscripciones(int aIDUsuario) throws PersistentException {
		List<Videos> listaVideos= new ArrayList<Videos>();
		PersistentTransaction transaccion = ProyectoMDSPersistentManager.instance().getSession().beginTransaction();
		try {
		  Usuario_registrado user= Usuario_registradoDAO.loadUsuario_registradoByQuery("ID = "+aIDUsuario, "1");
		  for(Usuario_registrado suscritoA : user.suscrito.toArray()) {
			  for(Videos video : suscritoA.video_subido.toArray()) {
				  listaVideos.add(video);
			  }
		  }
	     transaccion.commit();
		} catch(Exception e) {
			transaccion.rollback();			
		}
		return listaVideos;
	}

	public void subir_video(String aTitulo, String aMiniatura,String aContenido, int idAutor, boolean aDeshabilitar_comentarios, TextArea aDescripcion, String aEtiquetas, String categoria, int lista) throws PersistentException {
		
		//VideosCriteria vc = new VideosCriteria();
		//El titulo era unico?
		//En ese caso realizar vc
		/*vc.titulo.eq(aTitulo);
		if(vc.uniqueVideos()!=null) {
			throw new RuntimeException("Titulo en uso");
		}
		*/
		PersistentTransaction transaccion = ProyectoMDSPersistentManager.instance().getSession().beginTransaction();
		try {
			
		Videos vid = database.VideosDAO.createVideos();

		Categorias categ = database.CategoriasDAO.loadCategoriasByQuery("nombre = '"+categoria+"'", "1");
		Listas_de_reproduccion list = database.Listas_de_reproduccionDAO.loadListas_de_reproduccionByQuery("id_lista = "+lista, "1");
		Usuario_registrado autor = database.Usuario_registradoDAO.loadUsuario_registradoByQuery("ID = " +idAutor, "1");
		vid.setTitulo(aTitulo);
		vid.setMiniatura(aMiniatura);
		vid.setAutor(autor);
		vid.setDescrVideo(aDescripcion.getValue());
		vid.setContenidoVideo(aContenido);
		vid.setEtiquetas(aEtiquetas);
		Calendar fecha = Calendar.getInstance();
        String año = fecha.get(Calendar.DAY_OF_MONTH)+"-"+fecha.get(Calendar.MONTH)+"-"+fecha.get(Calendar.YEAR);
		vid.setFecha(año);
		vid.setCategoria(categ);
		vid.listas_de_videos.add(list);
		vid.setNumVisualizaciones(0);
		VideosDAO.save(vid);
		categ.videos.add(vid);
		CategoriasDAO.save(categ);
		autor.video_subido.add(vid);
		Usuario_registradoDAO.save(autor);
		transaccion.commit();
		
		}catch(Exception e) {
			transaccion.rollback();
			e.printStackTrace();
		}
	    
	}

	public void Eliminar_video(int aID) throws PersistentException {
		PersistentTransaction transaccion = ProyectoMDSPersistentManager.instance().getSession().beginTransaction();
		try {
			Videos vid = database.VideosDAO.loadVideosByQuery("id_video = "+aID, "1");
			VideosDAO.delete(vid);
			transaccion.commit();
		}catch(Exception e) {
			transaccion.rollback();
			
		}
	}

	public void descargar(int aID) throws PersistentException{
		PersistentTransaction transaccion = ProyectoMDSPersistentManager.instance().getSession().beginTransaction();
		try{
			Videos video = VideosDAO.loadVideosByQuery("id_video = "+aID, "1");
			String url = "C:\\Users\\Zéin\\git\\EvolutionMDS\\Descargas";
			  File source = new File(video.getContenidoVideo());
		      File dest = new File(url + video.getTitulo().replaceAll("\\s+","") +".mp4");
		      Files.copy(source.toPath(),dest.toPath());
			transaccion.commit();
		}catch(PersistentException e) {
			e.printStackTrace();
			transaccion.rollback();
		} catch (IOException e) {
			e.printStackTrace();
			transaccion.rollback();
		}
	}
		
	public List<String> ver_etiquetas(int IDvideo) throws PersistentException {
		PersistentTransaction transaccion = ProyectoMDSPersistentManager.instance().getSession().beginTransaction();
		ArrayList<String> etq = new ArrayList<String>();
		try {
			Videos video = VideosDAO.loadVideosByQuery("id_video = "+IDvideo, "1");
			String[] etiquetas = video.getEtiquetas().split(",");
			for(String foo : etiquetas) {
				etq.add(foo);
			}
			transaccion.commit();
		}catch(Exception e) {
			transaccion.rollback();
			e.printStackTrace();
		}
		return etq;
	}

	public void me_gusta(int aIDvideo, int aIDusuario) throws PersistentException {
		PersistentTransaction transaccion = ProyectoMDSPersistentManager.instance().getSession().beginTransaction();
		try{
			Usuario_registrado user = Usuario_registradoDAO.loadUsuario_registradoByQuery("ID = "+aIDusuario, "1");
			Videos vid = VideosDAO.loadVideosByQuery("id_video = "+aIDvideo , "1");
			if(user.videos_que_gustan.contains(vid)&&vid.usuarios_que_dan_me_gusta.contains(user)) {
				user.video_visualizado.remove(vid);
				vid.usuarios_que_dan_me_gusta.remove(user);
			}else {
			user.videos_que_gustan.add(vid);
			vid.usuarios_que_dan_me_gusta.add(user);
			}
			VideosDAO.save(vid);
			Usuario_registradoDAO.save(user);
			transaccion.commit();
		}catch(Exception e) {
			transaccion.rollback();
			e.printStackTrace();
		}
	}

	public List<Videos> buscar(String aTexto) throws PersistentException {
		PersistentTransaction transaccion = ProyectoMDSPersistentManager.instance().getSession().beginTransaction();
		ArrayList<Videos> lista = new ArrayList<Videos>();
		try {
			Videos[] listaVideos = VideosDAO.listVideosByQuery("titulo LIKE '%"+aTexto+"%'", "1");
			for(Videos vid : listaVideos) {
				lista.add(vid);
		}
			transaccion.commit();
		}catch(Exception e) {
			transaccion.rollback();
			e.printStackTrace();
		}
		return lista;
	}
	public List<Videos> buscarPorCategoria(String aTexto) throws PersistentException {
		PersistentTransaction transaccion = ProyectoMDSPersistentManager.instance().getSession().beginTransaction();
		ArrayList<Videos> lista = new ArrayList<Videos>();
		try {
			Videos[] listaVideos = VideosDAO.listVideosByQuery(null,null);
			for(Videos vid : listaVideos) {
				if(vid.getCategoria().getNombre().equals(aTexto))
				lista.add(vid);
		}
			transaccion.commit();
		}catch(Exception e) {
			transaccion.rollback();
			e.printStackTrace();
		}
		return lista;
	}
	public List<Videos> buscarPorEtiqueta(String aTexto) throws PersistentException {
		PersistentTransaction transaccion = ProyectoMDSPersistentManager.instance().getSession().beginTransaction();
		ArrayList<Videos> lista = new ArrayList<Videos>();
		try {
			Videos[] listaVideos = VideosDAO.listVideosByQuery(null,null);
			for(Videos vid : listaVideos) {
				if(vid.getEtiquetas().contains(aTexto))
				lista.add(vid);
		}
			transaccion.commit();
		}catch(Exception e) {
			transaccion.rollback();
			e.printStackTrace();
		}
		return lista;
	}

	public List<Videos> cargar_Videos_Subidos(int aIDUsuario) throws PersistentException {
		PersistentTransaction transaccion = ProyectoMDSPersistentManager.instance().getSession().beginTransaction();
		ArrayList<Videos> lista = new ArrayList<Videos>();
		try {
			Usuario_registrado user = Usuario_registradoDAO.loadUsuario_registradoByQuery("ID = "+aIDUsuario, "1");
			for(Videos video : user.video_subido.toArray()) {
				lista.add(video);
			}
			transaccion.commit();
		}catch(Exception e) {
			transaccion.rollback();
			e.printStackTrace();
		}
		
		return lista;
	}
	//Mismo metodo que el de arriba?
	public List<Videos> cargar_Gestion_Videos_Subidos(int aIDUsuario) throws PersistentException {
		PersistentTransaction transaccion = ProyectoMDSPersistentManager.instance().getSession().beginTransaction();
		ArrayList<Videos> lista = new ArrayList<Videos>();
		try {
			Usuario_registrado user = Usuario_registradoDAO.loadUsuario_registradoByQuery("ID = "+aIDUsuario, "1");
			for(Videos video : user.video_subido.toArray()) {
				lista.add(video);
			}
			transaccion.commit();
		}catch(Exception e) {
			transaccion.rollback();
			e.printStackTrace();
		}
		return lista;
	}

	public void modificar_video(int aIDVideo, String aTitulo, String aDescripcion, String categoria, String aEtiquetas) throws PersistentException {
		PersistentTransaction transaccion = ProyectoMDSPersistentManager.instance().getSession().beginTransaction();
		try {
			Videos video = VideosDAO.loadVideosByQuery("id_video = "+aIDVideo, "1");
			video.setTitulo(aTitulo);
			video.setDescrVideo(aDescripcion);
			video.setCategoria(CategoriasDAO.loadCategoriasByQuery("nombre = '"+categoria+"'",null));
			video.setEtiquetas(aEtiquetas);
			VideosDAO.save(video);
			transaccion.commit();
		}catch(Exception e ) {
			e.printStackTrace();
			transaccion.rollback();
		}
	}

	public void eliminarVideo(int aIDVideo) throws PersistentException {
		PersistentTransaction transaccion = ProyectoMDSPersistentManager.instance().getSession().beginTransaction();
		try {
			Videos video = VideosDAO.loadVideosByQuery("id_video = "+aIDVideo,"1");
			VideosDAO.delete(video);
			transaccion.commit();
		}catch(Exception e) {
			transaccion.rollback();
			e.printStackTrace();
		}
	}

	public void editar_Miniatura(int aIDVideo, String miniatura) throws PersistentException {
		PersistentTransaction transaccion = ProyectoMDSPersistentManager.instance().getSession().beginTransaction();
		try {
			Videos video = VideosDAO.loadVideosByQuery("id_video = "+aIDVideo, "1");
			video.setMiniatura(miniatura);
			VideosDAO.save(video);
			transaccion.commit();
		}catch(Exception e ) {
			e.printStackTrace();
			transaccion.rollback();
		}
	}
	public boolean getSiVideoMeGusta(int idVideo, int idUsuario) throws PersistentException {
		PersistentTransaction transaccion = ProyectoMDSPersistentManager.instance().getSession().beginTransaction();
		try {
			Usuario_registrado user = Usuario_registradoDAO.loadUsuario_registradoByQuery("ID = "+idUsuario, "1");
			Videos video = VideosDAO.loadVideosByQuery("id_video = "+idVideo, "1");
			if(user.videos_que_gustan.contains(video)) {
				transaccion.commit();
				return true;
			}else {
				transaccion.commit();
				return false;
			}
		}catch(PersistentException e) {
			transaccion.rollback();
			e.printStackTrace();
			return false;
		}
	}
	/**
	 * Comprueba si hay videos en la bd
	 * @return
	 * @throws PersistentException 
	 */
	@SuppressWarnings("unchecked")
	public boolean compruebaVideos() throws PersistentException {
		PersistentTransaction transaccion = ProyectoMDSPersistentManager.instance().getSession().beginTransaction();
		boolean boo = false;
		try {
			List<Usuario_registrado> users = Usuario_registradoDAO.queryUsuario_registrado(null,null);
			for(Usuario_registrado foo : users) {
				if(!foo.video_subido.isEmpty()) {
					boo = true;
					break;
				}
			}
			transaccion.commit();
			return boo;
		}catch(PersistentException e) {
			transaccion.rollback();
			e.printStackTrace();
			return boo;
		}
	}
 	public boolean tienenVideosSuscrito(int idUsuario) throws PersistentException {
		PersistentTransaction transaccion = ProyectoMDSPersistentManager.instance().getSession().beginTransaction();
		boolean boo = false;
		try {
			Usuario_registrado user = Usuario_registradoDAO.loadUsuario_registradoByQuery("ID = "+idUsuario, "1");
			
			for(Usuario_registrado foo : user.suscrito.toArray()) {
				if(!foo.video_subido.isEmpty()) {
					boo = true;
					break;
				}
			}
			transaccion.commit();
			return boo;
		}catch(PersistentException e) {
			transaccion.rollback();
			e.printStackTrace();
			return boo;
		}
	}
}