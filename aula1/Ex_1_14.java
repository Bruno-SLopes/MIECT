import java.util.*;
import java.lang.*;

public class Ex_1_14 {
	static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) {
		double catA, catB, hipt, ang, ang_ToDegrees;
		
		System.out.print("Comprimento do lado A do triangulo:");
		catA = sc.nextDouble();
		
		System.out.print("\nComprimento do lado B do triangulo:");
		catB = sc.nextDouble();
		
		hipt = Math.sqrt(Math.pow((catA),2)+Math.pow((catB),2));
		
		ang = Math.acos(catA/hipt);
		
		ang_ToDegrees = Math.toDegrees(ang);
		
		System.out.printf("Hipotenusa: %f", hipt);
		System.out.printf("\nAngulo entre adjacente(A) e hipotenusa: %f", ang_ToDegrees);
	}
}

