package evolutionYoutube;

import org.orm.PersistentException;

import com.vaadin.server.ExternalResource;


import com.vaadin.ui.Button;
import com.vaadin.ui.UI;

import database.BD_Usuario_registrado;
import database.BD_general;

import database.Usuario_registrado;

import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Image;

public class Datos_personales extends Datos_personales_ventana{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Mi_cuenta _unnamed_Mi_cuenta_;
	public Modificar_datos_personales _unnamed_Modificar_datos_personales_;
	public Usuario_registrado admin;
	public Image browser;

	
	public Datos_personales() {
		modificar.addClickListener(new Button.ClickListener() {

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void buttonClick(ClickEvent event) {
				((MyUI) UI.getCurrent()).modificar_datos_personales();
				
			}
			
		});
		editaravatar.addClickListener(new Button.ClickListener() {

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void buttonClick(ClickEvent event) {
				editar_avatar();
				
				
			}
			
		});
		BD_general bd = new BD_general();
		admin= bd.cargar_Datos_Registrado(MyUI.getUsuarioLogged().getID());
	    nombre.setValue(""+admin.getNombre());
		apellido.setValue(""+admin.getApellido());
		apodo.setValue(""+admin.getApodo());
		email.setValue(""+admin.getEmail());
		contrasenia.setValue(""+admin.getContrasenia());
		anio.setValue(""+admin.getAnio());
		if(admin.getAvatar() == null) {
			browser = new Image("",new ExternalResource("https://image.ibb.co/djBd5J/fondo.jpg"));
		}
		else{
			browser = new Image("",new ExternalResource(admin.getAvatar()));
		}
		browser.setWidth("100%");
		avatar.addComponent(browser);
	}
	public void editar_avatar() {
		BD_Usuario_registrado bd = new BD_Usuario_registrado();
		try {
			bd.editar_avatar(admin.getID(), url.getValue());
			browser = new Image("",new ExternalResource(admin.getAvatar()));
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}