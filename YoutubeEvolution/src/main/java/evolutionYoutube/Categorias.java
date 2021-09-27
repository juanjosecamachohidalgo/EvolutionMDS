package evolutionYoutube;

import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

public class Categorias extends Categorias_ventana implements View {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Mi_perfil_Admin _unnamed_Mi_perfil_Admin_;
	//public Edicion_Categorias _unnamed_Edicion_Categorias_;
	public Lista_Categoria _unnamed_Lista_Categoria_;
	
	public Categorias() {
		listacategorias.addComponent(new Lista_Categoria());
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