package evolutionYoutube;

import java.util.List;
import java.util.Vector;

import database.BD_general;
import database.Usuario_registrado;
import evolutionYoutube.Suscriptor;

public class Lista_Suscriptores extends Lista_Suscriptores_ventana {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Ver_perfil_usuario _unnamed_Ver_perfil_usuario_;
	public Suscripciones _unnamed_Suscripciones_;
	public Vector<Suscriptor> _unnamed_Suscriptor_ = new Vector<Suscriptor>();
	
	public Lista_Suscriptores() {
		BD_general bd = new BD_general();
		if(!bd.cargar_Suscripciones(MyUI.getUsuarioLogged().getID()).isEmpty()) {
			List<database.Usuario_registrado> suscriptors = bd.cargar_Suscripciones(MyUI.getUsuarioLogged().getID());
			for(Usuario_registrado suscriptor : suscriptors) {
				 suscriptores.addComponent(new Suscriptor(suscriptor));
			}
		}
		
	}

	public Lista_Suscriptores(Usuario_registrado user) {
		
		BD_general bd = new BD_general();
		if(!bd.cargar_Suscripciones(user.getID()).isEmpty()) {
			List<database.Usuario_registrado> suscriptors = bd.cargar_Suscripciones(user.getID());
			for(Usuario_registrado suscriptor : suscriptors) {
				 suscriptores.addComponent(new Suscriptor(suscriptor));
			}
		}
		
	}
}