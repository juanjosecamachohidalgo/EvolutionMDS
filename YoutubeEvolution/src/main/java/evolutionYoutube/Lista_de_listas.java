package evolutionYoutube;

import java.util.List;

import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Panel;

import database.BD_general;
import database.Listas_de_reproduccion;

public class Lista_de_listas extends Lista_de_listas_ventana{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Listas_de_reproduccion _unnamed_Listas_de_reproduccion_;
	public Listas_creadas _unnamed_Listas_creadas_;
	public Listas_fijas_reproduccion _unnamed_Listas_fijas_reproduccion_;
	
	public Lista_de_listas() {
		Listas_fijas_reproduccion lista = new Listas_fijas_reproduccion();
		HorizontalLayout layout = new HorizontalLayout();
		//listas.addComponent(lista);
		//lista.setSizeUndefined();
		layout.addComponent(lista);
		BD_general bd = new BD_general();
		
		List<database.Listas_de_reproduccion> listas_de_reproduccion = bd.cargar_Listas_Reproduccion(MyUI.getUsuarioLogged().getID());
		Listas_creadas lista2;
		for(int i=0;i<listas_de_reproduccion.size();i++) {
			lista2 = new Listas_creadas(listas_de_reproduccion.get(i));
			//lista2.setSizeUndefined();
			layout.addComponent(lista2);
			
		}
		

		
		// The panel will give it scrollbars.
		Panel panel = new Panel("Scroll");
		panel.setWidth("1000px");
		panel.setHeight("300px");
		layout.setSizeUndefined();
		panel.setCaption("listas");
		panel.setContent(layout);
		

		listas.addComponent(panel);
		
		crearlista.addClickListener(new Button.ClickListener() {

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void buttonClick(ClickEvent event) {
				bd.crearListaReproduccion(MyUI.getUsuarioLogged().getID(), nombrelista.getValue());
				((MyUI) UI.getCurrent()).mis_listas();
				
				
			}
			
		});
		
		
		
		
	
	
		
		
	}
}