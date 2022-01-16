package tempconverter;
import java.util.Scanner;
public class TempConverter {

	public static void main(String[] args) {
		int Z;

		System.out.println("*******Welcome to your converter*******");
		System.out.println("Celcius-fahrenheit/Fahrenheit-celcius");
		do {
		System.out.println("choose the conversion mode:");
		System.out.println("1-celcius to fahrenheit");
		System.out.println("2-fahrenheit to celcius");
		int a ;
		double b;
		Scanner sc = new Scanner(System.in);
		 a= sc.nextInt();
		 if (a == 1) {
		System.out.println("Enter temperature to convert");
		b= sc.nextDouble();
		double F = (b*9/5)+32;
		System.out.println(F);
		 }
		 if (a == 2){
		System.out.println("Enter temperature to convert");
		b= sc.nextDouble();
		double C=(b-32)*5/9;
		System.out.println(C);
		 }
		 System.out.println("do you want to convert other temperatures ?");
		 System.out.println("1 for YES or 2 for NO");
		  Z= sc.nextInt();
		
		 }
		
		 while (Z==1);
		 System.out.println("****GOOD BYE, SEE YOU SOON****");
	}
}
