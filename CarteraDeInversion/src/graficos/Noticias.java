package graficos;

public class Noticias extends Ventana {
	
	public Noticias() {
		super();
		LaminaNoticias l = new LaminaNoticias();//ESTO DESPUES SE CAMBIA HAY Q CREAR UNA LAMINA PARA CADA VENTANA
		add(l);
		setTitle("Noticias");
		setVisible(true);
	}
}
