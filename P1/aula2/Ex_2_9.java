import java.util.*;

public class Ex_2_9 {
	static Scanner sc = new Scanner (System.in);
	public static void main (String[] args) {
		
		double tc, tf;
		int choice;
		
		System.out.print("Temperatura(0-Celsius    1-Fahrenheit): ");
		choice = sc.nextInt();
		
		if(choice == 0){
			System.out.print("Celsius: ");
			tc = sc.nextInt();
			tf = (1.8*tc) + 32;
			System.out.printf("%6.2f ºCelsius é equivalente a %6.2f ºFahrenheit", tc, tf);
		}
		
		else{
			System.out.print("Fahrenheit: ");
			tf = sc.nextInt();
			tc = (tf - 32)/1.8;
			System.out.printf("%6.2f ºFahrenheit é equivalente a %6.2f ºCelsius", tf, tc);
		}
		
	}
}

