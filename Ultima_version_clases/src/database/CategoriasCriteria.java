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

public class CategoriasCriteria extends AbstractORMCriteria {
	public final IntegerExpression id_categoria;
	public final StringExpression nombre;
	public final IntegerExpression edad;
	public final StringExpression icono;
	public final CollectionExpression videos;
	
	public CategoriasCriteria(Criteria criteria) {
		super(criteria);
		id_categoria = new IntegerExpression("id_categoria", this);
		nombre = new StringExpression("nombre", this);
		edad = new IntegerExpression("edad", this);
		icono = new StringExpression("icono", this);
		videos = new CollectionExpression("ORM_videos", this);
	}
	
	public CategoriasCriteria(PersistentSession session) {
		this(session.createCriteria(Categorias.class));
	}
	
	public CategoriasCriteria() throws PersistentException {
		this(ProyectoMDSPersistentManager.instance().getSession());
	}
	
	public VideosCriteria createVideosCriteria() {
		return new VideosCriteria(createCriteria("ORM_videos"));
	}
	
	public Categorias uniqueCategorias() {
		return (Categorias) super.uniqueResult();
	}
	
	public Categorias[] listCategorias() {
		java.util.List list = super.list();
		return (Categorias[]) list.toArray(new Categorias[list.size()]);
	}
}

