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

public class Listas_de_reproduccionCriteria extends AbstractORMCriteria {
	public final IntegerExpression id_lista;
	public final IntegerExpression usuario_que_consulta_historialId;
	public final AssociationExpression usuario_que_consulta_historial;
	public final IntegerExpression usuario_registradoId;
	public final AssociationExpression usuario_registrado;
	public final IntegerExpression num_videos;
	public final StringExpression nombre;
	public final CollectionExpression videos_en_lista;
	
	public Listas_de_reproduccionCriteria(Criteria criteria) {
		super(criteria);
		id_lista = new IntegerExpression("id_lista", this);
		usuario_que_consulta_historialId = new IntegerExpression("usuario_que_consulta_historial.", this);
		usuario_que_consulta_historial = new AssociationExpression("usuario_que_consulta_historial", this);
		usuario_registradoId = new IntegerExpression("usuario_registrado.", this);
		usuario_registrado = new AssociationExpression("usuario_registrado", this);
		num_videos = new IntegerExpression("num_videos", this);
		nombre = new StringExpression("nombre", this);
		videos_en_lista = new CollectionExpression("ORM_videos_en_lista", this);
	}
	
	public Listas_de_reproduccionCriteria(PersistentSession session) {
		this(session.createCriteria(Listas_de_reproduccion.class));
	}
	
	public Listas_de_reproduccionCriteria() throws PersistentException {
		this(ProyectoMDSPersistentManager.instance().getSession());
	}
	
	public Usuario_registradoCriteria createUsuario_que_consulta_historialCriteria() {
		return new Usuario_registradoCriteria(createCriteria("usuario_que_consulta_historial"));
	}
	
	public Usuario_registradoCriteria createUsuario_registradoCriteria() {
		return new Usuario_registradoCriteria(createCriteria("usuario_registrado"));
	}
	
	public VideosCriteria createVideos_en_listaCriteria() {
		return new VideosCriteria(createCriteria("ORM_videos_en_lista"));
	}
	
	public Listas_de_reproduccion uniqueListas_de_reproduccion() {
		return (Listas_de_reproduccion) super.uniqueResult();
	}
	
	public Listas_de_reproduccion[] listListas_de_reproduccion() {
		java.util.List list = super.list();
		return (Listas_de_reproduccion[]) list.toArray(new Listas_de_reproduccion[list.size()]);
	}
}

