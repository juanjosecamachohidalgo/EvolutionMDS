/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Juan José(University of Almeria)
 * License Type: Academic
 */
package database;

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class VideosDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id_video;
	public final CollectionExpression usuarios_que_dan_me_gusta;
	public final IntegerExpression categoriaId;
	public final AssociationExpression categoria;
	public final StringExpression miniatura;
	public final StringExpression titulo;
	public final StringExpression descrVideo;
	public final StringExpression fecha;
	public final IntegerExpression numVisualizaciones;
	public final StringExpression contenidoVideo;
	public final StringExpression etiquetas;
	public final IntegerExpression duracion;
	public final CollectionExpression comentarios_en_videos;
	public final IntegerExpression autorId;
	public final AssociationExpression autor;
	public final CollectionExpression listas_de_videos;
	public final CollectionExpression usuario_visualizador;
	
	public VideosDetachedCriteria() {
		super(database.Videos.class, database.VideosCriteria.class);
		id_video = new IntegerExpression("id_video", this.getDetachedCriteria());
		usuarios_que_dan_me_gusta = new CollectionExpression("ORM_usuarios_que_dan_me_gusta", this.getDetachedCriteria());
		categoriaId = new IntegerExpression("categoria.id_categoria", this.getDetachedCriteria());
		categoria = new AssociationExpression("categoria", this.getDetachedCriteria());
		miniatura = new StringExpression("miniatura", this.getDetachedCriteria());
		titulo = new StringExpression("titulo", this.getDetachedCriteria());
		descrVideo = new StringExpression("descrVideo", this.getDetachedCriteria());
		fecha = new StringExpression("fecha", this.getDetachedCriteria());
		numVisualizaciones = new IntegerExpression("numVisualizaciones", this.getDetachedCriteria());
		contenidoVideo = new StringExpression("contenidoVideo", this.getDetachedCriteria());
		etiquetas = new StringExpression("etiquetas", this.getDetachedCriteria());
		duracion = new IntegerExpression("duracion", this.getDetachedCriteria());
		comentarios_en_videos = new CollectionExpression("ORM_comentarios_en_videos", this.getDetachedCriteria());
		autorId = new IntegerExpression("autor.", this.getDetachedCriteria());
		autor = new AssociationExpression("autor", this.getDetachedCriteria());
		listas_de_videos = new CollectionExpression("ORM_listas_de_videos", this.getDetachedCriteria());
		usuario_visualizador = new CollectionExpression("ORM_usuario_visualizador", this.getDetachedCriteria());
	}
	
	public VideosDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, database.VideosCriteria.class);
		id_video = new IntegerExpression("id_video", this.getDetachedCriteria());
		usuarios_que_dan_me_gusta = new CollectionExpression("ORM_usuarios_que_dan_me_gusta", this.getDetachedCriteria());
		categoriaId = new IntegerExpression("categoria.id_categoria", this.getDetachedCriteria());
		categoria = new AssociationExpression("categoria", this.getDetachedCriteria());
		miniatura = new StringExpression("miniatura", this.getDetachedCriteria());
		titulo = new StringExpression("titulo", this.getDetachedCriteria());
		descrVideo = new StringExpression("descrVideo", this.getDetachedCriteria());
		fecha = new StringExpression("fecha", this.getDetachedCriteria());
		numVisualizaciones = new IntegerExpression("numVisualizaciones", this.getDetachedCriteria());
		contenidoVideo = new StringExpression("contenidoVideo", this.getDetachedCriteria());
		etiquetas = new StringExpression("etiquetas", this.getDetachedCriteria());
		duracion = new IntegerExpression("duracion", this.getDetachedCriteria());
		comentarios_en_videos = new CollectionExpression("ORM_comentarios_en_videos", this.getDetachedCriteria());
		autorId = new IntegerExpression("autor.", this.getDetachedCriteria());
		autor = new AssociationExpression("autor", this.getDetachedCriteria());
		listas_de_videos = new CollectionExpression("ORM_listas_de_videos", this.getDetachedCriteria());
		usuario_visualizador = new CollectionExpression("ORM_usuario_visualizador", this.getDetachedCriteria());
	}
	
	public Usuario_registradoDetachedCriteria createUsuarios_que_dan_me_gustaCriteria() {
		return new Usuario_registradoDetachedCriteria(createCriteria("ORM_usuarios_que_dan_me_gusta"));
	}
	
	public CategoriasDetachedCriteria createCategoriaCriteria() {
		return new CategoriasDetachedCriteria(createCriteria("categoria"));
	}
	
	public ComentariosDetachedCriteria createComentarios_en_videosCriteria() {
		return new ComentariosDetachedCriteria(createCriteria("ORM_comentarios_en_videos"));
	}
	
	public Usuario_registradoDetachedCriteria createAutorCriteria() {
		return new Usuario_registradoDetachedCriteria(createCriteria("autor"));
	}
	
	public Listas_de_reproduccionDetachedCriteria createListas_de_videosCriteria() {
		return new Listas_de_reproduccionDetachedCriteria(createCriteria("ORM_listas_de_videos"));
	}
	
	public Usuario_registradoDetachedCriteria createUsuario_visualizadorCriteria() {
		return new Usuario_registradoDetachedCriteria(createCriteria("ORM_usuario_visualizador"));
	}
	
	public Videos uniqueVideos(PersistentSession session) {
		return (Videos) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Videos[] listVideos(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Videos[]) list.toArray(new Videos[list.size()]);
	}
}

