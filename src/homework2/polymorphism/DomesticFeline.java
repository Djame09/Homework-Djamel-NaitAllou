package homework2.polymorphism;

public class DomesticFeline extends Feline {

	//Overriding
	
	@Override
	public void classification (char animal, char Mammal) {
		String def = "Friendly";
		System.out.println(def);
	}
}
