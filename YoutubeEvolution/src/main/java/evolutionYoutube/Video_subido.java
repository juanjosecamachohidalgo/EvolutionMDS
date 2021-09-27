package evolutionYoutube;

import com.vaadin.server.ExternalResource;
import com.vaadin.ui.Button;
import com.vaadin.ui.Image;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

import database.BD_general;
import database.Videos;

public class Video_subido extends Video_subido_ventana{
	public Video_subido(Videos video) {
		// TODO Auto-generated constructor stub
		Image img = new Image("",new ExternalResource(video.getMiniatura()));
		img.setWidth("80px");
		miniatura.addComponent(img);
		titulo.setValue(video.getTitulo());
		vervideo.addClickListener(new Button.ClickListener() {

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void buttonClick(ClickEvent event) {
				//  SI TIENE COMENTARIOS DESHABILITADOS
				if(video.getDescrVideo().contains("*comentarios deshabilitados*")) {
					((MyUI) UI.getCurrent()).visualizar_video_comentarios(video);
				}
				else {
					//Si es invitado
					if(MyUI.getUsuarioLogged()==null) {
						((MyUI) UI.getCurrent()).visualizar_video(video);
					}
					//si es registrado
					else if(MyUI.getUsuarioLogged()!=null) {
						BD_general bd = new BD_general();
						//si es creador
						if(bd.cargar_Videos_Subidos(MyUI.getUsuarioLogged().getID()).contains(video)) {
							((MyUI) UI.getCurrent()).visualizar_video_creador(video);
						}
						((MyUI) UI.getCurrent()).visualizar_video_registrado(video);
					}
					//si es admin
					else if(MyUI.getAdminLogged()!=null) {
						((MyUI) UI.getCurrent()).visualizar_video_admin(video);
					}
				}
					
				
			}
			
		
					
				
				
			
			
		});
	}
	//public Ver_video _ver_video;
	//public Lista_videos _unnamed_Lista_videos_;
	//public Lista_videos_me_gusta _unnamed_Lista_videos_me_gusta_;
	//public Lista_historial _unnamed_Lista_historial_;
}