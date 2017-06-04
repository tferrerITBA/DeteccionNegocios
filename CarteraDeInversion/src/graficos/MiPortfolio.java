package graficos;


public class MiPortfolio extends Ventana /*implements ActionListener*/{
	
	public MiPortfolio(){
		super();
		LaminaPortfolio l = new LaminaPortfolio();
		add(l);
		setTitle("Mi Portofolio");
		setVisible(true);
	}
	/*public void actionPerformed(ActionEvent e){
		
	}*/
}
