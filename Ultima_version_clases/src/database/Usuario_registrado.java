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
@Table(name="Usuario_registrado")
@Inheritance(strategy=InheritanceType.JOINED)
@PrimaryKeyJoinColumn(name="UsuariosID", referencedColumnName="ID")
public class Usuario_registrado extends database.Usuarios implements Serializable {
	public Usuario_registrado() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_USUARIO_REGISTRADO_COMENTARIOS) {
			return ORM_comentarios;
		}
		else if (key == ORMConstants.KEY_USUARIO_REGISTRADO_VIDEOS_QUE_GUSTAN) {
			return ORM_videos_que_gustan;
		}
		else if (key == ORMConstants.KEY_USUARIO_REGISTRADO_VIDEO_SUBIDO) {
			return ORM_video_subido;
		}
		else if (key == ORMConstants.KEY_USUARIO_REGISTRADO_SUSCRITO) {
			return ORM_suscrito;
		}
		else if (key == ORMConstants.KEY_USUARIO_REGISTRADO_VIDEO_VISUALIZADO) {
			return ORM_video_visualizado;
		}
		else if (key == ORMConstants.KEY_USUARIO_REGISTRADO_LISTAS_DE_REPRODUCCION) {
			return ORM_listas_de_reproduccion;
		}
		else if (key == ORMConstants.KEY_USUARIO_REGISTRADO_SUSCRIPTOR) {
			return ORM_suscriptor;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_USUARIO_REGISTRADO_HISTORIAL_USUARIO) {
			this.historial_usuario = (database.Listas_de_reproduccion) owner;
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
	
	@Column(name="Id_Usuario_registrado", nullable=false, length=10)	
	private int id_Usuario_registrado;
	
	@Column(name="Anio", nullable=true, length=255)	
	private String anio;
	
	@Column(name="NumeroVisitas", nullable=false, length=10)	
	private int numeroVisitas;
	
	@Column(name="Edad", nullable=false, length=10)	
	private int edad;
	
	@ManyToMany(targetEntity=database.Usuario_registrado.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Usuario_registrado_Usuario_registrado", joinColumns={ @JoinColumn(name="Usuario_registradoUsuariosID2") }, inverseJoinColumns={ @JoinColumn(name="Usuario_registradoUsuariosID") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_suscrito = new java.util.HashSet();
	
	@OneToMany(mappedBy="usuarios_que_comentan", targetEntity=database.Comentarios.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_comentarios = new java.util.HashSet();
	
	@ManyToMany(targetEntity=database.Videos.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Videos_Usuario_registrado2", joinColumns={ @JoinColumn(name="Usuario_registradoUsuariosID") }, inverseJoinColumns={ @JoinColumn(name="VideosId_video") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_videos_que_gustan = new java.util.HashSet();
	
	@OneToMany(mappedBy="autor", targetEntity=database.Videos.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_video_subido = new java.util.HashSet();
	
	@ManyToMany(targetEntity=database.Videos.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Videos_Usuario_registrado", joinColumns={ @JoinColumn(name="Usuario_registradoUsuariosID") }, inverseJoinColumns={ @JoinColumn(name="VideosId_video") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_video_visualizado = new java.util.HashSet();
	
	@OneToMany(mappedBy="usuario_registrado", targetEntity=database.Listas_de_reproduccion.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_listas_de_reproduccion = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_suscrito", targetEntity=database.Usuario_registrado.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_suscriptor = new java.util.HashSet();
	
	@OneToOne(mappedBy="usuario_que_consulta_historial", targetEntity=database.Listas_de_reproduccion.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private database.Listas_de_reproduccion historial_usuario;
	
	public void setId_Usuario_registrado(int value) {
		this.id_Usuario_registrado = value;
	}
	
	public int getId_Usuario_registrado() {
		return id_Usuario_registrado;
	}
	
	public void setAnio(String value) {
		this.anio = value;
	}
	
	public String getAnio() {
		return anio;
	}
	
	public void setNumeroVisitas(int value) {
		this.numeroVisitas = value;
	}
	
	public int getNumeroVisitas() {
		return numeroVisitas;
	}
	
	public void setEdad(int value) {
		this.edad = value;
	}
	
	public int getEdad() {
		return edad;
	}
	
	private void setORM_Comentarios(java.util.Set value) {
		this.ORM_comentarios = value;
	}
	
	private java.util.Set getORM_Comentarios() {
		return ORM_comentarios;
	}
	
	@Transient	
	public final database.ComentariosSetCollection comentarios = new database.ComentariosSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIO_REGISTRADO_COMENTARIOS, ORMConstants.KEY_COMENTARIOS_USUARIOS_QUE_COMENTAN, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Videos_que_gustan(java.util.Set value) {
		this.ORM_videos_que_gustan = value;
	}
	
	private java.util.Set getORM_Videos_que_gustan() {
		return ORM_videos_que_gustan;
	}
	
	@Transient	
	public final database.VideosSetCollection videos_que_gustan = new database.VideosSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIO_REGISTRADO_VIDEOS_QUE_GUSTAN, ORMConstants.KEY_VIDEOS_USUARIOS_QUE_DAN_ME_GUSTA, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Video_subido(java.util.Set value) {
		this.ORM_video_subido = value;
	}
	
	private java.util.Set getORM_Video_subido() {
		return ORM_video_subido;
	}
	
	@Transient	
	public final database.VideosSetCollection video_subido = new database.VideosSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIO_REGISTRADO_VIDEO_SUBIDO, ORMConstants.KEY_VIDEOS_AUTOR, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Suscrito(java.util.Set value) {
		this.ORM_suscrito = value;
	}
	
	private java.util.Set getORM_Suscrito() {
		return ORM_suscrito;
	}
	
	@Transient	
	public final database.Usuario_registradoSetCollection suscrito = new database.Usuario_registradoSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIO_REGISTRADO_SUSCRITO, ORMConstants.KEY_USUARIO_REGISTRADO_SUSCRIPTOR, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Video_visualizado(java.util.Set value) {
		this.ORM_video_visualizado = value;
	}
	
	private java.util.Set getORM_Video_visualizado() {
		return ORM_video_visualizado;
	}
	
	@Transient	
	public final database.VideosSetCollection video_visualizado = new database.VideosSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIO_REGISTRADO_VIDEO_VISUALIZADO, ORMConstants.KEY_VIDEOS_USUARIO_VISUALIZADOR, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Listas_de_reproduccion(java.util.Set value) {
		this.ORM_listas_de_reproduccion = value;
	}
	
	private java.util.Set getORM_Listas_de_reproduccion() {
		return ORM_listas_de_reproduccion;
	}
	
	@Transient	
	public final database.Listas_de_reproduccionSetCollection listas_de_reproduccion = new database.Listas_de_reproduccionSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIO_REGISTRADO_LISTAS_DE_REPRODUCCION, ORMConstants.KEY_LISTAS_DE_REPRODUCCION_USUARIO_REGISTRADO, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Suscriptor(java.util.Set value) {
		this.ORM_suscriptor = value;
	}
	
	private java.util.Set getORM_Suscriptor() {
		return ORM_suscriptor;
	}
	
	@Transient	
	public final database.Usuario_registradoSetCollection suscriptor = new database.Usuario_registradoSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIO_REGISTRADO_SUSCRIPTOR, ORMConstants.KEY_USUARIO_REGISTRADO_SUSCRITO, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void setHistorial_usuario(database.Listas_de_reproduccion value) {
		if (this.historial_usuario != value) {
			database.Listas_de_reproduccion lhistorial_usuario = this.historial_usuario;
			this.historial_usuario = value;
			if (value != null) {
				historial_usuario.setUsuario_que_consulta_historial(this);
			}
			if (lhistorial_usuario != null && lhistorial_usuario.getUsuario_que_consulta_historial() == this) {
				lhistorial_usuario.setUsuario_que_consulta_historial(null);
			}
		}
	}
	
	public database.Listas_de_reproduccion getHistorial_usuario() {
		return historial_usuario;
	}
	
	public String toString() {
		return super.toString();
	}
	
}
