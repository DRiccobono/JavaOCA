package projectMenue;
import java.time.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Eingabetest extends JFrame {

	private JPanel contentPane;
	private JLabel lblTitel;
	private JButton btnStart;
	private JTextField tfEingabe;
	private JButton btnExit;
	private JLabel lblErgebnis;
	static Eingabetest frame = new Eingabetest();
	String vorgabe = "Fischers Fritz fischt frische Fische";
	Instant start;
	Instant end;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args){
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
	public Eingabetest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 475);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblTitel = new JLabel("Eingabetest");
		lblTitel.setBounds(40, 40, 85, 13);
		contentPane.add(lblTitel);
		
		btnStart = new JButton("Start");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfEingabe.setEnabled(true);
				tfEingabe.requestFocus();
				tfEingabe.setText("");
				JOptionPane.showMessageDialog(null, "Gib den Text 'Fischers"
						+ " Fritz fischt frische Fische' möglichst schnell ein");
				start = Instant.now();
				
			}
		});
		btnStart.setBounds(40, 95, 85, 21);
		contentPane.add(btnStart);
		
		tfEingabe = new JTextField();
		tfEingabe.setEnabled(false);
		tfEingabe.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					if(!tfEingabe.getText().isBlank()) {
						
						end = Instant.now();
						Duration span = Duration.between(start, end);
						if (tfEingabe.getText().equals(vorgabe)) {
							lblErgebnis.setText("Fehlerfreie eingabe! "
									+ span.toMinutesPart() + " Minuten " 
									+ span.toSecondsPart() + " Sekunden und " 
									+ span.toMillisPart() + " Millisekunden");
						}
						else {lblErgebnis.setText("Schreibfehler in der Eingabe");}
					}
					else {
						JOptionPane.showMessageDialog(null, "Das Feld "
														+ "ist leer");
					}
					tfEingabe.setEnabled(false);
				}
			}
		});
		tfEingabe.setBounds(40, 128, 500, 19);
		contentPane.add(tfEingabe);
		tfEingabe.setColumns(10);
		
		lblErgebnis = new JLabel("Ergebnis:");
		lblErgebnis.setBounds(40, 157, 500, 13);
		contentPane.add(lblErgebnis);
		
		btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menue.frame.setVisible(true);
				frame.setVisible(false);
				
			}
		});
		btnExit.setBounds(180, 95, 85, 21);
		contentPane.add(btnExit);
	}
}
