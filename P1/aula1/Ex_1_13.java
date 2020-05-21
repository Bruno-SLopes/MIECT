import java.util.*;
import java.lang.*;

public class Ex_1_13 {
	static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) {
		
		double x1, x2, y1, y2, d, dkm;
		
		System.out.print("Localidade 1(Coordenadas X e Y):");
		x1 = sc.nextDouble();
		y1 = sc.nextDouble();
		
		System.out.print("Localidade 2(Coordenadas X e Y):");
		x2 = sc.nextDouble();
		y2 = sc.nextDouble();
		
		d = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
		
		dkm = d * 100;
		
		System.out.printf("A distância em cm entre o local 1 e o local 2 é de %f.", d);
		
		System.out.printf("\nA distância em km entre o local 1 e o local 2 é de %f.", dkm);
	}
}

