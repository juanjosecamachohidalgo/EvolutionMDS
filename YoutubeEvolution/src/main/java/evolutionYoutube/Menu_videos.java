package evolutionYoutube;

import java.util.List;

import com.vaadin.server.ExternalResource;
import com.vaadin.ui.Button;
import com.vaadin.ui.Image;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

import database.BD_general;

public class Menu_videos extends Menu_videos_ventana {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Inicio_Comun _unnamed_Inicio_Comun_;
	//public Lista_Categorias _unnamed_Lista_Categorias_;
	public Buscador_videos _unnamed_Buscador_videos_;
	public List<?> busqueda;
	

	public Menu_videos() {
		crearIconos();
	
		buscar.addClickListener(new Button.ClickListener() {

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void buttonClick(ClickEvent event) {
				buscar();
				((MyUI) UI.getCurrent()).buscador(busqueda,tipo.getValue());
				
			}
		});
	}
	private void crearIconos() {
		BD_general bd= new BD_general();
	    List<database.Categorias> categorias = bd.Cargar_Categorias();
	    
		for(database.Categorias cat: categorias){
			  
			    
				Image browser = new Image("",new ExternalResource(cat.getIcono()));
			    browser.setHeight("30px");
			    categoria.addComponent(browser);	    
			    
		}
	
	

	}

	public void buscar() {
		
		BD_general bd = new BD_general();
		this.busqueda=bd.buscar(texto.getValue(), tipo.getValue());
	}
	
	
	
	
}
	