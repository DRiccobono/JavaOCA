package test1;
import java.util.Arrays;
public class ArrayTesting {

	public static void main(String[] args) {
		
		int[] arr1 = new int[5]; 
		arr1[0] = 4;
		arr1[1] = 5;
		arr1[2] = 1;
		arr1[3] = 2;
		arr1[4] = 8;
		
		System.out.println("aufgabe 2 array ausgeben\n" + arr1[2] + "," + arr1[4]);
		System.out.println("\naufgabe 3 elemente überschreiben \n" + arr1[3] + " alt");
		
		arr1[3] = 4;
		
		System.out.println(arr1[3] + " neu");
		
		int[] arr2 = new int[] {9,7,6,0,4};
		
		System.out.println("\naufgabe 5 array literal ausgabe");
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + ", ");
		}
		System.out.println("\n\naufgabe 6 array 2 überschrieben");
		for (int j = 0; j < arr2.length; j++) {
			arr2[j] = 0;
			System.out.print(arr2[j] + ", ");
		}
		System.out.println("\n\naufgabe 7 array fill methode");
		int[] arr3 = new int[5];
		
		Arrays.fill(arr3, 4);
		for (int k = 0; k < arr3.length; k++) {
			
		System.out.print(arr3[k] + ", ");
		}
		
		System.out.println("\n\naufgabe 8 array sort methode");
		int[] arr4 = new int[] {4,1,7,3,2};
		
		Arrays.sort(arr4);
		for (int l = 0; l < arr4.length; l++) {
			System.out.print(arr4[l] + ", ");
		}
		
		System.out.println("\n\naufgabe 9 String array binary search" );
		
		String[] arr5 = new String[] {"hallo", "wie", "gehts", "dir"};
		Arrays.sort(arr5);
		int found = Arrays.binarySearch(arr5, "hallo");
		System.out.println("element 'hallo' an stelle " + found + " gefunden");
		
		
		System.out.println("\n\naufgabe 10 equals");
		String[] arr6 = new String[] {"hallo", "wie", "gehts", "dir"};
		System.out.println("\nvor der sortierung");
		System.out.println(Arrays.equals(arr5, arr6));
		System.out.println("\nnach der sortierung");
		Arrays.sort(arr6);
		System.out.println(Arrays.equals(arr5, arr6));
		
		System.out.println("\n\naufgabe 11 for each");
		for (int i : arr1) {
			System.out.print(i + ", ");
		}
		
		System.out.println();
		
		for (String i : arr5) {
			System.out.print(i + ", ");
		}
	}
}
