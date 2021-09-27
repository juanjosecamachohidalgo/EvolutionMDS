package evolutionYoutube;

import java.util.List;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;

import database.BD_general;

import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Grid;

public class Lista_Categoria extends Lista_Categoria_ventana {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Categorias _unnamed_Categorias_;
	//public Vector<Categoria> _unnamed_Categoria_ = new Vector<Categoria>();
	
	public Lista_Categoria() {
        
		BD_general bd = new BD_general();
		List<database.Categorias> categ = bd.Cargar_Categorias();
		System.out.println(categ);
		Grid<database.Categorias> grid = new Grid<>();
		grid.setItems(categ);
		grid.addColumn(database.Categorias::getNombre).setCaption("Categoría");
		grid.addColumn(database.Categorias::getIcono).setCaption("Icono");
		grid.addColumn(database.Categorias::getEdad).setCaption("Edad");
		grid.setWidth("100%");

		contenido.addComponent(grid);
		MyUI.setGrid(grid);
	
		
		
		crearcategoria.addClickListener(new Button.ClickListener() {

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void buttonClick(ClickEvent event) {
				((MyUI) UI.getCurrent()).crearcategoria();
				
			}
			
		});
		editarcategoria.addClickListener(new Button.ClickListener() {

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void buttonClick(ClickEvent event) {
				((MyUI) UI.getCurrent()).editarcategoria(grid.getSelectionModel().getFirstSelectedItem().get());
				
			}
			
		});
		eliminarcategoria.addClickListener(new Button.ClickListener() {

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void buttonClick(ClickEvent event) {
				BD_general bd = new BD_general();
				bd.eliminar_categoria(grid.getSelectionModel().getFirstSelectedItem().get().getId_categoria());
				((MyUI) UI.getCurrent()).Categorias();
				
				
				
			}
			
		});
		
		
	}
	
	
}