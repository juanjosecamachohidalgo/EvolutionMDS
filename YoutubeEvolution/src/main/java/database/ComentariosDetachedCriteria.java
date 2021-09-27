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

public class ComentariosDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id_comentario;
	public final IntegerExpression videosComentadosId;
	public final AssociationExpression videosComentados;
	public final IntegerExpression usuarios_que_comentanId;
	public final AssociationExpression usuarios_que_comentan;
	public final StringExpression contenido_comentario;
	
	public ComentariosDetachedCriteria() {
		super(database.Comentarios.class, database.ComentariosCriteria.class);
		id_comentario = new IntegerExpression("id_comentario", this.getDetachedCriteria());
		videosComentadosId = new IntegerExpression("videosComentados.id_video", this.getDetachedCriteria());
		videosComentados = new AssociationExpression("videosComentados", this.getDetachedCriteria());
		usuarios_que_comentanId = new IntegerExpression("usuarios_que_comentan.", this.getDetachedCriteria());
		usuarios_que_comentan = new AssociationExpression("usuarios_que_comentan", this.getDetachedCriteria());
		contenido_comentario = new StringExpression("contenido_comentario", this.getDetachedCriteria());
	}
	
	public ComentariosDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, database.ComentariosCriteria.class);
		id_comentario = new IntegerExpression("id_comentario", this.getDetachedCriteria());
		videosComentadosId = new IntegerExpression("videosComentados.id_video", this.getDetachedCriteria());
		videosComentados = new AssociationExpression("videosComentados", this.getDetachedCriteria());
		usuarios_que_comentanId = new IntegerExpression("usuarios_que_comentan.", this.getDetachedCriteria());
		usuarios_que_comentan = new AssociationExpression("usuarios_que_comentan", this.getDetachedCriteria());
		contenido_comentario = new StringExpression("contenido_comentario", this.getDetachedCriteria());
	}
	
	public VideosDetachedCriteria createVideosComentadosCriteria() {
		return new VideosDetachedCriteria(createCriteria("videosComentados"));
	}
	
	public Usuario_registradoDetachedCriteria createUsuarios_que_comentanCriteria() {
		return new Usuario_registradoDetachedCriteria(createCriteria("usuarios_que_comentan"));
	}
	
	public Comentarios uniqueComentarios(PersistentSession session) {
		return (Comentarios) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Comentarios[] listComentarios(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Comentarios[]) list.toArray(new Comentarios[list.size()]);
	}
}

