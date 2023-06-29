package test1;

public class ZweidimensionalesArray {

	public static void main(String[] args) {
		
		int [][] arr1 = {
			{3,6,2},
			{9,1,4},
			{2,8,7}
		};
		
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}
	}

}
