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
@Table(name="Listas_de_reproduccion")
public class Listas_de_reproduccion implements Serializable {
	public Listas_de_reproduccion() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_LISTAS_DE_REPRODUCCION_VIDEOS_EN_LISTA) {
			return ORM_videos_en_lista;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_LISTAS_DE_REPRODUCCION_USUARIO_REGISTRADO) {
			this.usuario_registrado = (database.Usuario_registrado) owner;
		}
		
		else if (key == ORMConstants.KEY_LISTAS_DE_REPRODUCCION_USUARIO_QUE_CONSULTA_HISTORIAL) {
			this.usuario_que_consulta_historial = (database.Usuario_registrado) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="Id_lista", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="DATABASE_LISTAS_DE_REPRODUCCION_ID_LISTA_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="DATABASE_LISTAS_DE_REPRODUCCION_ID_LISTA_GENERATOR", strategy="native")	
	private int id_lista;
	
	@OneToOne(targetEntity=database.Usuario_registrado.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="Usuario_registradoUsuariosID2", referencedColumnName="UsuariosID") })	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private database.Usuario_registrado usuario_que_consulta_historial;
	
	@ManyToOne(targetEntity=database.Usuario_registrado.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="Usuario_registradoUsuariosID", referencedColumnName="UsuariosID", nullable=false) })	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private database.Usuario_registrado usuario_registrado;
	
	@Column(name="Num_videos", nullable=false, length=10)	
	private int num_videos;
	
	@Column(name="Nombre", nullable=true, length=255)	
	private String nombre;
	
	@ManyToMany(targetEntity=database.Videos.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Videos_Listas_de_reproduccion2", joinColumns={ @JoinColumn(name="Listas_de_reproduccion2Id_lista") }, inverseJoinColumns={ @JoinColumn(name="VideosId_video") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_videos_en_lista = new java.util.HashSet();
	
	private void setId_lista(int value) {
		this.id_lista = value;
	}
	
	public int getId_lista() {
		return id_lista;
	}
	
	public int getORMID() {
		return getId_lista();
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNum_videos(int value) {
		this.num_videos = value;
	}
	
	public int getNum_videos() {
		return num_videos;
	}
	
	public void setUsuario_registrado(database.Usuario_registrado value) {
		if (usuario_registrado != null) {
			usuario_registrado.listas_de_reproduccion.remove(this);
		}
		if (value != null) {
			value.listas_de_reproduccion.add(this);
		}
	}
	
	public database.Usuario_registrado getUsuario_registrado() {
		return usuario_registrado;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Usuario_registrado(database.Usuario_registrado value) {
		this.usuario_registrado = value;
	}
	
	private database.Usuario_registrado getORM_Usuario_registrado() {
		return usuario_registrado;
	}
	
	private void setORM_Videos_en_lista(java.util.Set value) {
		this.ORM_videos_en_lista = value;
	}
	
	private java.util.Set getORM_Videos_en_lista() {
		return ORM_videos_en_lista;
	}
	
	@Transient	
	public final database.VideosSetCollection videos_en_lista = new database.VideosSetCollection(this, _ormAdapter, ORMConstants.KEY_LISTAS_DE_REPRODUCCION_VIDEOS_EN_LISTA, ORMConstants.KEY_VIDEOS_LISTAS_DE_VIDEOS, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void setUsuario_que_consulta_historial(database.Usuario_registrado value) {
		if (this.usuario_que_consulta_historial != value) {
			database.Usuario_registrado lusuario_que_consulta_historial = this.usuario_que_consulta_historial;
			this.usuario_que_consulta_historial = value;
			if (value != null) {
				usuario_que_consulta_historial.setHistorial_usuario(this);
			}
			if (lusuario_que_consulta_historial != null && lusuario_que_consulta_historial.getHistorial_usuario() == this) {
				lusuario_que_consulta_historial.setHistorial_usuario(null);
			}
		}
	}
	
	public database.Usuario_registrado getUsuario_que_consulta_historial() {
		return usuario_que_consulta_historial;
	}
	
	public String toString() {
		return String.valueOf(getId_lista());
	}
	
}
