package ChapterArray;

public class ArrayEvenTest {

	public static void main(String[] args) {

		int[] myArray = {20, 93, 56, 92, 39};
		System.out.println("Even numbers  ");

		for (int i=0; i<myArray.length; i++){
			if(myArray[i]%2 == 0){
				System.out.println(myArray[i]);
			}

		}
	}

}
