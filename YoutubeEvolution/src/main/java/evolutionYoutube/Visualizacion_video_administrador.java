package evolutionYoutube;

import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;

import database.BD_general;
import database.Videos;

import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;

public class Visualizacion_video_administrador extends Visualizacion_video_administrador_ventana implements View {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//public Ver_video _unnamed_Ver_video_;
	//public Video_Usuario _unnamed_Video_Usuario_;
	public Escribir_Comentario _unnamed_Escribir_Comentario_;

	
	public Visualizacion_video_administrador(Videos vide) {
		Visualizacion_video visu = new Visualizacion_video(vide);
		visu.eliminarVideo.setVisible(true);
		visu.eliminarVideo.setEnabled(true);
		visu.botonesOpciones.setVisible(true);
		visu.botonesOpciones.setEnabled(true);
		visu.descargar.setVisible(true);
		visu.descargar.setEnabled(true);
		visu.eliminarVideo.addClickListener(new ClickListener() {

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void buttonClick(ClickEvent event) {
				eliminar_video(vide);
				
			}
			
		});
		visu.volver.addClickListener(new Button.ClickListener() {
			
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void buttonClick(ClickEvent event) {
				((MyUI) UI.getCurrent()).administrador();
				
			}
		});
		visualizacionComun.addComponent(visu);
	}
	
	public void eliminar_video(Videos vide) {
		BD_general bd = new BD_general();
		bd.eliminar_Video(vide.getId_video());//AQUI TIENE QUE IR IDVIDEO, QUE SE CARGA CON LA VISUALIZACION
	}

	/**public void eliminar_comentario() {
		BD_general bd = new BD_general();
		bd.eliminar_comentarioAdmin(1,1);//IDVIDEO
	}**/
}