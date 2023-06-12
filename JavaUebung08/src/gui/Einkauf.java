package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Einkauf extends JFrame {

	private JPanel contentPane;
	private JLabel lblStueckzahl;
	private JLabel lblStueckpreis;
	private JLabel lblRabatt;
	private JTextField tfStueckzahl;
	private JTextField tfStueckPreis;
	private JTextField tfRabatt;
	private JButton btnBerechnen;
	private JButton btnEnde;
	private JLabel lblAusgabe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Einkauf frame = new Einkauf();
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
	public Einkauf() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 785, 237);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		lblStueckzahl = new JLabel("Stückzahl");
		lblStueckzahl.setBounds(10, 10, 100, 20);
		contentPane.add(lblStueckzahl);
		
		lblStueckpreis = new JLabel("Stückpreis");
		lblStueckpreis.setBounds(200, 10, 100, 20);
		contentPane.add(lblStueckpreis);
		
		lblRabatt = new JLabel("Rabatt(%)");
		lblRabatt.setBounds(400, 10, 100, 20);
		contentPane.add(lblRabatt);
		
		tfStueckzahl = new JTextField();
		tfStueckzahl.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					tfStueckPreis.requestFocus();
				}
			}
		});
		tfStueckzahl.setBounds(10, 30, 96, 19);
		contentPane.add(tfStueckzahl);
		tfStueckzahl.setColumns(10);
		
		tfStueckPreis = new JTextField();
		tfStueckPreis.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					tfRabatt.requestFocus();
				}
			}
		});
		tfStueckPreis.setBounds(200, 30, 96, 19);
		contentPane.add(tfStueckPreis);
		tfStueckPreis.setColumns(10);
		
		tfRabatt = new JTextField();
		tfRabatt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					
					if(tfStueckzahl.getText().isBlank()||tfStueckPreis.getText().isBlank()||tfRabatt.getText().isBlank()) {
						lblAusgabe.setText("Die Eingaben sind unvollständig");
					}
					else{
						Berechnen();					
					}
				}
			}
		});
		tfRabatt.setBounds(400, 30, 96, 19);
		contentPane.add(tfRabatt);
		tfRabatt.setColumns(10);
		
		btnBerechnen = new JButton("Berechnen");
		btnBerechnen.setBounds(600, 29, 100, 21);
		contentPane.add(btnBerechnen);
		
		btnEnde = new JButton("Ende");
		btnEnde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnEnde.setBounds(600, 125, 100, 21);
		contentPane.add(btnEnde);
		
		lblAusgabe = new JLabel("Ausgabe");
		lblAusgabe.setHorizontalAlignment(SwingConstants.CENTER);
		lblAusgabe.setBounds(10, 129, 490, 13);
		contentPane.add(lblAusgabe);
	}
	public void Berechnen() {
		double stueckzahl = Double.parseDouble(tfStueckzahl.getText());
		double stueckpreis = Double.parseDouble(tfStueckPreis.getText());
		double rabatt = Double.parseDouble(tfRabatt.getText());
		

		
			double ausgabeBrutto = stueckzahl * stueckpreis;
			double ausgabeNetto = ausgabeBrutto - (ausgabeBrutto * (rabatt / 100));
			lblAusgabe.setText(String.format("%.2f", ausgabeNetto) + " €");
		
		
		
	}

}
