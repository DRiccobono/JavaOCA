package test1;
import javax.swing.JOptionPane;

public class Disco {

	public static void main(String[] args) {
		final int mindestalter = 18;
		int alter = Integer.parseInt(JOptionPane.showInputDialog("Gib dein Alter an"));
		String geschlecht = JOptionPane.showInputDialog("Gib Dein Geschlecht an");
		geschlecht = geschlecht.toLowerCase();
		boolean einlass = true;
		
		while(einlass) {
			
		
			if (alter < mindestalter) {
				JOptionPane.showMessageDialog(null, "Du musst mindestens " + mindestalter
													+ " Jahre alt sein");
				einlass = false;
			}
			else if (alter >= mindestalter) {
				JOptionPane.showMessageDialog(null,"Okay du darfst rein");
				String vip = JOptionPane.showInputDialog("Bist du VIP?");
				
				vip = vip.toLowerCase();
				
				if (vip.equals("ja")) {
					JOptionPane.showMessageDialog(null,"Du bekommst ein Spezielles Angebot" + 
														" für VIPs");

				}
				if (vip.equals("nein")) {
					JOptionPane.showMessageDialog(null,"Okay du bekommst das normale Angebot");

				}
				
				if (geschlecht.equals("frau")) {
					JOptionPane.showMessageDialog(null,"Heute ist übrigens Ladies-Night." + 
							" Du bekommst 15% rabatt auf Getränke");
					
				}
			}			
		einlass = false;
		}	
	}
}
