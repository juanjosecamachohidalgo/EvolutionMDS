package evolutionYoutube;

import java.util.List;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Grid;
import com.vaadin.ui.UI;
import database.Usuario_Administrador;
import database.Usuario_registrado;
import database.Videos;

/**
 * This UI is the application entry point. A UI may either represent a browser window 
 * (or tab) or some part of an HTML page where a Vaadin application is embedded.
 * <p>
 * The UI is initialized using {@link #init(VaadinRequest)}. This method is intended to be 
 * overridden to add component to the user interface and initialize non-component functionality.
 */
@Theme("mytheme")
public class MyUI extends UI implements View{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static Usuario_registrado usuario;
	public static Grid<database.Categorias> grid;
	public static Grid<database.Usuario_registrado> gridListaUsuarios;
	public static Usuario_Administrador admin;

    @Override
    protected void init(VaadinRequest vaadinRequest) {
    	setNavigator(new Navigator(this, this));
    	getNavigator().addView("", new Invitado());
    }
    public static Usuario_registrado getUsuarioLogged() {
		return usuario;
	}
   
    

	public static void setUsuarioLogged(Usuario_registrado user) {
		usuario = user;
	}
	
	public static database.Categorias getCategoria(){
		return grid.getSelectionModel().getFirstSelectedItem().get();
	}
	public static Usuario_Administrador getAdminLogged() {
		return admin;
	}

    public static void setAdminLogged(Usuario_Administrador administrador) {
		admin = administrador;
	}
	public static void setGrid(Grid<database.Categorias> tabla) {
		grid=tabla;
		
	}
	public static void setGridListaUsuarios(Grid<database.Usuario_registrado> tabla) {
		gridListaUsuarios=tabla;
		
	}
	public static database.Usuario_registrado getUsuario(){
		return gridListaUsuarios.getSelectionModel().getFirstSelectedItem().get();
	}
    public void registrarse() {
    	getNavigator().addView("Registro", new Registrarse());
		getNavigator().navigateTo("Registro");
    }
    public void iniciar_sesion() {
    	getNavigator().addView("Iniciar Sesion", new Iniciar_Sesion());
		getNavigator().navigateTo("Iniciar Sesion");
	}
    public void invitado() {
    	getNavigator().addView("Invitado", new Invitado());
		getNavigator().navigateTo("Invitado");
	}
	public void usuario_registrado() {
    	getNavigator().addView("Usuario Registrado", new Usuario_Registrado());
		getNavigator().navigateTo("Usuario Registrado");
	}
	public void videos_subidos() {
    	getNavigator().addView("Videos Subidos", new Videos_subidos());
		getNavigator().navigateTo("Videos Subidos");
	}
	public void mis_listas() {
    	getNavigator().addView("Mis Listas", new Listas_de_reproduccion());
		getNavigator().navigateTo("Mis Listas");
	}
	public void suscripciones() {
    	getNavigator().addView("Suscripciones", new Suscripciones());
		getNavigator().navigateTo("Suscripciones");
	}
	public void subir_video() {
    	getNavigator().addView("Subir video", new Subir_video());
		getNavigator().navigateTo("Subir video");
		
	}
	public void mi_perfil_registrado() {
    	getNavigator().addView("Mi perfil registrado", new Mi_perfil());
		getNavigator().navigateTo("Mi perfil registrado");
	}
	public void modificar_datos_personales() {
    	getNavigator().addView("Modificar datos personales", new Modificar_datos_personales());
		getNavigator().navigateTo("Modificar datos personales");
	}
	public void modificar_video(Videos vide) {
    	getNavigator().addView("Modificar video", new Modificar_video(vide));
		getNavigator().navigateTo("Modificar video");
	}
	public void aniadir_categoria() {
    	getNavigator().addView("Aniadir categoria", new Aniadir_Categoria());
		getNavigator().navigateTo("Aniadir categoria");
		
	}
	public void administrador() {
    	getNavigator().addView("Administrador", new Administrador());
		getNavigator().navigateTo("Administrador");
	}
	public void buscador(List<?> busqueda, String string) {
    	getNavigator().addView("Buscador", new Buscador_videos(busqueda,string));
		getNavigator().navigateTo("Buscador");
	}
	public void perfil_administrador() {
    	getNavigator().addView("Mi perfil Admin", new Mi_perfil_Admin());
		getNavigator().navigateTo("Mi perfil Admin");
		
	}

