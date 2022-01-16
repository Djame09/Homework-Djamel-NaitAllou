package homework2.abstraction;

public class Apartment extends Mansion implements Airbnb, Hotel {

	
	public void kitchen() {
		System.out.println("fully furnished kitchen");
		
	}

	public void livingRoom() {
		System.out.println("good size with beautiful view");
		
	}
	
	public void swimingPool() {
		System.out.println("Weird shaped swiming pool");
		
	}

	
	public void room() {
		System.out.println("3 friend rooms available");
	}

	public void bar() {
		System.out.println("Mini bar for all convenience");
		
	}
	
	

}
