package evolutionYoutube;

import java.util.List;

import com.vaadin.server.ExternalResource;
import com.vaadin.ui.Button;
import com.vaadin.ui.Image;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

import database.BD_general;
import database.Videos;

public class Videos_con_mas_megusta extends Videos_con_mas_megusta_ventana {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Inicio_Comun _unnamed_Inicio_Comun_;
	
	
	
	public Videos_con_mas_megusta(Videos video) {
		Image img = new Image("",new ExternalResource(video.getMiniatura()));
		img.setWidth("100px");
		miniatura.setHeight("-1px");
		miniatura.setMargin(false);
		miniatura.addComponent(img);
		titulo.setValue(video.getTitulo());
		autor.setValue(video.usuarios_que_dan_me_gusta.size()+" Me Gusta");
		
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
}