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
@Table(name="Comentarios")
public class Comentarios implements Serializable {
	public Comentarios() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_COMENTARIOS_USUARIOS_QUE_COMENTAN) {
			this.usuarios_que_comentan = (database.Usuario_registrado) owner;
		}
		
		else if (key == ORMConstants.KEY_COMENTARIOS_VIDEOSCOMENTADOS) {
			this.videosComentados = (database.Videos) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="Id_comentario", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="DATABASE_COMENTARIOS_ID_COMENTARIO_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="DATABASE_COMENTARIOS_ID_COMENTARIO_GENERATOR", strategy="native")	
	private int id_comentario;
	
	@ManyToOne(targetEntity=database.Videos.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="VideosId_video", referencedColumnName="Id_video", nullable=false) })	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private database.Videos videosComentados;
	
	@ManyToOne(targetEntity=database.Usuario_registrado.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="Usuario_registradoUsuariosID", referencedColumnName="UsuariosID", nullable=false) })	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private database.Usuario_registrado usuarios_que_comentan;
	
	@Column(name="Contenido_comentario", nullable=true, length=255)	
	private String contenido_comentario;
	
	private void setId_comentario(int value) {
		this.id_comentario = value;
	}
	
	public int getId_comentario() {
		return id_comentario;
	}
	
	public int getORMID() {
		return getId_comentario();
	}
	
	public void setContenido_comentario(String value) {
		this.contenido_comentario = value;
	}
	
	public String getContenido_comentario() {
		return contenido_comentario;
	}
	
	public void setUsuarios_que_comentan(database.Usuario_registrado value) {
		if (usuarios_que_comentan != null) {
			usuarios_que_comentan.comentarios.remove(this);
		}
		if (value != null) {
			value.comentarios.add(this);
		}
	}
	
	public database.Usuario_registrado getUsuarios_que_comentan() {
		return usuarios_que_comentan;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Usuarios_que_comentan(database.Usuario_registrado value) {
		this.usuarios_que_comentan = value;
	}
	
	private database.Usuario_registrado getORM_Usuarios_que_comentan() {
		return usuarios_que_comentan;
	}
	
	public void setVideosComentados(database.Videos value) {
		if (videosComentados != null) {
			videosComentados.comentarios_en_videos.remove(this);
		}
		if (value != null) {
			value.comentarios_en_videos.add(this);
		}
	}
	
	public database.Videos getVideosComentados() {
		return videosComentados;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_VideosComentados(database.Videos value) {
		this.videosComentados = value;
	}
	
	private database.Videos getORM_VideosComentados() {
		return videosComentados;
	}
	
	public String toString() {
		return String.valueOf(getId_comentario());
	}
	
}
