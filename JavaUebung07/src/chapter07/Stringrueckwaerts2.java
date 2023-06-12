package chapter07;
import javax.swing.JOptionPane;
public class Stringrueckwaerts2 {
	
	public static void main(String[] args) {
		
		String eingabe = JOptionPane.showInputDialog("Bitte text eingeben");
		String ausgabe = "";
		for (int i = eingabe.length()-1; i >= 0; i--) {
			ausgabe += eingabe.charAt(i);
		}
		JOptionPane.showMessageDialog(null, ausgabe);
	}
}
