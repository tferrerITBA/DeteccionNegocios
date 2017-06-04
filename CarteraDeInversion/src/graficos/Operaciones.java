package graficos;

public class Operaciones extends Ventana{
	public Operaciones(){
		super();
		LaminaOperaciones l= new LaminaOperaciones();//ESTO DESPUES SE CAMBIA HAY Q CREAR UNA LAMINA PARA CADA VENTANA
		add(l);
		setTitle("Operaciones");
		setVisible(true);
	}
}
