package evolutionYoutube;

import com.vaadin.server.ExternalResource;
import com.vaadin.ui.Button;
import com.vaadin.ui.Image;
import com.vaadin.ui.UI;

import database.BD_general;
import database.Listas_de_reproduccion;

import com.vaadin.ui.Button.ClickEvent;

public class Listas_creadas extends Listas_creadas_ventana {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Lista_de_listas _unnamed_Lista_de_listas_;
	public Ver_perfil_usuario _unnamed_Ver_perfil_usuario_;
	//public Editar_listas_reproduccion _unnamed_Editar_listas_reproduccion_;
	
	public Listas_creadas(Listas_de_reproduccion listas_de_reproduccion) {
		Image mini = new Image("",new ExternalResource("https://image.ibb.co/dPqX08/playlist.png"));
		mini.setWidth("60px");
		miniatura.addComponent(mini);
		titulo.setValue(listas_de_reproduccion.getNombre());
		if(MyUI.getUsuarioLogged()==null) {
			editar.setEnabled(false);
			editar.setVisible(false);
			eliminar.setEnabled(false);
			eliminar.setVisible(false);
		}
		
		editar.addClickListener(new Button.ClickListener() {

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			

			@Override
			public void buttonClick(ClickEvent event) {
				
                if(listas_de_reproduccion != null) {
					
				
					((MyUI) UI.getCurrent()).Editar_lista(listas_de_reproduccion);
				
                }
			}

			
		});
		eliminar.addClickListener(new Button.ClickListener() {

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			

			@Override
			public void buttonClick(ClickEvent event) {
				eliminar();
				((MyUI) UI.getCurrent()).mis_listas();
				
			}



			private void eliminar() {
				BD_general bd = new BD_general();
				bd.eliminar_lista_reproduccion(listas_de_reproduccion.getId_lista(), MyUI.getUsuarioLogged().getID());
				
			}

			
		});
	}
}