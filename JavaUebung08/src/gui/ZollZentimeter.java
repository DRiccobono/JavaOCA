package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ZollZentimeter extends JFrame {

	private JPanel contentPane;
	private JTextField tfZoll;
	private JLabel lblZoll;
	private JButton btnUmrechnen;
	private JButton btnEnde;
	private JLabel lblZentimeter;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ZollZentimeter frame = new ZollZentimeter();
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
	public ZollZentimeter() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 323, 150);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		tfZoll = new JTextField();
		tfZoll.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					Umrechnen();
				}
			}
		});
		tfZoll.setBounds(10, 33, 110, 19);
		contentPane.add(tfZoll);
		tfZoll.setColumns(10);
		
		lblZoll = new JLabel("Zoll");
		lblZoll.setBounds(10, 10, 45, 13);
		contentPane.add(lblZoll);
		
		btnUmrechnen = new JButton("Umrechnen");
		btnUmrechnen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Umrechnen();
			}
		});
		btnUmrechnen.setBounds(10, 62, 110, 26);
		contentPane.add(btnUmrechnen);
		
		btnEnde = new JButton("Ende");
		btnEnde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnEnde.setBounds(200, 62, 96, 26);
		contentPane.add(btnEnde);
		
		lblZentimeter = new JLabel("");
		lblZentimeter.setBounds(200, 33, 96, 19);
		contentPane.add(lblZentimeter);
		}
		public void Umrechnen(){
			double zentimeter = Double.parseDouble(tfZoll.getText());
			zentimeter = zentimeter * 2.54;
			lblZentimeter.setText(String.format("%.2f",zentimeter) + " cm");
			
			tfZoll.requestFocus();
			tfZoll.selectAll();
	}
}
