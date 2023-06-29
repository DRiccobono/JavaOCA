package test1;
import javax.swing.JOptionPane;
public class Niederschlagsmaenge {

	public static void main(String[] args) {
		String Niederschlag_A = JOptionPane.showInputDialog("Geben Sie die Niederschlagsmenge für April ein: ");
		String Niederschlag_M = JOptionPane.showInputDialog("Geben Sie die Niederschlagsmenge für Mai ein: ");
		String Niederschlag_J = JOptionPane.showInputDialog("Geben Sie die Niederschlagsmenge für Juni ein: ");
		
		int April = Integer.parseInt(Niederschlag_A);
		int Mai = Integer.parseInt(Niederschlag_M);
		int Juni = Integer.parseInt(Niederschlag_J);
		
		int Average = April + Mai + Juni;
		Average = Average / 3;
		JOptionPane.showMessageDialog(null,"Die Niederschlagsmenge für April ist: " + April + " l/qm \nDie Niederschlagsmenge für Mai ist: " + Mai + " l/qm \nDie Niederschlagsmenge für Juni ist: " + Juni + " l/qm \n\nDer Durchschnittliche Niederschlag beträgt: " + Average + " l/qm");
	}

}
