package graficos;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

public class Ventana extends JFrame /*implements WindowListener*/ {
	
	public Ventana() {
		setSize(900,600);
		setResizable(false); //para que el usuario no lo pueda redimensionar
		Toolkit miPantalla = Toolkit.getDefaultToolkit();
		Image miIcono = miPantalla.getImage("src/graficos/logo.jpg");
		setIconImage(miIcono);
		setLocationRelativeTo(null);
	}

	/*@Override
	public void windowActivated(WindowEvent arg0) {
		System.out.println("Ventana activada");
		
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		System.out.println("Cerrando ventana");
		
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		System.out.println("Ventana desactivada");
		
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		System.out.println("Ventana restaurada");
		
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		System.out.println("Ventana minimizada");
		
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		System.out.println("Ventana abierta");
		
	}
	*/
}
