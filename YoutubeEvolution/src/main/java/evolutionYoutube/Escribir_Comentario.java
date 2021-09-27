package evolutionYoutube;

import com.vaadin.server.ExternalResource;
import com.vaadin.ui.Button;
import com.vaadin.ui.Image;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

import database.BD_general;
import database.Videos;

public class Escribir_Comentario extends Escribir_Comentario_ventana{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Comentario _comentario;
	public Visualizacion_video_administrador _unnamed_Visualizacion_video_administrador_;
	public Visualizacion_video_registrado _unnamed_Visualizacion_video_registrado_;
	public Videos vide;

	public Escribir_Comentario(Videos vide) {
		this.vide=vide;
		Image img = new Image("",new ExternalResource(MyUI.getUsuarioLogged().getAvatar()));
		img.setWidth("90%");
		avatar.addComponent(img);
		nombre.setValue(MyUI.getUsuarioLogged().getApodo()+"");
		
		
		enviar.addClickListener(new Button.ClickListener() {

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void buttonClick(ClickEvent event) {
				
				enviar_comentario();
				
				
			}
			
		});
		
	}
	public void enviar_comentario() {
		BD_general bd = new BD_general();
		bd.enviar_comentario(contenido,vide.getId_video(),MyUI.getUsuarioLogged().getID());//1 = idvideo 2 = idusuario
	}
	public Comentario get_comentario() {
		return _comentario;
	}
	public void set_comentario(Comentario _comentario) {
		this._comentario = _comentario;
	}
}