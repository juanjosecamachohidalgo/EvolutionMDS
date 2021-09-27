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

public class ComentariosCriteria extends AbstractORMCriteria {
	public final IntegerExpression id_comentario;
	public final IntegerExpression videosComentadosId;
	public final AssociationExpression videosComentados;
	public final IntegerExpression usuarios_que_comentanId;
	public final AssociationExpression usuarios_que_comentan;
	public final StringExpression contenido_comentario;
	
	public ComentariosCriteria(Criteria criteria) {
		super(criteria);
		id_comentario = new IntegerExpression("id_comentario", this);
		videosComentadosId = new IntegerExpression("videosComentados.id_video", this);
		videosComentados = new AssociationExpression("videosComentados", this);
		usuarios_que_comentanId = new IntegerExpression("usuarios_que_comentan.", this);
		usuarios_que_comentan = new AssociationExpression("usuarios_que_comentan", this);
		contenido_comentario = new StringExpression("contenido_comentario", this);
	}
	
	public ComentariosCriteria(PersistentSession session) {
		this(session.createCriteria(Comentarios.class));
	}
	
	public ComentariosCriteria() throws PersistentException {
		this(ProyectoMDSPersistentManager.instance().getSession());
	}
	
	public VideosCriteria createVideosComentadosCriteria() {
		return new VideosCriteria(createCriteria("videosComentados"));
	}
	
	public Usuario_registradoCriteria createUsuarios_que_comentanCriteria() {
		return new Usuario_registradoCriteria(createCriteria("usuarios_que_comentan"));
	}
	
	public Comentarios uniqueComentarios() {
		return (Comentarios) super.uniqueResult();
	}
	
	public Comentarios[] listComentarios() {
		java.util.List list = super.list();
		return (Comentarios[]) list.toArray(new Comentarios[list.size()]);
	}
}

