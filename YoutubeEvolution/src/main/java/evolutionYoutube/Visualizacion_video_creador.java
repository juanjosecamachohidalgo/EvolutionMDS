package evolutionYoutube;

import java.util.ArrayList;
import java.util.List;

import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;

import database.BD_general;
import database.Videos;

import com.vaadin.ui.Button.ClickEvent;

public class Visualizacion_video_creador extends Visualizacion_video_creador_ventana implements View {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//public Video_subido_propietario _unnamed_Video_subido_propietario_;
	//public Ver_video _unnamed_Ver_video_;
	public Videos vide;
	public List<database.Listas_de_reproduccion> lista;
	
	
	public Visualizacion_video_creador(Videos vide) {
		this.vide=vide;
		Visualizacion_video visu = new Visualizacion_video(vide);
		
		visu.aniadeALista.setVisible(true);
		visu.aniadeALista.setEnabled(true);
		visu.aniadirALista.setVisible(true);
		visu.aniadirALista.setEnabled(true);
		visu.eliminarVideo.setVisible(true);
		visu.eliminarVideo.setEnabled(true);
		visu.comentarios.setEnabled(true);
		visu.comentarios.setVisible(true);
		BD_general bd = new BD_general();
		//Si hay listas de reproduccion, añadir a combobox
		if(!vide.getAutor().listas_de_reproduccion.isEmpty()){
			lista = bd.cargar_Listas_Reproduccion(vide.getAutor().getID());
			this.lista=lista;
			List<String> listRe = new ArrayList();
			for(database.Listas_de_reproduccion list : lista) {
				listRe.add(list.getNombre());
			}
			visu.comboBox.setItems(listRe);
		}
		
		visualizacionComun.addComponent(visu);
		visu.volver.addClickListener(new Button.ClickListener() {
			
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void buttonClick(ClickEvent event) {
				((MyUI) UI.getCurrent()).usuario_registrado();
				
			}
		});
        visu.eliminarVideo.addClickListener(new Button.ClickListener() {
			
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void buttonClick(ClickEvent event) {
				BD_general bd = new BD_general();
				bd.eliminar_Video(vide.getId_video());
				((MyUI) UI.getCurrent()).usuario_registrado();
				
			}
		});
        visu.descargar.addClickListener(new Button.ClickListener() {
			
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void buttonClick(ClickEvent event) {
				BD_general bd = new BD_general();
				bd.descargar(vide.getId_video());
				
				
			}
		});
        visu.comentarios.addClickListener(new Button.ClickListener() {
			
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void buttonClick(ClickEvent event) {
				deshabilitar_comentario();
				
			}
		});
        visu.aniadeALista.addClickListener(new Button.ClickListener() {
			
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void buttonClick(ClickEvent event) {
				for(database.Listas_de_reproduccion ls : lista) {
					if(ls.getNombre().equals(visu.comboBox.getValue())) {
						aniadir_a_lista(ls);
					}
					
				}
				
				
			}
		});
	}

	public void deshabilitar_comentario() {
		if(!vide.getDescrVideo().contains("*comentarios deshabilitados*")) {
			vide.setDescrVideo("*comentarios deshabilitados*"+vide.getDescrVideo());
			   BD_general bd = new BD_general();
			   bd.modificar_video(vide.getId_video(), vide.getTitulo(), vide.getDescrVideo(), vide.getCategoria().getNombre(), vide.getEtiquetas());
			   ((MyUI) UI.getCurrent()).visualizar_video_creador(vide);
		}
		else if(vide.getDescrVideo().contains("*comentarios deshabilitados*")) {
			vide.setDescrVideo(vide.getDescrVideo().replace("*comentarios deshabilitados*", ""));
			 BD_general bd = new BD_general();
			   bd.modificar_video(vide.getId_video(), vide.getTitulo(), vide.getDescrVideo(), vide.getCategoria().getNombre(), vide.getEtiquetas());
			   ((MyUI) UI.getCurrent()).visualizar_video_creador(vide);
		}
	   
	}

	public void aniadir_a_lista(database.Listas_de_reproduccion ls) {
		BD_general bd = new BD_general();
		
		bd.aniade_a_lista(vide.getAutor().getID(), vide.getId_video(),ls.getId_lista());;//ID VIDEO E ID LISTA
	}
}