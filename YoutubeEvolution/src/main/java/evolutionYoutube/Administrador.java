package evolutionYoutube;

import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

public class Administrador extends Administrador_ventana implements View{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
   	//public Inicio_Administrador _unnamed_Inicio_Administrador_;
	public Mi_perfil_Admin _unnamed_Mi_perfil_Admin_;
	public Cerrar_Sesion _unnamed_Cerrar_Sesion_;
	public Aniadir_Categoria _unnamed_Aniadir_Categoria_;
public Administrador() {
	cerrarSesion.addComponent(new Cerrar_Sesion());
	inicioComun.addComponent(new Inicio_Comun());
	

	
	aniadirCategoria.addClickListener(new Button.ClickListener() {
		
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		@Override
		public void buttonClick(ClickEvent event) {
			((MyUI) UI.getCurrent()).aniadir_categoria();
		}
	});
	miPerfil.addClickListener(new Button.ClickListener() {

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		@Override
		public void buttonClick(ClickEvent event) {
			((MyUI) UI.getCurrent()).Mi_perfil_Admin();
			
		}
		
	});
	
}


}