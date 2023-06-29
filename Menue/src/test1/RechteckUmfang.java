package test1;
import javax.swing.JOptionPane;
public class RechteckUmfang {

	public static void main(String[] args) {
		String laenge = JOptionPane.showInputDialog(null,"Bitte Länge eingeben:");
		String laengeEinheit = JOptionPane.showInputDialog(null,"Länge gemessen in?: ");
		String breite = JOptionPane.showInputDialog(null,"Bitte Breite eingeben:");
		String breiteEinheit = JOptionPane.showInputDialog(null,"Breite gemessen in?: ");

		
		int lang = Integer.parseInt(laenge);
		int breit = Integer.parseInt(breite);
		
		int umfang = 2 * lang + 2 * breit;
		int flaeche = lang * breit;
		
		JOptionPane.showMessageDialog(null, "Die eingegebene Länge beträgt: " + lang + laengeEinheit + "\n Die eingegebene Breite beträgt: " + breit + breiteEinheit + "\n\n Der Umfang beträgt: " + umfang + laengeEinheit + "\n Die Fläche beträgt: " + flaeche + laengeEinheit + "²");
	}

}
