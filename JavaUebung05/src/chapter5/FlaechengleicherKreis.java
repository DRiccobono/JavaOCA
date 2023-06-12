package chapter5;
import javax.swing.JOptionPane;
public class FlaechengleicherKreis {

	public static void main(String[] args) {
		
		
		double laenge = Double.parseDouble(JOptionPane.showInputDialog("Länge "
											+ "des Rechtecks eingeben; "));
		
		double breite = Double.parseDouble(JOptionPane.showInputDialog("Breite "
											+ "des Rechtecks eingeben; "));
		
		Rechteck rechteck = new Rechteck(laenge,breite);
		
		Kreis kreis = new Kreis();
		
		System.out.println("Rechtecklänge: " + rechteck.getLaenge());
		System.out.println("Rechteckbreite: " + rechteck.getBreite());
		System.out.println("Rechteckfläche: " + rechteck.getFlaeche());
		System.out.println();
		kreis.setRadByFlaeche(rechteck.getFlaeche());
		System.out.println("Kreisfläche: " + kreis.getFlaeche());
	}

}