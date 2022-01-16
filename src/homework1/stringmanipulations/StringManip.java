package stringmanipulations;

public class StringManip {

	public static void main(String[] args) {
	    String ID="30426NY";
		String ben="Rachid Alane";
		String name = "Djamel Nait Allou";	
		System.out.println(name+" "+ID);
		System.out.println(name.startsWith("D"));
	    System.out.println(name.replaceAll(name,ben));
	    System.out.println(name.charAt(1));
	    System.out.println(name.contains("N"));
	    System.out.println(name.replaceFirst("Nait", "Ait"));
        System.out.println(name.toUpperCase());	
	    System.out.println(name.length());
	    System.out.println(name.lastIndexOf("A"));
	    System.out.println(name.toLowerCase());
	    System.out.println(name.replaceFirst("Djamel", "Rachid"));
	    System.out.println(name.replace('3','5'));
	}

}