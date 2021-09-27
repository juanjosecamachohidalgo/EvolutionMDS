package evolutionYoutube;

import com.vaadin.server.ExternalResource;
import com.vaadin.ui.Button;
import com.vaadin.ui.Image;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

import database.BD_general;
import database.Usuario_registrado;

public class Suscriptor extends Suscriptores_ventana{
	
	public Lista_Suscriptores _unnamed_Lista_Suscriptores_;
	
	public Suscriptor(Usuario_registrado suscriptor) {
		Image img = new Image("",new ExternalResource(suscriptor.getAvatar()));
		img.setWidth("60px");
		avatar.addComponent(img);
		nombre.setValue(suscriptor.getNombre());
		if(MyUI.getUsuarioLogged()==null) {
			dejardeseguir.setEnabled(false);
			dejardeseguir.setVisible(false);
			
		}
		dejardeseguir.addClickListener(new Button.ClickListener() {

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void buttonClick(ClickEvent event) {
				BD_general bd = new BD_general();
				bd.dejar_de_seguir(MyUI.getUsuarioLogged().getID(), suscriptor.getID());
				((MyUI) UI.getCurrent()).usuario_registrado();
				
			}
			
		});
		
	}
}