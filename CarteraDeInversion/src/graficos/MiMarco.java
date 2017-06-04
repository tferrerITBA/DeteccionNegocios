package graficos;

import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

class miMarco extends JFrame{
	
	public miMarco(){
		setSize(900, 600);
		setResizable(false); //para que el usuario no lo pueda redimensionar
		setTitle("Cartera de Inversión");
		Toolkit miPantalla = Toolkit.getDefaultToolkit();
		Image miIcono = miPantalla.getImage("src/graficos/logo.jpg");
		setIconImage(miIcono);
		
		Lamina miLamina = new Lamina();
		miLamina.setLayout(null);
		add(miLamina);
	}
}	