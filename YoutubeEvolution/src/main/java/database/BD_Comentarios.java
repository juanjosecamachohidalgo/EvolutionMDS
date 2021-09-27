package database;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import org.orm.PersistentException;
import org.orm.PersistentTransaction;
import com.vaadin.ui.TextArea;

public class BD_Comentarios {
	public BD_general _bd_PrincipalComentarios;
	public Vector<Comentarios> _contieneComentarios = new Vector<Comentarios>();
	
	public List<Comentarios> cargar_Comentarios(int aID) throws PersistentException {
		ArrayList<Comentarios> listaComentarios = new ArrayList<Comentarios>();
		PersistentTransaction transaccion = ProyectoMDSPersistentManager.instance().getSession().beginTransaction();
		try {
			Videos video = VideosDAO.loadVideosByQuery("id_video = "+aID, "1");
			for(Comentarios coment : video.comentarios_en_videos.toArray()) {
				listaComentarios.add(coment);
			}
	      transaccion.commit();
		} catch(Exception e) {
			transaccion.rollback();			
		}
		return listaComentarios;
	}
	//FALTA IDVIDEO?
	public void eliminar_comentarioAdmin(int aIDvideo , int aIDcomentario) throws PersistentException {
		PersistentTransaction transaccion = ProyectoMDSPersistentManager.instance().getSession().beginTransaction();
		try {
		Videos vid = database.VideosDAO.loadVideosByQuery("id_video= "+aIDvideo,"1");
		Comentarios coment = database.ComentariosDAO.loadComentariosByQuery("id_comentario = " +aIDcomentario ,"1");
		vid.comentarios_en_videos.remove(coment);
		transaccion.commit();
		}catch(Exception e) {
			
			transaccion.rollback();
			e.printStackTrace();
			
		}
	}
	public void enviar_comentario(TextArea aTexto, int aIDvideo, int aIDusuario) throws PersistentException {
		PersistentTransaction transaccion = ProyectoMDSPersistentManager.instance().getSession().beginTransaction();
		try {
		Comentarios comentario = database.ComentariosDAO.createComentarios();
		Videos vid = database.VideosDAO.loadVideosByQuery("id_video =" +aIDvideo , "1");
		Usuario_registrado user = database.Usuario_registradoDAO.loadUsuario_registradoByQuery("ID = "+aIDusuario,"1");
		comentario.setContenido_comentario(aTexto.getValue());
		comentario.setVideosComentados(vid);
		comentario.setUsuarios_que_comentan(user);
		ComentariosDAO.save(comentario);
		user.comentarios.add(comentario);
		vid.comentarios_en_videos.add(comentario);
		VideosDAO.save(vid);
		Usuario_registradoDAO.save(user);
		transaccion.commit();
			
			} catch (Exception e) {
			transaccion.rollback();
			e.printStackTrace();
		}
		
	}
	public void eliminar_comentario_propio(int aIDUsuario, int aIDComentario, int aIDVideo) throws PersistentException {
		PersistentTransaction transaccion = ProyectoMDSPersistentManager.instance().getSession().beginTransaction();
		try {
		Videos vid = database.VideosDAO.loadVideosByQuery("id_video =" +aIDVideo, "1");
		Comentarios coment = database.ComentariosDAO.loadComentariosByQuery("id_comentario = "+aIDComentario , "1");
		Usuario_registrado user = Usuario_registradoDAO.loadUsuario_registradoByQuery("ID = "+aIDUsuario, "1");
		if(coment.getUsuarios_que_comentan().getID()!=aIDUsuario) {
			throw new RuntimeException("El comentario no pertenece al usuario");
		}
		user.comentarios.remove(coment);
		vid.comentarios_en_videos.remove(coment);
		ComentariosDAO.delete(coment);
		Usuario_registradoDAO.save(user);
		VideosDAO.save(vid);
		transaccion.commit();
		}catch(Exception e) {
			
			transaccion.rollback();
			e.printStackTrace();
			
		}
	}
}