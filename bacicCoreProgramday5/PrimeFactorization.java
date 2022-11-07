package bacicCoreProgramday5;

import java.util.Scanner;

public class PrimeFactorization {

	public static void main(String[] args) {
		
		int num;
		Scanner input = new Scanner(System.in);
		System.out.println("enter a number");
		num = input.nextInt();
		
		for (int i = 2; i <= num; i++) {
			while (num % i ==0) {
				num = num / i;
				System.out.println("the prime factors are: "+i);
			}
		}
		
	}

}
