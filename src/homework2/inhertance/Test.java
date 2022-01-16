package homework2.inhertance;

public class Test {

	public static void main(String[] args) {
	
		//Single Inheritance
		
		Jaguar Whisky = new Jaguar();
		Whisky.eat();
		
		Cat Ouistiti = new Cat();
		Ouistiti.eat();
		Ouistiti.sleep();
		
		//MultiLevel Inheritance
		
		FelineFamily Fel = new FelineFamily();
		Fel.mammal();
		Fel.hunt();
		
		Whisky.mammal();
		Whisky.hunt();
		Whisky.eat();
		
		Ouistiti.mammal();
		Ouistiti.hunt();
		Ouistiti.eat();
		Ouistiti.sleep();
		
		// hierarchical Inheritance
		
		Animals FelCan = new Animals();
		FelCan.Communicate();
		
		CanineFamily Can = new CanineFamily();
		Can.Communicate();
		Can.Teeth();
		
		
		Fel.mammal();
		Fel.hunt();
		
		Whisky.mammal();
		Whisky.hunt();
		Whisky.eat();
		
		Ouistiti.mammal();
		Ouistiti.hunt();
		Ouistiti.eat();
		Ouistiti.sleep();
		
	}

}
