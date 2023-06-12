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

public class Uhrzeit extends JFrame {

	private JPanel contentPane;
	private JLabel lblStunden;
	private JLabel lblMinuten;
	private JTextField tfStunden;
	private JTextField tfMinuten;
	private JLabel lblAusgabe;
	private JButton btnAusgabe;
	private JButton btnEnde;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Uhrzeit frame = new Uhrzeit();
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
	public Uhrzeit() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		lblStunden = new JLabel("Stunden");
		lblStunden.setBounds(10, 10, 96, 20);
		contentPane.add(lblStunden);
		
		lblMinuten = new JLabel("Minuten");
		lblMinuten.setBounds(240, 10, 96, 20);
		contentPane.add(lblMinuten);
		
		tfStunden = new JTextField();
		tfStunden.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				try {
					
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					tfMinuten.requestFocus();
					}
				}
				catch(NumberFormatException f) {
					lblAusgabe.setText("Ungültiges Format");
				}
			}
		});
		tfStunden.setBounds(10, 40, 96, 19);
		contentPane.add(tfStunden);
		tfStunden.setColumns(10);
		
		tfMinuten = new JTextField();
		tfMinuten.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				try {
					
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					Ausgabe();
					}
				}	
				catch(NumberFormatException f) {
					lblAusgabe.setText("Ungültiges Format");
				}
			}
		});
		tfMinuten.setBounds(240, 40, 96, 19);
		contentPane.add(tfMinuten);
		tfMinuten.setColumns(10);
		
		lblAusgabe = new JLabel("");
		lblAusgabe.setBounds(10, 150, 231, 30);
		contentPane.add(lblAusgabe);
		
		btnAusgabe = new JButton("Ausgabe");
		btnAusgabe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ausgabe();
			}
		});
		btnAusgabe.setBounds(251, 146, 85, 21);
		contentPane.add(btnAusgabe);
		
		btnEnde = new JButton("Ende");
		btnEnde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnEnde.setBounds(251, 232, 85, 21);
		contentPane.add(btnEnde);
	}
	public void Ausgabe() {
		int stunden = Integer.parseInt(tfStunden.getText());
		int minuten = Integer.parseInt(tfMinuten.getText());
		
		try {
			if (minuten < 10) {				
			lblAusgabe.setText("Es ist: " + stunden + ":"  + 
								"0" + minuten + " Uhr");
			}
			
			else{				
			lblAusgabe.setText("Es ist: " + stunden + ":" + minuten + " Uhr");
			}
			
			if (stunden > 23 || stunden < 0) {
				throw new UhrzeitFormatException("Ungültige Stundeneingabe");
			}

			
			if(minuten < 0 || minuten > 59) {
				throw new UhrzeitFormatException("Ungültige Minuteneingabe");
			}
		}
		
		catch(UhrzeitFormatException e){
			lblAusgabe.setText((e.getMessage()));
		}
	}
}
