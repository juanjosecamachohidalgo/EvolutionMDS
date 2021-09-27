package database;

import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

public class BD_Usuario_administrador {
	public BD_general _bd_principalAdministrador;
	public Vector<Usuario_Administrador> _contieneAdministradores = new Vector<Usuario_Administrador>();

	public Usuario_Administrador cargar_datos_admin(int aID_Admin) throws PersistentException {
		PersistentTransaction transaccion = ProyectoMDSPersistentManager.instance().getSession().beginTransaction();
		Usuario_Administrador admin = null;
		try {
			admin = database.Usuario_AdministradorDAO.loadUsuario_AdministradorByQuery("Id_Usuario_Administrador = "+aID_Admin, "1");
			transaccion.commit();
		}catch(Exception e ) {
			transaccion.rollback();
			e.printStackTrace();
		}
		return admin;
		
	}
	public void editar_avatarAdmin(int aID_Usuario, String avatar) throws PersistentException {
		PersistentTransaction transaccion = ProyectoMDSPersistentManager.instance().getSession().beginTransaction();
		try {
			Usuario_Administrador admin = Usuario_AdministradorDAO.loadUsuario_AdministradorByQuery("ID = "+aID_Usuario, "1");
			admin.setAvatar(avatar);
			Usuario_AdministradorDAO.save(admin);
			transaccion.commit();
		}catch(Exception e ) {
			e.printStackTrace();
			transaccion.rollback();
		}
	}
	public void modificar_datosAdmin(int idAdmin, String aNombre, String aApellido, String aApodo, String aEmail, String aContrasenia) throws PersistentException {
		PersistentTransaction transaccion = ProyectoMDSPersistentManager.instance().getSession().beginTransaction();
		try {
			Usuario_Administrador admin = database.Usuario_AdministradorDAO.loadUsuario_AdministradorByQuery("ID ="+idAdmin, "1");
			admin.setNombre(aNombre);
			admin.setApellido(aApellido);
			admin.setContrasenia(aContrasenia);
			admin.setEmail(aEmail);
			admin.setApodo(aApodo);
			Usuario_AdministradorDAO.save(admin);
			transaccion.commit();
		}catch(Exception e) {
			transaccion.rollback();
			e.printStackTrace();
		}
	}

	public void eliminar_Usuario(int aIDUsuario) throws PersistentException {
		PersistentTransaction transaccion = ProyectoMDSPersistentManager.instance().getSession().beginTransaction();
		try {
			Usuario_registrado user = database.Usuario_registradoDAO.loadUsuario_registradoByQuery("ID = "+aIDUsuario, "1");
			database.Usuario_registradoDAO.delete(user);
			transaccion.commit();
		}catch(Exception e) {
			transaccion.rollback();
			e.printStackTrace();
		}
	}
}