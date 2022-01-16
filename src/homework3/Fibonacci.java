package homework3;

import java.util.Scanner;

public class Fibonacci {
	
	public static int fibonacci(int i) {
		if (i==0) return 0;
			if(i<=2)
			return 1;
		else return fibonacci(i-1)+fibonacci(i-2);
		
	}
	

	public static void main(String[] args) {
		int number;
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the fibonacci number you want to print");
		number=sc.nextInt();
		for(int j=0;j<number;j++) {
			
		System.out.println(fibonacci(j));
		}
	
		}
	}



