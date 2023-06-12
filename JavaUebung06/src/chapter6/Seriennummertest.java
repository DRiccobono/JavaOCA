package chapter6;

public class Seriennummertest {

	public static void main(String[] args) {
		
		BruchMitSeriennummer bruch1 = new BruchMitSeriennummer(1,2);
		BruchMitSeriennummer bruch2 = new BruchMitSeriennummer(3,4);
		BruchMitSeriennummer bruch3 = new BruchMitSeriennummer(5,6);
		BruchMitSeriennummer bruch4 = new BruchMitSeriennummer(7,8);
		BruchMitSeriennummer bruch5 = new BruchMitSeriennummer(9,10);
		
		System.out.println("Bruch 1, Seriennummer: " + bruch1.getSeriennummer());
		System.out.println("Bruch 2, Seriennummer: " + bruch2.getSeriennummer());
		System.out.println("Bruch 3, Seriennummer: " + bruch3.getSeriennummer());
		System.out.println("Bruch 4, Seriennummer: " + bruch4.getSeriennummer());
		System.out.println("Bruch 5, Seriennummer: " + bruch5.getSeriennummer());
	}

}
