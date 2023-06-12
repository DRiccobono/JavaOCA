package chapter5;
import javax.swing.JOptionPane;
public class KreisTabelle {

	public static void main(String[] args) {
		double radius = Double.parseDouble(JOptionPane.showInputDialog("Bitte Radius eingeben: "));
		
		double radiusErhoehung = Double.parseDouble(JOptionPane.showInputDialog("Bitte" + 
																		"Radiuserhöhung eingeben: "));
		
		int tabLaenge = Integer.parseInt(JOptionPane.showInputDialog("Bitte Tabellenlänge eingeben: "));
		int maxTabelle = tabLaenge;
		
		Kreis kreis = new Kreis(radius);
		
		System.out.println("Radius" + "\t" + "Fläche" + "\t" + "Umfang");
		
		for (int i = 0; i < maxTabelle; i++) {
			System.out.println(kreis.radius + "\t" + kreis.getUmfang() + 
								"\t" + kreis.getFlaeche());
			
			kreis.setRadiuserhoehung(radiusErhoehung);
			
		}
	}

}
