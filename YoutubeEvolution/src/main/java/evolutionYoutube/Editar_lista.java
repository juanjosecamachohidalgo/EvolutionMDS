package evolutionYoutube;

import java.util.List;

import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.Grid;
import com.vaadin.ui.UI;

import database.BD_general;
import database.Listas_de_reproduccion;
import database.Videos;

import com.vaadin.ui.Button.ClickEvent;

public class Editar_lista extends Editar_lista_ventana implements View{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Grid<database.Videos> grid;
	public Listas_de_reproduccion listas_de_reproduccion;
	public Editar_lista(Listas_de_reproduccion listas_de_reproduccion) {
		this.listas_de_reproduccion=listas_de_reproduccion;
		BD_general bd = new BD_general();
		
		List<database.Videos> videos = bd.cargar_Lista_Videos(listas_de_reproduccion.getId_lista(), MyUI.getUsuarioLogged().getID());
		titulo.setValue(listas_de_reproduccion.getNombre());
		
		grid = new Grid<>();
		grid.setItems(videos);
		grid.addColumn(database.Videos::getTitulo).setCaption("Titulo");
		grid.addColumn(database.Videos::getContenidoVideo).setCaption("URL");
		grid.addColumn(database.Videos::getCategoria).setCaption("Categoría");
		grid.setWidth("100%");

		contenido.addComponent(grid);
		
	
		cambiarnombre.addClickListener(new Button.ClickListener() {

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void buttonClick(ClickEvent event) {
				((MyUI) UI.getCurrent()).cambiarnombre(listas_de_reproduccion);
				
			}
			
		});
		atras.addClickListener(new Button.ClickListener() {

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void buttonClick(ClickEvent event) {
				((MyUI) UI.getCurrent()).mis_listas();
				
			}
			
		});
		eliminartodo.addClickListener(new Button.ClickListener() {

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void buttonClick(ClickEvent event) {
				BD_general bd = new BD_general();
				List<database.Videos> lista = bd.cargar_Lista_Videos(listas_de_reproduccion.getId_lista(), MyUI.getUsuarioLogged().getID());
				for(database.Videos video : lista) {
					bd.eliminar_Video_De_Lista(listas_de_reproduccion.getId_lista(), video.getId_video(), MyUI.getUsuarioLogged().getID());
				}
				((MyUI) UI.getCurrent()).Editar_lista(listas_de_reproduccion);
				
			}
			
		});
		eliminar.addClickListener(new Button.ClickListener() {

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void buttonClick(ClickEvent event) {
				eliminar_video_lista();
				((MyUI) UI.getCurrent()).Editar_lista(listas_de_reproduccion);
				
			}
			
		});
		vervideo.addClickListener(new Button.ClickListener() {

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void buttonClick(ClickEvent event) {
				BD_general bd = new BD_general();
				//si es admin
				if(MyUI.getAdminLogged()!=null) {
					((MyUI) UI.getCurrent()).visualizar_video_admin(grid.getSelectionModel().getFirstSelectedItem().get());
				}
				//si es creador
				
				else if(MyUI.getUsuarioLogged()!=null && bd.cargar_Videos_Subidos(MyUI.getUsuarioLogged().getID()).contains(grid.getSelectionModel().getFirstSelectedItem().get())==true) {
					((MyUI) UI.getCurrent()).visualizar_video_creador(grid.getSelectionModel().getFirstSelectedItem().get());
				}
				
				
			    //  SI TIENE COMENTARIOS DESHABILITADOS
				else if(grid.getSelectionModel().getFirstSelectedItem().get().getDescrVideo().contains("*comentarios deshabilitados*")) {
					((MyUI) UI.getCurrent()).visualizar_video_comentarios(grid.getSelectionModel().getFirstSelectedItem().get());
				}else {
					//Si es invitado
					if(MyUI.getUsuarioLogged()==null) {
						((MyUI) UI.getCurrent()).visualizar_video(grid.getSelectionModel().getFirstSelectedItem().get());
					}
					
					
						//si es registrado
						else {
							((MyUI) UI.getCurrent()).visualizar_video_registrado(grid.getSelectionModel().getFirstSelectedItem().get());
						}
						
					}
					
					
					
				
				
			}
			
		});
		
	}

	
	public void eliminar_video_lista() {
		BD_general bd = new BD_general();
		for(Videos video : grid.getSelectedItems()) {
			bd.eliminar_Video_De_Lista(listas_de_reproduccion.getId_lista(), video.getId_video(), MyUI.getUsuarioLogged().getID());
		}
	}
}