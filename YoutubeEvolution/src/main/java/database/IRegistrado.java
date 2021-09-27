package database;

import java.util.List;
import org.orm.PersistentException;
import com.vaadin.ui.TextArea;

public interface IRegistrado {

	public List<Videos> Cargar_Videos_Relacionados(int aIDUsuario);

	public List<Videos> Cargar_Videos_Suscripciones(int aIDUsuario);

	public void Registrarse(String aNombre, String aApellidos, String aApodo, int aEdad, String aEmail, String aContrasenia, String aConfirmacion);

	public void subir_video(String aTitulo, String aMiniatura,String contenido, int idAutor, boolean aDeshabilitar_comentarios, TextArea aDescripcion, String aEtiquetas, String categoria, int lista); 
		
	public void descargar(int aID);

	public Listas_de_reproduccion getVideosMeGusta(int idUsuario);
	
	public void cerrar_sesion();
	
    public boolean compruebaVideos();
	
	public boolean tienenVideosSuscrito(int idUsuario);
	
	public List<Comentarios> cargar_Comentarios(int aID);
	
	public void visualizacionVideo(int idVideo, int idUsuario);

	public void aniade_a_lista(int IDusuario, int aIDvideo, int aIDlista);

	public void me_gusta(int aIDvideo, int aIDusuario);

	public void eliminar_Video_De_Lista(int idLista, int idVideo, int idUsuario);
	
	public void enviar_comentario(TextArea aTexto, int aIDvideo, int aIDUsuario) throws PersistentException;

	public void cambiar_Nombre_Lista(int IDlista, int IDusuario, String aNuevo_Nombre);

	public List<Videos> cargar_Lista_Videos(int aId_Lista, int Id_usuario);

	public void eliminar_lista_reproduccion(int aID_lista, int IDusuario);

	public Usuario_registrado cargar_Datos_Registrado(int aID_Registrado);

	public void editar_avatar(int aID_Usuario, String avatar);

	public void modificar_datos(int id, String aNombre, String aApellido, String aApodo, String anio, String aEmail, String aContrasenia);

	public void dejar_de_seguir(int aID_Usuario, int ID_Usuarioseguido);

	public List<Usuario_registrado> cargar_Seguidores(int aID_Usuario);

	public List<Usuario_registrado> cargar_Suscripciones(int aID_Usuario);

	public void suscribirse(int aID_Usuario, int ID_Usuariosusc);

	public List<Listas_de_reproduccion> cargar_Listas_Reproduccion(int aID_Usuario);

	public List<Videos> cargar_Videos_Subidos(int aIDUsuario);

	public List<Videos> cargar_Gestion_Videos_Subidos(int aIDUsuario);

	public void modificar_video(int aIDVideo, String aTitulo, String aDescripcion, String aNombre_categorias, String aEtiquetas);
		
	public void eliminar_Video(int aIDVideo);

	public void editar_Miniatura(int aIDVideo,String miniatura);

	public void eliminar_comentario_propio(int aIDUsuario, int aIDComentario, int aIDVideo);
}