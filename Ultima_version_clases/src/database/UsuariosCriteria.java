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

public class UsuariosCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression nombre;
	public final StringExpression apellido;
	public final StringExpression email;
	public final StringExpression contrasenia;
	public final StringExpression apodo;
	public final StringExpression avatar;
	
	public UsuariosCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		nombre = new StringExpression("nombre", this);
		apellido = new StringExpression("apellido", this);
		email = new StringExpression("email", this);
		contrasenia = new StringExpression("contrasenia", this);
		apodo = new StringExpression("apodo", this);
		avatar = new StringExpression("avatar", this);
	}
	
	public UsuariosCriteria(PersistentSession session) {
		this(session.createCriteria(Usuarios.class));
	}
	
	public UsuariosCriteria() throws PersistentException {
		this(ProyectoMDSPersistentManager.instance().getSession());
	}
	
	public Usuarios uniqueUsuarios() {
		return (Usuarios) super.uniqueResult();
	}
	
	public Usuarios[] listUsuarios() {
		java.util.List list = super.list();
		return (Usuarios[]) list.toArray(new Usuarios[list.size()]);
	}
}

