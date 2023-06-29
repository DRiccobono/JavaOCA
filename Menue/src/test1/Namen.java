package test1;

import javax.swing.JOptionPane;

public class Namen {

	public static void main(String[] args) {
		String ausgabe = "";
		String Vorname = JOptionPane.showInputDialog("Bitte Namen Eingeben");
		String zahl = JOptionPane.showInputDialog(null,"Bitte anzahl der Widerholungen Eingeben");
		int eingabe = Integer.parseInt(zahl);
		int zaehler = 0;
		int oberGrenze = 30;
		int unterGrenze = 0;

		
		while (zaehler < eingabe) {
			
			if (eingabe < oberGrenze && eingabe > unterGrenze) {
				zaehler++;
				ausgabe += zaehler + ": " +  Vorname + "\n";

			}

			
			
			else {	
				JOptionPane.showMessageDialog(null,"Falsche eingabe bitte gib eine Zahl zwischen"
						 							+ " 0 und 30 an");
				zahl = JOptionPane.showInputDialog(null,"Bitte anzahl der Widerholungen Eingeben");
				eingabe = Integer.parseInt(zahl);
			}
			
		}
		JOptionPane.showMessageDialog(null, ausgabe);

	}

}
