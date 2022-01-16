package homework2.shuffleGame;

import java.util.Random;


public class test {

	
		
		public int[] shuffleGame(int[] ar) {//{0, 1, 1}

		Random rnd = new Random();

		for (int i = ar.length - 1; i > 0; i--) {

		int index = rnd.nextInt(i + 1);

		int a = ar[index];

		ar[index] = ar[i];

		ar[i] = a;

		}

		return ar;
	
		}
}
