package evolutionYoutube;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Panel;

import database.BD_general;
import database.Videos;

import evolutionYoutube.Video_subido_propietario;

public class Lista_videos_subidos extends Lista_videos_subidos_ventana {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Videos_subidos _unnamed_Videos_subidos_;
	public Vector<Video_subido_propietario> _unnamed_Video_subido_propietario_ = new Vector<Video_subido_propietario>();

 
	public Lista_videos_subidos() {
		BD_general bd = new BD_general();
		
		HorizontalLayout hz = new HorizontalLayout();
		
		if(MyUI.getUsuarioLogged().video_subido!=null) {
		List<database.Videos> videosSubidos = bd.cargar_Videos_Subidos(MyUI.getUsuarioLogged().getID());
		
			for(database.Videos video : videosSubidos) {
				hz.addComponent(new Video_subido_propietario(video));
			}
		}
		
		Panel panel = new Panel("Mis videos");
		panel.setWidth("1000px");
		panel.setHeight("800px");
		hz.setSizeUndefined();

		panel.setContent(hz);
		lista.addComponent(panel);
	
		
		
		
		
	}
	


}