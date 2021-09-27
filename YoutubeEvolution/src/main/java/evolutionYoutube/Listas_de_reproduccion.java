package evolutionYoutube;

import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

public class Listas_de_reproduccion extends Listas_de_reproduccion_ventana implements View {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Mi_perfil _unnamed_Mi_perfil_;
	public Lista_de_listas _unnamed_Lista_de_listas_;
	
	public Listas_de_reproduccion() {
		listas.addComponent(new Lista_de_listas());
		
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