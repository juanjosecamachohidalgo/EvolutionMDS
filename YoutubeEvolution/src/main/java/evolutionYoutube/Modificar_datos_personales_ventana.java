package evolutionYoutube;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.annotations.DesignRoot;
import com.vaadin.ui.Button;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.declarative.Design;

/** 
 * !! DO NOT EDIT THIS FILE !!
 * 
 * This class is generated by Vaadin Designer and will be overwritten.
 * 
 * Please make a subclass with logic and additional interfaces as needed,
 * e.g class LoginView extends LoginDesign implements View { }
 */
@DesignRoot
@AutoGenerated
@SuppressWarnings("serial")
public class Modificar_datos_personales_ventana extends VerticalLayout {
	protected TextField nombre;
	protected TextField apellido;
	protected TextField apodo;
	protected TextField anio;
	protected TextField email;
	protected TextField contrasenia;
	protected TextField repetircontrasenia;
	protected Button guardar;
	protected Button cancelar;

	public Modificar_datos_personales_ventana() {
		Design.read(this);
	}
}
