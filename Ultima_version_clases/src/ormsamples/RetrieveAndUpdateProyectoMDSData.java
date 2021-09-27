/**
 * Licensee: Juan José(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateProyectoMDSData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = database.ProyectoMDSPersistentManager.instance().getSession().beginTransaction();
		try {
			database.Usuarios ldatabaseUsuarios = database.UsuariosDAO.loadUsuariosByQuery(null, null);
			// Update the properties of the persistent object
			database.UsuariosDAO.save(ldatabaseUsuarios);
			database.Usuario_registrado ldatabaseUsuario_registrado = database.Usuario_registradoDAO.loadUsuario_registradoByQuery(null, null);
			// Update the properties of the persistent object
			database.Usuario_registradoDAO.save(ldatabaseUsuario_registrado);
			database.Videos ldatabaseVideos = database.VideosDAO.loadVideosByQuery(null, null);
			// Update the properties of the persistent object
			database.VideosDAO.save(ldatabaseVideos);
			database.Listas_de_reproduccion ldatabaseListas_de_reproduccion = database.Listas_de_reproduccionDAO.loadListas_de_reproduccionByQuery(null, null);
			// Update the properties of the persistent object
			database.Listas_de_reproduccionDAO.save(ldatabaseListas_de_reproduccion);
			database.Usuario_Administrador ldatabaseUsuario_Administrador = database.Usuario_AdministradorDAO.loadUsuario_AdministradorByQuery(null, null);
			// Update the properties of the persistent object
			database.Usuario_AdministradorDAO.save(ldatabaseUsuario_Administrador);
			database.Categorias ldatabaseCategorias = database.CategoriasDAO.loadCategoriasByQuery(null, null);
			// Update the properties of the persistent object
			database.CategoriasDAO.save(ldatabaseCategorias);
			database.Comentarios ldatabaseComentarios = database.ComentariosDAO.loadComentariosByQuery(null, null);
			// Update the properties of the persistent object
			database.ComentariosDAO.save(ldatabaseComentarios);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Usuarios by UsuariosCriteria");
		database.UsuariosCriteria ldatabaseUsuariosCriteria = new database.UsuariosCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//ldatabaseUsuariosCriteria.ID.eq();
		System.out.println(ldatabaseUsuariosCriteria.uniqueUsuarios());
		
		System.out.println("Retrieving Usuario_registrado by Usuario_registradoCriteria");
		database.Usuario_registradoCriteria ldatabaseUsuario_registradoCriteria = new database.Usuario_registradoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//ldatabaseUsuario_registradoCriteria.ID.eq();
		System.out.println(ldatabaseUsuario_registradoCriteria.uniqueUsuario_registrado());
		
		System.out.println("Retrieving Videos by VideosCriteria");
		database.VideosCriteria ldatabaseVideosCriteria = new database.VideosCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//ldatabaseVideosCriteria.id_video.eq();
		System.out.println(ldatabaseVideosCriteria.uniqueVideos());
		
		System.out.println("Retrieving Listas_de_reproduccion by Listas_de_reproduccionCriteria");
		database.Listas_de_reproduccionCriteria ldatabaseListas_de_reproduccionCriteria = new database.Listas_de_reproduccionCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//ldatabaseListas_de_reproduccionCriteria.id_lista.eq();
		System.out.println(ldatabaseListas_de_reproduccionCriteria.uniqueListas_de_reproduccion());
		
		System.out.println("Retrieving Usuario_Administrador by Usuario_AdministradorCriteria");
		database.Usuario_AdministradorCriteria ldatabaseUsuario_AdministradorCriteria = new database.Usuario_AdministradorCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//ldatabaseUsuario_AdministradorCriteria.ID.eq();
		System.out.println(ldatabaseUsuario_AdministradorCriteria.uniqueUsuario_Administrador());
		
		System.out.println("Retrieving Categorias by CategoriasCriteria");
		database.CategoriasCriteria ldatabaseCategoriasCriteria = new database.CategoriasCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//ldatabaseCategoriasCriteria.id_categoria.eq();
		System.out.println(ldatabaseCategoriasCriteria.uniqueCategorias());
		
		System.out.println("Retrieving Comentarios by ComentariosCriteria");
		database.ComentariosCriteria ldatabaseComentariosCriteria = new database.ComentariosCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//ldatabaseComentariosCriteria.id_comentario.eq();
		System.out.println(ldatabaseComentariosCriteria.uniqueComentarios());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateProyectoMDSData retrieveAndUpdateProyectoMDSData = new RetrieveAndUpdateProyectoMDSData();
			try {
				retrieveAndUpdateProyectoMDSData.retrieveAndUpdateTestData();
				//retrieveAndUpdateProyectoMDSData.retrieveByCriteria();
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
