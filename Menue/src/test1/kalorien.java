package test1;

public class kalorien {

	public static void main(String[] args) {
		
		int [][] kal = new int[][] {
			{1000,2000,3000},
			{4000},
			{5000,6000},
			{7000,8000,9000},
			{10000}
		};
		int kalZaehler = 0;
		int kalRechner = 0;
		int forscher = 1;
		
		for (int i = 0; i < kal.length; i++) {
			for (int j = 0; j < kal[i].length; j++) {
				kalRechner += kal[i][j];
				if (kalRechner > kalZaehler) {
					kalZaehler = kalRechner;
				}
				System.out.print(kal[i][j] + " ");
			}
			System.out.println("\nforscher " + forscher + " hat " + kalRechner + " Kalorien");
			forscher++;
			kalRechner = 0;
			System.out.println();
		}
		System.out.println("\nhöchste kalorienanzahl: " + kalZaehler);
	}

}