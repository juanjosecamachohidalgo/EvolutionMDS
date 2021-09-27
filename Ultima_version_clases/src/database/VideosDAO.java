/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Juan José(University of Almeria)
 * License Type: Academic
 */
package database;

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class VideosDAO {
	public static Videos loadVideosByORMID(int id_video) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDSPersistentManager.instance().getSession();
			return loadVideosByORMID(session, id_video);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Videos getVideosByORMID(int id_video) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDSPersistentManager.instance().getSession();
			return getVideosByORMID(session, id_video);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Videos loadVideosByORMID(int id_video, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDSPersistentManager.instance().getSession();
			return loadVideosByORMID(session, id_video, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Videos getVideosByORMID(int id_video, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDSPersistentManager.instance().getSession();
			return getVideosByORMID(session, id_video, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Videos loadVideosByORMID(PersistentSession session, int id_video) throws PersistentException {
		try {
			return (Videos) session.load(database.Videos.class, new Integer(id_video));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Videos getVideosByORMID(PersistentSession session, int id_video) throws PersistentException {
		try {
			return (Videos) session.get(database.Videos.class, new Integer(id_video));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Videos loadVideosByORMID(PersistentSession session, int id_video, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Videos) session.load(database.Videos.class, new Integer(id_video), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Videos getVideosByORMID(PersistentSession session, int id_video, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Videos) session.get(database.Videos.class, new Integer(id_video), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryVideos(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDSPersistentManager.instance().getSession();
			return queryVideos(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryVideos(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDSPersistentManager.instance().getSession();
			return queryVideos(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Videos[] listVideosByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDSPersistentManager.instance().getSession();
			return listVideosByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Videos[] listVideosByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDSPersistentManager.instance().getSession();
			return listVideosByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryVideos(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From database.Videos as Videos");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryVideos(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From database.Videos as Videos");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Videos", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Videos[] listVideosByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryVideos(session, condition, orderBy);
			return (Videos[]) list.toArray(new Videos[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Videos[] listVideosByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryVideos(session, condition, orderBy, lockMode);
			return (Videos[]) list.toArray(new Videos[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Videos loadVideosByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDSPersistentManager.instance().getSession();
			return loadVideosByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Videos loadVideosByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDSPersistentManager.instance().getSession();
			return loadVideosByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Videos loadVideosByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Videos[] videoses = listVideosByQuery(session, condition, orderBy);
		if (videoses != null && videoses.length > 0)
			return videoses[0];
		else
			return null;
	}
	
	public static Videos loadVideosByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Videos[] videoses = listVideosByQuery(session, condition, orderBy, lockMode);
		if (videoses != null && videoses.length > 0)
			return videoses[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateVideosByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDSPersistentManager.instance().getSession();
			return iterateVideosByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateVideosByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDSPersistentManager.instance().getSession();
			return iterateVideosByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateVideosByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From database.Videos as Videos");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateVideosByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From database.Videos as Videos");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Videos", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Videos createVideos() {
		return new database.Videos();
	}
	
	public static boolean save(database.Videos videos) throws PersistentException {
		try {
			ProyectoMDSPersistentManager.instance().saveObject(videos);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(database.Videos videos) throws PersistentException {
		try {
			ProyectoMDSPersistentManager.instance().deleteObject(videos);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(database.Videos videos)throws PersistentException {
		try {
			database.Usuario_registrado[] lUsuarios_que_dan_me_gustas = videos.usuarios_que_dan_me_gusta.toArray();
			for(int i = 0; i < lUsuarios_que_dan_me_gustas.length; i++) {
				lUsuarios_que_dan_me_gustas[i].videos_que_gustan.remove(videos);
			}
			if (videos.getCategoria() != null) {
				videos.getCategoria().videos.remove(videos);
			}
			
			database.Comentarios[] lComentarios_en_videoss = videos.comentarios_en_videos.toArray();
			for(int i = 0; i < lComentarios_en_videoss.length; i++) {
				lComentarios_en_videoss[i].setVideosComentados(null);
			}
			if (videos.getAutor() != null) {
				videos.getAutor().video_subido.remove(videos);
			}
			
			database.Listas_de_reproduccion[] lListas_de_videoss = videos.listas_de_videos.toArray();
			for(int i = 0; i < lListas_de_videoss.length; i++) {
				lListas_de_videoss[i].videos_en_lista.remove(videos);
			}
			database.Usuario_registrado[] lUsuario_visualizadors = videos.usuario_visualizador.toArray();
			for(int i = 0; i < lUsuario_visualizadors.length; i++) {
				lUsuario_visualizadors[i].video_visualizado.remove(videos);
			}
			return delete(videos);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(database.Videos videos, org.orm.PersistentSession session)throws PersistentException {
		try {
			database.Usuario_registrado[] lUsuarios_que_dan_me_gustas = videos.usuarios_que_dan_me_gusta.toArray();
			for(int i = 0; i < lUsuarios_que_dan_me_gustas.length; i++) {
				lUsuarios_que_dan_me_gustas[i].videos_que_gustan.remove(videos);
			}
			if (videos.getCategoria() != null) {
				videos.getCategoria().videos.remove(videos);
			}
			
			database.Comentarios[] lComentarios_en_videoss = videos.comentarios_en_videos.toArray();
			for(int i = 0; i < lComentarios_en_videoss.length; i++) {
				lComentarios_en_videoss[i].setVideosComentados(null);
			}
			if (videos.getAutor() != null) {
				videos.getAutor().video_subido.remove(videos);
			}
			
			database.Listas_de_reproduccion[] lListas_de_videoss = videos.listas_de_videos.toArray();
			for(int i = 0; i < lListas_de_videoss.length; i++) {
				lListas_de_videoss[i].videos_en_lista.remove(videos);
			}
			database.Usuario_registrado[] lUsuario_visualizadors = videos.usuario_visualizador.toArray();
			for(int i = 0; i < lUsuario_visualizadors.length; i++) {
				lUsuario_visualizadors[i].video_visualizado.remove(videos);
			}
			try {
				session.delete(videos);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(database.Videos videos) throws PersistentException {
		try {
			ProyectoMDSPersistentManager.instance().getSession().refresh(videos);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(database.Videos videos) throws PersistentException {
		try {
			ProyectoMDSPersistentManager.instance().getSession().evict(videos);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Videos loadVideosByCriteria(VideosCriteria videosCriteria) {
		Videos[] videoses = listVideosByCriteria(videosCriteria);
		if(videoses == null || videoses.length == 0) {
			return null;
		}
		return videoses[0];
	}
	
	public static Videos[] listVideosByCriteria(VideosCriteria videosCriteria) {
		return videosCriteria.listVideos();
	}
}
