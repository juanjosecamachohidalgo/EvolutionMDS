package evolutionYoutube;
//import evolutionYoutube.Edicion_Categorias;

import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.UI;

import database.BD_general;
import evolutionYoutube.Administrador;

public class Aniadir_Categoria extends Aniadir_Categoria_ventana implements View {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//public Edicion_Categorias _unnamed_Edicion_Categorias_;
	public Administrador _unnamed_Administrador_;

	public Aniadir_Categoria() {
	aniadirCategoria.addClickListener(new Button.ClickListener() {

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		@Override
		public void buttonClick(ClickEvent event) {
			crear_categoria();
			((MyUI) UI.getCurrent()).administrador();
			
		}
		
	});
	cancelar.addClickListener(new Button.ClickListener() {

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		@Override
		public void buttonClick(ClickEvent event) {
			((MyUI) UI.getCurrent()).administrador();
			
		}
		
	});
	}
	public void crear_categoria() {
		BD_general bd = new BD_general();//1 = idcateg
		bd.crear_categoria(MyUI.getAdminLogged().getID(),categoria.getValue(), contrasenia.getValue(),Integer.parseInt(edad.getValue()), urlImagen.getValue(), check.getValue());
		
	}
}