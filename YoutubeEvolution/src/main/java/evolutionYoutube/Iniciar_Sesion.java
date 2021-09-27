package evolutionYoutube;

import java.util.List;

import org.orm.PersistentException;

import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

import database.BD_Usuario_administrador;
import database.BD_Usuario_registrado;
import database.BD_general;
import database.Usuario_registrado;

public class Iniciar_Sesion extends Iniciar_Sesion_ventana implements View{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Invitado _unnamed_Invitado_;
	public Recordar_Contrasenia _unnamed_Recordar_Contrasenia_;

	
	public Iniciar_Sesion() {
		olvidaPass.addClickListener(new Button.ClickListener() {

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void buttonClick(ClickEvent event) {
				olvida_contrasenia();
			}
			
		});
		iniciarSesion.addClickListener(new Button.ClickListener() {

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void buttonClick(ClickEvent event) {
		
					try {
						iniciar_sesion();
					} catch (PersistentException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
			}
			
		});
		cancelarBoton.addClickListener(new Button.ClickListener() {

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void buttonClick(ClickEvent event) {
				cancelar();
			}
			
		});
	
	
		
	}
	public void cancelar() {
		((MyUI) UI.getCurrent()).invitado();
		
	}

	public void iniciar_sesion() throws PersistentException  {
		BD_general bd = new BD_general();
		bd.iniciar_sesion(email.getValue(), contrasenia.getValue());
		
	    
	 
	}

	public void olvida_contrasenia() {
		((MyUI) UI.getCurrent()).recordarContrasenia();		
	}
}