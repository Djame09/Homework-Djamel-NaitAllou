package homework3;

import java.util.Scanner;

public class FactorialRecursion {
	
	static int factorial(int n) {
		if (n<=1)
			return 1;
		else
			return n*factorial(n-1);
	}
	

	public static void main(String[] args) {
		int number,result;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a positive number");
		number=sc.nextInt();
		result=factorial(number);
		System.out.printf("%d!=%d", number,result);
	}

}
