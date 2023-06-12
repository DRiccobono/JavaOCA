package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class UmrechnungFahrenheitCelsius extends JFrame {

	private JPanel contentPane;
	private JLabel lblFahrenheit;
	private JTextField tfFahrenheit;
	private JLabel lblCelsius;
	private JTextField tfCelsius;
	private JButton btnUmrechnen;
	private JButton btnEnde;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UmrechnungFahrenheitCelsius frame = new UmrechnungFahrenheitCelsius();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public UmrechnungFahrenheitCelsius() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 230);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		lblFahrenheit = new JLabel("Grad Fahrenheit");
		lblFahrenheit.setBounds(10, 10, 100, 13);
		contentPane.add(lblFahrenheit);
		
		tfFahrenheit = new JTextField();
		tfFahrenheit.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				//btnUmrechnen.doClick();
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					Umrechnen();					
				}
			}
		});
		tfFahrenheit.setBounds(10, 33, 110, 34);
		contentPane.add(tfFahrenheit);
		tfFahrenheit.setColumns(10);
		
		lblCelsius = new JLabel("Grad Celsius");
		lblCelsius.setBounds(10, 90, 100, 13);
		contentPane.add(lblCelsius);
		
		tfCelsius = new JTextField();
		tfCelsius.setEditable(false);
		tfCelsius.setBounds(10, 113, 110, 34);
		contentPane.add(tfCelsius);
		tfCelsius.setColumns(10);
		
		btnUmrechnen = new JButton("Umrechnen");
		btnUmrechnen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Umrechnen();
//				double fahrenheit = Double.parseDouble(tfFahrenheit.getText());
//				double celsius = (fahrenheit- 32) * 5 / 9;
//				tfCelsius.setText(String.format("%.2f", celsius));
//				
//				tfFahrenheit.requestFocus();
//				tfFahrenheit.selectAll();
			}
		});
		btnUmrechnen.setBounds(175, 33, 139, 34);
		contentPane.add(btnUmrechnen);
		
		btnEnde = new JButton("Ende");
		btnEnde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnEnde.setBounds(175, 113, 139, 34);
		contentPane.add(btnEnde);
	}
		
	
	public void Umrechnen() {
	
		try {
		double fahrenheit = Double.parseDouble(tfFahrenheit.getText());
		double celsius = (fahrenheit- 32) * 5 / 9;
			
		tfCelsius.setText(String.format("%.2f", celsius));
		
		tfFahrenheit.requestFocus();
		tfFahrenheit.selectAll();
		}
		catch (NumberFormatException e) {
			tfCelsius.setText("Keine gültige Zahl");
		}
			
	}
}
