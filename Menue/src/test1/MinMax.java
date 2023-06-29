package test1;
import javax.swing.JOptionPane;
public class MinMax {

	public static void main(String[] args) {
		int[] arr1 = new int[] {5,2,10,12,3};
		
		int temp;
		String zahlen = "";
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1.length-1; j++) {
				
				if (arr1[j] > arr1[j + 1]) {
					
					temp = arr1[j];
					arr1[j] = arr1[j+1];
					arr1[j+1] = temp;
				}
			}
		}
		for (int i = 0; i < arr1.length; i++) {
			
			zahlen += arr1[i] + ", ";
		}
		JOptionPane.showMessageDialog(null,"Der Such-Array beträgt: " + zahlen + "\n\nDer Max-Wert" + 
											"beträgt " + arr1[4] + "\n"
											+ "Der Min-Wert beträgt " + arr1[0]);

	}

}
