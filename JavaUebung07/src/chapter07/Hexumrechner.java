package chapter07;
import javax.swing.JOptionPane;
public class Hexumrechner {
	public static void main(String[] args) {		
		String eingabe = JOptionPane.showInputDialog("Bitte Hexzahl eingeben");
		int dezi = Integer.parseInt(eingabe,16);
		String bin = Integer.toBinaryString(dezi);
		JOptionPane.showMessageDialog(null,"Hexa: " + eingabe + "\nDezimal: " + dezi + 
										"\nBinär: " + bin);
	}
}
