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

public class Listas_de_reproduccionDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id_lista;
	public final IntegerExpression usuario_que_consulta_historialId;
	public final AssociationExpression usuario_que_consulta_historial;
	public final IntegerExpression usuario_registradoId;
	public final AssociationExpression usuario_registrado;
	public final IntegerExpression num_videos;
	public final StringExpression nombre;
	public final CollectionExpression videos_en_lista;
	
	public Listas_de_reproduccionDetachedCriteria() {
		super(database.Listas_de_reproduccion.class, database.Listas_de_reproduccionCriteria.class);
		id_lista = new IntegerExpression("id_lista", this.getDetachedCriteria());
		usuario_que_consulta_historialId = new IntegerExpression("usuario_que_consulta_historial.", this.getDetachedCriteria());
		usuario_que_consulta_historial = new AssociationExpression("usuario_que_consulta_historial", this.getDetachedCriteria());
		usuario_registradoId = new IntegerExpression("usuario_registrado.", this.getDetachedCriteria());
		usuario_registrado = new AssociationExpression("usuario_registrado", this.getDetachedCriteria());
		num_videos = new IntegerExpression("num_videos", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		videos_en_lista = new CollectionExpression("ORM_videos_en_lista", this.getDetachedCriteria());
	}
	
	public Listas_de_reproduccionDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, database.Listas_de_reproduccionCriteria.class);
		id_lista = new IntegerExpression("id_lista", this.getDetachedCriteria());
		usuario_que_consulta_historialId = new IntegerExpression("usuario_que_consulta_historial.", this.getDetachedCriteria());
		usuario_que_consulta_historial = new AssociationExpression("usuario_que_consulta_historial", this.getDetachedCriteria());
		usuario_registradoId = new IntegerExpression("usuario_registrado.", this.getDetachedCriteria());
		usuario_registrado = new AssociationExpression("usuario_registrado", this.getDetachedCriteria());
		num_videos = new IntegerExpression("num_videos", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		videos_en_lista = new CollectionExpression("ORM_videos_en_lista", this.getDetachedCriteria());
	}
	
	public Usuario_registradoDetachedCriteria createUsuario_que_consulta_historialCriteria() {
		return new Usuario_registradoDetachedCriteria(createCriteria("usuario_que_consulta_historial"));
	}
	
	public Usuario_registradoDetachedCriteria createUsuario_registradoCriteria() {
		return new Usuario_registradoDetachedCriteria(createCriteria("usuario_registrado"));
	}
	
	public VideosDetachedCriteria createVideos_en_listaCriteria() {
		return new VideosDetachedCriteria(createCriteria("ORM_videos_en_lista"));
	}
	
	public Listas_de_reproduccion uniqueListas_de_reproduccion(PersistentSession session) {
		return (Listas_de_reproduccion) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Listas_de_reproduccion[] listListas_de_reproduccion(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Listas_de_reproduccion[]) list.toArray(new Listas_de_reproduccion[list.size()]);
	}
}

