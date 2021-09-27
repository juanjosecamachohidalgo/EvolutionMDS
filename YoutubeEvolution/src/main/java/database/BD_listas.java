package database;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

public class BD_listas {
	public BD_general _bd_PrincipalListas;
	public Vector<Listas_de_reproduccion> _contieneListas = new Vector<Listas_de_reproduccion>();

	public void aniade_a_lista(int IDusuario, int aIDvideo, int aIDlista) throws PersistentException {
		PersistentTransaction transaccion = ProyectoMDSPersistentManager.instance().getSession().beginTransaction();
		try {
			Usuario_registrado user = Usuario_registradoDAO.loadUsuario_registradoByQuery("ID = "+IDusuario,"1");
			Videos video = VideosDAO.loadVideosByQuery("id_video = "+aIDvideo, "1");
			for(Listas_de_reproduccion lista : user.listas_de_reproduccion.toArray()) {
				if(lista.getId_lista()==aIDlista) {
					lista.videos_en_lista.add(video);
					Listas_de_reproduccionDAO.save(lista);
					break;
				}
			}
			transaccion.commit();
		}catch(Exception e ) {
			transaccion.rollback();
			e.printStackTrace();
		}
	}
	public void crearListaReproduccion (int idUsuario, String nombre) throws PersistentException {
		PersistentTransaction transaccion = ProyectoMDSPersistentManager.instance().getSession().beginTransaction();
		Listas_de_reproduccion lista = Listas_de_reproduccionDAO.createListas_de_reproduccion();
		try{
			Usuario_registrado user = Usuario_registradoDAO.loadUsuario_registradoByQuery("ID = "+idUsuario, null);
			lista.setNombre(nombre);
			lista.setNum_videos(0);
			lista.setUsuario_registrado(user);
			lista.setUsuario_que_consulta_historial(user);
			Listas_de_reproduccionDAO.save(lista);
			user.listas_de_reproduccion.add(lista);
			Usuario_registradoDAO.save(user);
			transaccion.commit();
		}catch(PersistentException e) {
			e.printStackTrace();
			transaccion.rollback();
		}
	}
	
	public void cambiar_Nombre_Lista(int IDlista, int IDusuario, String aNuevo_Nombre) throws PersistentException {
		PersistentTransaction transaccion = ProyectoMDSPersistentManager.instance().getSession().beginTransaction();
		try {
			Usuario_registrado user = Usuario_registradoDAO.loadUsuario_registradoByQuery("ID = "+IDusuario,"1");
			for(Listas_de_reproduccion lista : user.listas_de_reproduccion.toArray()) {
				if(lista.getId_lista()==IDlista) {
					lista.setNombre(aNuevo_Nombre);
					Listas_de_reproduccionDAO.save(lista);
					break;
				}
			}
		}catch(Exception e ) {
			transaccion.rollback();
			e.printStackTrace();
		}
	}


	public List<Videos> cargar_Lista_Videos(int aId_Lista, int id_usuario) throws PersistentException {
		PersistentTransaction transaccion = ProyectoMDSPersistentManager.instance().getSession().beginTransaction();
		ArrayList<Videos> listaVideos = new ArrayList<Videos>();
		try {
			Usuario_registrado user = Usuario_registradoDAO.loadUsuario_registradoByQuery("ID = "+id_usuario,"1");
			for(Listas_de_reproduccion lista : user.listas_de_reproduccion.toArray()) {
				if(lista.getId_lista()==aId_Lista) {
					for(Videos video : lista.videos_en_lista.toArray()) {
						listaVideos.add(video);
					}
					break;
				}
			}
			transaccion.commit();
		}catch(Exception e ) {
			transaccion.rollback();
			e.printStackTrace();
		}
		return listaVideos;
	}

