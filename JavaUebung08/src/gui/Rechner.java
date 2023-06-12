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

public class Rechner extends JFrame {

	private JPanel contentPane;
	private JLabel lblOperator1;
	private JLabel lblOperator2;
	private JLabel lblErgebnis;
	private JTextField tfAusgabe;
	private JTextField tfOperator1;
	private JTextField tfOperator2;
	private JButton btnPlus;
	private JButton btnMinus;
	private JButton btnMal;
	private JButton btnGeteilt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Rechner frame = new Rechner();
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
	public Rechner() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		lblOperator1 = new JLabel("Operand1");
		lblOperator1.setBounds(10, 10, 96, 13);
		contentPane.add(lblOperator1);
		
		lblOperator2 = new JLabel("Operand2");
		lblOperator2.setBounds(330, 10, 96, 13);
		contentPane.add(lblOperator2);
		
		lblErgebnis = new JLabel("Ergebnis");
		lblErgebnis.setBounds(10, 200, 96, 13);
		contentPane.add(lblErgebnis);
		
		tfAusgabe = new JTextField();
		tfAusgabe.setEditable(false);
		tfAusgabe.setBounds(10, 223, 416, 19);
		contentPane.add(tfAusgabe);
		tfAusgabe.setColumns(10);
		
		tfOperator1 = new JTextField();
		tfOperator1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					tfOperator2.requestFocus();
				}
			}
		});
		tfOperator1.setBounds(10, 30, 96, 19);
		contentPane.add(tfOperator1);
		tfOperator1.setColumns(10);
		
		tfOperator2 = new JTextField();
		tfOperator2.setBounds(330, 30, 96, 19);
		contentPane.add(tfOperator2);
		tfOperator2.setColumns(10);
		
		btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double zahl1 = Double.parseDouble(tfOperator1.getText());
				double zahl2 = Double.parseDouble(tfOperator2.getText());
				double ausgabe = zahl1 + zahl2;
				tfAusgabe.setText( zahl1 + " + " + zahl2 + " = " + String.format("%.2f",ausgabe));
			}
		});
		btnPlus.setBounds(150, 29, 50, 21);
		contentPane.add(btnPlus);
		
		btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double zahl1 = Double.parseDouble(tfOperator1.getText());
				double zahl2 = Double.parseDouble(tfOperator2.getText());
				double ausgabe = zahl1 - zahl2;
				tfAusgabe.setText( zahl1 + " - " + zahl2 + " = " + String.format("%.2f",ausgabe));
			}
		});
		btnMinus.setBounds(247, 29, 50, 21);
		contentPane.add(btnMinus);
		
		btnMal = new JButton("*");
		btnMal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double zahl1 = Double.parseDouble(tfOperator1.getText());
				double zahl2 = Double.parseDouble(tfOperator2.getText());
				double ausgabe = zahl1 * zahl2;
				tfAusgabe.setText( zahl1 + " * " + zahl2 + " = " + String.format("%.2f",ausgabe));
			}
		});
		btnMal.setBounds(150, 60, 50, 21);
		contentPane.add(btnMal);
		
		btnGeteilt = new JButton("/");
		btnGeteilt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double zahl1 = Double.parseDouble(tfOperator1.getText());
				double zahl2 = Double.parseDouble(tfOperator2.getText());
				double ausgabe = zahl1 / zahl2;
				tfAusgabe.setText( zahl1 + " / " + zahl2 + " = " + String.format("%.2f",ausgabe));
			}
		});
		btnGeteilt.setBounds(247, 60, 50, 21);
		contentPane.add(btnGeteilt);
	}

}
