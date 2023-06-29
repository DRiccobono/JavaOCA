package test1;
import javax.swing.JOptionPane;

public class Zahlenraten {

	public static void main(String[] args) {
		
		boolean erraten = false;
		boolean abbruch = false;
		
		int versuche = 0;
		int zahlen[] = {5,10,15,20,25,30};
		int zahl = (int)(Math.random() * 6);
		
		final int hinweis = 5;
		final int frage = 10;
		final int ende = 30;
		final int aufhoeren = 404;

		JOptionPane.showMessageDialog(null,"Willkommen beim Zahlenraten.");
		JOptionPane.showMessageDialog(null,"Um das Spiel vorzeitig zu beenden "
											+ "gib die Zahl " + aufhoeren + " ein");
			
		while (erraten == false && abbruch == false) {	
			String beginn = JOptionPane.showInputDialog("Gib eine Zahl ein");
			
			if (beginn.isBlank()) {
				JOptionPane.showMessageDialog(null,"Das feld darf nicht leer sein");
			}
			else {								
				int eingabe = Integer.parseInt(beginn);
				
				if (eingabe == aufhoeren) {				
					JOptionPane.showMessageDialog(null,"Das Spiel wird beendet. Danke fürs spielen");
					abbruch = true;
				}
				
				else if (zahlen[zahl] != eingabe) {				
					JOptionPane.showMessageDialog(null,"Leider Falsch..");
					versuche++;
				}
				
				if (versuche > ende) {				
					JOptionPane.showMessageDialog(null,"Hey uhm... also du hattest mittlerweile" + 
							" schon 30 versuche.. ich glaube es ist besser" + 
							" für dich wenn ich das hier jetzt beende." + 
							" Trotzdem Danke fürs spielen :)");
					abbruch = true;
				}
							
				if (versuche == hinweis) {				
					JOptionPane.showMessageDialog(null,"Kleiner Tipp: Es ist eine zahl" 
														+ " zwischen 1 und 30");
				}
				
				if (versuche == frage) {
					String antwort = JOptionPane.showInputDialog("Du hast es bereits 10 mal" + 
																" versucht.. möchtest du aufhören?");
					antwort.toLowerCase();
	
					if (antwort.equals("ja")) {
						JOptionPane.showMessageDialog(null,"Vernünftige Entscheidung." + 
															" Danke fürs spielen");
						abbruch = true;
					}
					
					else {
						JOptionPane.showMessageDialog(null,"Okay dann noch viel Spass!");
					}
				}				
				
				else if (zahlen[zahl] == eingabe) {				
					JOptionPane.showMessageDialog(null,"Hey das war richtig!" +
														" Glückwunsch du hast gewonnen!");
					erraten = true;
				}			
			}						
		}
	}
}
