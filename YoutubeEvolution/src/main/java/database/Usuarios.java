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
@Table(name="Usuarios")
@Inheritance(strategy=InheritanceType.JOINED)
public class Usuarios implements Serializable {
	public Usuarios() {
	}
	
	@Column(name="ID", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="DATABASE_USUARIOS_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="DATABASE_USUARIOS_ID_GENERATOR", strategy="native")	
	private int ID;
	
	@Column(name="Nombre", nullable=true, length=255)	
	private String nombre;
	
	@Column(name="Apellido", nullable=true, length=255)	
	private String apellido;
	
	@Column(name="Email", nullable=true, length=255)	
	private String email;
	
	@Column(name="Contrasenia", nullable=true, length=255)	
	private String contrasenia;
	
	@Column(name="Apodo", nullable=true, length=255)	
	private String apodo;
	
	@Column(name="Avatar", nullable=true, length=255)	
	private String avatar;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setApellido(String value) {
		this.apellido = value;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setEmail(String value) {
		this.email = value;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setContrasenia(String value) {
		this.contrasenia = value;
	}
	
	public String getContrasenia() {
		return contrasenia;
	}
	
	public void setApodo(String value) {
		this.apodo = value;
	}
	
	public String getApodo() {
		return apodo;
	}
	
	public void setAvatar(String value) {
		this.avatar = value;
	}
	
	public String getAvatar() {
		return avatar;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
