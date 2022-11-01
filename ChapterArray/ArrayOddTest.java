package ChapterArray;

public class ArrayOddTest {

	public static void main(String[] args) {

		int[] myArray = {20, 93, 56, 92, 39,23,78,53,91,46};
		System.out.println("ODD NUMBERS ");

		for (int i=0; i<myArray.length; i++){
			if(myArray[i]%2 != 0){
				System.out.println(myArray[i]);
			}
		}


	}

}
