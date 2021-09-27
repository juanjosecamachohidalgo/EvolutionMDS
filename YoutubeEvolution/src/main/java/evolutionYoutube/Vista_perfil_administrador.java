package evolutionYoutube;

import java.util.Arrays;
import java.util.List;

import com.vaadin.navigator.View;
import com.vaadin.server.ExternalResource;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Image;
import com.vaadin.ui.Panel;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

import database.BD_general;
import database.Usuario_registrado;
import database.Videos;

public class Vista_perfil_administrador extends Vista_perfil_administrador_ventana implements View {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		
		public Vista_perfil_administrador(Usuario_registrado user) {
			user.setNumeroVisitas(user.getNumeroVisitas()+1);
			Image img = new Image("",new ExternalResource(user.getAvatar()));
			img.setWidth("100%");
			avatar.addComponent(img);
			visitas.setValue("Visitas: "+user.getNumeroVisitas());
			BD_general bd= new BD_general();
			
			numerosuscriptores.setValue("Suscriptores: "+bd.cargar_Seguidores(user.getID()).size());
			
			
			HorizontalLayout layout = new HorizontalLayout();
			HorizontalLayout layout2 = new HorizontalLayout();
			
			
			
			
			if(user.video_subido!=null) {
				List<Videos> vide = bd.cargar_Videos_Subidos(user.getID());
				Arrays.toString(user.video_subido.toArray());
				
				for(int i=0;i<vide.size();i++) {
					Video_subido videoo = new Video_subido(vide.get(i));
					layout.addComponent(videoo);
				
				}
			}
			
			if(user.listas_de_reproduccion!=null) {
				List<database.Listas_de_reproduccion> listas = bd.cargar_Listas_Reproduccion(user.getID());
				for(int i=0;i<listas.size();i++) {
					Listas_creadas lista2 = new Listas_creadas(listas.get(i));
					
					layout2.addComponent(lista2);
				}
			}
			
			Panel panel = new Panel("Videos subidos");
			panel.setWidth("1000px");
			panel.setHeight("400px");
			layout.setSizeUndefined();

			panel.setContent(layout);
			videossubidos.addComponent(panel);
			
			Panel panel2 = new Panel("Listas");
			panel2.setWidth("1000px");
			panel2.setHeight("400px");
			layout2.setSizeUndefined();
			
			panel2.setContent(layout2);
			listas_reproduccion.addComponent(panel2);
			HorizontalLayout layout3 = new HorizontalLayout();
			HorizontalLayout layout4 = new HorizontalLayout();
		
			Panel panel3 = new Panel("Suscriptores");
			panel3.setWidth("1000px");
			panel3.setHeight("400px");
			layout3.setSizeUndefined();
			layout3.addComponent(new Lista_Suscriptores(user));
			panel3.setContent(layout3);
			seguidores.addComponent(panel3);
			
			Panel panel4 = new Panel("Seguidores");
			panel4.setWidth("1000px");
			panel4.setHeight("400px");
			layout4.setSizeUndefined();
			layout4.addComponent(new Lista_Seguidores(user));
			panel4.setContent(layout4);
			suscripciones.addComponent(panel4);
			
			
			volver.addClickListener(new Button.ClickListener() {

				/**
				 * 
				 */
				private static final long serialVersionUID = 1L;

				@Override
				public void buttonClick(ClickEvent event) {
					((MyUI) UI.getCurrent()).administrador();
				}
				
			});
			eliminar.addClickListener(new Button.ClickListener() {

				/**
				 * 
				 */
				private static final long serialVersionUID = 1L;

				@Override
				public void buttonClick(ClickEvent event) {
					
					//es admin
					if(MyUI.getAdminLogged()!=null) {
						bd.eliminar_Usuario(user.getID());
						((MyUI) UI.getCurrent()).usuario_registrado();
					}
						
					
					
				}
				
			});
		
	
	}
}