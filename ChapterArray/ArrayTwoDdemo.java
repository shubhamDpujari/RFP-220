package ChapterArray;

public class ArrayTwoDdemo {

	public static void main(String[] args) {

		int[][] myarray = {{4,6,7},{8,9,6},{0,5,4}};

		for(int row =0; row<myarray.length; row++) {
			for(int col = 0; col<myarray.length; col++) {
				System.out.println(myarray[row][col]+"");

				System.out.println();
			}
		}


	}

}
