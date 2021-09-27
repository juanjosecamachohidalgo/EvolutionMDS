package evolutionYoutube;

import java.util.List;

import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Panel;

import database.BD_general;

public class Inicio_Comun extends Inicio_comun_ventana{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Invitado _unnamed_Invitado_;
	public Videos_con_mas_megusta videos_con_mas_megusta;
	public Ultimos_videos ultimos_videos;
	public Menu_videos menu_videos;
	public Buscador_videos _unnamed_Buscador_videos_;

	
public Inicio_Comun() {
	
	BD_general bd = new BD_general();
	HorizontalLayout layout = new HorizontalLayout();
	HorizontalLayout layout2 = new HorizontalLayout();
	if(bd.compruebaVideos()==true) {
	List<database.Videos> videosMasMeGusta = bd.Cargar_Videos_Megusta();
	    for(int i = videosMasMeGusta.size()-1;i>=0;i--) {
	    	layout.addComponent(new Videos_con_mas_megusta(videosMasMeGusta.get(i)));
	    }
		
	}
	if(bd.compruebaVideos()==true) {
	List<database.Videos> ultimosVideos = bd.Cargar_Videos_Recientes();
	
		for(database.Videos video : ultimosVideos) {
			layout2.addComponent(new Ultimos_videos(video));
		}
	}
	Panel panel = new Panel("¡Me gusta!");
	panel.setWidth("1000px");
	panel.setHeight("400px");
	layout.setSizeUndefined();

	panel.setContent(layout);
	listas.addComponent(panel);
	
	Panel panel2 = new Panel("Recientes");
	panel2.setWidth("1000px");
	panel2.setHeight("400px");
	layout2.setSizeUndefined();
	
	panel2.setContent(layout2);
	listas2.addComponent(panel2);
	
    
	this.menu_videos= new Menu_videos();
	menuVideos.addComponent(this.menu_videos);
	
}

}