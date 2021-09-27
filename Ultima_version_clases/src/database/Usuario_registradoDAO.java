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

public class Usuario_registradoDAO {
	public static Usuario_registrado loadUsuario_registradoByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDSPersistentManager.instance().getSession();
			return loadUsuario_registradoByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_registrado getUsuario_registradoByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDSPersistentManager.instance().getSession();
			return getUsuario_registradoByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_registrado loadUsuario_registradoByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDSPersistentManager.instance().getSession();
			return loadUsuario_registradoByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_registrado getUsuario_registradoByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDSPersistentManager.instance().getSession();
			return getUsuario_registradoByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_registrado loadUsuario_registradoByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Usuario_registrado) session.load(database.Usuario_registrado.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_registrado getUsuario_registradoByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Usuario_registrado) session.get(database.Usuario_registrado.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_registrado loadUsuario_registradoByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Usuario_registrado) session.load(database.Usuario_registrado.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_registrado getUsuario_registradoByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Usuario_registrado) session.get(database.Usuario_registrado.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuario_registrado(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDSPersistentManager.instance().getSession();
			return queryUsuario_registrado(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuario_registrado(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDSPersistentManager.instance().getSession();
			return queryUsuario_registrado(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_registrado[] listUsuario_registradoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDSPersistentManager.instance().getSession();
			return listUsuario_registradoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_registrado[] listUsuario_registradoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDSPersistentManager.instance().getSession();
			return listUsuario_registradoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuario_registrado(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From database.Usuario_registrado as Usuario_registrado");
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
	
	public static List queryUsuario_registrado(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From database.Usuario_registrado as Usuario_registrado");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Usuario_registrado", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_registrado[] listUsuario_registradoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryUsuario_registrado(session, condition, orderBy);
			return (Usuario_registrado[]) list.toArray(new Usuario_registrado[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_registrado[] listUsuario_registradoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryUsuario_registrado(session, condition, orderBy, lockMode);
			return (Usuario_registrado[]) list.toArray(new Usuario_registrado[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_registrado loadUsuario_registradoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDSPersistentManager.instance().getSession();
			return loadUsuario_registradoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_registrado loadUsuario_registradoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDSPersistentManager.instance().getSession();
			return loadUsuario_registradoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_registrado loadUsuario_registradoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Usuario_registrado[] usuario_registrados = listUsuario_registradoByQuery(session, condition, orderBy);
		if (usuario_registrados != null && usuario_registrados.length > 0)
			return usuario_registrados[0];
		else
			return null;
	}
	
	public static Usuario_registrado loadUsuario_registradoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Usuario_registrado[] usuario_registrados = listUsuario_registradoByQuery(session, condition, orderBy, lockMode);
		if (usuario_registrados != null && usuario_registrados.length > 0)
			return usuario_registrados[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateUsuario_registradoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDSPersistentManager.instance().getSession();
			return iterateUsuario_registradoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUsuario_registradoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDSPersistentManager.instance().getSession();
			return iterateUsuario_registradoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUsuario_registradoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From database.Usuario_registrado as Usuario_registrado");
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
	
	public static java.util.Iterator iterateUsuario_registradoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From database.Usuario_registrado as Usuario_registrado");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Usuario_registrado", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_registrado createUsuario_registrado() {
		return new database.Usuario_registrado();
	}
	
	public static boolean save(database.Usuario_registrado usuario_registrado) throws PersistentException {
		try {
			ProyectoMDSPersistentManager.instance().saveObject(usuario_registrado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(database.Usuario_registrado usuario_registrado) throws PersistentException {
		try {
			ProyectoMDSPersistentManager.instance().deleteObject(usuario_registrado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(database.Usuario_registrado usuario_registrado)throws PersistentException {
		try {
			database.Usuario_registrado[] lSuscritos = usuario_registrado.suscrito.toArray();
			for(int i = 0; i < lSuscritos.length; i++) {
				lSuscritos[i].suscriptor.remove(usuario_registrado);
			}
			database.Comentarios[] lComentarioss = usuario_registrado.comentarios.toArray();
			for(int i = 0; i < lComentarioss.length; i++) {
				lComentarioss[i].setUsuarios_que_comentan(null);
			}
			database.Videos[] lVideos_que_gustans = usuario_registrado.videos_que_gustan.toArray();
			for(int i = 0; i < lVideos_que_gustans.length; i++) {
				lVideos_que_gustans[i].usuarios_que_dan_me_gusta.remove(usuario_registrado);
			}
			database.Videos[] lVideo_subidos = usuario_registrado.video_subido.toArray();
			for(int i = 0; i < lVideo_subidos.length; i++) {
				lVideo_subidos[i].setAutor(null);
			}
			database.Videos[] lVideo_visualizados = usuario_registrado.video_visualizado.toArray();
			for(int i = 0; i < lVideo_visualizados.length; i++) {
				lVideo_visualizados[i].usuario_visualizador.remove(usuario_registrado);
			}
			database.Listas_de_reproduccion[] lListas_de_reproduccions = usuario_registrado.listas_de_reproduccion.toArray();
			for(int i = 0; i < lListas_de_reproduccions.length; i++) {
				lListas_de_reproduccions[i].setUsuario_registrado(null);
			}
			database.Usuario_registrado[] lSuscriptors = usuario_registrado.suscriptor.toArray();
			for(int i = 0; i < lSuscriptors.length; i++) {
				lSuscriptors[i].suscrito.remove(usuario_registrado);
			}
			if (usuario_registrado.getHistorial_usuario() != null) {
				usuario_registrado.getHistorial_usuario().setUsuario_que_consulta_historial(null);
			}
			
			return delete(usuario_registrado);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(database.Usuario_registrado usuario_registrado, org.orm.PersistentSession session)throws PersistentException {
		try {
			database.Usuario_registrado[] lSuscritos = usuario_registrado.suscrito.toArray();
			for(int i = 0; i < lSuscritos.length; i++) {
				lSuscritos[i].suscriptor.remove(usuario_registrado);
			}
			database.Comentarios[] lComentarioss = usuario_registrado.comentarios.toArray();
			for(int i = 0; i < lComentarioss.length; i++) {
				lComentarioss[i].setUsuarios_que_comentan(null);
			}
			database.Videos[] lVideos_que_gustans = usuario_registrado.videos_que_gustan.toArray();
			for(int i = 0; i < lVideos_que_gustans.length; i++) {
				lVideos_que_gustans[i].usuarios_que_dan_me_gusta.remove(usuario_registrado);
			}
			database.Videos[] lVideo_subidos = usuario_registrado.video_subido.toArray();
			for(int i = 0; i < lVideo_subidos.length; i++) {
				lVideo_subidos[i].setAutor(null);
			}
			database.Videos[] lVideo_visualizados = usuario_registrado.video_visualizado.toArray();
			for(int i = 0; i < lVideo_visualizados.length; i++) {
				lVideo_visualizados[i].usuario_visualizador.remove(usuario_registrado);
			}
			database.Listas_de_reproduccion[] lListas_de_reproduccions = usuario_registrado.listas_de_reproduccion.toArray();
			for(int i = 0; i < lListas_de_reproduccions.length; i++) {
				lListas_de_reproduccions[i].setUsuario_registrado(null);
			}
			database.Usuario_registrado[] lSuscriptors = usuario_registrado.suscriptor.toArray();
			for(int i = 0; i < lSuscriptors.length; i++) {
				lSuscriptors[i].suscrito.remove(usuario_registrado);
			}
			if (usuario_registrado.getHistorial_usuario() != null) {
				usuario_registrado.getHistorial_usuario().setUsuario_que_consulta_historial(null);
			}
			
			try {
				session.delete(usuario_registrado);
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
	
	public static boolean refresh(database.Usuario_registrado usuario_registrado) throws PersistentException {
		try {
			ProyectoMDSPersistentManager.instance().getSession().refresh(usuario_registrado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(database.Usuario_registrado usuario_registrado) throws PersistentException {
		try {
			ProyectoMDSPersistentManager.instance().getSession().evict(usuario_registrado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_registrado loadUsuario_registradoByCriteria(Usuario_registradoCriteria usuario_registradoCriteria) {
		Usuario_registrado[] usuario_registrados = listUsuario_registradoByCriteria(usuario_registradoCriteria);
		if(usuario_registrados == null || usuario_registrados.length == 0) {
			return null;
		}
		return usuario_registrados[0];
	}
	
	public static Usuario_registrado[] listUsuario_registradoByCriteria(Usuario_registradoCriteria usuario_registradoCriteria) {
		return usuario_registradoCriteria.listUsuario_registrado();
	}
}
