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

public class Usuario_registradoCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression nombre;
	public final StringExpression apellido;
	public final StringExpression email;
	public final StringExpression contrasenia;
	public final StringExpression apodo;
	public final StringExpression avatar;
	public final IntegerExpression id_Usuario_registrado;
	public final StringExpression anio;
	public final IntegerExpression numeroVisitas;
	public final IntegerExpression edad;
	public final CollectionExpression suscrito;
	public final CollectionExpression comentarios;
	public final CollectionExpression videos_que_gustan;
	public final CollectionExpression video_subido;
	public final CollectionExpression video_visualizado;
	public final CollectionExpression listas_de_reproduccion;
	public final CollectionExpression suscriptor;
	public final IntegerExpression historial_usuarioId;
	public final AssociationExpression historial_usuario;
	
	public Usuario_registradoCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		nombre = new StringExpression("nombre", this);
		apellido = new StringExpression("apellido", this);
		email = new StringExpression("email", this);
		contrasenia = new StringExpression("contrasenia", this);
		apodo = new StringExpression("apodo", this);
		avatar = new StringExpression("avatar", this);
		id_Usuario_registrado = new IntegerExpression("id_Usuario_registrado", this);
		anio = new StringExpression("anio", this);
		numeroVisitas = new IntegerExpression("numeroVisitas", this);
		edad = new IntegerExpression("edad", this);
		suscrito = new CollectionExpression("ORM_suscrito", this);
		comentarios = new CollectionExpression("ORM_comentarios", this);
		videos_que_gustan = new CollectionExpression("ORM_videos_que_gustan", this);
		video_subido = new CollectionExpression("ORM_video_subido", this);
		video_visualizado = new CollectionExpression("ORM_video_visualizado", this);
		listas_de_reproduccion = new CollectionExpression("ORM_listas_de_reproduccion", this);
		suscriptor = new CollectionExpression("ORM_suscriptor", this);
		historial_usuarioId = new IntegerExpression("historial_usuario.", this);
		historial_usuario = new AssociationExpression("historial_usuario", this);
	}
	
	public Usuario_registradoCriteria(PersistentSession session) {
		this(session.createCriteria(Usuario_registrado.class));
	}
	
	public Usuario_registradoCriteria() throws PersistentException {
		this(ProyectoMDSPersistentManager.instance().getSession());
	}
	
	public Usuario_registradoCriteria createSuscritoCriteria() {
		return new Usuario_registradoCriteria(createCriteria("ORM_suscrito"));
	}
	
	public ComentariosCriteria createComentariosCriteria() {
		return new ComentariosCriteria(createCriteria("ORM_comentarios"));
	}
	
	public VideosCriteria createVideos_que_gustanCriteria() {
		return new VideosCriteria(createCriteria("ORM_videos_que_gustan"));
	}
	
	public VideosCriteria createVideo_subidoCriteria() {
		return new VideosCriteria(createCriteria("ORM_video_subido"));
	}
	
	public VideosCriteria createVideo_visualizadoCriteria() {
		return new VideosCriteria(createCriteria("ORM_video_visualizado"));
	}
	
	public Listas_de_reproduccionCriteria createListas_de_reproduccionCriteria() {
		return new Listas_de_reproduccionCriteria(createCriteria("ORM_listas_de_reproduccion"));
	}
	
	public Usuario_registradoCriteria createSuscriptorCriteria() {
		return new Usuario_registradoCriteria(createCriteria("ORM_suscriptor"));
	}
	
	public Listas_de_reproduccionCriteria createHistorial_usuarioCriteria() {
		return new Listas_de_reproduccionCriteria(createCriteria("historial_usuario"));
	}
	
	public Usuario_registrado uniqueUsuario_registrado() {
		return (Usuario_registrado) super.uniqueResult();
	}
	
	public Usuario_registrado[] listUsuario_registrado() {
		java.util.List list = super.list();
		return (Usuario_registrado[]) list.toArray(new Usuario_registrado[list.size()]);
	}
}

