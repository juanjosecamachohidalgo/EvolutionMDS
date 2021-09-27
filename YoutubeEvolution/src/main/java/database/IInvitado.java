package database;
import java.util.List;
//import evolutionYoutube.Etiqueta;

public interface IInvitado {

	public List<Videos> Cargar_Videos_Megusta();

	public List<Videos> Cargar_Videos_Recientes();

	public List<Categorias> Cargar_Categorias();

	public List<String> ver_etiquetas(int idVideo);

	public void recuperar_contrasenia(String aEmail);

	@SuppressWarnings("rawtypes")
	public List buscar(String aTexto, String aTipo);

	public void iniciar_sesion(String aApodo, String aContrasenia);
}