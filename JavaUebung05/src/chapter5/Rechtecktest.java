package chapter5;
import javax.swing.JOptionPane;
public class Rechtecktest {

	public static void main(String[] args) {
		double laenge = Double.parseDouble(JOptionPane.showInputDialog("Bitte Länge eingeben: "));
		double breite = Double.parseDouble(JOptionPane.showInputDialog("Bitte Breite eingeben: "));
		double bv = Double.parseDouble(JOptionPane.showInputDialog("Breite vergößern: "));
		double lv = Double.parseDouble(JOptionPane.showInputDialog("Länge vergrößern: "));
		double bk = Double.parseDouble(JOptionPane.showInputDialog("Breite verkleinern: "));
		double lk = Double.parseDouble(JOptionPane.showInputDialog("Länge verkleinern: "));

		
		Rechteck rechteck = new Rechteck(laenge, breite);
		
		System.out.println("Lange Seite: " + rechteck.getLangeSeite() + " cm");
		System.out.println("Kurze Seite: " + rechteck.getKurzeSeite() + " cm");
		System.out.println("Diagonale: " + rechteck.getDiagonale() + " cm");
		System.out.println("Fläche: " + rechteck.getFlaeche() + " cm");
		System.out.println("Umfang: " + rechteck.getUmfang() + " cm");
		rechteck.laengeAusgeben();
		rechteck.breiteVergroessern(bv);
		rechteck.laengeVergroessern(lv);
		rechteck.breiteVerkleinern(bk);
		rechteck.laengeVerkleinern(lk);
	}

}
