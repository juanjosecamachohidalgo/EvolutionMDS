package evolutionYoutube;

import com.vaadin.server.ExternalResource;
import com.vaadin.ui.Button;
import com.vaadin.ui.Image;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

import database.BD_general;
import database.Usuario_registrado;
import database.Videos;

public class Video_subido_propietario extends Video_subido_propietario_ventana {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Lista_videos_subidos _unnamed_Lista_videos_subidos_;
	public Visualizacion_video_creador _unnamed_Visualizacion_video_creador_;
	public Modificar_video _unnamed_Modificar_video_;
	public Image browser;
	public Videos vide;

	

	public Video_subido_propietario(Videos vide) {
		this.vide=vide;
		reproducciones.setValue(""+vide.getNumVisualizaciones());
		titulo.setValue(vide.getTitulo());
		categorias.setValue(vide.getCategoria().getNombre()+"");
		etiquetas.setValue(vide.getEtiquetas());
		megusta.setValue(vide.usuarios_que_dan_me_gusta.size()+"");
		descripcion.setValue(vide.getDescrVideo().toString());
		
		
		if(vide.getMiniatura() == null) {
			browser = new Image("",new ExternalResource("https://image.ibb.co/djBd5J/fondo.jpg"));
		}
		else{
			browser = new Image("",new ExternalResource(vide.getMiniatura()));
		}
		browser.setWidth("200px");
		
		miniatura.addComponent(browser);
		
		modificar.addClickListener(new Button.ClickListener() {

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void buttonClick(ClickEvent event) {
				((MyUI) UI.getCurrent()).modificar_video(vide);
				
			}
			
		});
		eliminar.addClickListener(new Button.ClickListener() {

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void buttonClick(ClickEvent event) {
				eliminar_video();
				
			}

			
		});
		editarminiatura.addClickListener(new Button.ClickListener() {

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void buttonClick(ClickEvent event) {
				editar_miniatura();
				browser = new Image("",new ExternalResource(vide.getMiniatura()));
				
			}
			
		});
		vervideo.addClickListener(new Button.ClickListener() {

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void buttonClick(ClickEvent event) {
				((MyUI) UI.getCurrent()).visualizar_video_creador(vide);
				
			}
			
		});
	}
	
	public void editar_miniatura() {
		BD_general bd = new BD_general();
		bd.editar_Miniatura(vide.getId_video(),url.getValue());//IDVIDEO
	}



	public void eliminar_video() {
		BD_general bd = new BD_general();
		bd.Eliminar_video(vide.getId_video());//IDVIDEO
	}
}