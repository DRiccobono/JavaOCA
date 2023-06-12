package chapter07;
import javax.swing.JOptionPane;
public class Vokalzaehler2 {

	public static void main(String[] args) {
		String eingabe = JOptionPane.showInputDialog("Bitte text eingeben");
		String lower = eingabe.toLowerCase();
		
		int aCount = 0;
		int eCount = 0;
		int iCount = 0;
		int oCount = 0;
		int uCount = 0;
		
		for (int i = 0; i < lower.length(); i++) {
			char buchstabe = lower.charAt(i);
			
			switch(buchstabe) {
			
			case 'a':
				aCount++;
				break;
			case 'e':
				eCount++;
				break;
			case 'i':
				iCount++;
				break;
			case 'o':
				oCount++;
				break;
			case 'u':
				uCount++;
				break;
			}
		}
		System.out.println("Eingabetext: " + eingabe);
		System.out.println("vokal a: " + aCount + " vokal e: " + eCount + 
				" vokal i: " + iCount + " vokal o: " + oCount
				+ " vokal u: " + uCount);
	}
}
