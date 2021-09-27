package evolutionYoutube;

import java.io.File;

import com.vaadin.navigator.View;
import com.vaadin.server.ExternalResource;
import com.vaadin.server.FileResource;
import com.vaadin.ui.Button;
import com.vaadin.ui.Image;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

import database.BD_general;
import database.Videos;

public class Visualizacion_video extends Visualizacion_video_ventana implements View {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Lista_comentarios _unnamed_Lista_comentarios_;
	private Videos vide;

	
	
	public Visualizacion_video(Videos vide) {
		this.vide=vide;
		BD_general bd = new BD_general();
		if(MyUI.getUsuarioLogged()==null) {
			bd.visualizacionVideo(vide.getId_video(), -1);
		}
		else {
			bd.visualizacionVideo(vide.getId_video(), MyUI.getUsuarioLogged().getID());
		}
		
		//List<?> listaComents = bd.cargar_Comentarios(1);//PONER ID DEL VIDEO
		//CARGAR COMENTARIOS EN LISTA FOREACH
		etiquetas.setValue(vide.getEtiquetas());
		comentarios.setVisible(false);
		fecha.setValue(vide.getFecha());
		like.setValue(vide.usuarios_que_dan_me_gusta.size()+"");
		descargar.setEnabled(false);
		descargar.setVisible(false);
		aniadirALista.setEnabled(false);
		aniadirALista.setVisible(false);
		
		if(MyUI.getUsuarioLogged()!=null) {
			Lista_comentarios lista = new Lista_comentarios(vide);
			listaComentarios.addComponent(lista);
			Escribir_Comentario escribir = new Escribir_Comentario(vide);
			escribirComentario.addComponent(escribir);
			aniadirALista.setEnabled(true);
			aniadirALista.setVisible(true);
		}
		
		titulo.setValue(vide.getTitulo());
		categoria.setValue(vide.getCategoria().getNombre());
		descripcion.setValue(vide.getDescrVideo()+"");
		visualizaciones.setValue(vide.getNumVisualizaciones()+"");
		
		
		nombre.setValue(vide.getAutor().getApodo()+"");
		Image img = new Image("",new ExternalResource(""+vide.getAutor().getAvatar()));
		img.setWidth("60px");
		img.setHeight("60px");
		avatar.addComponent(img);
		
		avatar.setWidth("20px");
		avatar.setHeight("20px");
		
		
		FileResource resource = new FileResource(new File(vide.getContenidoVideo()));
		video.setSource(resource);
		
		volver.addClickListener(new Button.ClickListener() {

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void buttonClick(ClickEvent event) {
				if(MyUI.getUsuarioLogged()==null) {
					((MyUI) UI.getCurrent()).invitado();
				}
				else if(MyUI.getUsuarioLogged()!=null) {
					((MyUI) UI.getCurrent()).usuario_registrado();
				}
				else if(MyUI.getAdminLogged()!=null) {
					((MyUI) UI.getCurrent()).administrador();
				}
				
				
			}
			
		});
		
		
	}
	public void descargar() {
		BD_general bd = new BD_general();
		bd.descargar(vide.getId_video());
	}
}