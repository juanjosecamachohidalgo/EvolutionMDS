package evolutionYoutube;

import java.util.List;

import database.BD_general;
import database.Videos;

public class Lista_comentarios extends Lista_comentarios_ventana{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Lista_comentarios(Videos vide) {
		BD_general bd = new BD_general();
		if(vide.comentarios_en_videos!=null) {
			List<database.Comentarios> comentario = bd.cargar_Comentarios(vide.getId_video());
			for (database.Comentarios coment : comentario) {
				comentarios.addComponent(new Comentario(coment));
			}
		}
		
		
	}
}