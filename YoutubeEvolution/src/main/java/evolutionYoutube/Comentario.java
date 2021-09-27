package evolutionYoutube;

import com.vaadin.server.ExternalResource;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Image;

import database.BD_general;
import database.Comentarios;

public class Comentario extends Comentario_ventana{
	public Comentario(Comentarios coment) {
		if(MyUI.getAdminLogged()!=null) {
			eliminar.setEnabled(true);
			eliminar.setVisible(true);
		}
		else if(MyUI.getUsuarioLogged()!=null && coment.getUsuarios_que_comentan().getApodo().equals(MyUI.getUsuarioLogged().getApodo())) {
			eliminar.setEnabled(true);
			eliminar.setVisible(true);
		}
		else {
			eliminar.setEnabled(false);
			eliminar.setVisible(false);
		}
		autor.setValue(coment.getUsuarios_que_comentan().getApodo());
		
		  Image img = new Image("",new ExternalResource(coment.getUsuarios_que_comentan().getAvatar()));
		  img.setWidth("100%");
		  avatar.addComponent(img);
		 
		contenido.setValue(coment.getContenido_comentario());
		
		
		
		eliminar.addClickListener(new Button.ClickListener() {

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void buttonClick(ClickEvent event) {
				BD_general bd = new BD_general();
				if(MyUI.getAdminLogged()!=null) {
					bd.eliminar_comentarioAdmin(coment.getVideosComentados().getId_video(), coment.getId_comentario());
				}
				else if(MyUI.getUsuarioLogged()!=null) {
					bd.eliminar_comentario_propio(coment.getUsuarios_que_comentan().getID(), coment.getId_comentario(), coment.getVideosComentados().getId_video());
				}
				
				
				
				
			}
			
		});
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//private Usuario_Comentario _autor;
	public Lista_comentarios _unnamed_Lista_comentarios_;
	//public Usuario_Comentario _unnamed_Usuario_Comentario_;
	
	
}