	public void eliminar_lista_reproduccion(int aID_lista, int IDusuario) throws PersistentException {
		PersistentTransaction transaccion = ProyectoMDSPersistentManager.instance().getSession().beginTransaction();
		try {
			Usuario_registrado user = Usuario_registradoDAO.loadUsuario_registradoByQuery("ID = "+IDusuario,"1");
			for(Listas_de_reproduccion lista : user.listas_de_reproduccion.toArray()) {
				if(lista.getId_lista()==aID_lista) {
					user.listas_de_reproduccion.remove(lista);
					Listas_de_reproduccionDAO.delete(lista);
					break;
				}
			}
			Usuario_registradoDAO.save(user);
			transaccion.commit();
		}catch(Exception e ) {
			transaccion.rollback();
			e.printStackTrace();
		}
	}
	public void eliminar_Video_De_Lista(int idLista, int idVideo, int idUsuario) throws PersistentException {
		PersistentTransaction transaccion = ProyectoMDSPersistentManager.instance().getSession().beginTransaction();
		try {
			Usuario_registrado user = Usuario_registradoDAO.loadUsuario_registradoByQuery("ID = "+idUsuario,"1");
			for(Listas_de_reproduccion lista : user.listas_de_reproduccion.toArray()) {
				if(lista.getId_lista()==idLista) {
					lista.videos_en_lista.remove(VideosDAO.loadVideosByQuery("id_video = "+idVideo, null));
					Listas_de_reproduccionDAO.save(lista);
					break;
				}
			}
			transaccion.commit();
		}catch(Exception e ) {
			transaccion.rollback();
			e.printStackTrace();
		}
		
	
		
	}
	public Listas_de_reproduccion getVideosMeGusta(int idUsuario) throws PersistentException {
		PersistentTransaction transaccion = ProyectoMDSPersistentManager.instance().getSession().beginTransaction();
		Listas_de_reproduccion lista = new Listas_de_reproduccion();
		try {
			Usuario_registrado user = Usuario_registradoDAO.loadUsuario_registradoByQuery("ID = "+idUsuario, "1");
			for(Videos video :user.videos_que_gustan.toArray()) {
				lista.videos_en_lista.add(video);
			}
			transaccion.commit();
		}catch(PersistentException e){
			transaccion.rollback();
			e.printStackTrace();
		}
		return lista;
	}
	public void visualizacionVideo(int idVideo, int idUsuario) throws PersistentException {
		PersistentTransaction transaccion = ProyectoMDSPersistentManager.instance().getSession().beginTransaction();
		try {
			Usuario_registrado user = Usuario_registradoDAO.loadUsuario_registradoByQuery("ID = "+idUsuario, "1");
			Videos video = VideosDAO.loadVideosByQuery("id_video = "+idVideo, null);
			if(idUsuario!=-1) {
				if(!user.video_visualizado.contains(video)) {
					aniadeAHistorial(user, video);
				}
			}
			video.setNumVisualizaciones(video.getNumVisualizaciones()+1);
			VideosDAO.save(video);
			Usuario_registradoDAO.save(user);
		transaccion.commit();
		}catch(PersistentException e) {
			transaccion.rollback();
			e.printStackTrace();
		}
		
	}
	public void aniadeAHistorial(Usuario_registrado user,Videos video) {
		ArrayList<Videos> array = new ArrayList<Videos>();
		if(user.video_visualizado.size() == 10) {
			for(Videos foo : user.video_visualizado.toArray()) {
				array.add(foo);
			}
			user.video_visualizado.remove(array.get(0));
		}
		user.video_visualizado.add(video);
	}
	public List<Listas_de_reproduccion> cargar_Listas_Reproduccion(int aID_Usuario) throws PersistentException {
		PersistentTransaction transaccion = ProyectoMDSPersistentManager.instance().getSession().beginTransaction();
		ArrayList<Listas_de_reproduccion> listalistas=new ArrayList<Listas_de_reproduccion>();
		try {
			
	      Usuario_registrado user = Usuario_registradoDAO.loadUsuario_registradoByQuery("ID = "+aID_Usuario, "1");
	      for(Listas_de_reproduccion foo : user.listas_de_reproduccion.toArray()) {
	    	  listalistas.add(foo);
	      }
	      transaccion.commit();
		} catch(Exception e) {
			transaccion.rollback();			
		}
		return listalistas;
	}

}