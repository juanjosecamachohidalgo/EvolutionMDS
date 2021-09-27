package evolutionYoutube;

import com.vaadin.server.ExternalResource;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Image;

import database.BD_general;
import database.Usuario_Administrador;

public class Datos_Admin extends Datos_Admin_ventana{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//public Mi_cuenta_admin _unnamed_Mi_cuenta_admin_;
	public Mi_perfil_Admin _unnamed_Mi_cuenta_admin_;

	
	public Datos_Admin() {
		
		
		
		if(MyUI.getAdminLogged().getAvatar() == null) {
			Image img= new Image("",new ExternalResource("https://image.ibb.co/djBd5J/fondo.jpg"));
			img.setWidth("200px");
			avatar.addComponent(img);
		}
		else{
			Image img = new Image("",new ExternalResource(MyUI.getAdminLogged().getAvatar()));
			img.setWidth("200px");
			avatar.addComponent(img);
		}
		
		
		
		
		modificar.addClickListener(new Button.ClickListener() {

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void buttonClick(ClickEvent event) {
				((MyUI) UI.getCurrent()).modificar_datos_Admin();
				
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
				((MyUI) UI.getCurrent()).Mi_perfil_Admin();
				
			}
			
		});
		
		BD_general bd = new BD_general();
		Usuario_Administrador admin= bd.cargar_datos_admin(MyUI.getAdminLogged().getID());
	    nombre.setValue(""+admin.getNombre());
		apellido.setValue(""+admin.getApellido());
		apodo.setValue(""+admin.getApodo());
		email.setValue(""+admin.getEmail());
		contrasenia.setValue(""+admin.getContrasenia());
		
	    
		
	}
	public void editar_avatar() {
	    BD_general bd = new BD_general();
	    bd.editar_avatarAdmin(MyUI.getAdminLogged().getID(), url.getValue());
	}
}