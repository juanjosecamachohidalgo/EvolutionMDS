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

public class UsuariosDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression nombre;
	public final StringExpression apellido;
	public final StringExpression email;
	public final StringExpression contrasenia;
	public final StringExpression apodo;
	public final StringExpression avatar;
	
	public UsuariosDetachedCriteria() {
		super(database.Usuarios.class, database.UsuariosCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		apellido = new StringExpression("apellido", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		contrasenia = new StringExpression("contrasenia", this.getDetachedCriteria());
		apodo = new StringExpression("apodo", this.getDetachedCriteria());
		avatar = new StringExpression("avatar", this.getDetachedCriteria());
	}
	
	public UsuariosDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, database.UsuariosCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		apellido = new StringExpression("apellido", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		contrasenia = new StringExpression("contrasenia", this.getDetachedCriteria());
		apodo = new StringExpression("apodo", this.getDetachedCriteria());
		avatar = new StringExpression("avatar", this.getDetachedCriteria());
	}
	
	public Usuarios uniqueUsuarios(PersistentSession session) {
		return (Usuarios) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Usuarios[] listUsuarios(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Usuarios[]) list.toArray(new Usuarios[list.size()]);
	}
}

