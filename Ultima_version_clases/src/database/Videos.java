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
@Table(name="Videos")
public class Videos implements Serializable {
	public Videos() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_VIDEOS_COMENTARIOS_EN_VIDEOS) {
			return ORM_comentarios_en_videos;
		}
		else if (key == ORMConstants.KEY_VIDEOS_USUARIOS_QUE_DAN_ME_GUSTA) {
			return ORM_usuarios_que_dan_me_gusta;
		}
		else if (key == ORMConstants.KEY_VIDEOS_LISTAS_DE_VIDEOS) {
			return ORM_listas_de_videos;
		}
		else if (key == ORMConstants.KEY_VIDEOS_USUARIO_VISUALIZADOR) {
			return ORM_usuario_visualizador;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_VIDEOS_CATEGORIA) {
			this.categoria = (database.Categorias) owner;
		}
		
		else if (key == ORMConstants.KEY_VIDEOS_AUTOR) {
			this.autor = (database.Usuario_registrado) owner;
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
	
	@Column(name="Id_video", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="DATABASE_VIDEOS_ID_VIDEO_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="DATABASE_VIDEOS_ID_VIDEO_GENERATOR", strategy="native")	
	private int id_video;
	
	@ManyToMany(mappedBy="ORM_videos_que_gustan", targetEntity=database.Usuario_registrado.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_usuarios_que_dan_me_gusta = new java.util.HashSet();
	
	@ManyToOne(targetEntity=database.Categorias.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="Categorias2Id_categoria", referencedColumnName="Id_categoria", nullable=false) })	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private database.Categorias categoria;
	
	@Column(name="Miniatura", nullable=true, length=255)	
	private String miniatura;
	
	@Column(name="Titulo", nullable=true, length=255)	
	private String titulo;
	
	@Column(name="DescrVideo", nullable=true, length=255)	
	private String descrVideo;
	
	@Column(name="Fecha", nullable=true, length=255)	
	private String fecha;
	
	@Column(name="NumVisualizaciones", nullable=false, length=10)	
	private int numVisualizaciones;
	
	@Column(name="ContenidoVideo", nullable=true, length=255)	
	private String contenidoVideo;
	
	@Column(name="Etiquetas", nullable=true, length=255)	
	private String etiquetas;
	
	@Column(name="Duracion", nullable=false, length=10)	
	private int duracion;
	
	@OneToMany(mappedBy="videosComentados", targetEntity=database.Comentarios.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_comentarios_en_videos = new java.util.HashSet();
	
	@ManyToOne(targetEntity=database.Usuario_registrado.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="Usuario_registradoUsuariosID", referencedColumnName="UsuariosID", nullable=false) })	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private database.Usuario_registrado autor;
	
	@ManyToMany(mappedBy="ORM_videos_en_lista", targetEntity=database.Listas_de_reproduccion.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_listas_de_videos = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_video_visualizado", targetEntity=database.Usuario_registrado.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_usuario_visualizador = new java.util.HashSet();
	
	private void setId_video(int value) {
		this.id_video = value;
	}
	
	public int getId_video() {
		return id_video;
	}
	
	public int getORMID() {
		return getId_video();
	}
	
	public void setMiniatura(String value) {
		this.miniatura = value;
	}
	
	public String getMiniatura() {
		return miniatura;
	}
	
	public void setTitulo(String value) {
		this.titulo = value;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setDescrVideo(String value) {
		this.descrVideo = value;
	}
	
	public String getDescrVideo() {
		return descrVideo;
	}
	
	public void setFecha(String value) {
		this.fecha = value;
	}
	
	public String getFecha() {
		return fecha;
	}
	
	public void setNumVisualizaciones(int value) {
		this.numVisualizaciones = value;
	}
	
	public int getNumVisualizaciones() {
		return numVisualizaciones;
	}
	
	public void setContenidoVideo(String value) {
		this.contenidoVideo = value;
	}
	
	public String getContenidoVideo() {
		return contenidoVideo;
	}
	
	public void setEtiquetas(String value) {
		this.etiquetas = value;
	}
	
	public String getEtiquetas() {
		return etiquetas;
	}
	
	public void setDuracion(int value) {
		this.duracion = value;
	}
	
	public int getDuracion() {
		return duracion;
	}
	
	private void setORM_Comentarios_en_videos(java.util.Set value) {
		this.ORM_comentarios_en_videos = value;
	}
	
	private java.util.Set getORM_Comentarios_en_videos() {
		return ORM_comentarios_en_videos;
	}
	
	@Transient	
	public final database.ComentariosSetCollection comentarios_en_videos = new database.ComentariosSetCollection(this, _ormAdapter, ORMConstants.KEY_VIDEOS_COMENTARIOS_EN_VIDEOS, ORMConstants.KEY_COMENTARIOS_VIDEOSCOMENTADOS, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Usuarios_que_dan_me_gusta(java.util.Set value) {
		this.ORM_usuarios_que_dan_me_gusta = value;
	}
	
	private java.util.Set getORM_Usuarios_que_dan_me_gusta() {
		return ORM_usuarios_que_dan_me_gusta;
	}
	
	@Transient	
	public final database.Usuario_registradoSetCollection usuarios_que_dan_me_gusta = new database.Usuario_registradoSetCollection(this, _ormAdapter, ORMConstants.KEY_VIDEOS_USUARIOS_QUE_DAN_ME_GUSTA, ORMConstants.KEY_USUARIO_REGISTRADO_VIDEOS_QUE_GUSTAN, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void setCategoria(database.Categorias value) {
		if (categoria != null) {
			categoria.videos.remove(this);
		}
		if (value != null) {
			value.videos.add(this);
		}
	}
	
	public database.Categorias getCategoria() {
		return categoria;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Categoria(database.Categorias value) {
		this.categoria = value;
	}
	
	private database.Categorias getORM_Categoria() {
		return categoria;
	}
	
	public void setAutor(database.Usuario_registrado value) {
		if (autor != null) {
			autor.video_subido.remove(this);
		}
		if (value != null) {
			value.video_subido.add(this);
		}
	}
	
	public database.Usuario_registrado getAutor() {
		return autor;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Autor(database.Usuario_registrado value) {
		this.autor = value;
	}
	
	private database.Usuario_registrado getORM_Autor() {
		return autor;
	}
	
	private void setORM_Listas_de_videos(java.util.Set value) {
		this.ORM_listas_de_videos = value;
	}
	
	private java.util.Set getORM_Listas_de_videos() {
		return ORM_listas_de_videos;
	}
	
	@Transient	
	public final database.Listas_de_reproduccionSetCollection listas_de_videos = new database.Listas_de_reproduccionSetCollection(this, _ormAdapter, ORMConstants.KEY_VIDEOS_LISTAS_DE_VIDEOS, ORMConstants.KEY_LISTAS_DE_REPRODUCCION_VIDEOS_EN_LISTA, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Usuario_visualizador(java.util.Set value) {
		this.ORM_usuario_visualizador = value;
	}
	
	private java.util.Set getORM_Usuario_visualizador() {
		return ORM_usuario_visualizador;
	}
	
	@Transient	
	public final database.Usuario_registradoSetCollection usuario_visualizador = new database.Usuario_registradoSetCollection(this, _ormAdapter, ORMConstants.KEY_VIDEOS_USUARIO_VISUALIZADOR, ORMConstants.KEY_USUARIO_REGISTRADO_VIDEO_VISUALIZADO, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId_video());
	}
	
}
