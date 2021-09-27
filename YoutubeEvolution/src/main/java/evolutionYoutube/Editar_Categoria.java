package evolutionYoutube;

import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;

import database.BD_general;

import com.vaadin.ui.Button.ClickEvent;

public class Editar_Categoria extends Editar_categoria_ventana implements View {
	//public Edicion_Categorias _unnamed_Edicion_Categorias_;
    public database.Categorias categorias;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Editar_Categoria(database.Categorias categorias) {
		this.categorias=categorias;
	
		guardar.addClickListener(new Button.ClickListener() {

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void buttonClick(ClickEvent event) {
				guardar_cambios();
				((MyUI) UI.getCurrent()).Categorias();
				
			}
			
		});
		atras.addClickListener(new Button.ClickListener() {

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void buttonClick(ClickEvent event) {
				((MyUI) UI.getCurrent()).Categorias();
				
			}
			
		});
		nombre.setValue(MyUI.getCategoria().getNombre());
		logo.setValue(MyUI.getCategoria().getIcono());
		edad.setValue(""+MyUI.getCategoria().getEdad());
		
	}
	public void guardar_cambios() {
		BD_general bd = new BD_general();
		bd.editar_Categoria(categorias.getId_categoria(), nombre.getValue(), logo.getValue(), Integer.parseInt(edad.getValue()));
		MyUI.setGrid(null);
	}
}