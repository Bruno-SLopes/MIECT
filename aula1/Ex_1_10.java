import java.util.*;

public class Ex_1_10 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		double celsius, fahrenheit;
		
		
		System.out.print("Temperatura:");
		celsius = sc.nextDouble();
		
		fahrenheit = (1.8*celsius) + 32;
		
		//System.out.print(celsius+" graus Celsius equivalem a "+fahrenheit+" Fahrenheit.");
		System.out.printf("\n%4.2f graus Celsius equivalem a %4.2f Fahrenheit.", celsius, fahrenheit);
	}
}

