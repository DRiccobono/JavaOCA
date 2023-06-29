package test1;

import javax.swing.JOptionPane;

public class Notendurchschnitt {

	public static void main(String[] args) {
		
		int anzahl = Integer.parseInt(JOptionPane.showInputDialog("Mit diesem Tool berechnen Sie "
																+ "Ihren Notendurchschnitt.\n\n"
																+ "Bitte Geben SIe die exakte Anzahl "
																+ "von Noten an, deren Notendurchschnitt"
																+ " Sie berechnen wollen."));

		String eingabe1 = "";
		int note = 1;
		int komma = 0;
		double[] arr1 = new double[anzahl];
		
		for (int i = 0; i < anzahl; i++) {
			String eingabe = JOptionPane.showInputDialog("Bitte geben sie Ihre " + note + ". Note ein");
			double zahl = Double.parseDouble(eingabe);
			
			arr1[i] = zahl;
			eingabe1 += eingabe;
			
			if (komma < anzahl -1) {
				eingabe1 += ", ";
				komma++;
			}
			
			note++;
		}
		for (int i = 0; i < anzahl; i++) {
			
		}
		
		double rechnung = 0;
		for(int i = 0; i < anzahl; i++) {
			rechnung += arr1[i];
		}
		rechnung /= anzahl;
		JOptionPane.showMessageDialog(null,"Ihre eingegebenen Noten sind: " + eingabe1 + 
										"\n\nIhr Notendurchschnitt ist: " + String.format("%.2f",rechnung));
	}

}
