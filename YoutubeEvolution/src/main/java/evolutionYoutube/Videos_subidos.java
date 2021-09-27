package evolutionYoutube;

import java.util.List;

import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Panel;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

import database.BD_general;

public class Videos_subidos extends Videos_subidos_ventana implements View {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Mi_perfil _unnamed_Mi_perfil_;
	public Lista_videos_subidos _unnamed_Lista_videos_subidos_;
	
	public Videos_subidos() {
		
		lista_videos_subidos.addComponent(new Lista_videos_subidos());
		
		principal.addClickListener(new Button.ClickListener() {

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void buttonClick(ClickEvent event) {
				((MyUI) UI.getCurrent()).usuario_registrado();
				
			}
			
		});
		micuenta.addClickListener(new Button.ClickListener() {

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void buttonClick(ClickEvent event) {
				((MyUI) UI.getCurrent()).mi_perfil_registrado();
				
			}
			
		});
		videos_subidos.addClickListener(new Button.ClickListener() {

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void buttonClick(ClickEvent event) {
				((MyUI) UI.getCurrent()).videos_subidos();
				
			}
			
		});
		mis_listas.addClickListener(new Button.ClickListener() {

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void buttonClick(ClickEvent event) {
				((MyUI) UI.getCurrent()).mis_listas();
				
			}
			
		});
		suscripciones.addClickListener(new Button.ClickListener() {

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void buttonClick(ClickEvent event) {
				((MyUI) UI.getCurrent()).suscripciones();
				
			}
			
		});
	}
}