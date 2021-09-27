/**
 * Licensee: Juan José(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class ListProyectoMDSData {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Usuarios...");
		database.Usuarios[] databaseUsuarioses = database.UsuariosDAO.listUsuariosByQuery(null, null);
		int length = Math.min(databaseUsuarioses.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(databaseUsuarioses[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Usuario_registrado...");
		database.Usuario_registrado[] databaseUsuario_registrados = database.Usuario_registradoDAO.listUsuario_registradoByQuery(null, null);
		length = Math.min(databaseUsuario_registrados.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(databaseUsuario_registrados[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Videos...");
		database.Videos[] databaseVideoses = database.VideosDAO.listVideosByQuery(null, null);
		length = Math.min(databaseVideoses.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(databaseVideoses[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Listas_de_reproduccion...");
		database.Listas_de_reproduccion[] databaseListas_de_reproduccions = database.Listas_de_reproduccionDAO.listListas_de_reproduccionByQuery(null, null);
		length = Math.min(databaseListas_de_reproduccions.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(databaseListas_de_reproduccions[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Usuario_Administrador...");
		database.Usuario_Administrador[] databaseUsuario_Administradors = database.Usuario_AdministradorDAO.listUsuario_AdministradorByQuery(null, null);
		length = Math.min(databaseUsuario_Administradors.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(databaseUsuario_Administradors[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Categorias...");
		database.Categorias[] databaseCategoriases = database.CategoriasDAO.listCategoriasByQuery(null, null);
		length = Math.min(databaseCategoriases.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(databaseCategoriases[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Comentarios...");
		database.Comentarios[] databaseComentarioses = database.ComentariosDAO.listComentariosByQuery(null, null);
		length = Math.min(databaseComentarioses.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(databaseComentarioses[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing Usuarios by Criteria...");
		database.UsuariosCriteria ldatabaseUsuariosCriteria = new database.UsuariosCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//ldatabaseUsuariosCriteria.ID.eq();
		ldatabaseUsuariosCriteria.setMaxResults(ROW_COUNT);
		database.Usuarios[] databaseUsuarioses = ldatabaseUsuariosCriteria.listUsuarios();
		int length =databaseUsuarioses== null ? 0 : Math.min(databaseUsuarioses.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(databaseUsuarioses[i]);
		}
		System.out.println(length + " Usuarios record(s) retrieved."); 
		
		System.out.println("Listing Usuario_registrado by Criteria...");
		database.Usuario_registradoCriteria ldatabaseUsuario_registradoCriteria = new database.Usuario_registradoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//ldatabaseUsuario_registradoCriteria.ID.eq();
		ldatabaseUsuario_registradoCriteria.setMaxResults(ROW_COUNT);
		database.Usuario_registrado[] databaseUsuario_registrados = ldatabaseUsuario_registradoCriteria.listUsuario_registrado();
		length =databaseUsuario_registrados== null ? 0 : Math.min(databaseUsuario_registrados.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(databaseUsuario_registrados[i]);
		}
		System.out.println(length + " Usuario_registrado record(s) retrieved."); 
		
		System.out.println("Listing Videos by Criteria...");
		database.VideosCriteria ldatabaseVideosCriteria = new database.VideosCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//ldatabaseVideosCriteria.id_video.eq();
		ldatabaseVideosCriteria.setMaxResults(ROW_COUNT);
		database.Videos[] databaseVideoses = ldatabaseVideosCriteria.listVideos();
		length =databaseVideoses== null ? 0 : Math.min(databaseVideoses.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(databaseVideoses[i]);
		}
		System.out.println(length + " Videos record(s) retrieved."); 
		
		System.out.println("Listing Listas_de_reproduccion by Criteria...");
		database.Listas_de_reproduccionCriteria ldatabaseListas_de_reproduccionCriteria = new database.Listas_de_reproduccionCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//ldatabaseListas_de_reproduccionCriteria.id_lista.eq();
		ldatabaseListas_de_reproduccionCriteria.setMaxResults(ROW_COUNT);
		database.Listas_de_reproduccion[] databaseListas_de_reproduccions = ldatabaseListas_de_reproduccionCriteria.listListas_de_reproduccion();
		length =databaseListas_de_reproduccions== null ? 0 : Math.min(databaseListas_de_reproduccions.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(databaseListas_de_reproduccions[i]);
		}
		System.out.println(length + " Listas_de_reproduccion record(s) retrieved."); 
		
		System.out.println("Listing Usuario_Administrador by Criteria...");
		database.Usuario_AdministradorCriteria ldatabaseUsuario_AdministradorCriteria = new database.Usuario_AdministradorCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//ldatabaseUsuario_AdministradorCriteria.ID.eq();
		ldatabaseUsuario_AdministradorCriteria.setMaxResults(ROW_COUNT);
		database.Usuario_Administrador[] databaseUsuario_Administradors = ldatabaseUsuario_AdministradorCriteria.listUsuario_Administrador();
		length =databaseUsuario_Administradors== null ? 0 : Math.min(databaseUsuario_Administradors.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(databaseUsuario_Administradors[i]);
		}
		System.out.println(length + " Usuario_Administrador record(s) retrieved."); 
		
		System.out.println("Listing Categorias by Criteria...");
		database.CategoriasCriteria ldatabaseCategoriasCriteria = new database.CategoriasCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//ldatabaseCategoriasCriteria.id_categoria.eq();
		ldatabaseCategoriasCriteria.setMaxResults(ROW_COUNT);
		database.Categorias[] databaseCategoriases = ldatabaseCategoriasCriteria.listCategorias();
		length =databaseCategoriases== null ? 0 : Math.min(databaseCategoriases.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(databaseCategoriases[i]);
		}
		System.out.println(length + " Categorias record(s) retrieved."); 
		
		System.out.println("Listing Comentarios by Criteria...");
		database.ComentariosCriteria ldatabaseComentariosCriteria = new database.ComentariosCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//ldatabaseComentariosCriteria.id_comentario.eq();
		ldatabaseComentariosCriteria.setMaxResults(ROW_COUNT);
		database.Comentarios[] databaseComentarioses = ldatabaseComentariosCriteria.listComentarios();
		length =databaseComentarioses== null ? 0 : Math.min(databaseComentarioses.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(databaseComentarioses[i]);
		}
		System.out.println(length + " Comentarios record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListProyectoMDSData listProyectoMDSData = new ListProyectoMDSData();
			try {
				listProyectoMDSData.listTestData();
				//listProyectoMDSData.listByCriteria();
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
