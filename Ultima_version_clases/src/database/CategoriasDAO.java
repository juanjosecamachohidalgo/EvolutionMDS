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

public class CategoriasDAO {
	public static Categorias loadCategoriasByORMID(int id_categoria) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDSPersistentManager.instance().getSession();
			return loadCategoriasByORMID(session, id_categoria);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Categorias getCategoriasByORMID(int id_categoria) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDSPersistentManager.instance().getSession();
			return getCategoriasByORMID(session, id_categoria);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Categorias loadCategoriasByORMID(int id_categoria, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDSPersistentManager.instance().getSession();
			return loadCategoriasByORMID(session, id_categoria, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Categorias getCategoriasByORMID(int id_categoria, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDSPersistentManager.instance().getSession();
			return getCategoriasByORMID(session, id_categoria, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Categorias loadCategoriasByORMID(PersistentSession session, int id_categoria) throws PersistentException {
		try {
			return (Categorias) session.load(database.Categorias.class, new Integer(id_categoria));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Categorias getCategoriasByORMID(PersistentSession session, int id_categoria) throws PersistentException {
		try {
			return (Categorias) session.get(database.Categorias.class, new Integer(id_categoria));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Categorias loadCategoriasByORMID(PersistentSession session, int id_categoria, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Categorias) session.load(database.Categorias.class, new Integer(id_categoria), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Categorias getCategoriasByORMID(PersistentSession session, int id_categoria, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Categorias) session.get(database.Categorias.class, new Integer(id_categoria), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCategorias(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDSPersistentManager.instance().getSession();
			return queryCategorias(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCategorias(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDSPersistentManager.instance().getSession();
			return queryCategorias(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Categorias[] listCategoriasByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDSPersistentManager.instance().getSession();
			return listCategoriasByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Categorias[] listCategoriasByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDSPersistentManager.instance().getSession();
			return listCategoriasByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCategorias(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From database.Categorias as Categorias");
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
	
	public static List queryCategorias(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From database.Categorias as Categorias");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Categorias", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Categorias[] listCategoriasByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryCategorias(session, condition, orderBy);
			return (Categorias[]) list.toArray(new Categorias[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Categorias[] listCategoriasByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryCategorias(session, condition, orderBy, lockMode);
			return (Categorias[]) list.toArray(new Categorias[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Categorias loadCategoriasByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDSPersistentManager.instance().getSession();
			return loadCategoriasByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Categorias loadCategoriasByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDSPersistentManager.instance().getSession();
			return loadCategoriasByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Categorias loadCategoriasByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Categorias[] categoriases = listCategoriasByQuery(session, condition, orderBy);
		if (categoriases != null && categoriases.length > 0)
			return categoriases[0];
		else
			return null;
	}
	
	public static Categorias loadCategoriasByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Categorias[] categoriases = listCategoriasByQuery(session, condition, orderBy, lockMode);
		if (categoriases != null && categoriases.length > 0)
			return categoriases[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateCategoriasByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDSPersistentManager.instance().getSession();
			return iterateCategoriasByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCategoriasByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDSPersistentManager.instance().getSession();
			return iterateCategoriasByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCategoriasByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From database.Categorias as Categorias");
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
	
	public static java.util.Iterator iterateCategoriasByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From database.Categorias as Categorias");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Categorias", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Categorias createCategorias() {
		return new database.Categorias();
	}
	
	public static boolean save(database.Categorias categorias) throws PersistentException {
		try {
			ProyectoMDSPersistentManager.instance().saveObject(categorias);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(database.Categorias categorias) throws PersistentException {
		try {
			ProyectoMDSPersistentManager.instance().deleteObject(categorias);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(database.Categorias categorias)throws PersistentException {
		try {
			database.Videos[] lVideoss = categorias.videos.toArray();
			for(int i = 0; i < lVideoss.length; i++) {
				lVideoss[i].setCategoria(null);
			}
			return delete(categorias);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(database.Categorias categorias, org.orm.PersistentSession session)throws PersistentException {
		try {
			database.Videos[] lVideoss = categorias.videos.toArray();
			for(int i = 0; i < lVideoss.length; i++) {
				lVideoss[i].setCategoria(null);
			}
			try {
				session.delete(categorias);
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
	
	public static boolean refresh(database.Categorias categorias) throws PersistentException {
		try {
			ProyectoMDSPersistentManager.instance().getSession().refresh(categorias);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(database.Categorias categorias) throws PersistentException {
		try {
			ProyectoMDSPersistentManager.instance().getSession().evict(categorias);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Categorias loadCategoriasByCriteria(CategoriasCriteria categoriasCriteria) {
		Categorias[] categoriases = listCategoriasByCriteria(categoriasCriteria);
		if(categoriases == null || categoriases.length == 0) {
			return null;
		}
		return categoriases[0];
	}
	
	public static Categorias[] listCategoriasByCriteria(CategoriasCriteria categoriasCriteria) {
		return categoriasCriteria.listCategorias();
	}
}
