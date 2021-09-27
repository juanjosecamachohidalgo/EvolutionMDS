package evolutionYoutube;

import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;

import database.BD_general;
import database.Videos;

import com.vaadin.ui.Button.ClickEvent;

public class Visualizacion_video_comentarios_deshabilitados extends Visualizacion_video_comentarios_deshabilitados_ventana implements View{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Buscador_videos _unnamed_Buscador_videos_;
	//public Ver_video _unnamed_Ver_video_;

	public Visualizacion_video_comentarios_deshabilitados(Videos vide) {
		BD_general bd = new BD_general();
		Visualizacion_video visu = new Visualizacion_video(vide);
		
		visu.listaComentarios.setEnabled(false);
		visu.listaComentarios.setVisible(false);
		
		//si es usuario
		if(MyUI.getUsuarioLogged()!=null) {
			visu.meGusta.setEnabled(true);
			visu.meGusta.setVisible(true);
			 if(bd.getSiVideoMeGusta(vide.getId_video(), MyUI.getUsuarioLogged().getID())) {
					visu.meGusta.setCaption("Me gusta");
				}
				else {
					visu.meGusta.setCaption("Me gusta -");
				}
		}
		visualizacionComun.addComponent(visu);
		
		visu.volver.addClickListener(new Button.ClickListener() {
			
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void buttonClick(ClickEvent event) {
				volver();
			}
		});
		 visu.meGusta.addClickListener(new Button.ClickListener() {
				
				/**
				 * 
				 */
				private static final long serialVersionUID = 1L;

				@Override
				public void buttonClick(ClickEvent event) {
					
					if(bd.getSiVideoMeGusta(vide.getId_video(), MyUI.getUsuarioLogged().getID())) {
						MyUI.getUsuarioLogged().videos_que_gustan.remove(vide);
						vide.usuarios_que_dan_me_gusta.remove(MyUI.getUsuarioLogged());
						visu.meGusta.setCaption("Me gusta");
						((MyUI) UI.getCurrent()).visualizar_video_registrado(vide);
					}
					else {
						bd.me_gusta(vide.getId_video(), MyUI.getUsuarioLogged().getID());
						visu.meGusta.setCaption("Me gusta -");
						((MyUI) UI.getCurrent()).visualizar_video_registrado(vide);
					}
						
						
					}
					
					
				
			});
	}
	
	

	public void volver() {

		((MyUI) UI.getCurrent()).usuario_registrado();
	}

	

	
}