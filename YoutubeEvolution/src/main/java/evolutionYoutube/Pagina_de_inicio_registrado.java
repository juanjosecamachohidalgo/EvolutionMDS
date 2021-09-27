package evolutionYoutube;

import java.util.List;

import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Panel;

import database.BD_general;

public class Pagina_de_inicio_registrado extends Pagina_de_inicio_registrado_ventana {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Usuario_Registrado _unnamed_Usuario_Registrado_;
	public Lista_videos_relacionados _unnamed_Lista_videos_relacionados_;
	public Lista_videos_suscripciones _unnamed_Lista_videos_suscripciones_;
	public Pagina_de_inicio_registrado() {
		Inicio_Comun inicio = new Inicio_Comun();
		
		HorizontalLayout layout = new HorizontalLayout();
		HorizontalLayout layout2 = new HorizontalLayout();
			
		inicioComun.addComponent(inicio);
		BD_general bd = new BD_general();
		
		if(MyUI.getUsuarioLogged().videos_que_gustan != null) {
		List<database.Videos> videosRelacionados = bd.Cargar_Videos_Relacionados(MyUI.getUsuarioLogged().getID());
			for(database.Videos video : videosRelacionados) {
				layout.addComponent(new Lista_videos_relacionados(video));
			}
		}
		
		if(bd.tienenVideosSuscrito(MyUI.getUsuarioLogged().getID())==true) {
		List<database.Videos> videosSuscriptores = bd.Cargar_Videos_Suscripciones(MyUI.getUsuarioLogged().getID());
	
			for(database.Videos video2 : videosSuscriptores) {
				layout2.addComponent(new Lista_videos_suscripciones(video2));
			}
		}
		
		
		Panel panel = new Panel("Relacionados");
		panel.setWidth("1000px");
		panel.setHeight("400px");
		layout.setSizeUndefined();

		panel.setContent(layout);
		videosrelacionados.addComponent(panel);
		
		Panel panel2 = new Panel("Videos de suscriptores");
		panel2.setWidth("1000px");
		panel2.setHeight("400px");
		layout2.setSizeUndefined();
		
		panel2.setContent(layout2);
		videossuscriptores.addComponent(panel2);
		
		
	}
}