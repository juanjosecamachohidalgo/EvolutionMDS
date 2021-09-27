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

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Usuario_Administrador")
@Inheritance(strategy=InheritanceType.JOINED)
@PrimaryKeyJoinColumn(name="UsuariosID", referencedColumnName="ID")
public class Usuario_Administrador extends database.Usuarios implements Serializable {
	public Usuario_Administrador() {
	}
	
	@Column(name="Id_Usuario_Administrador", nullable=false, length=10)	
	private int id_Usuario_Administrador;
	
	public void setId_Usuario_Administrador(int value) {
		this.id_Usuario_Administrador = value;
	}
	
	public int getId_Usuario_Administrador() {
		return id_Usuario_Administrador;
	}
	
	public String toString() {
		return super.toString();
	}
	
}
