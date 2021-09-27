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
@Table(name="Categorias")
public class Categorias implements Serializable {
	public Categorias() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_CATEGORIAS_VIDEOS) {
			return ORM_videos;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="Id_categoria", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="DATABASE_CATEGORIAS_ID_CATEGORIA_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="DATABASE_CATEGORIAS_ID_CATEGORIA_GENERATOR", strategy="native")	
	private int id_categoria;
	
	@Column(name="Nombre", nullable=true, length=255)	
	private String nombre;
	
	@Column(name="Edad", nullable=false, length=10)	
	private int edad;
	
	@Column(name="Icono", nullable=true, length=255)	
	private String icono;
	
	@OneToMany(mappedBy="categoria", targetEntity=database.Videos.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_videos = new java.util.HashSet();
	
	private void setId_categoria(int value) {
		this.id_categoria = value;
	}
	
	public int getId_categoria() {
		return id_categoria;
	}
	
	public int getORMID() {
		return getId_categoria();
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setEdad(int value) {
		this.edad = value;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setIcono(String value) {
		this.icono = value;
	}
	
	public String getIcono() {
		return icono;
	}
	
	private void setORM_Videos(java.util.Set value) {
		this.ORM_videos = value;
	}
	
	private java.util.Set getORM_Videos() {
		return ORM_videos;
	}
	
	@Transient	
	public final database.VideosSetCollection videos = new database.VideosSetCollection(this, _ormAdapter, ORMConstants.KEY_CATEGORIAS_VIDEOS, ORMConstants.KEY_VIDEOS_CATEGORIA, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId_categoria());
	}
	
}
