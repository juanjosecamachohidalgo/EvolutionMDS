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

public class CategoriasDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id_categoria;
	public final StringExpression nombre;
	public final IntegerExpression edad;
	public final StringExpression icono;
	public final CollectionExpression videos;
	
	public CategoriasDetachedCriteria() {
		super(database.Categorias.class, database.CategoriasCriteria.class);
		id_categoria = new IntegerExpression("id_categoria", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		edad = new IntegerExpression("edad", this.getDetachedCriteria());
		icono = new StringExpression("icono", this.getDetachedCriteria());
		videos = new CollectionExpression("ORM_videos", this.getDetachedCriteria());
	}
	
	public CategoriasDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, database.CategoriasCriteria.class);
		id_categoria = new IntegerExpression("id_categoria", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		edad = new IntegerExpression("edad", this.getDetachedCriteria());
		icono = new StringExpression("icono", this.getDetachedCriteria());
		videos = new CollectionExpression("ORM_videos", this.getDetachedCriteria());
	}
	
	public VideosDetachedCriteria createVideosCriteria() {
		return new VideosDetachedCriteria(createCriteria("ORM_videos"));
	}
	
	public Categorias uniqueCategorias(PersistentSession session) {
		return (Categorias) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Categorias[] listCategorias(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Categorias[]) list.toArray(new Categorias[list.size()]);
	}
}

