package chapter07;
import java.util.Arrays;
import javax.swing.JOptionPane;
public class Stringsort {

	public static void main(String[] args) {
		String text1 = JOptionPane.showInputDialog("Eingabe 1:");
		String text2 = JOptionPane.showInputDialog("Eingabe 2:");
		String text3 = JOptionPane.showInputDialog("Eingabe 3:");
		
		String[] arr1 = {text1, text2, text3};
		for (int i = 0; i < arr1.length; i++) {
			Arrays.sort(arr1);
		}
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
	}
}
