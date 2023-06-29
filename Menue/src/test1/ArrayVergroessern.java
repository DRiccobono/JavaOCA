package test1;
import javax.swing.JOptionPane;
public class ArrayVergroessern {

	public static void main(String[] args) {
		String[] arr = {"Hans","Christian","Lisa"};
		final int USR_AMOUT = Integer.parseInt(JOptionPane.showInputDialog("Please enter the amout "
												+ "by which the array should be increasd:"));
		String[] tmpArr = new String[arr.length + USR_AMOUT];
		String ausgabe = "";
		
		for (int i = 0; i < tmpArr.length; i++) {
			
			if (i <= 2) {
				
			tmpArr[i] = arr[i];
			}
						
		}
		
		int komma = 0;
		for (int i = 0; i < tmpArr.length; i++) {
		ausgabe += tmpArr[i];
		
			if (komma < tmpArr.length -1) {
				ausgabe += ", ";
				komma++;
			}
		}
		JOptionPane.showMessageDialog(null, "New Array: " + ausgabe);
	}

}
