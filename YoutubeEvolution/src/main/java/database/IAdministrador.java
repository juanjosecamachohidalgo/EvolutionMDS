package database;
import java.util.List;
public interface IAdministrador {

	public void Eliminar_video(int aID);

	public void crear_categoria(int idAdmin, String aNombre, String aContrasenia, int aEdad, String aImagen, boolean aConfirmacion);

	public List<Categorias> cargar_Lista_De_Categorias();

	public void eliminar_categoria(int aId_categoria);
	
	public void editar_avatarAdmin(int aID_Usuario, String avatar);

	public List<Usuario_registrado> cargar_Lista_Usuarios();

	public void modificar_datosAdmin(int idAdmin, String aNombre, String aApellido, String aApodo, String aEmail, String aContrasenia);
	
	public void editar_Categoria(int id_Categoria, String aNombre_categoria, String aIcono_categoria, int aEdad_categoria);

	public Usuario_Administrador cargar_datos_admin(int aID_Admin);

	public void eliminar_comentarioAdmin(int aIDvideo, int aIDcomentario);
	
	public void eliminar_Usuario(int aIDUsuario);
}