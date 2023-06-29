package test1;
import javax.swing.JOptionPane;

public class Alphabet {

	public static void main(String[] args) {
		int zahl = 65;
		int grenze = 91;
		String asciiToChar = "";
		
		while(zahl < grenze) {
			asciiToChar += (char)zahl + "\n";
			
			zahl++;
		}
		JOptionPane.showMessageDialog(null,asciiToChar);

	}

}
