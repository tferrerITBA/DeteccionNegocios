package graficos;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

public class LaminaPortfolio extends JPanel /*implements ActionListener*/ {
	
		public void paintComponent(Graphics g){
			super.paintComponent(g);
			Graphics2D g2= (Graphics2D) g;
			Font miFuente=new Font("Arial", Font.BOLD, 26);
			g2.setFont(miFuente);
			g2.drawString("Mi Portfolio", 20, 30);
			
		
		}
		public LaminaPortfolio(){
			
		}

	//	@Override
		/*public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}*/
}
