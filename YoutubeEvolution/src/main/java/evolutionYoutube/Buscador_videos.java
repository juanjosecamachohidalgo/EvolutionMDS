package evolutionYoutube;

import java.util.List;

import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.Grid;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

import database.BD_general;
import database.Usuario_registrado;
import database.Videos;

public class Buscador_videos extends Buscador_videos_ventana implements View{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Inicio_Comun _unnamed_Inicio_Comun_;
	public Menu_videos _unnamed_Menu_videos_;
	//public Listado_busqueda _unnamed_Listado_busqueda_;
	//public Vista_video_comun _unnamed_Vista_video_comun_;
	//public Ordenar_videos _unnamed_Ordenar_videos_;
	public Grid<database.Usuario_registrado> grid;
	public Grid<database.Videos> grid2;
	
	public Buscador_videos(List<?> busqueda, String tipo) {
		
		
		if(tipo.equals("Usuario")==true) {
			
		verusuario.setVisible(true);
			
		List<database.Usuario_registrado> usuarios = (List<Usuario_registrado>) busqueda;
		grid = new Grid<>();
		grid.setItems(usuarios);
		grid.addColumn(database.Usuario_registrado::getNombre).setCaption("Categoría");
		grid.addColumn(database.Usuario_registrado::getAvatar).setCaption("Avatar");
		grid.addColumn(database.Usuario_registrado::getNumeroVisitas).setCaption("Visitas");
		grid.setWidth("100%");

		contenido.addComponent(grid);
		}
		else if(tipo.equals("Video")==true) {
			
			vervideo.setVisible(true);
			List<database.Videos> usuarios = (List<Videos>) busqueda;
			grid2 = new Grid<>();
			grid2.setItems(usuarios);
			grid2.addColumn(database.Videos::getTitulo).setCaption("Titulo");
			grid2.addColumn(database.Videos::getNumVisualizaciones).setCaption("Visualizaciones");
			grid2.addColumn(database.Videos::getFecha).setCaption("Fecha");
			grid2.setWidth("100%");
			
			contenido.addComponent(grid2);
			
		}
         
         else if(tipo.equals("Categoria")==true) {
 			
 			vervideo.setVisible(true);
 			List<database.Videos> usuarios = (List<Videos>) busqueda;
 			grid2 = new Grid<>();
 			grid2.setItems(usuarios);
 			grid2.addColumn(database.Videos::getTitulo).setCaption("Titulo");
 			grid2.addColumn(database.Videos::getNumVisualizaciones).setCaption("Visualizaciones");
 			grid2.addColumn(database.Videos::getFecha).setCaption("Fecha");
 			grid2.setWidth("100%");
 			
 			contenido.addComponent(grid2);
 			
 		}
         else if(tipo.equals("Etiqueta")==true) {
 			
 			vervideo.setVisible(true);
 			List<database.Videos> usuarios = (List<Videos>) busqueda;
 			grid2 = new Grid<>();
 			grid2.setItems(usuarios);
 			grid2.addColumn(database.Videos::getTitulo).setCaption("Titulo");
 			grid2.addColumn(database.Videos::getNumVisualizaciones).setCaption("Visualizaciones");
 			grid2.addColumn(database.Videos::getFecha).setCaption("Fecha");
 			grid2.setWidth("100%");
 			
 			contenido.addComponent(grid2);
 			
 		}
		volver.addClickListener(new Button.ClickListener() {

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void buttonClick(ClickEvent event) {
				((MyUI) UI.getCurrent()).invitado();
				
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
					((MyUI) UI.getCurrent()).visualizar_video_admin(grid2.getSelectionModel().getFirstSelectedItem().get());
				}
				//si es creador
				
				else if(MyUI.getUsuarioLogged()!=null && bd.cargar_Videos_Subidos(MyUI.getUsuarioLogged().getID()).contains(grid2.getSelectionModel().getFirstSelectedItem().get())==true) {
					((MyUI) UI.getCurrent()).visualizar_video_creador(grid2.getSelectionModel().getFirstSelectedItem().get());
				}
				
				
			    //  SI TIENE COMENTARIOS DESHABILITADOS
				else if(grid2.getSelectionModel().getFirstSelectedItem().get().getDescrVideo().contains("*comentarios deshabilitados*")) {
					((MyUI) UI.getCurrent()).visualizar_video_comentarios(grid2.getSelectionModel().getFirstSelectedItem().get());
				}else {
					//Si es invitado
					if(MyUI.getUsuarioLogged()==null) {
						((MyUI) UI.getCurrent()).visualizar_video(grid2.getSelectionModel().getFirstSelectedItem().get());
					}
					
					
						//si es registrado
						else {
							((MyUI) UI.getCurrent()).visualizar_video_registrado(grid2.getSelectionModel().getFirstSelectedItem().get());
						}
						
					}
					
					
					
				
				
			}
			
		});
		verusuario.addClickListener(new Button.ClickListener() {

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void buttonClick(ClickEvent event) {
				//si es invitado
				if(MyUI.getUsuarioLogged()==null && MyUI.getAdminLogged()==null) {
					((MyUI) UI.getCurrent()).ver_perfil_usuario(grid.getSelectionModel().getFirstSelectedItem().get());
				}
				//si es registrado
				else if(MyUI.getUsuarioLogged()!=null) {
					((MyUI) UI.getCurrent()).ver_perfil_registrado(grid.getSelectionModel().getFirstSelectedItem().get());
				}
				//si es admin
				else if(MyUI.getAdminLogged()!=null) {
					((MyUI) UI.getCurrent()).ver_perfil_admin(grid.getSelectionModel().getFirstSelectedItem().get());
				}
			
				
			}
			
		});
		
	
		
		
	}
	
}