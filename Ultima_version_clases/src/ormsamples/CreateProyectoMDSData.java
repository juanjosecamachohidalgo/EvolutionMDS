/**
 * Licensee: Juan José(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateProyectoMDSData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = database.ProyectoMDSPersistentManager.instance().getSession().beginTransaction();
		try {
			database.Usuarios ldatabaseUsuarios = database.UsuariosDAO.createUsuarios();
			// Initialize the properties of the persistent object here
			database.UsuariosDAO.save(ldatabaseUsuarios);
			database.Usuario_registrado ldatabaseUsuario_registrado = database.Usuario_registradoDAO.createUsuario_registrado();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : suscriptor, listas_de_reproduccion, video_visualizado, video_subido, videos_que_gustan, comentarios, suscrito, edad, numeroVisitas, id_Usuario_registrado
			database.Usuario_registradoDAO.save(ldatabaseUsuario_registrado);
			database.Videos ldatabaseVideos = database.VideosDAO.createVideos();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : usuario_visualizador, listas_de_videos, autor, comentarios_en_videos, duracion, numVisualizaciones, categoria, usuarios_que_dan_me_gusta
			database.VideosDAO.save(ldatabaseVideos);
			database.Listas_de_reproduccion ldatabaseListas_de_reproduccion = database.Listas_de_reproduccionDAO.createListas_de_reproduccion();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : videos_en_lista, num_videos, usuario_registrado
			database.Listas_de_reproduccionDAO.save(ldatabaseListas_de_reproduccion);
			database.Usuario_Administrador ldatabaseUsuario_Administrador = database.Usuario_AdministradorDAO.createUsuario_Administrador();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : id_Usuario_Administrador
			database.Usuario_AdministradorDAO.save(ldatabaseUsuario_Administrador);
			database.Categorias ldatabaseCategorias = database.CategoriasDAO.createCategorias();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : videos, edad
			database.CategoriasDAO.save(ldatabaseCategorias);
			database.Comentarios ldatabaseComentarios = database.ComentariosDAO.createComentarios();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : usuarios_que_comentan, videosComentados
			database.ComentariosDAO.save(ldatabaseComentarios);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateProyectoMDSData createProyectoMDSData = new CreateProyectoMDSData();
			try {
				createProyectoMDSData.createTestData();
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
