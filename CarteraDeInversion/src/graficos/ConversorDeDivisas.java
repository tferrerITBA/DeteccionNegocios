package graficos;

public class ConversorDeDivisas extends Ventana {
	
	public ConversorDeDivisas() {
		super();
		LaminaOperaciones l = new LaminaOperaciones();//ESTO DESPUES SE CAMBIA HAY Q CREAR UNA LAMINA PARA CADA VENTANA
		add(l);
		setTitle("Conversor De Divisas");
		setVisible(true);
	}
}
