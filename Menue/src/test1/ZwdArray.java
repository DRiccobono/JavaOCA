package test1;
import javax.swing.JOptionPane;
public class ZwdArray {

	public static void main(String[] args) {
		
		String[][] persons = {
				{"Hans", "Werner", "48", "ledig", "Handwerker"},
				{"Christian", "Herrero", "30", "verheiratet", "Bankkaufmann"},
				{"Elif", "Yamaz", "8", "ledig", "Schülerin"},
				{null, null, null, null, null}
				};
		
		String[] categories = {
				"Vorname", "Nachname", "Alter", "Familienstand", "Beruf"
				};
		String ausgabe = "";
		for (int i = 0; i < persons.length; i++) {
			for (int j = 0; j < persons[i].length; j++) {
				if (persons[i][j] == null) { 

						persons[i][j] = JOptionPane.showInputDialog("Bitte geben sie " + categories[j] + " an");					
					}
				ausgabe += persons[i][j] + " ";
			}
			ausgabe += "\n";
		}
		JOptionPane.showMessageDialog(null,ausgabe);
	}

}
