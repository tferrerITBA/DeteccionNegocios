package graficos;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class LaminaOperaciones extends JPanel {
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		Font miFuente = new Font("Arial", Font.BOLD, 26);
		g2.setFont(miFuente);
		g2.drawString("Operaciones", 20, 30);
		
	
	}
	
	public LaminaOperaciones() {
		
	}
}
