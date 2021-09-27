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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class VideosCriteria extends AbstractORMCriteria {
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
	
	public VideosCriteria(Criteria criteria) {
		super(criteria);
		id_video = new IntegerExpression("id_video", this);
		usuarios_que_dan_me_gusta = new CollectionExpression("ORM_usuarios_que_dan_me_gusta", this);
		categoriaId = new IntegerExpression("categoria.id_categoria", this);
		categoria = new AssociationExpression("categoria", this);
		miniatura = new StringExpression("miniatura", this);
		titulo = new StringExpression("titulo", this);
		descrVideo = new StringExpression("descrVideo", this);
		fecha = new StringExpression("fecha", this);
		numVisualizaciones = new IntegerExpression("numVisualizaciones", this);
		contenidoVideo = new StringExpression("contenidoVideo", this);
		etiquetas = new StringExpression("etiquetas", this);
		duracion = new IntegerExpression("duracion", this);
		comentarios_en_videos = new CollectionExpression("ORM_comentarios_en_videos", this);
		autorId = new IntegerExpression("autor.", this);
		autor = new AssociationExpression("autor", this);
		listas_de_videos = new CollectionExpression("ORM_listas_de_videos", this);
		usuario_visualizador = new CollectionExpression("ORM_usuario_visualizador", this);
	}
	
	public VideosCriteria(PersistentSession session) {
		this(session.createCriteria(Videos.class));
	}
	
	public VideosCriteria() throws PersistentException {
		this(ProyectoMDSPersistentManager.instance().getSession());
	}
	
	public Usuario_registradoCriteria createUsuarios_que_dan_me_gustaCriteria() {
		return new Usuario_registradoCriteria(createCriteria("ORM_usuarios_que_dan_me_gusta"));
	}
	
	public CategoriasCriteria createCategoriaCriteria() {
		return new CategoriasCriteria(createCriteria("categoria"));
	}
	
	public ComentariosCriteria createComentarios_en_videosCriteria() {
		return new ComentariosCriteria(createCriteria("ORM_comentarios_en_videos"));
	}
	
	public Usuario_registradoCriteria createAutorCriteria() {
		return new Usuario_registradoCriteria(createCriteria("autor"));
	}
	
	public Listas_de_reproduccionCriteria createListas_de_videosCriteria() {
		return new Listas_de_reproduccionCriteria(createCriteria("ORM_listas_de_videos"));
	}
	
	public Usuario_registradoCriteria createUsuario_visualizadorCriteria() {
		return new Usuario_registradoCriteria(createCriteria("ORM_usuario_visualizador"));
	}
	
	public Videos uniqueVideos() {
		return (Videos) super.uniqueResult();
	}
	
	public Videos[] listVideos() {
		java.util.List list = super.list();
		return (Videos[]) list.toArray(new Videos[list.size()]);
	}
}

