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

public class Usuario_AdministradorDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression nombre;
	public final StringExpression apellido;
	public final StringExpression email;
	public final StringExpression contrasenia;
	public final StringExpression apodo;
	public final StringExpression avatar;
	public final IntegerExpression id_Usuario_Administrador;
	
	public Usuario_AdministradorDetachedCriteria() {
		super(database.Usuario_Administrador.class, database.Usuario_AdministradorCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		apellido = new StringExpression("apellido", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		contrasenia = new StringExpression("contrasenia", this.getDetachedCriteria());
		apodo = new StringExpression("apodo", this.getDetachedCriteria());
		avatar = new StringExpression("avatar", this.getDetachedCriteria());
		id_Usuario_Administrador = new IntegerExpression("id_Usuario_Administrador", this.getDetachedCriteria());
	}
	
	public Usuario_AdministradorDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, database.Usuario_AdministradorCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		apellido = new StringExpression("apellido", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		contrasenia = new StringExpression("contrasenia", this.getDetachedCriteria());
		apodo = new StringExpression("apodo", this.getDetachedCriteria());
		avatar = new StringExpression("avatar", this.getDetachedCriteria());
		id_Usuario_Administrador = new IntegerExpression("id_Usuario_Administrador", this.getDetachedCriteria());
	}
	
	public Usuario_Administrador uniqueUsuario_Administrador(PersistentSession session) {
		return (Usuario_Administrador) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Usuario_Administrador[] listUsuario_Administrador(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Usuario_Administrador[]) list.toArray(new Usuario_Administrador[list.size()]);
	}
}

