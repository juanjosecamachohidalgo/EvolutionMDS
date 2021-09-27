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

public class Listas_de_reproduccionDAO {
	public static Listas_de_reproduccion loadListas_de_reproduccionByORMID(int id_lista) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDSPersistentManager.instance().getSession();
			return loadListas_de_reproduccionByORMID(session, id_lista);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Listas_de_reproduccion getListas_de_reproduccionByORMID(int id_lista) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDSPersistentManager.instance().getSession();
			return getListas_de_reproduccionByORMID(session, id_lista);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Listas_de_reproduccion loadListas_de_reproduccionByORMID(int id_lista, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDSPersistentManager.instance().getSession();
			return loadListas_de_reproduccionByORMID(session, id_lista, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Listas_de_reproduccion getListas_de_reproduccionByORMID(int id_lista, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDSPersistentManager.instance().getSession();
			return getListas_de_reproduccionByORMID(session, id_lista, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Listas_de_reproduccion loadListas_de_reproduccionByORMID(PersistentSession session, int id_lista) throws PersistentException {
		try {
			return (Listas_de_reproduccion) session.load(database.Listas_de_reproduccion.class, new Integer(id_lista));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Listas_de_reproduccion getListas_de_reproduccionByORMID(PersistentSession session, int id_lista) throws PersistentException {
		try {
			return (Listas_de_reproduccion) session.get(database.Listas_de_reproduccion.class, new Integer(id_lista));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Listas_de_reproduccion loadListas_de_reproduccionByORMID(PersistentSession session, int id_lista, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Listas_de_reproduccion) session.load(database.Listas_de_reproduccion.class, new Integer(id_lista), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Listas_de_reproduccion getListas_de_reproduccionByORMID(PersistentSession session, int id_lista, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Listas_de_reproduccion) session.get(database.Listas_de_reproduccion.class, new Integer(id_lista), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryListas_de_reproduccion(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDSPersistentManager.instance().getSession();
			return queryListas_de_reproduccion(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryListas_de_reproduccion(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDSPersistentManager.instance().getSession();
			return queryListas_de_reproduccion(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Listas_de_reproduccion[] listListas_de_reproduccionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDSPersistentManager.instance().getSession();
			return listListas_de_reproduccionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Listas_de_reproduccion[] listListas_de_reproduccionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDSPersistentManager.instance().getSession();
			return listListas_de_reproduccionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryListas_de_reproduccion(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From database.Listas_de_reproduccion as Listas_de_reproduccion");
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
	
	public static List queryListas_de_reproduccion(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From database.Listas_de_reproduccion as Listas_de_reproduccion");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Listas_de_reproduccion", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Listas_de_reproduccion[] listListas_de_reproduccionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryListas_de_reproduccion(session, condition, orderBy);
			return (Listas_de_reproduccion[]) list.toArray(new Listas_de_reproduccion[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Listas_de_reproduccion[] listListas_de_reproduccionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryListas_de_reproduccion(session, condition, orderBy, lockMode);
			return (Listas_de_reproduccion[]) list.toArray(new Listas_de_reproduccion[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Listas_de_reproduccion loadListas_de_reproduccionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDSPersistentManager.instance().getSession();
			return loadListas_de_reproduccionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Listas_de_reproduccion loadListas_de_reproduccionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDSPersistentManager.instance().getSession();
			return loadListas_de_reproduccionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Listas_de_reproduccion loadListas_de_reproduccionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Listas_de_reproduccion[] listas_de_reproduccions = listListas_de_reproduccionByQuery(session, condition, orderBy);
		if (listas_de_reproduccions != null && listas_de_reproduccions.length > 0)
			return listas_de_reproduccions[0];
		else
			return null;
	}
	
	public static Listas_de_reproduccion loadListas_de_reproduccionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Listas_de_reproduccion[] listas_de_reproduccions = listListas_de_reproduccionByQuery(session, condition, orderBy, lockMode);
		if (listas_de_reproduccions != null && listas_de_reproduccions.length > 0)
			return listas_de_reproduccions[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateListas_de_reproduccionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDSPersistentManager.instance().getSession();
			return iterateListas_de_reproduccionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateListas_de_reproduccionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDSPersistentManager.instance().getSession();
			return iterateListas_de_reproduccionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateListas_de_reproduccionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From database.Listas_de_reproduccion as Listas_de_reproduccion");
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
	
	public static java.util.Iterator iterateListas_de_reproduccionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From database.Listas_de_reproduccion as Listas_de_reproduccion");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Listas_de_reproduccion", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Listas_de_reproduccion createListas_de_reproduccion() {
		return new database.Listas_de_reproduccion();
	}
	
	public static boolean save(database.Listas_de_reproduccion listas_de_reproduccion) throws PersistentException {
		try {
			ProyectoMDSPersistentManager.instance().saveObject(listas_de_reproduccion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(database.Listas_de_reproduccion listas_de_reproduccion) throws PersistentException {
		try {
			ProyectoMDSPersistentManager.instance().deleteObject(listas_de_reproduccion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(database.Listas_de_reproduccion listas_de_reproduccion)throws PersistentException {
		try {
			if (listas_de_reproduccion.getUsuario_que_consulta_historial() != null) {
				listas_de_reproduccion.getUsuario_que_consulta_historial().setHistorial_usuario(null);
			}
			
			if (listas_de_reproduccion.getUsuario_registrado() != null) {
				listas_de_reproduccion.getUsuario_registrado().listas_de_reproduccion.remove(listas_de_reproduccion);
			}
			
			database.Videos[] lVideos_en_listas = listas_de_reproduccion.videos_en_lista.toArray();
			for(int i = 0; i < lVideos_en_listas.length; i++) {
				lVideos_en_listas[i].listas_de_videos.remove(listas_de_reproduccion);
			}
			return delete(listas_de_reproduccion);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(database.Listas_de_reproduccion listas_de_reproduccion, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (listas_de_reproduccion.getUsuario_que_consulta_historial() != null) {
				listas_de_reproduccion.getUsuario_que_consulta_historial().setHistorial_usuario(null);
			}
			
			if (listas_de_reproduccion.getUsuario_registrado() != null) {
				listas_de_reproduccion.getUsuario_registrado().listas_de_reproduccion.remove(listas_de_reproduccion);
			}
			
			database.Videos[] lVideos_en_listas = listas_de_reproduccion.videos_en_lista.toArray();
			for(int i = 0; i < lVideos_en_listas.length; i++) {
				lVideos_en_listas[i].listas_de_videos.remove(listas_de_reproduccion);
			}
			try {
				session.delete(listas_de_reproduccion);
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
	
	public static boolean refresh(database.Listas_de_reproduccion listas_de_reproduccion) throws PersistentException {
		try {
			ProyectoMDSPersistentManager.instance().getSession().refresh(listas_de_reproduccion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(database.Listas_de_reproduccion listas_de_reproduccion) throws PersistentException {
		try {
			ProyectoMDSPersistentManager.instance().getSession().evict(listas_de_reproduccion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Listas_de_reproduccion loadListas_de_reproduccionByCriteria(Listas_de_reproduccionCriteria listas_de_reproduccionCriteria) {
		Listas_de_reproduccion[] listas_de_reproduccions = listListas_de_reproduccionByCriteria(listas_de_reproduccionCriteria);
		if(listas_de_reproduccions == null || listas_de_reproduccions.length == 0) {
			return null;
		}
		return listas_de_reproduccions[0];
	}
	
	public static Listas_de_reproduccion[] listListas_de_reproduccionByCriteria(Listas_de_reproduccionCriteria listas_de_reproduccionCriteria) {
		return listas_de_reproduccionCriteria.listListas_de_reproduccion();
	}
}
