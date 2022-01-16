package homework2.encapsulation;

public class testPlane {

	public static void main(String[] args) {

		Plane boing = new Plane();
		boing.setSpeed(980.9);
		
		
		//System.out.print(boing.getSpeed());
		
		boing.setSeat("AnimalTransportation");
		
		System.out.println(boing.getSeat());
	}
	

}
