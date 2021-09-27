package evolutionYoutube;


import com.vaadin.server.ExternalResource;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Image;
import com.vaadin.ui.UI;

import database.BD_general;

public class Listas_fijas_reproduccion extends Listas_fijas_reproduccion_ventana {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Lista_de_listas _unnamed_Lista_de_listas_;
	//public Lista_videos_me_gusta _unnamed_Lista_videos_me_gusta_;
	//public Lista_historial _unnamed_Lista_historial_;

	
	public Listas_fijas_reproduccion() {
		Image mini = new Image("",new ExternalResource("https://image.ibb.co/dPqX08/playlist.png"));
		mini.setWidth("60px");
		Image mini2 = new Image("",new ExternalResource("https://image.ibb.co/dPqX08/playlist.png"));
		mini2.setWidth("60px");
		miniatura.addComponent(mini);
		miniatura2.addComponent(mini2);
		
		editar.addClickListener(new Button.ClickListener() {

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			

			@Override
			public void buttonClick(ClickEvent event) {
				if(MyUI.getUsuarioLogged().getHistorial_usuario() != null) {
					((MyUI) UI.getCurrent()).Editar_lista(MyUI.getUsuarioLogged().getHistorial_usuario());
				}
				
				
				
			}

			
		});
		editar2.addClickListener(new Button.ClickListener() {

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			

			@Override
			public void buttonClick(ClickEvent event) {
				BD_general bd = new BD_general();
                if(bd.getVideosMeGusta(MyUI.getUsuarioLogged().getID()) != null) {
                	((MyUI) UI.getCurrent()).Editar_lista(bd.getVideosMeGusta(MyUI.getUsuarioLogged().getID()));
				}
				
					
					
				
				
				
			}

			
		});
	}
}