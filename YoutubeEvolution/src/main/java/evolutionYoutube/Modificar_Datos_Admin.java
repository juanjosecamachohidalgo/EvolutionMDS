package evolutionYoutube;

import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;

import database.BD_general;

import com.vaadin.ui.Button.ClickEvent;

public class Modificar_Datos_Admin extends Modificar_Datos_Admin_ventana implements View {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//public Mi_cuenta_admin _unnamed_Mi_cuenta_admin_;
	public Datos_Admin _unnamed_Mi_cuenta_admin_;

	
	public Modificar_Datos_Admin() {
		guardar.addClickListener(new Button.ClickListener() {

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void buttonClick(ClickEvent event) {
				guardar();
				((MyUI) UI.getCurrent()).Mi_perfil_Admin();
				
			}
			
		});
	    cancelar.addClickListener(new Button.ClickListener() {

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void buttonClick(ClickEvent event) {
				((MyUI) UI.getCurrent()).Mi_perfil_Admin();
				
			}
			
		});
	    nombre.setValue(MyUI.getAdminLogged().getNombre());
	    apellido.setValue(MyUI.getAdminLogged().getApellido());
	    apodo.setValue(MyUI.getAdminLogged().getApodo());
	    email.setValue(MyUI.getAdminLogged().getEmail());
	    contrasenia.setValue(MyUI.getAdminLogged().getContrasenia());
	    repetircontrasenia.setValue(MyUI.getAdminLogged().getContrasenia());
	  
	}
	public void guardar() {
		BD_general bd = new BD_general();
		bd.modificar_datosAdmin(MyUI.getAdminLogged().getID(),nombre.getValue(),apellido.getValue(), apodo.getValue(), email.getValue(), contrasenia.getValue());
	}

	
}