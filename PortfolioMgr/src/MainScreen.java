import java.awt.EventQueue;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import javax.swing.border.BevelBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import java.awt.Panel;
import javax.swing.JList;
import java.awt.Label;
import java.awt.Color;
import javax.swing.JInternalFrame;
import javax.swing.JTable;
import java.awt.Cursor;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.MatteBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.table.DefaultTableModel;
import javax.swing.JSpinner;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
/**
 * Application's GUI.
 * 
 * @author Nicolas Benenzon
 *
 */
public class MainScreen {

	private JFrame frmPortfolioManager;
	private JLabel lblTitle;
	private JPanel panelMenu;
	private JPanel panelPortfolio;
	private JLabel lblMarketInfo;
	private JTable tblStocks;
	private JSpinner spDolarOficial;
	private JSpinner spDolarBlue;
	private Panel panelConversor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainScreen window = new MainScreen();
					window.frmPortfolioManager.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainScreen() {
		initialize();
	}
	
	private void ClearScreen(){
		panelPortfolio.setVisible(false);
		tblStocks.setVisible(false);
		panelConversor.setVisible(false);
	}
	
	private void changeModule(String module){
		ClearScreen();
		lblTitle.setText(module);
		if(module == "PORTFOLIO"){
			panelPortfolio.setVisible(true);
		}
		else if(module == "ACCIONES"){
			tblStocks.setVisible(true);
		}
		else if(module == "BONOS"){
			tblStocks.setVisible(true);
		}
		else if(module == "OPCIONES"){
			tblStocks.setVisible(true);
		}
		else if(module == "FUTUROS"){
			tblStocks.setVisible(true);
		}
		else if(module == "FOREX"){
			tblStocks.setVisible(true);
		}
		else if(module == "COMMODITIES"){
			tblStocks.setVisible(true);
		}
		else if(module == "CCL"){
			tblStocks.setVisible(true);
		}
		else if(module == "CONVERSOR"){
			panelConversor.setVisible(true);
		}
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPortfolioManager = new JFrame();
		frmPortfolioManager.setResizable(false);
		frmPortfolioManager.setTitle("Portfolio Manager");
		frmPortfolioManager.setBounds(100, 100, 949, 616);
		frmPortfolioManager.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPortfolioManager.getContentPane().setLayout(null);
		
		panelPortfolio = new JPanel();
		panelPortfolio.setBounds(10, 138, 921, 437);
		frmPortfolioManager.getContentPane().add(panelPortfolio);
		panelPortfolio.setLayout(null);
		
		JLabel lblNetWorth = new JLabel("Net Worth");
		lblNetWorth.setBounds(12, 120, 123, 29);
		panelPortfolio.add(lblNetWorth);
		lblNetWorth.setFont(new Font("Tahoma", Font.PLAIN, 24));
		
		JLabel lblNetWorth_V = new JLabel("$100500");
		lblNetWorth_V.setBounds(193, 120, 123, 29);
		panelPortfolio.add(lblNetWorth_V);
		lblNetWorth_V.setForeground(new Color(0, 128, 0));
		lblNetWorth_V.setFont(new Font("Tahoma", Font.PLAIN, 24));
		
		JLabel lblOverallGains_V = new JLabel("$500");
		lblOverallGains_V.setBounds(193, 159, 123, 29);
		panelPortfolio.add(lblOverallGains_V);
		lblOverallGains_V.setForeground(new Color(0, 128, 0));
		lblOverallGains_V.setFont(new Font("Tahoma", Font.PLAIN, 24));
		
		JLabel lblOverallGains = new JLabel("Overall Gains");
		lblOverallGains.setBounds(12, 160, 191, 27);
		panelPortfolio.add(lblOverallGains);
		lblOverallGains.setFont(new Font("Tahoma", Font.PLAIN, 24));
		
		JLabel lblOverallReturns = new JLabel("Overall Returns");
		lblOverallReturns.setBounds(12, 198, 191, 39);
		panelPortfolio.add(lblOverallReturns);
		lblOverallReturns.setFont(new Font("Tahoma", Font.PLAIN, 24));
		
		JLabel lblOverallReturns_V = new JLabel("0,5%");
		lblOverallReturns_V.setBounds(193, 203, 123, 29);
		panelPortfolio.add(lblOverallReturns_V);
		lblOverallReturns_V.setForeground(new Color(0, 128, 0));
		lblOverallReturns_V.setFont(new Font("Tahoma", Font.PLAIN, 24));
		
		JLabel lblInvested_V = new JLabel("$25500");
		lblInvested_V.setBounds(193, 243, 123, 29);
		panelPortfolio.add(lblInvested_V);
		lblInvested_V.setForeground(new Color(0, 128, 0));
		lblInvested_V.setFont(new Font("Tahoma", Font.PLAIN, 24));
		
		JLabel lblInvested = new JLabel("Invested");
		lblInvested.setBounds(12, 243, 182, 29);
		panelPortfolio.add(lblInvested);
		lblInvested.setFont(new Font("Tahoma", Font.PLAIN, 24));
		
		JLabel lblNotInvested = new JLabel("Not Invested");
		lblNotInvested.setBounds(12, 283, 182, 29);
		panelPortfolio.add(lblNotInvested);
		lblNotInvested.setFont(new Font("Tahoma", Font.PLAIN, 24));
		
		JLabel lblNotInvested_V = new JLabel("$75000");
		lblNotInvested_V.setBounds(193, 283, 123, 29);
		panelPortfolio.add(lblNotInvested_V);
		lblNotInvested_V.setForeground(new Color(0, 128, 0));
		lblNotInvested_V.setFont(new Font("Tahoma", Font.PLAIN, 24));
		
		JTable tblHoldings = new JTable();
		tblHoldings.setBounds(323, 33, 270, 392);
		panelPortfolio.add(tblHoldings);
		
		Label lblHoldings = new Label("Holdings");
		lblHoldings.setBounds(323, 5, 270, 22);
		panelPortfolio.add(lblHoldings);
		lblHoldings.setAlignment(Label.CENTER);
		lblHoldings.setFont(new Font("Dialog", Font.PLAIN, 16));
		
		Label lblMarketNews = new Label("El mercado, en un vistazo");
		lblMarketNews.setBounds(643, 0, 270, 22);
		panelPortfolio.add(lblMarketNews);
		lblMarketNews.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblMarketNews.setAlignment(Label.CENTER);
		
		JLabel lblNewsTitle1 = new JLabel("<html>El MERVAL pasa a ser catalogado como un mercado emergente por JPMorgan</html>");
		lblNewsTitle1.setBounds(643, 28, 270, 72);
		panelPortfolio.add(lblNewsTitle1);
		lblNewsTitle1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewsTitle1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewsTitle1.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblNewsDesc1 = new JLabel("<html>El MERVAL pasa a ser catalogado como un mercado emergente por JPMorgan</html>");
		lblNewsDesc1.setBounds(643, 99, 270, 51);
		panelPortfolio.add(lblNewsDesc1);
		lblNewsDesc1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewsDesc1.setVerticalAlignment(SwingConstants.TOP);
		lblNewsDesc1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewsDesc1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JLabel lblNewsTitle2 = new JLabel("<html>El MERVAL pasa a ser catalogado como un mercado emergente por JPMorgan</html>");
		lblNewsTitle2.setBounds(643, 156, 270, 72);
		panelPortfolio.add(lblNewsTitle2);
		lblNewsTitle2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewsTitle2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewsTitle2.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblNewsDesc2 = new JLabel("<html>El MERVAL pasa a ser catalogado como un mercado emergente por JPMorgan</html>");
		lblNewsDesc2.setBounds(643, 227, 270, 51);
		panelPortfolio.add(lblNewsDesc2);
		lblNewsDesc2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewsDesc2.setVerticalAlignment(SwingConstants.TOP);
		lblNewsDesc2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewsDesc2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JLabel lblNewsTitle3 = new JLabel("<html>El MERVAL pasa a ser catalogado como un mercado emergente por JPMorgan</html>");
		lblNewsTitle3.setBounds(643, 283, 270, 72);
		panelPortfolio.add(lblNewsTitle3);
		lblNewsTitle3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewsTitle3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewsTitle3.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblNewsDesc3 = new JLabel("<html>El MERVAL pasa a ser catalogado como un mercado emergente por JPMorgan</html>");
		lblNewsDesc3.setBounds(643, 354, 270, 51);
		panelPortfolio.add(lblNewsDesc3);
		lblNewsDesc3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewsDesc3.setVerticalAlignment(SwingConstants.TOP);
		lblNewsDesc3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewsDesc3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		lblTitle = new JLabel("PORTFOLIO");
		lblTitle.setHorizontalAlignment(SwingConstants.LEFT);
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblTitle.setBounds(10, 87, 913, 39);
		frmPortfolioManager.getContentPane().add(lblTitle);
		
		panelMenu = new JPanel();
		panelMenu.setBorder(null);
		panelMenu.setBounds(10, 34, 921, 41);
		frmPortfolioManager.getContentPane().add(panelMenu);
		
		JButton btnMyPortfolio = new JButton("Portfolio");
		btnMyPortfolio.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				changeModule("PORTFOLIO");
			}
		});
		btnMyPortfolio.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnMyPortfolio.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelMenu.add(btnMyPortfolio);
		btnMyPortfolio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		JButton btnStocks = new JButton("Acciones");
		btnStocks.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				changeModule("ACCIONES");
			}
		});
		btnStocks.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnStocks.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelMenu.add(btnStocks);
		
		JButton btnBonos = new JButton("Bonos");
		btnBonos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				changeModule("BONOS");
			}
		});
		btnBonos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnBonos.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelMenu.add(btnBonos);
		
		JButton btnOptions = new JButton("Opciones");
		btnOptions.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				changeModule("OPCIONES");
			}
		});
		btnOptions.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnOptions.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelMenu.add(btnOptions);
		
		JButton btnFutures = new JButton("Futuros");
		btnFutures.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				changeModule("FUTUROS");
			}
		});
		btnFutures.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnFutures.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelMenu.add(btnFutures);
		
		JButton btnForex = new JButton("FOREX");
		btnForex.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				changeModule("FOREX");
			}
		});
		btnForex.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnForex.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelMenu.add(btnForex);
		
		JButton btnCommodities = new JButton("Commodities");
		btnCommodities.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				changeModule("COMMODITIES");
			}
		});
		btnCommodities.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCommodities.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelMenu.add(btnCommodities);
		
		JButton btnCcl = new JButton("CCL");
		btnCcl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				changeModule("CCL");
			}
		});
		btnCcl.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCcl.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelMenu.add(btnCcl);
		
		JButton btnConversor = new JButton("Conversor");
		btnConversor.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				changeModule("CONVERSOR");
			}
		});
		btnConversor.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnConversor.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelMenu.add(btnConversor);
		
		Timer marketInfoTimer = new Timer();
		marketInfoTimer.scheduleAtFixedRate(new TimerTask() {
			int count = 800;
			  @Override
			  public void run() {
				if(count == -975)
				{
					count = 800;
					lblMarketInfo.setLocation(500, 0);
				}
				lblMarketInfo.setLocation(count, 0);
			    count--;
			  }
			}, 10, 10);
		
		lblMarketInfo = new JLabel("REFERENCIAS DE RENDIMIENTO:                LEBAC: 25,2%                CAUCI\u00D3N: 25%                INFLACI\u00D3N ESTIMADA (FMI): 25,6%");
		lblMarketInfo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMarketInfo.setOpaque(true);
		lblMarketInfo.setForeground(Color.WHITE);
		lblMarketInfo.setBackground(Color.BLACK);
		lblMarketInfo.setBounds(0, 0, 943, 22);
		frmPortfolioManager.getContentPane().add(lblMarketInfo);
		
		JLabel label = new JLabel("");
		label.setOpaque(true);
		label.setForeground(Color.WHITE);
		label.setBackground(Color.BLACK);
		label.setBounds(0, 0, 943, 22);
		frmPortfolioManager.getContentPane().add(label);
		
		tblStocks = new JTable();
		tblStocks.setFont(new Font("Dialog", Font.PLAIN, 16));
		tblStocks.setRowHeight(32);
		tblStocks.setRowSelectionAllowed(false);
		tblStocks.setVisible(false);
		tblStocks.setModel(new DefaultTableModel(
			new Object[][] {
				{"AGRO", "42,000", "-0,59%", "2.575.038", "60.728"},
				{"ALUA", "10,950", "-1,35%", "1.915.382", "175.341"},
				{"APBR", "42,000", "-1,92%", "2.575.038", "60.728"},
				{"AUSO", "42,000", "-0,59%", "2.575.038", "60.728"},
				{"BMA", "42,000", "-0,59%", "2.575.038", "60.728"},
				{"CECO2", "42,000", "-0,59%", "2.575.038", "60.728"},
				{"CELU", "42,000", "-0,59%", "2.575.038", "60.728"},
				{"CEPU", "42,000", "-0,59%", "2.575.038", "60.728"},
				{"COME", "42,000", "-0,59%", "2.575.038", "60.728"},
				{"CRES", "42,000", "-0,59%", "2.575.038", "60.728"},
				{"CTIO", "42,000", "-0,59%", "2.575.038", "60.728"},
				{"EDN", "42,000", "-0,59%", "2.575.038", "60.728"},
				{"ERAR", "42,000", "-0,59%", "2.575.038", "60.728"},
				{"FRAN", "42,000", "-0,59%", "2.575.038", "60.728"},
				{"GGAL", "42,000", "-0,59%", "2.575.038", "60.728"},
				{"JMIN", "42,000", "-0,59%", "2.575.038", "60.728"},
				{"MIRG", "42,000", "-0,59%", "2.575.038", "60.728"},
				{"PAMP", "42,000", "-0,59%", "2.575.038", "60.728"},
				{"PESA", "42,000", "-0,59%", "2.575.038", "60.728"},
				{"PETR", "42,000", "-0,59%", "2.575.038", "60.728"},
				{"SAMI", "42,000", "-0,59%", "2.575.038", "60.728"},
				{"TECO2", "42,000", "-0,59%", "2.575.038", "60.728"},
				{"TGNO4", "42,000", "-0,59%", "2.575.038", "60.728"},
				{"TGSU2", "42,000", "-0,59%", "2.575.038", "60.728"},
				{"TRAN", "42,000", "-0,59%", "2.575.038", "60.728"},
				{"TS", "42,000", "-0,59%", "2.575.038", "60.728"},
				{"YPFD", "42,000", "-0,59%", "2.575.038", "60.728"},

				 

			},
			new String[] {
				"Ticker", "Cotizaci\u00F3n", "Variaci\u00F3n", "Volumen Efectivo", "Volumen Nominal"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				true, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		tblStocks.getColumnModel().getColumn(0).setResizable(false);
		tblStocks.getColumnModel().getColumn(1).setResizable(false);
		tblStocks.getColumnModel().getColumn(1).setPreferredWidth(101);
		tblStocks.getColumnModel().getColumn(2).setResizable(false);
		tblStocks.getColumnModel().getColumn(3).setResizable(false);
		tblStocks.getColumnModel().getColumn(3).setPreferredWidth(127);
		tblStocks.getColumnModel().getColumn(4).setResizable(false);
		tblStocks.getColumnModel().getColumn(4).setPreferredWidth(145);
		tblStocks.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		tblStocks.setBounds(10, 138, 921, 437);
		frmPortfolioManager.getContentPane().add(tblStocks);
		
		panelConversor = new Panel();
		panelConversor.setVisible(false);
		panelConversor.setBounds(10, 138, 921, 437);
		frmPortfolioManager.getContentPane().add(panelConversor);
		panelConversor.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("D\u00F3lar oficial: 15,65");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel.setBounds(199, 166, 183, 16);
		panelConversor.add(lblNewLabel);
		
		JLabel lblDlarBlue = new JLabel("D\u00F3lar blue: 16,20");
		lblDlarBlue.setFont(new Font("Dialog", Font.BOLD, 18));
		lblDlarBlue.setBounds(493, 166, 183, 16);
		panelConversor.add(lblDlarBlue);
		
		spDolarOficial = new JSpinner();
		spDolarOficial.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				spDolarBlue.setValue(spDolarOficial.getValue());
			}
		});
		spDolarOficial.setFont(new Font("Dialog", Font.BOLD, 18));
		spDolarOficial.setBounds(199, 194, 183, 33);
		panelConversor.add(spDolarOficial);
		
		spDolarBlue = new JSpinner();
		spDolarBlue.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				spDolarOficial.setValue(spDolarBlue.getValue());
			}
		});
		spDolarBlue.setFont(new Font("Dialog", Font.BOLD, 18));
		spDolarBlue.setBounds(493, 194, 183, 33);
		panelConversor.add(spDolarBlue);
		btnBonos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
	}
}
