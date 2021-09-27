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

public class ComentariosDAO {
	public static Comentarios loadComentariosByORMID(int id_comentario) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDSPersistentManager.instance().getSession();
			return loadComentariosByORMID(session, id_comentario);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Comentarios getComentariosByORMID(int id_comentario) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDSPersistentManager.instance().getSession();
			return getComentariosByORMID(session, id_comentario);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Comentarios loadComentariosByORMID(int id_comentario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDSPersistentManager.instance().getSession();
			return loadComentariosByORMID(session, id_comentario, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Comentarios getComentariosByORMID(int id_comentario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDSPersistentManager.instance().getSession();
			return getComentariosByORMID(session, id_comentario, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Comentarios loadComentariosByORMID(PersistentSession session, int id_comentario) throws PersistentException {
		try {
			return (Comentarios) session.load(database.Comentarios.class, new Integer(id_comentario));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Comentarios getComentariosByORMID(PersistentSession session, int id_comentario) throws PersistentException {
		try {
			return (Comentarios) session.get(database.Comentarios.class, new Integer(id_comentario));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Comentarios loadComentariosByORMID(PersistentSession session, int id_comentario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Comentarios) session.load(database.Comentarios.class, new Integer(id_comentario), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Comentarios getComentariosByORMID(PersistentSession session, int id_comentario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Comentarios) session.get(database.Comentarios.class, new Integer(id_comentario), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryComentarios(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDSPersistentManager.instance().getSession();
			return queryComentarios(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryComentarios(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDSPersistentManager.instance().getSession();
			return queryComentarios(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Comentarios[] listComentariosByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDSPersistentManager.instance().getSession();
			return listComentariosByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Comentarios[] listComentariosByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDSPersistentManager.instance().getSession();
			return listComentariosByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryComentarios(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From database.Comentarios as Comentarios");
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
	
	public static List queryComentarios(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From database.Comentarios as Comentarios");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Comentarios", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Comentarios[] listComentariosByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryComentarios(session, condition, orderBy);
			return (Comentarios[]) list.toArray(new Comentarios[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Comentarios[] listComentariosByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryComentarios(session, condition, orderBy, lockMode);
			return (Comentarios[]) list.toArray(new Comentarios[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Comentarios loadComentariosByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDSPersistentManager.instance().getSession();
			return loadComentariosByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Comentarios loadComentariosByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDSPersistentManager.instance().getSession();
			return loadComentariosByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Comentarios loadComentariosByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Comentarios[] comentarioses = listComentariosByQuery(session, condition, orderBy);
		if (comentarioses != null && comentarioses.length > 0)
			return comentarioses[0];
		else
			return null;
	}
	
	public static Comentarios loadComentariosByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Comentarios[] comentarioses = listComentariosByQuery(session, condition, orderBy, lockMode);
		if (comentarioses != null && comentarioses.length > 0)
			return comentarioses[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateComentariosByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDSPersistentManager.instance().getSession();
			return iterateComentariosByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateComentariosByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDSPersistentManager.instance().getSession();
			return iterateComentariosByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateComentariosByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From database.Comentarios as Comentarios");
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
	
	public static java.util.Iterator iterateComentariosByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From database.Comentarios as Comentarios");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Comentarios", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Comentarios createComentarios() {
		return new database.Comentarios();
	}
	
	public static boolean save(database.Comentarios comentarios) throws PersistentException {
		try {
			ProyectoMDSPersistentManager.instance().saveObject(comentarios);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(database.Comentarios comentarios) throws PersistentException {
		try {
			ProyectoMDSPersistentManager.instance().deleteObject(comentarios);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(database.Comentarios comentarios)throws PersistentException {
		try {
			if (comentarios.getVideosComentados() != null) {
				comentarios.getVideosComentados().comentarios_en_videos.remove(comentarios);
			}
			
			if (comentarios.getUsuarios_que_comentan() != null) {
				comentarios.getUsuarios_que_comentan().comentarios.remove(comentarios);
			}
			
			return delete(comentarios);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(database.Comentarios comentarios, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (comentarios.getVideosComentados() != null) {
				comentarios.getVideosComentados().comentarios_en_videos.remove(comentarios);
			}
			
			if (comentarios.getUsuarios_que_comentan() != null) {
				comentarios.getUsuarios_que_comentan().comentarios.remove(comentarios);
			}
			
			try {
				session.delete(comentarios);
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
	
	public static boolean refresh(database.Comentarios comentarios) throws PersistentException {
		try {
			ProyectoMDSPersistentManager.instance().getSession().refresh(comentarios);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(database.Comentarios comentarios) throws PersistentException {
		try {
			ProyectoMDSPersistentManager.instance().getSession().evict(comentarios);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Comentarios loadComentariosByCriteria(ComentariosCriteria comentariosCriteria) {
		Comentarios[] comentarioses = listComentariosByCriteria(comentariosCriteria);
		if(comentarioses == null || comentarioses.length == 0) {
			return null;
		}
		return comentarioses[0];
	}
	
	public static Comentarios[] listComentariosByCriteria(ComentariosCriteria comentariosCriteria) {
		return comentariosCriteria.listComentarios();
	}
}
