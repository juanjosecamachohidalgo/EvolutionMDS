package evolutionYoutube;

import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;

import database.BD_general;
import database.Listas_de_reproduccion;

import com.vaadin.ui.Button.ClickEvent;

public class Cambiar_nombre extends Cambiar_nombre_ventana implements View{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//public Editar_listas_reproduccion _unnamed_Editar_listas_reproduccion_;
	public Listas_de_reproduccion listas_de_reproduccion;
	
	public Cambiar_nombre(Listas_de_reproduccion listas_de_reproduccion) {
		
		this.listas_de_reproduccion=listas_de_reproduccion;
		guardar.addClickListener(new Button.ClickListener() {

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void buttonClick(ClickEvent event) {
				guardar();
				((MyUI) UI.getCurrent()).mis_listas();
				
			}
			
		});
		cancelar.addClickListener(new Button.ClickListener() {

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void buttonClick(ClickEvent event) {
				((MyUI) UI.getCurrent()).mis_listas();
				
			}
			
		});
	}


	public void guardar() {
		BD_general bd = new BD_general();
		bd.cambiar_Nombre_Lista(listas_de_reproduccion.getId_lista(), MyUI.getUsuarioLogged().getID(), nuevonombre.getValue());
	}
}