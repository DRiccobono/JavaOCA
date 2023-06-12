package chapter5;
import javax.swing.JOptionPane;
public class Kreistest {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("Geben sie den Radius des Kreises ein;");
		double radius = Double.parseDouble(input);
		double flaeche = 4.3;
		double umfang = 6.4;
		
		Kreis kreis = new Kreis(radius);
		
		System.out.println("Radius: " + kreis.getRadius());
		System.out.println("Umfang: " + kreis.getUmfang());
		System.out.println("Fläche: " + kreis.getFlaeche());
		kreis.setRadByFlaeche(flaeche);
		kreis.setRadByUmfang(umfang);
	}

}