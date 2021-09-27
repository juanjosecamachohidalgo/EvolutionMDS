package evolutionYoutube;

import com.vaadin.server.ExternalResource;
import com.vaadin.ui.Button;
import com.vaadin.ui.Image;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

import database.BD_general;
import database.Videos;

public class Lista_videos_relacionados extends Lista_videos_relacionados_ventana {
	public Lista_videos_relacionados(Videos video) {
		Image img = new Image("",new ExternalResource(video.getMiniatura()));
		img.setWidth("60px");
		miniatura.addComponent(img);
		titulo.setValue(video.getTitulo());
		//Image img2 = new Image("",new ExternalResource("https://image.ibb.co/djBd5J/fondo.jpg"));
		autor.setValue(video.usuarios_que_dan_me_gusta.size()+" Me gusta");
		
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
		// TODO Auto-generated constructor stub
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Pagina_de_inicio_registrado _unnamed_Pagina_de_inicio_registrado_;
}