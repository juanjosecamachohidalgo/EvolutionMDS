package evolutionYoutube;

import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

public class Mi_perfil_Admin extends Mi_perfil_Admin_ventana implements View{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Administrador _unnamed_Administrador_;
	//public Mi_cuenta_admin _unnamed_Mi_cuenta_admin_;
	public Datos_Admin _unnamed_Datos_Admin_;
	public Categorias _unnamed_Categorias_;
	public Lista_Usuarios _unnamed_Lista_Usuarios_;
	
	
	public Mi_perfil_Admin() {
		
		datosadmin.addComponent(new Datos_Admin());
		cerrar_sesion.addComponent(new Cerrar_Sesion());
		
		
		principal.addClickListener(new Button.ClickListener() {

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void buttonClick(ClickEvent event) {
				((MyUI) UI.getCurrent()).administrador();
				
			}
			
		});
		micuenta.addClickListener(new Button.ClickListener() {

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void buttonClick(ClickEvent event) {
				((MyUI) UI.getCurrent()).Mi_perfil_Admin();
				
			}
			
		});
		lista_usuarios.addClickListener(new Button.ClickListener() {

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void buttonClick(ClickEvent event) {
				((MyUI) UI.getCurrent()).listausuarios();
				
			}
			
		});
		categorias.addClickListener(new Button.ClickListener() {

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void buttonClick(ClickEvent event) {
				((MyUI) UI.getCurrent()).Categorias();
				
			}
			
		});
		
	}


}