package homework3;

import java.util.Scanner;

public class FactorialIteration {
	
     static int factorial(int number) {
	 int fact=1;
	 for (int i=1; i<=number; i++) {
		 fact=fact*i;
		 
	 }
	 return fact;
 }
	public static void main(String[] args) {
		int number1,result;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a positive number");
		number1=sc.nextInt();
		result=factorial(number1);
		System.out.printf("%d!=%d", number1,result);
	}

}
