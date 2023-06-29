package test1;
import javax.swing.JOptionPane;

public class Fakultaet {

	public static void main(String[] args) {

		String eingabe = JOptionPane.showInputDialog("Bitte Zahl eingeben zwischen 0 und 10");
		int zahl = Integer.parseInt(eingabe);
		int ergebnis = 1;

		String ausgabe = "Das Ergebnis der " + zahl + "! ist: " + ergebnis;
		
		final int UNTERE_GRENZE = 0;
		final int OBERE_GRENZE = 10;
		
		while(zahl < UNTERE_GRENZE || zahl > OBERE_GRENZE) {
			zahl = Integer.parseInt(JOptionPane.showInputDialog("Fehler bite gib eine zahl zwischen 0 und 10 ein"));
		}
		
		if(zahl == 0 || zahl == 1) {
			JOptionPane.showMessageDialog(null, ausgabe);
		}
		else {
			for (int i = 1; i <= zahl; i++) {
				ergebnis *= i;
			}
			JOptionPane.showMessageDialog(null, "Das Ergebnis der " + zahl + "! ist: " + ergebnis);
		}
	}

}
