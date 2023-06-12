package chapter6;
import javax.swing.JOptionPane;
public class Kontotest {

	public static void main(String[] args) {
		String kontonummer = "0000000001";
		double kontostand = 1000;
		
		Konto k1 = new Konto(kontonummer, kontostand);
		
		System.out.println("Kontonummer: " + k1.getKontonummer()
								+ "\nKontostand: " + k1.getKontostand());
		double betragE = Double.parseDouble(JOptionPane.showInputDialog("Bitte Einzahlungsbetrag "
																		+ "eingeben: "));
		k1.einzahlen(betragE);
		
		double betragA = Double.parseDouble(JOptionPane.showInputDialog("Bitte Auszahlungsbetrag "
																		+ "eingeben: "));
		k1.auszahlen(betragA);
		
		System.out.println("Kontonummer: " + k1.getKontonummer()
		+ "\nKontostand: " + k1.getKontostand());
	}

}
