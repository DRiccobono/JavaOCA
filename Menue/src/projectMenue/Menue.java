package projectMenue;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Menue extends JFrame {

	private JPanel contentPane;
	private JButton btnEingabetest;
	private JButton btnEnde;
	static Menue frame = new Menue();
	private JButton btnHangman;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
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
	public Menue() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 221);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnEingabetest = new JButton("Eingabetest");
		btnEingabetest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				Eingabetest.frame.setVisible(true);
			}
		});
		btnEingabetest.setBounds(40, 29, 140, 21);
		contentPane.add(btnEingabetest);
		
		btnEnde = new JButton("Ende");
		btnEnde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnEnde.setBounds(230, 29, 91, 21);
		contentPane.add(btnEnde);
		
		btnHangman = new JButton("Hangman");
		btnHangman.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				Hangman.frame.setVisible(true);
			}
		});
		btnHangman.setBounds(40, 81, 140, 21);
		contentPane.add(btnHangman);
	}
}
