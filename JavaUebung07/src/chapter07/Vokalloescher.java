package chapter07;
import javax.swing.JOptionPane;
public class Vokalloescher {

	public static void main(String[] args) {
		String eingabe = JOptionPane.showInputDialog("Bitte text eingeben");
		StringBuilder text = new StringBuilder(eingabe);
		char arr1[] = {'a','e','i','o','u'};
		
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < text.length(); j++) {
				char text2 = text.charAt(j);
				
				
			if (text2 == arr1[i]) {
					text.deleteCharAt(j);
					i--;
					break;
				}
			}
		}
		System.out.println(text);
	}
}