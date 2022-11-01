package Javabasicprogram;

public class FactorialNumber {

	public static void main(String[] args) {

		int num = 4;
		int factorial = 1;

		for(int i=num; i>0; i--)
		{
			factorial = factorial *i;

		}
		System.out.println("factorial is: "+factorial);


	}

}
