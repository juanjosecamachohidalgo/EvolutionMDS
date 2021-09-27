package database;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import org.orm.PersistentException;
import org.orm.PersistentTransaction;


public class BD_Categorias {
	public BD_general _bd_principalCategorias;
	public Vector<Categorias> _contieneCategorias = new Vector<Categorias>();

	/**public List<Categorias> Cargar_Categorias() throws PersistentException {
		Categorias[] lista = null;
		ArrayList<Categorias> listaCateg = new ArrayList<Categorias>();
		PersistentTransaction transaccion = ProyectoMDSPersistentManager.instance().getSession().beginTransaction();
		try {
			CategoriasCriteria crit = new CategoriasCriteria();
			crit.id_categoria.ge(0);
			lista = CategoriasDAO.listCategoriasByCriteria(crit);
			for(Categorias cat : lista) {
				listaCateg.add(cat);
			}
			
		} catch(Exception e) {
			transaccion.rollback();			
		}
		return listaCateg;
	}**/
	@SuppressWarnings("unchecked")
	public List<Categorias> Cargar_Categorias() throws PersistentException {
		List<Categorias> listaCateg = new ArrayList<Categorias>();
		PersistentTransaction transaccion = ProyectoMDSPersistentManager.instance().getSession().beginTransaction();
		try {
			listaCateg = CategoriasDAO.queryCategorias(null, null);
			transaccion.commit();
		} catch(Exception e) {
			transaccion.rollback();			
		}
		return listaCateg;
	}

	public void crear_categoria(int idAdmin, String aNombre, String aContrasenia, int aEdad, String aImagen, boolean aConfirmacion) throws PersistentException {
		PersistentTransaction transaccion = ProyectoMDSPersistentManager.instance().getSession().beginTransaction();
		try {
		if(aConfirmacion == false) {
			throw new RuntimeException("No se ha confirmado.");
		}
		Usuario_Administrador user = database.Usuario_AdministradorDAO.loadUsuario_AdministradorByQuery("ID = " +idAdmin , "1");
		if(!user.getContrasenia().equals(aContrasenia)) {
			throw new RuntimeException("Contrasenia no coincide");
		}
		Categorias categ = database.CategoriasDAO.createCategorias();
		categ.setEdad(aEdad);
		categ.setIcono(aImagen);
		categ.setNombre(aNombre);
		CategoriasDAO.save(categ);
		transaccion.commit();
			
		} catch (Exception e) {
			transaccion.rollback();
			e.printStackTrace();
		}
	}

	public void eliminar_categoria(int aId_categoria) throws PersistentException {
		PersistentTransaction transaccion = ProyectoMDSPersistentManager.instance().getSession().beginTransaction();
		try{
			Categorias cat = database.CategoriasDAO.loadCategoriasByQuery("id_categoria = "+aId_categoria , "1");
			if(cat==null) {
				throw new RuntimeException("NO SE ENCONTRÓ EL ID");
			}
			database.CategoriasDAO.delete(cat);
			transaccion.commit();
		}catch(Exception e) {
			transaccion.rollback();
			e.printStackTrace();
		}
	}

	public void editarCategoria(int id_Categoria, String aNombre_categoria, String aIcono_categoria, int aEdad_categoria) throws PersistentException {
		PersistentTransaction transaccion = ProyectoMDSPersistentManager.instance().getSession().beginTransaction();
		try{
			Categorias cat = database.CategoriasDAO.loadCategoriasByQuery("id_categoria ="+id_Categoria , "1");
		cat.setNombre(aNombre_categoria);
		cat.setIcono(aIcono_categoria);
		cat.setEdad(aEdad_categoria);
		CategoriasDAO.save(cat);
		transaccion.commit();
		}catch(Exception e ) {
			transaccion.rollback();
			e.printStackTrace();
		}
		
	}
}