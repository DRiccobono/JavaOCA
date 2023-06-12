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

public class AlteZaehlweise extends JFrame {

	private JPanel contentPane;
	private JLabel lblStueckzahl;
	private JTextField tfStueckzahl;
	private JLabel lblGros;
	private JLabel lblSchock;
	private JLabel lblDutzend;
	private JLabel lblStueck;
	private JButton btnUmrechnen;
	private JButton btnEnde;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AlteZaehlweise frame = new AlteZaehlweise();
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
	public AlteZaehlweise() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 754, 342);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		lblStueckzahl = new JLabel("Stückzahl angeben:");
		lblStueckzahl.setBounds(10, 10, 195, 31);
		contentPane.add(lblStueckzahl);
		
		tfStueckzahl = new JTextField();
		tfStueckzahl.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					Umrechnen();
				}
			}
		});
		tfStueckzahl.setBounds(10, 51, 120, 31);
		contentPane.add(tfStueckzahl);
		tfStueckzahl.setColumns(10);
		
		lblGros = new JLabel("Gros");
		lblGros.setBounds(10, 110, 100, 31);
		contentPane.add(lblGros);
		
		lblSchock = new JLabel("Schock");
		lblSchock.setBounds(10, 160, 100, 31);
		contentPane.add(lblSchock);
		
		lblDutzend = new JLabel("Dutzend");
		lblDutzend.setBounds(10, 210, 100, 31);
		contentPane.add(lblDutzend);
		
		lblStueck = new JLabel("Stück");
		lblStueck.setBounds(10, 260, 100, 31);
		contentPane.add(lblStueck);
		
		btnUmrechnen = new JButton("In alte Zählmaße umrechnen");
		btnUmrechnen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Umrechnen();
				
			}
		});
		btnUmrechnen.setBounds(323, 51, 201, 31);
		contentPane.add(btnUmrechnen);
		
		btnEnde = new JButton("Ende");
		btnEnde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnEnde.setBounds(380, 215, 85, 26);
		contentPane.add(btnEnde);
	}
	public void Umrechnen() {
		int stueckzahl = Integer.parseInt(tfStueckzahl.getText());
		lblGros.setText("0 Gros");
		lblSchock.setText("0 Schock");
		lblDutzend.setText("0 Dutzend");
		lblStueck.setText("0 Stück");
		 if (stueckzahl >= 144) {
			 				 
			 int zahl2 = (stueckzahl / 12) / 12;
			 stueckzahl = stueckzahl - (zahl2 * 144);
			 String zahl = "";
			 zahl += zahl2;
			 lblGros.setText(zahl + " Gros");			 
		 }
		 
		 if (stueckzahl >= 60) {
			 int zahl = (stueckzahl / 5) /12;
			 stueckzahl = stueckzahl - (zahl * 60);
			 String zahl2 = "";
			 zahl2 += zahl;
			 lblSchock.setText(zahl2 + " Schock");
		 }
		 if (stueckzahl >= 12) {
			 int zahl = stueckzahl /12;
			 stueckzahl = stueckzahl - (zahl * 12);
			 String zahl2 = "";
			 zahl2 += zahl;
			 lblDutzend.setText(zahl2 + " Dutzend");
		 }
		 if (stueckzahl < 12) {

			 lblStueck.setText(stueckzahl + " Stück");
		 }
		 
		tfStueckzahl.requestFocus();
		tfStueckzahl.selectAll();
	}
}
