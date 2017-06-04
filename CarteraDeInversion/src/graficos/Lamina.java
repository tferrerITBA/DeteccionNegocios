package graficos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class Lamina extends JPanel implements ActionListener{
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Graphics2D g2= (Graphics2D) g;
		Font miFuente=new Font("Arial", Font.BOLD, 26);
		g2.setFont(miFuente);
		//g2.setColor(Color.DARK_GRAY);
		g2.drawString("Bienvenido a su cartera", 20, 30);
		
	
	}
	JButton miPortfolio= new JButton("Mi Portfolio");
	JButton noticias= new JButton("Noticias");
	JButton conversor= new JButton("Conversor de Divisas");
	JButton miHistorial= new JButton("Historial de Operaciones");
	JButton operaciones= new JButton("Operaciones");
	Font fte=new Font("Arial", Font.PLAIN, 18);
	public Lamina(){
		add(miPortfolio);
		miPortfolio.setFont(fte);
		miPortfolio.setBounds(100, 200, 200, 50);
		add(noticias);
		noticias.setFont(fte);
		noticias.setBounds(350, 200, 200, 50);
		add(conversor);
		conversor.setFont(fte);
		conversor.setBounds(600, 200, 250, 50);
		add(miHistorial);
		miHistorial.setBounds(200, 300, 250,50);
		miHistorial.setFont(fte);
		add(operaciones);
		operaciones.setFont(fte);
		operaciones.setBounds(450, 300, 200,50);
		miPortfolio.addActionListener(this); 
		noticias.addActionListener(this);
		conversor.addActionListener(this);
		miHistorial.addActionListener(this);
		operaciones.addActionListener(this);

	}
	

	public void actionPerformed(ActionEvent e){ //windowEvent
		Object botonPulsado= e.getSource();
		if(botonPulsado==miPortfolio){
			MiPortfolio portfolioVentana= new MiPortfolio();
			portfolioVentana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		}
		else if(botonPulsado==noticias){
			Noticias noticVentana= new Noticias();
			noticVentana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		}
		else if(botonPulsado==conversor){
			ConversorDeDivisas convVentana= new ConversorDeDivisas();
			convVentana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		}
		else if(botonPulsado==miHistorial){
			HistorialDeOperaciones histVentana= new HistorialDeOperaciones();
			histVentana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		}
		else{
			//boton operaciones
			Operaciones opVentana= new Operaciones();
			opVentana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		}
		
	}
}