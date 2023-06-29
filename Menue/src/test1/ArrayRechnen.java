package test1;

public class ArrayRechnen {

	public static void main(String[] args) {

		int arrayEins[]= new int [5];
		arrayEins[0]=22;
		arrayEins[1]=2;
		arrayEins[2]=21;
		arrayEins[3]=18;
		arrayEins[4]=7;
		
		for(int i : arrayEins) {
			
		System.out.print(i + ", ");
		}
		System.out.println("\n\naufgabe 2 \nElement 3 * Element 2 ergibt: " 
							+ (arrayEins[2] * arrayEins[1]));
		
		System.out.println("\n\naufgabe 3 \nElement 1 / Element 4 ergibt: " 
				+ (arrayEins[0] / arrayEins[3]));
		
		System.out.println("\n\naufgabe 4 teiler");
		
		if (arrayEins[2] % arrayEins[4] == 0) {
			System.out.println("5. Element ist Teiler vom 3. Element\n");
		}
		
		System.out.println("aufgabe 5 werte ändern\n");
		arrayEins[1] = arrayEins[1] * arrayEins[2];
		arrayEins[0] = arrayEins[0] / arrayEins[3];
		for(int i : arrayEins) {
			
		System.out.print(i + ", ");
		}
	}

}
