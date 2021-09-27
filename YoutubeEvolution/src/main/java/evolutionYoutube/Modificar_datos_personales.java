package evolutionYoutube;

import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

import database.BD_general;

public class Modificar_datos_personales extends Modificar_datos_personales_ventana implements View {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Datos_personales _unnamed_Datos_personales_;

	public Modificar_datos_personales() {
		guardar.addClickListener(new Button.ClickListener() {

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void buttonClick(ClickEvent event) {
				guardar();
				((MyUI) UI.getCurrent()).mi_perfil_registrado();
				
			}
			
		});
	    cancelar.addClickListener(new Button.ClickListener() {

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void buttonClick(ClickEvent event) {
				((MyUI) UI.getCurrent()).mi_perfil_registrado();
				
			}
			
		});
	    nombre.setValue(MyUI.getUsuarioLogged().getNombre());
	    apellido.setValue(MyUI.getUsuarioLogged().getApellido());
	    apodo.setValue(MyUI.getUsuarioLogged().getApodo());
	    email.setValue(MyUI.getUsuarioLogged().getEmail());
	    contrasenia.setValue(MyUI.getUsuarioLogged().getContrasenia());
	    repetircontrasenia.setValue(MyUI.getUsuarioLogged().getContrasenia());
	    anio.setValue(MyUI.getUsuarioLogged().getEdad()+"");
	}
	public void guardar() {
		BD_general bd = new BD_general();
		bd.modificar_datos(MyUI.getUsuarioLogged().getID(), nombre.getValue(), apellido.getValue(), apodo.getValue(),anio.getValue(), email.getValue(), contrasenia.getValue());
	}

	
}