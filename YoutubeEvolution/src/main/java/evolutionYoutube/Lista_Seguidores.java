package evolutionYoutube;

import java.util.List;

import com.vaadin.ui.AbstractOrderedLayout;

import database.BD_general;
import database.Usuario_registrado;

public class Lista_Seguidores extends Lista_Seguidores_ventana{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Ver_perfil_usuario _unnamed_Ver_perfil_usuario_;
	public Suscripciones _unnamed_Suscripciones_;
	//public Vector<Seguidor> _unnamed_Seguidor_ = new Vector<Seguidor>();
	
	public Lista_Seguidores() {
		
		BD_general bd = new BD_general();
		if(!bd.cargar_Seguidores(MyUI.getUsuarioLogged().getID()).isEmpty()) {
		List<database.Usuario_registrado> seguidors = bd.cargar_Seguidores(MyUI.getUsuarioLogged().getID());
		for(Usuario_registrado seguidor : seguidors) {
			 seguidores.addComponent(new Seguidor(seguidor));
		}
		}
		
	}

	public Lista_Seguidores(Usuario_registrado user) {
		BD_general bd = new BD_general();
		if(!bd.cargar_Seguidores(user.getID()).isEmpty()) {
		    List<database.Usuario_registrado> seguidors = bd.cargar_Seguidores(user.getID());
		    for(Usuario_registrado seguidor : seguidors) {
			      seguidores.addComponent(new Seguidor(seguidor));
		    }
		
	    }
	 }
		
}