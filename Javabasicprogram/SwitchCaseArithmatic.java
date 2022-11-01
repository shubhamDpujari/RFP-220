package Javabasicprogram;

import java.util.Scanner;

public class SwitchCaseArithmatic {

	public static void main(String[] args) {
		{
			int n1 , n2 , n3 , ch;
			Scanner input = new Scanner(System.in);
			System.out.println("enter first number");
			n1 = input.nextInt();
			System.out.println("enter secoend number");
			n2 = input.nextInt();
			System.out.println("choice");
			System.out.println("1. Addition");
			System.out.println("2. substraction");
			System.out.println("3. multiplication");
			System.out.println("4. division");
			System.out.println("enter the choice");
			ch = input.nextInt();
			switch(ch)
			{
			case 1 :
				n3 = n1 + n2;
				System.out.println("Addition ="+ n3);
				break;
			case 2 :
				n3 = n1 - n2;
				System.out.println("substraction = " + n3);
				break;
			case 3 :
				n3 = n1 * n2;
				System.out.println("multiplication = " + n3);
				break;
			case 4 :
				n3 = n1 / n2;
				System.out.println("division = " + n3);
				break;
			default:
				System.out.println("you will be enter wrong choice");
			}

		}




	}

}
