package evolutionYoutube;

import java.util.List;
import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.Grid;
import com.vaadin.ui.Image;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

import database.BD_general;

public class Lista_Usuario extends Lista_Usuario_ventana implements View {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Lista_Usuarios _unnamed_Lista_Usuarios_;
	//public Vector<Usuario_Comentario> _unnamed_Usuario_Comentario_ = new Vector<Usuario_Comentario>();

	
	public Lista_Usuario() {
		
		
		BD_general bd = new BD_general();
		List<database.Usuario_registrado> user = bd.cargar_Lista_Usuarios();
		Grid<database.Usuario_registrado> grid = new Grid<>();
		grid.setItems(user);
		grid.addColumn(database.Usuario_registrado::getAvatar).setCaption("Avatar");
		grid.addColumn(database.Usuario_registrado::getApodo).setCaption("Apodo");
		grid.addColumn(database.Usuario_registrado::getAnio).setCaption("Fecha");
		grid.setWidth("100%");

		contenido.addComponent(grid);
		MyUI.setGridListaUsuarios(grid);
		vervideos.addClickListener(new Button.ClickListener() {

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void buttonClick(ClickEvent event) {
				((MyUI) UI.getCurrent()).Lista_Video_Usuario(grid.getSelectionModel().getFirstSelectedItem().get());
				
			}
			
		});
		
	}
	
}