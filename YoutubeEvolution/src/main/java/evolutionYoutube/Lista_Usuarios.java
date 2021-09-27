package evolutionYoutube;

import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

public class Lista_Usuarios extends Lista_Usuarios_ventana implements View{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Mi_perfil_Admin _unnamed_Mi_perfil_Admin_;
	public Lista_Usuario _unnamed_Lista_Usuario_;
	public Lista_Video_Usuario _unnamed_Lista_Video_Usuario_;
	
	public Lista_Usuarios() {
		
		listausuarios.addComponent(new Lista_Usuario());
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