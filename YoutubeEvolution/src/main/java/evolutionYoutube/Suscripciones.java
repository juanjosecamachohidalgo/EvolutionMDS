package evolutionYoutube;

import java.util.List;

import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Panel;
import com.vaadin.ui.UI;

import database.BD_general;

import com.vaadin.ui.Button.ClickEvent;

public class Suscripciones extends Suscripciones_ventana implements View {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Mi_perfil _unnamed_Mi_perfil_;
	public Lista_Suscriptores _unnamed_Lista_Suscriptores_;
	public Lista_Seguidores _unnamed_Lista_Seguidores_;

	public Suscripciones() {
		BD_general bd = new BD_general();
		HorizontalLayout layout = new HorizontalLayout();
		HorizontalLayout layout2 = new HorizontalLayout();
		    if(MyUI.getUsuarioLogged().suscriptor!=null) {
			List<database.Usuario_registrado> users = bd.cargar_Seguidores(MyUI.getUsuarioLogged().getID());
			
				for(database.Usuario_registrado user : users) {
					layout.addComponent(new Lista_Seguidores(user));
				}
			}
		    if(bd.cargar_Suscripciones(MyUI.getUsuarioLogged().getID())!=null) {
			List<database.Usuario_registrado> users = bd.cargar_Suscripciones(MyUI.getUsuarioLogged().getID());
			
				for(database.Usuario_registrado user : users) {
					layout2.addComponent(new Lista_Suscriptores(user));
				}
			}
			Panel panel = new Panel("SEGUIDORES");
			panel.setWidth("1000px");
			panel.setHeight("400px");
			layout.setSizeUndefined();

			panel.setContent(layout);
		    seguidores.addComponent(panel);
			
			Panel panel2 = new Panel("SUSCRIPTORES");
			panel2.setWidth("1000px");
			panel2.setHeight("400px");
			layout2.setSizeUndefined();
			
			panel2.setContent(layout2);
			suscriptores.addComponent(panel2);
			
		
		principal.addClickListener(new Button.ClickListener() {

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void buttonClick(ClickEvent event) {
				((MyUI) UI.getCurrent()).usuario_registrado();
				
			}
			
		});
		micuenta.addClickListener(new Button.ClickListener() {

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void buttonClick(ClickEvent event) {
				((MyUI) UI.getCurrent()).mi_perfil_registrado();
				
			}
			
		});
		videos_subidos.addClickListener(new Button.ClickListener() {

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void buttonClick(ClickEvent event) {
				((MyUI) UI.getCurrent()).videos_subidos();
				
			}
			
		});
		mis_listas.addClickListener(new Button.ClickListener() {

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void buttonClick(ClickEvent event) {
				((MyUI) UI.getCurrent()).mis_listas();
				
			}
			
		});
		suscripciones.addClickListener(new Button.ClickListener() {

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void buttonClick(ClickEvent event) {
				((MyUI) UI.getCurrent()).suscripciones();
				
			}
			
		});
		cerrarsesion.addClickListener(new Button.ClickListener() {

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void buttonClick(ClickEvent event) {
				((MyUI) UI.getCurrent()).invitado();
				
			}
			
		});
		
	}
	
	
}