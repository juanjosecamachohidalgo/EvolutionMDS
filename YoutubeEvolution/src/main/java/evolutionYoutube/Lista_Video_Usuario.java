package evolutionYoutube;

import java.util.List;
import java.util.Set;

import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.Grid;
import com.vaadin.ui.UI;

import com.vaadin.ui.Button.ClickEvent;

import database.BD_general;
import database.Usuario_registrado;
import database.Videos;

public class Lista_Video_Usuario extends Lista_Video_Usuario_ventana implements View{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Lista_Usuarios _unnamed_Lista_Usuarios_;
	//public Vector<Video_Usuario> _unnamed_Video_Usuario_ = new Vector<Video_Usuario>();
	
	
	public Lista_Video_Usuario(Usuario_registrado user) {
		
        BD_general bd = new BD_general();
	   
	   
	    
		usuario.setValue(user.getNombre()+"");
		List<Videos> videos =  bd.cargar_Videos_Subidos(user.getID());
		Grid<Videos> grid = new Grid<>();
		grid.setItems(videos);
		grid.addColumn(database.Videos::getTitulo).setCaption("Titulo");
		grid.addColumn(database.Videos::getFecha).setCaption("Fecha");
		grid.addColumn(database.Videos::getCategoria).setCaption("Categoría");
		grid.setWidth("100%");

		contenido.addComponent(grid);
		
		atras.addClickListener(new Button.ClickListener() {

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void buttonClick(ClickEvent event) {
				((MyUI) UI.getCurrent()).Lista_Usuarios();
				
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
}