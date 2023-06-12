package chapter07;
import javax.swing.JOptionPane;
public class Zahlensysteme {

	public static void main(String[] args) {
		String eingabe = JOptionPane.showInputDialog("Bitte "
												+ "Zahl eingeben");
		//Binärausgabe
		
		String dualAusgabe = "";
		
		int zahl = Integer.parseInt(eingabe);
		for (int i = 0; i <20; i++) {
			
		int dual = zahl % 2;
		if (dual == 1) {
			dualAusgabe += "1";			
			}
		else {
			dualAusgabe += "0";
			}
		if (i == 4 || i == 8 || i == 12 || i == 16 || i == 20) {
			dualAusgabe += " ";
		}
		dual = zahl / 2;
		zahl = zahl / 2;
		}
		String dualAusgabeR = "";
		for (int i = dualAusgabe.length() -1;i >= 0; i--) {
			dualAusgabeR += dualAusgabe.charAt(i);
		}
		
		zahl = Integer.parseInt(eingabe);

		String hexa = Integer.toHexString(zahl);
		
		JOptionPane.showMessageDialog(null,eingabe + "\n" + dualAusgabeR + "\n" + hexa);
	}
}
