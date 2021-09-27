package evolutionYoutube;

import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

public class Mi_perfil extends Mi_perfil_ventana implements View {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Usuario_Registrado _unnamed_Usuario_Registrado_;
	public Suscripciones _unnamed_Suscripciones_;
	public Mi_cuenta _unnamed_Mi_cuenta_;
	public Videos_subidos _unnamed_Videos_subidos_;
	public Listas_de_reproduccion _unnamed_Listas_de_reproduccion_;

	public Mi_perfil() {
		
		mi_cuenta.addComponent(new Mi_cuenta());
		cerrar_sesion.addComponent(new Cerrar_Sesion());
	
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