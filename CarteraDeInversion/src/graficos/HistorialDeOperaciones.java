package graficos;

public class HistorialDeOperaciones extends Ventana{
	
	public HistorialDeOperaciones(){
		super();
		LaminaHistorial l = new LaminaHistorial();//ESTO DESPUES SE CAMBIA HAY Q CREAR UNA LAMINA PARA CADA VENTANA
		add(l);
		setTitle("Historial De Operaciones");
		setVisible(true);
	}
}
