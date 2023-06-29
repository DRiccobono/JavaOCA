package projectMenue;

import java.awt.EventQueue;
import java.awt.Font;
import java.util.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Dimension;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Hangman extends JFrame {

	private JPanel contentPane;
	private JTextField tfBuchstabe;
	private JTextField tfWort;
	private JTextField tfSuchwort;
	private JButton btnOK;
	private JButton btnOK2;
	private JLabel lblHangman;
	private JLabel lblSuchwort;
	private JLabel lblWort;
	private JLabel lblBuchstabe;
	private JLabel lblHangFloor;
	private JLabel lblStand;
	private JLabel lblMast;
	private JLabel lblRope;
	private JLabel lblHead;
	private JLabel lblBody;
	private JLabel lblLeftArm;
	private JLabel lblRightArm;
	private JLabel lblLeftLeg;
	private JLabel lblRightLeg;
	private JLabel lblVersuche;
	private JLabel lblHinweis;
	private JLabel lblHinweisAusgabe;
	static Hangman frame = new Hangman();
	
	StringBuilder suchwort = new StringBuilder();
	StringBuilder vergleichswort = new StringBuilder();
	ArrayList <String> randomWort = new ArrayList <String> ();
	int randint = (int)(Math.random() * 8);
	int versuche = 10;
	private JButton btnReset;
	private JButton btnEnde;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		


		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hangman frame = new Hangman();
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
	public Hangman() {
		
		randomWort.add("Sommer");
		randomWort.add("Winter");
		randomWort.add("Herbst");
		randomWort.add("Frühling");
		randomWort.add("Katze");
		randomWort.add("Schlafen");
		randomWort.add("Kuchen");
		randomWort.add("Essen");
		
		vergleichswort.append(randomWort.get(randint).toUpperCase());
		for (int i = 0; i < randomWort.get(randint).length(); i++) {
			
			suchwort.append(" ");
		}
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 725, 399);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblHangman = new JLabel("Hangman");
		lblHangman.setBounds(10, 10, 74, 13);
		contentPane.add(lblHangman);
		
		tfBuchstabe = new JTextField();
		tfBuchstabe.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					Check();
					tfBuchstabe.requestFocus();
					tfBuchstabe.selectAll();
				}
			}
		});
		tfBuchstabe.setBounds(10, 100, 102, 19);
		contentPane.add(tfBuchstabe);
		tfBuchstabe.setColumns(10);
		
		tfWort = new JTextField();
		tfWort.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					String feld = tfWort.getText();
					if(vergleichswort.toString().equals(feld)) {
						lblHinweisAusgabe.setText("Gewonnen! Das wort war: " + vergleichswort);
					}
					else {versuche--;
						switch(versuche) {
						
						case 9 :
							lblHangFloor.setVisible(true);
							lblVersuche.setText("Versuche: 9");
							break;
						case 8 :
							lblStand.setVisible(true);
							lblVersuche.setText("Versuche: 8");
							break;
						case 7 :
							lblMast.setVisible(true);
							lblVersuche.setText("Versuche: 7");
							break;
						case 6 :
							lblRope.setVisible(true);
							lblVersuche.setText("Versuche: 6");
							break;
						case 5 :
							lblHead.setVisible(true);
							lblVersuche.setText("Versuche: 5");
							break;
						case 4 :
							lblBody.setVisible(true);
							lblVersuche.setText("Versuche: 4");
							break;
						case 3 :
							lblLeftArm.setVisible(true);
							lblVersuche.setText("Versuche: 3");
							break;
						case 2 :
							lblRightArm.setVisible(true);
							lblVersuche.setText("Versuche: 2");
							break;
						case 1 :
							lblLeftLeg.setVisible(true);
							lblVersuche.setText("Versuche: 1");
							break;
						case 0 :
							lblRightLeg.setVisible(true);
							lblVersuche.setText("Versuche: 0");
							JOptionPane.showMessageDialog(null, "Leider verloren"
													+ " das gesuchte Wort war: " + vergleichswort);
							break;
						}
					}
				}
			}
		});
		tfWort.setBounds(10, 200, 102, 19);
		contentPane.add(tfWort);
		tfWort.setColumns(10);
		
		btnOK = new JButton("OK");
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Check();
				tfBuchstabe.requestFocus();
				tfBuchstabe.selectAll();
			}
		});
		btnOK.setBounds(140, 99, 85, 21);
		contentPane.add(btnOK);
		
		btnOK2 = new JButton("OK");
		btnOK2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String wort = tfWort.getText().toUpperCase();
				if(vergleichswort.toString().equals(wort)) {
					lblHinweisAusgabe.setText("Gewonnen! Das wort war: " + vergleichswort);
				}
			}
		});
		btnOK2.setBounds(140, 199, 85, 21);
		contentPane.add(btnOK2);
		
		tfSuchwort = new JTextField();
		tfSuchwort.setEditable(false);
		tfSuchwort.setBounds(10, 301, 300, 19);
		contentPane.add(tfSuchwort);
		tfSuchwort.setColumns(10);
		
		lblSuchwort = new JLabel("Suchwort");
		lblSuchwort.setBounds(10, 278, 102, 13);
		contentPane.add(lblSuchwort);
		
		lblWort = new JLabel("Wort raten");
		lblWort.setBounds(10, 177, 102, 13);
		contentPane.add(lblWort);
		
		lblBuchstabe = new JLabel("Buchstabe raten");
		lblBuchstabe.setBounds(10, 77, 102, 13);
		contentPane.add(lblBuchstabe);
		
		lblHangFloor = new JLabel("________________");
		lblHangFloor.setVisible(false);
		lblHangFloor.setHorizontalAlignment(SwingConstants.CENTER);
		lblHangFloor.setBounds(448, 203, 111, 13);
		contentPane.add(lblHangFloor);
		
		lblStand = new JLabel("<html>|<br/>|<br/>|<br/>"
				+ "|<br/>|<br/>|<br/>|<br/>|");
		lblStand.setVisible(false);
		lblStand.setHorizontalAlignment(SwingConstants.CENTER);
		lblStand.setBounds(446, 112, 102, 104);
		contentPane.add(lblStand);
		
		lblMast = new JLabel("_________");
		lblMast.setVisible(false);
		lblMast.setBounds(500, 99, 58, 13);
		contentPane.add(lblMast);
		
		lblRope = new JLabel("<html>|<br/>|<br/>|<br/>|<html/>");
		lblRope.setVisible(false);
		lblRope.setHorizontalAlignment(SwingConstants.CENTER);
		lblRope.setBounds(530, 112, 45, 37);
		contentPane.add(lblRope);
		
		lblHead = new JLabel("<html><span style="
				+ "' font-size : 20px '>O<span/><html/>");
		lblHead.setVisible(false);
		
		lblHead.setHorizontalAlignment(SwingConstants.CENTER);
		lblHead.setBounds(520, 140, 64, 31);
		contentPane.add(lblHead);
		
		lblBody = new JLabel("<html><span style = "
				+ "' font-size : 20px '>|<span/><html/>");
		lblBody.setVisible(false);
		lblBody.setHorizontalAlignment(SwingConstants.CENTER);
		lblBody.setBounds(530, 159, 45, 31);
		contentPane.add(lblBody);
		
		lblLeftArm = new JLabel("<html><span style= "
				+ "' font-size : 20px '>/<span/><html/>");
		lblLeftArm.setVisible(false);
		lblLeftArm.setHorizontalAlignment(SwingConstants.CENTER);
		lblLeftArm.setBounds(537, 162, 22, 31);
		contentPane.add(lblLeftArm);
		
		lblRightArm = new JLabel("<html><span style= "
				+ "' font-size : 20px '>\\<span/><html/>");
		lblRightArm.setVisible(false);
		lblRightArm.setHorizontalAlignment(SwingConstants.CENTER);
		lblRightArm.setBounds(545, 162, 22, 31);
		contentPane.add(lblRightArm);
		
		lblLeftLeg = new JLabel("<html><span style= "
				+ "' font-size : 20px '>/<span/><html/>");
		lblLeftLeg.setVisible(false);
		lblLeftLeg.setHorizontalAlignment(SwingConstants.CENTER);
		lblLeftLeg.setBounds(538, 181, 22, 30);
		contentPane.add(lblLeftLeg);
		
		lblRightLeg = new JLabel("<html><span style= "
				+ "' font-size : 20px '>\\<span/><html/>");
		lblRightLeg.setVisible(false);
		lblRightLeg.setHorizontalAlignment(SwingConstants.CENTER);
		lblRightLeg.setBounds(545, 181, 22, 30);
		contentPane.add(lblRightLeg);
		
		lblVersuche = new JLabel("Versuche: 10");
		lblVersuche.setBounds(500, 77, 75, 13);
		contentPane.add(lblVersuche);
		
		lblHinweis = new JLabel("Hinweis: Es ist ein Wort mit "
								+ vergleichswort.length() + " Buchstaben.");		
		lblHinweis.setBounds(448, 278, 253, 13);
		contentPane.add(lblHinweis);
		
		lblHinweisAusgabe = new JLabel("");
		lblHinweisAusgabe.setBounds(448, 304, 228, 13);
		contentPane.add(lblHinweisAusgabe);
		
		//Reset leider noch nicht verwendbar
		
		btnReset = new JButton("Reset");
		btnReset.setVisible(false);
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				vergleichswort.delete(0, randomWort.get(randint).length());
				suchwort.delete(0,randomWort.get(randint).length());
				randint = (int)(Math.random()*8);
				vergleichswort.append(randomWort.get(randint));
				
				for (int i = 0; i < randomWort.get(randint).length(); i++) {
					suchwort.append(" ");
				}
				
				tfWort.setText("");
				tfBuchstabe.setText("");
				tfSuchwort.setText("");
				tfBuchstabe.requestFocus();
				lblRightLeg.setVisible(false);
				lblRightArm.setVisible(false);
				lblLeftArm.setVisible(false);
				lblLeftLeg.setVisible(false);
				lblBody.setVisible(false);
				lblHead.setVisible(false);
				lblRope.setVisible(false);
				lblMast.setVisible(false);
				lblStand.setVisible(false);
				lblHangFloor.setVisible(false);
				tfBuchstabe.setEnabled(true);
				tfWort.setEnabled(true);
				btnOK.setEnabled(true);
				btnOK2.setEnabled(true);
				lblHinweisAusgabe.setText("");
				lblHinweis.setText("Hinweis: Es ist ein Wort mit "
									+ vergleichswort.length() + " Buchstaben.");
				versuche = 10;
				lblVersuche.setText("Versuche: 10");
			}
		});
		btnReset.setBounds(140, 245, 85, 21);
		contentPane.add(btnReset);
		
		btnEnde = new JButton("Exit");
		btnEnde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				Menue.frame.setVisible(true);
			}
		});
		btnEnde.setBounds(27, 245, 85, 21);
		contentPane.add(btnEnde);
	}
	public void Check() {

		String textFeld = tfBuchstabe.getText().toUpperCase();
		char buchstabe = textFeld.charAt(0);
		
		for (int i = 0; i <= vergleichswort.length() -1; i++) {
			
			if(vergleichswort.charAt(i) == buchstabe &&
				suchwort.charAt(i) != buchstabe) {	
					
				suchwort.deleteCharAt(i);
				suchwort.insert(i, buchstabe);
				tfSuchwort.setText(suchwort.toString());
			}
		}
		if(!vergleichswort.toString().contains(textFeld)){
			versuche--;
			
			switch(versuche) {
			
			case 9 :
				lblHangFloor.setVisible(true);
				lblVersuche.setText("Versuche: 9");
				break;
			case 8 :
				lblStand.setVisible(true);
				lblVersuche.setText("Versuche: 8");
				break;
			case 7 :
				lblMast.setVisible(true);
				lblVersuche.setText("Versuche: 7");
				break;
			case 6 :
				lblRope.setVisible(true);
				lblVersuche.setText("Versuche: 6");
				break;
			case 5 :
				lblHead.setVisible(true);
				lblVersuche.setText("Versuche: 5");
				break;
			case 4 :
				lblBody.setVisible(true);
				lblVersuche.setText("Versuche: 4");
				break;
			case 3 :
				lblLeftArm.setVisible(true);
				lblVersuche.setText("Versuche: 3");
				break;
			case 2 :
				lblRightArm.setVisible(true);
				lblVersuche.setText("Versuche: 2");
				break;
			case 1 :
				lblLeftLeg.setVisible(true);
				lblVersuche.setText("Versuche: 1");
				break;
			case 0 :
				lblRightLeg.setVisible(true);
				lblVersuche.setText("Versuche: 0");
				tfBuchstabe.setEnabled(false);
				tfWort.setEnabled(false);
				btnOK.setEnabled(false);
				btnOK2.setEnabled(false);
				JOptionPane.showMessageDialog(null, "Leider verloren das gesuchte Wort war: "
												+ vergleichswort);
				break;
			}
		}
		
		if (suchwort.toString().equals(vergleichswort.toString())) {
			
			lblHinweisAusgabe.setText("Gewonnen! Das Wort war: " + vergleichswort);
			tfBuchstabe.setEnabled(false);
			tfWort.setEnabled(false);
			btnOK.setEnabled(false);
			btnOK2.setEnabled(false);
			JOptionPane.showMessageDialog(null, "Du hast Gewonnen!");			
		}
	}
}
