import java.util.*;

public class Ex_1_11 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		double dolar, euro, conv;
		
		conv = 0.86;
		
		System.out.print("Quantos dólares:");
		dolar = sc.nextDouble();
		
		euro = dolar * conv;
		
		System.out.printf("%4.2f dolares equivalem a %4.2f euros.", dolar, euro);
	}
}

