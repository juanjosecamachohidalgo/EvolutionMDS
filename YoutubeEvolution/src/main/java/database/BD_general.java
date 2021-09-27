package database;

import java.util.List;

import org.orm.PersistentException;

import com.vaadin.ui.TextArea;


public class BD_general implements IRegistrado, IInvitado, IAdministrador {
	public BD_Videos _bd_Videos;
	public BD_listas _bd_listas;
	public BD_Usuario_registrado _bd_UsuariosRegistrados;
	public BD_Categorias _bd_categorias;
	public BD_Usuario_administrador _bd_Administradores;
	public BD_Comentarios _bd_Comentarios;

	public List<Videos> Cargar_Videos_Relacionados(int aIDUsuario) {
		BD_Videos bd = new BD_Videos();																				
		List<Videos> lista = null;
		try {
			lista = bd.Cargar_Videos_Relacionados(aIDUsuario);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista;
	}
	public void cerrar_sesion() {
		BD_Usuario_registrado bd = new BD_Usuario_registrado();
		try {
			bd.cerrar_sesion();
		}catch(PersistentException e) {
			e.printStackTrace();
		}
	}

	public List<Videos> Cargar_Videos_Suscripciones(int aIDUsuario) {
		BD_Videos bd = new BD_Videos();
		List<Videos> lista = null;
		try {
			lista = bd.Cargar_Videos_Suscripciones(aIDUsuario);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista;
	}

	public void Registrarse(String aNombre, String aApellidos, String aApodo, int aEdad, String aEmail, String aContrasenia, String aConfirmacion) {
		BD_Usuario_registrado bd = new BD_Usuario_registrado();
		try {
			bd.Registrarse(aNombre, aApellidos, aApodo, aEdad, aEmail, aContrasenia, aConfirmacion);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void editar_avatarAdmin(int aID_Usuario, String avatar) {
		BD_Usuario_administrador bd = new BD_Usuario_administrador();
		try {
			bd.editar_avatarAdmin(aID_Usuario, avatar);
		}catch(PersistentException e) {
			e.printStackTrace();
		}
	}
	public void subir_video(String aTitulo, String aMiniatura,String contenido, int idAutor, boolean aDeshabilitar_comentarios, TextArea aDescripcion, String aEtiquetas, String categoria, int lista) { 
		BD_Videos bd = new BD_Videos();
		try {
			bd.subir_video(aTitulo, aMiniatura,contenido, idAutor, aDeshabilitar_comentarios, aDescripcion, aEtiquetas, categoria, lista);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void descargar(int aID) {
		BD_Videos bd = new BD_Videos();
		try {
			bd.descargar(aID);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public List<Comentarios> cargar_Comentarios(int aID) {
		BD_Comentarios bd = new BD_Comentarios();
		try {
			List<Comentarios> lista = bd.cargar_Comentarios(aID);
			return lista;
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public void aniade_a_lista(int IDusuario, int aIDvideo, int aIDlista) {
		BD_listas bd = new BD_listas();
		try {
			bd.aniade_a_lista(IDusuario, aIDvideo, aIDlista);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void eliminar_comentarioAdmin(int aIDvideo, int aIDcomentario) {
		BD_Comentarios bd = new BD_Comentarios();
		try {
			bd.eliminar_comentarioAdmin(aIDvideo, aIDcomentario);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void me_gusta(int aIDvideo, int aIDusuario) {
		BD_Videos bd = new BD_Videos();
		try {
			bd.me_gusta(aIDvideo, aIDusuario);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * Comprueba si las suscripciones tienen videos
	 * @return booleano, true Y false N
	 */
	public boolean tienenVideosSuscrito(int idUsuario){
		BD_Videos bd = new BD_Videos();
		boolean boo = false;
		try {
			boo = bd.tienenVideosSuscrito(idUsuario);
			return boo;
		}catch(PersistentException e) {
			e.printStackTrace();
		}
		return boo;
	}
	/**
	 * Devuelve si hay videos en la bd
	 * @return boolean (Hay videos? True - Y False - N)
	 */
	public boolean compruebaVideos() {
		BD_Videos bd = new BD_Videos();
		boolean boo = false;
		try {
			boo = bd.compruebaVideos();
			return boo;
		}catch(PersistentException e) {
			e.printStackTrace();
		}
		return boo;
	}

	public void enviar_comentario(TextArea aTexto, int aIDvideo, int aIDusuario) {
		BD_Comentarios bd = new BD_Comentarios();
		try {
			bd.enviar_comentario(aTexto, aIDvideo, aIDusuario);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void eliminar_Video_De_Lista(int idLista, int idVideo, int idUsuario) {
		BD_listas bd = new BD_listas();
		try {
			bd.eliminar_Video_De_Lista(idLista, idVideo, idUsuario);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void cambiar_Nombre_Lista(int IDlista, int IDusuario, String aNuevo_Nombre) {
		BD_listas bd = new BD_listas();
		try {
			bd.cambiar_Nombre_Lista(IDlista, IDusuario, aNuevo_Nombre);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public Listas_de_reproduccion getVideosMeGusta(int idUsuario) {
		BD_listas bd = new BD_listas();
		Listas_de_reproduccion lista = null;
		try {
			lista = bd.getVideosMeGusta(idUsuario);
		}catch(PersistentException e){
			e.printStackTrace();
		}
		return lista;
	}
	public void crearListaReproduccion(int idUsuario, String nombre) {
		BD_listas bd = new BD_listas();
		try {
			bd.crearListaReproduccion(idUsuario, nombre);
		}catch(PersistentException e) {
			e.printStackTrace();
		}
	}
	public boolean getSiVideoMeGusta(int idVideo, int idUsuario) {
		BD_Videos bd = new BD_Videos();
		boolean boo = false;
		try {
			boo = bd.getSiVideoMeGusta(idVideo,idUsuario);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return boo;
	}
	/**
	 * Metodo a llamar para la visualizacion de video, si no es usuario registrado (El caso de Admin o
	 * invitado , el idUsuario a enviar es -1).
	 */
	public void visualizacionVideo(int idVideo, int idUsuario) {
		BD_listas bd = new BD_listas();
		try {
			bd.visualizacionVideo(idVideo,idUsuario);
		}catch(PersistentException e) {
			e.printStackTrace();
		}
	}
	

	public List<Videos> cargar_Lista_Videos(int aId_Lista, int id_usuario) {
		BD_listas bd = new BD_listas();
		List<Videos> lista = null;
		try {
			lista = bd.cargar_Lista_Videos(aId_Lista,id_usuario);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista;
	}

	public void eliminar_lista_reproduccion(int aID_lista, int IDusuario) {
		BD_listas bd = new BD_listas();
		try {
			bd.eliminar_lista_reproduccion(aID_lista, IDusuario);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Usuario_registrado cargar_Datos_Registrado(int aID_Registrado) {
		BD_Usuario_registrado bd = new BD_Usuario_registrado();
		Usuario_registrado user = null;
		try {
			user = bd.cargar_Datos_Registrado(aID_Registrado);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
	}

	public void editar_avatar(int aID_Usuario, String avatar) {
		BD_Usuario_registrado bd = new BD_Usuario_registrado();
		try {
			bd.editar_avatar(aID_Usuario,avatar);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void modificar_datos(int id, String aNombre, String aApellido, String aApodo, String aAnio, String aEmail, String aContrasenia) {
		BD_Usuario_registrado bd = new BD_Usuario_registrado();
		try {
			bd.modificar_datos(id, aNombre, aApellido, aApodo, aAnio, aEmail, aContrasenia);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void modificar_datosAdmin(int idAdmin, String aNombre, String aApellido, String aApodo, String aEmail, String aContrasenia) {
		BD_Usuario_administrador bd = new BD_Usuario_administrador();
		try {
			bd.modificar_datosAdmin(idAdmin ,aNombre, aApellido, aApodo, aEmail, aContrasenia);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void dejar_de_seguir(int aID_Usuario, int ID_Usuarioseguido) {
		BD_Usuario_registrado bd = new BD_Usuario_registrado();
		try {
			bd.dejar_de_seguir(aID_Usuario,ID_Usuarioseguido);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public List<Usuario_registrado> cargar_Seguidores(int aID_Usuario) {
		BD_Usuario_registrado bd = new BD_Usuario_registrado();
		List<Usuario_registrado> lista = null;
		try {
			lista = bd.cargar_Seguidores(aID_Usuario);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista;
	}

	public List<Usuario_registrado> cargar_Suscripciones(int aID_Usuario) {
		BD_Usuario_registrado bd = new BD_Usuario_registrado();
		List<Usuario_registrado> lista = null;
		try {
			lista = bd.cargar_Suscripciones(aID_Usuario);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista;
	}

	public void suscribirse(int aID_Usuario, int ID_Usuariosusc) {
		BD_Usuario_registrado bd = new BD_Usuario_registrado();
		try {
			bd.suscribirse(aID_Usuario, ID_Usuariosusc);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public List<Listas_de_reproduccion> cargar_Listas_Reproduccion(int aID_Usuario) {
		BD_listas bd = new BD_listas();
		List<Listas_de_reproduccion> lista = null;
		try {
			lista = bd.cargar_Listas_Reproduccion(aID_Usuario);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista;
	}

	public List<Videos> cargar_Videos_Subidos(int aIDUsuario) {
		BD_Videos bd = new BD_Videos();
		List<Videos> lista = null;
		try {
			lista = bd.cargar_Videos_Subidos(aIDUsuario);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista;
	}

	public List<Videos> cargar_Gestion_Videos_Subidos(int aIDUsuario) {
		BD_Videos bd = new BD_Videos();
		List<Videos> lista = null;
		try {
			lista = bd.cargar_Gestion_Videos_Subidos(aIDUsuario);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista;
	}

	public void modificar_video(int aIDVideo, String aTitulo, String aDescripcion, String categoria, String aEtiquetas) {
		BD_Videos bd = new BD_Videos();
		try {
			bd.modificar_video(aIDVideo, aTitulo, aDescripcion, categoria, aEtiquetas);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void eliminar_Video(int aIDVideo) {
		BD_Videos bd = new BD_Videos();
		try {
			bd.eliminarVideo(aIDVideo);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void editar_Miniatura(int aIDVideo,String miniatura) {
		BD_Videos bd = new BD_Videos();
		try {
			bd.editar_Miniatura(aIDVideo,miniatura);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void eliminar_comentario_propio(int aIDUsuario, int aIDComentario, int aIDVideo) {
		BD_Comentarios bd = new BD_Comentarios();
		try {
			bd.eliminar_comentario_propio(aIDUsuario, aIDComentario, aIDVideo);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public List<Videos> Cargar_Videos_Megusta() {
		BD_Videos bd = new BD_Videos();
		List<Videos> lista = null;
		try {
			lista = bd.Cargar_Videos_Megusta();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista;
	}

	public List<Videos> Cargar_Videos_Recientes() {
		BD_Videos bd = new BD_Videos();
		List<Videos> lista = null;
		try {
			lista = bd.Cargar_Videos_Recientes();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista;
	}


	public List<Categorias> Cargar_Categorias() {
		BD_Categorias bd = new BD_Categorias();
		try {
			return bd.Cargar_Categorias();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public List<String> ver_etiquetas(int idVideo) {
		BD_Videos bd = new BD_Videos();
		try {
			return bd.ver_etiquetas(idVideo);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public void recuperar_contrasenia(String aEmail) {
		BD_Usuario_registrado bd = new BD_Usuario_registrado();
		try {
			bd.recuperar_contrasenia(aEmail);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@SuppressWarnings("rawtypes")
	public List buscar(String aTexto, String aTipo) {
		List lista = null;
		if(aTipo.equals("Video")) {
			BD_Videos bd = new BD_Videos();
			try {
				lista = bd.buscar(aTexto);
			} catch (PersistentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return lista;
		}
		
		if(aTipo.equals("Usuario")) {
			BD_Usuario_registrado bd = new BD_Usuario_registrado();
			try {
				lista =  bd.buscar(aTexto);
			} catch (PersistentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return lista;
		}
		else if(aTipo.equals("Categoria")) {
			BD_Videos bd = new BD_Videos();
			try {
				lista =  bd.buscarPorCategoria(aTexto);
			} catch (PersistentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return lista;
		}
		else {
			BD_Videos bd = new BD_Videos();
			try {
				lista =  bd.buscarPorEtiqueta(aTexto);
			} catch (PersistentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return lista;
		}
	}

	public void iniciar_sesion(String aApodo, String aContrasenia) {
		BD_Usuario_registrado bd = new BD_Usuario_registrado();
		try {
			bd.iniciar_sesion(aApodo, aContrasenia);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void Eliminar_video(int aID) {
		BD_Videos bd = new BD_Videos();
		try {
			bd.Eliminar_video(aID);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void crear_categoria(int idAdmin, String aNombre, String aContrasenia, int aEdad, String aImagen, boolean aConfirmacion) {
		BD_Categorias bd = new BD_Categorias();
		try {
			bd.crear_categoria(idAdmin, aNombre, aContrasenia, aEdad, aImagen, aConfirmacion);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public List<Categorias> cargar_Lista_De_Categorias() {
		BD_Categorias bd = new BD_Categorias();
		try {
			return bd.Cargar_Categorias();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public void eliminar_categoria(int aId_categoria) {
		BD_Categorias bd = new BD_Categorias();
		try {
			bd.eliminar_categoria(aId_categoria);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public List<Usuario_registrado> cargar_Lista_Usuarios() {
		BD_Usuario_registrado bd = new BD_Usuario_registrado();
		List<Usuario_registrado> lista = null;
		try {
			lista = bd.cargar_Lista_Usuarios();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista;
	}

	public void editar_Categoria(int id_Categoria, String aNombre_categoria, String aIcono_categoria, int aEdad_categoria) {
		BD_Categorias bd = new BD_Categorias();
		try {
			bd.editarCategoria(id_Categoria, aNombre_categoria, aIcono_categoria, aEdad_categoria);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Usuario_Administrador cargar_datos_admin(int aID_Admin) {
		BD_Usuario_administrador bd = new BD_Usuario_administrador();
		try {
			return bd.cargar_datos_admin(aID_Admin);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public void eliminar_Usuario(int aIDUsuario) {
		BD_Usuario_administrador bd = new BD_Usuario_administrador();
		try {
			bd.eliminar_Usuario(aIDUsuario);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	

	

}