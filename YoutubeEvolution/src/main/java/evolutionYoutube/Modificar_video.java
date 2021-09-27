package evolutionYoutube;

import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;

import database.BD_general;
import database.Videos;

import com.vaadin.ui.Button.ClickEvent;

public class Modificar_video extends Modificar_video_ventana implements View {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Video_subido_propietario _unnamed_Video_subido_propietario_;
	//public Lista_etiquetas _unnamed_Lista_etiquetas_;
	public Videos vide;

	public Modificar_video(Videos vide) {
		this.vide=vide;
		guardar.addClickListener(new Button.ClickListener() {

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void buttonClick(ClickEvent event) {
				BD_general bd = new BD_general();
				bd.modificar_video(vide.getId_video(), titulo.getValue(), descripcion.getValue(), categoria.getValue(), etiquetas.getValue());
				((MyUI) UI.getCurrent()).videos_subidos();
				
			}
			
		});
		atras.addClickListener(new Button.ClickListener() {

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void buttonClick(ClickEvent event) {
				((MyUI) UI.getCurrent()).videos_subidos();
				
			}
			
		});
	}
	

	
}