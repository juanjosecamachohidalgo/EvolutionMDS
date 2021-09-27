package evolutionYoutube;

import java.util.List;

import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

import database.BD_general;
import database.Videos;

public class Visualizacion_video_registrado extends Visualizacion_video_registrado_ventana implements View {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//public Ver_video _unnamed_Ver_video_;
	public Escribir_Comentario _unnamed_Escribir_Comentario_;
	
	
	public Visualizacion_video_registrado(Videos vide) {
		BD_general bd = new BD_general();
		
		Visualizacion_video visu = new Visualizacion_video(vide);
		visu.meGusta.setEnabled(true);
		visu.meGusta.setVisible(true);
		
		
		
		//si es usuario
				if(MyUI.getUsuarioLogged()!=null) {
					 if(bd.getSiVideoMeGusta(vide.getId_video(), MyUI.getUsuarioLogged().getID())) {
							visu.meGusta.setCaption("No gusta");
						}
						else {
							visu.meGusta.setCaption("Me gusta");
						}
				}
		
				
       
		visu.volver.addClickListener(new Button.ClickListener() {
			
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void buttonClick(ClickEvent event) {
				((MyUI) UI.getCurrent()).usuario_registrado();
				
			}
		});
		
        visu.meGusta.addClickListener(new Button.ClickListener() {
			
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void buttonClick(ClickEvent event) {
				
					me_gusta(vide);
					((MyUI) UI.getCurrent()).visualizar_video_registrado(vide);
				
				
				
			}
		});
        visualizacionComun.addComponent(visu);
	}

	

	public void me_gusta(Videos vide) {
		BD_general bd = new BD_general();
		bd.me_gusta(vide.getId_video(), MyUI.getUsuarioLogged().getID());
	}
}