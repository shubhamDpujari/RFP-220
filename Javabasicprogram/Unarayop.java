package Javabasicprogram;

public class Unarayop {

	public static void main(String[] args) {
		//++ .--
		
		int num1 = 5;
		int num2 = 6;
		
		++num1; //(pre increment) first increase the value by 1 and after assign the value
		System.out.println(num1);
		
		int num3 = num1++; // (post increment) first assign the value and after it incremented by 1
		System.out.println("num3:  "+num3);
		System.out.println(num1);
		
		
		--num2;//(predecrement)
		System.out.println("num2:  "+num2);

	}

}
