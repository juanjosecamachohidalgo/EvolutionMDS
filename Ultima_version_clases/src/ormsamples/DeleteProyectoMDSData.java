/**
 * Licensee: Juan José(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class DeleteProyectoMDSData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = database.ProyectoMDSPersistentManager.instance().getSession().beginTransaction();
		try {
			database.Usuarios ldatabaseUsuarios = database.UsuariosDAO.loadUsuariosByQuery(null, null);
			// Delete the persistent object
			database.UsuariosDAO.delete(ldatabaseUsuarios);
			database.Usuario_registrado ldatabaseUsuario_registrado = database.Usuario_registradoDAO.loadUsuario_registradoByQuery(null, null);
			// Delete the persistent object
			database.Usuario_registradoDAO.delete(ldatabaseUsuario_registrado);
			database.Videos ldatabaseVideos = database.VideosDAO.loadVideosByQuery(null, null);
			// Delete the persistent object
			database.VideosDAO.delete(ldatabaseVideos);
			database.Listas_de_reproduccion ldatabaseListas_de_reproduccion = database.Listas_de_reproduccionDAO.loadListas_de_reproduccionByQuery(null, null);
			// Delete the persistent object
			database.Listas_de_reproduccionDAO.delete(ldatabaseListas_de_reproduccion);
			database.Usuario_Administrador ldatabaseUsuario_Administrador = database.Usuario_AdministradorDAO.loadUsuario_AdministradorByQuery(null, null);
			// Delete the persistent object
			database.Usuario_AdministradorDAO.delete(ldatabaseUsuario_Administrador);
			database.Categorias ldatabaseCategorias = database.CategoriasDAO.loadCategoriasByQuery(null, null);
			// Delete the persistent object
			database.CategoriasDAO.delete(ldatabaseCategorias);
			database.Comentarios ldatabaseComentarios = database.ComentariosDAO.loadComentariosByQuery(null, null);
			// Delete the persistent object
			database.ComentariosDAO.delete(ldatabaseComentarios);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteProyectoMDSData deleteProyectoMDSData = new DeleteProyectoMDSData();
			try {
				deleteProyectoMDSData.deleteTestData();
			}
			finally {
				database.ProyectoMDSPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