	public void recordarContrasenia() {
    	getNavigator().addView("Recordar Contrasenia", new Recordar_Contrasenia());
		getNavigator().navigateTo("Recordar Contrasenia");
		
	}
	public void ver_perfil_usuario(Usuario_registrado seguidor) {
    	getNavigator().addView("Ver_perfil_usuario", new Ver_perfil_usuario(seguidor));
		getNavigator().navigateTo("Ver_perfil_usuario");		
		
	}
	public void ver_perfil_registrado(Usuario_registrado seguidor) {
    	getNavigator().addView("Ver_perfil_usuario", new Vista_perfil_Registrado(seguidor));
		getNavigator().navigateTo("Ver_perfil_usuario");		
		
	}
	public void ver_perfil_admin(Usuario_registrado seguidor) {
    	getNavigator().addView("Ver_perfil_usuario", new Vista_perfil_administrador(seguidor));
		getNavigator().navigateTo("Ver_perfil_usuario");		
		
	}
	public void visualizar_video_creador(Videos vide) {
    	getNavigator().addView("Visualizar video creador", new Visualizacion_video_creador(vide));
		getNavigator().navigateTo("Visualizar video creador");		
		
	}
	public void visualizar_video(Videos vide) {
    	getNavigator().addView("Visualizar video", new Visualizacion_video(vide));
		getNavigator().navigateTo("Visualizar video");		
		
	}
	public void visualizar_video_registrado(Videos vide) {
    	getNavigator().addView("Visualizar video registrado", new Visualizacion_video_registrado(vide));
		getNavigator().navigateTo("Visualizar video registrado");		
		
	}
	public void visualizar_video_admin(Videos vide) {
    	getNavigator().addView("Visualizar video admin", new Visualizacion_video_administrador(vide));
		getNavigator().navigateTo("Visualizar video admin");		
		
	}
	public void visualizar_video_comentarios(Videos vide) {
    	getNavigator().addView("Visualizar video comentarios", new Visualizacion_video_comentarios_deshabilitados(vide));
		getNavigator().navigateTo("Visualizar video comentarios");		
		
	}
	
	
	
    @WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = MyUI.class, productionMode = false)
    public static class MyUIServlet extends VaadinServlet {

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
    }


    public void modificar_datos_Admin() {
    	getNavigator().addView("Modificar datos admin", new Modificar_Datos_Admin());
		getNavigator().navigateTo("Modificar datos admin");
		
	}
	public void Mi_perfil_Admin() {
		getNavigator().addView("perfil admin", new Mi_perfil_Admin());
		getNavigator().navigateTo("perfil admin");
		
	}
	public void listausuarios() {
		getNavigator().addView("lista usuarios", new Lista_Usuarios());
		getNavigator().navigateTo("lista usuarios");
		
	}
	public void Categorias() {
		getNavigator().addView("categorias", new Categorias());
		getNavigator().navigateTo("categorias");
		
	}
	public void Lista_Video_Usuario(Usuario_registrado usuario_registrado) {
		getNavigator().addView("lista video usuario", new Lista_Video_Usuario(usuario_registrado));
		getNavigator().navigateTo("lista video usuario");
		
	}
	public void Lista_Usuarios() {
		getNavigator().addView("lista usuarios", new Lista_Usuarios());
		getNavigator().navigateTo("lista usuarios");
		
	}
	public void crearcategoria() {
		getNavigator().addView("crear categoria", new Aniadir_Categoria());
		getNavigator().navigateTo("crear categoria");
		
	}
	public void editarcategoria(database.Categorias categorias) {
		getNavigator().addView("editar categoria", new Editar_Categoria(categorias));
		getNavigator().navigateTo("editar categoria");
		
	}
	public void cambiarnombre(database.Listas_de_reproduccion listas_de_reproduccion) {
		getNavigator().addView("cambiar nombre", new Cambiar_nombre(listas_de_reproduccion));
		getNavigator().navigateTo("cambiar nombre");
		
	}
	public void Editar_lista(database.Listas_de_reproduccion listas_de_reproduccion) {
		getNavigator().addView("editar lista", new Editar_lista(listas_de_reproduccion));
		getNavigator().navigateTo("editar lista");
		
	}
	

	

	


	
	

	
}
