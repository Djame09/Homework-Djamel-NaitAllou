package homework2.shuffleGame;

import java.util.Scanner;

public class ShuffleGame {

	public static void main(String[] args) {
		int[] array= {0,1,0};
		char answer;
		int position;
		
		test shuffle= new test();
	System.out.println("--------------------welcome to shuffle game---------------");
	System.out.println("Guess where the 0 is?");
	System.out.println("are you ready to play?");
	do {
	System.out.println("press Y fro yes or N for No");
	Scanner sc= new Scanner(System.in);
	answer= sc.next().charAt(0);
	if (answer=='Y') {
		
		
	shuffle.shuffleGame(array);
	System.out.println("Enter position of zero from 1 to 3");
	position=sc.nextInt();
	if (array[position-1]==0) {
		System.out.println("Good Guess, You won!");
	}
	else {
		System.out.println("SORRY!! WORNG GUESS.");
	}
	}
	System.out.println("Do you want to try again? Y/N");
	answer= sc.next().charAt(0);
	}
	while(answer=='Y');
	System.out.println("Good BYE, SEE YOU NEXT TIME");
	}
		
	
	
}		
		
	


