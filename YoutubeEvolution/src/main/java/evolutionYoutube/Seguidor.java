package evolutionYoutube;

import com.vaadin.server.ExternalResource;
import com.vaadin.ui.Button;
import com.vaadin.ui.Image;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

import database.Usuario_registrado;

public class Seguidor extends Seguidores_ventana {
	

	public Lista_Seguidores _unnamed_Lista_Seguidores_;
	
	public Seguidor(Usuario_registrado seguidor) {
		Image img = new Image("",new ExternalResource(seguidor.getAvatar()));
		img.setWidth("60px");
		avatar.addComponent(img);
		nombre.setValue(seguidor.getNombre());
		if(MyUI.getUsuarioLogged()==null) {
			verperfil.setEnabled(false);
			verperfil.setVisible(false);
		
		}
		
		verperfil.addClickListener(new Button.ClickListener() {

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void buttonClick(ClickEvent event) {
				((MyUI) UI.getCurrent()).ver_perfil_usuario(seguidor);
				
			}
			
		});
		
	}
}