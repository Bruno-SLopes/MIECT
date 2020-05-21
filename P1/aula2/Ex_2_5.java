import java.util.*;

public class Ex_2_5 {
	static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) {
		
		double x1, x2, x3, x4, y1, y2, y3, y4, l1, l2, l3, l4, d1, d2;
		
		System.out.print("Introduza a coordenada x do ponto 1: ");
		x1 = sc.nextDouble();
		
		System.out.print("Introduza a coordenada y do ponto 1: ");
		y1 = sc.nextDouble();
		
		System.out.print("Introduza a coordenada x do ponto 2: ");
		x2 = sc.nextDouble();
		
		System.out.print("Introduza a coordenada y do ponto 2: ");
		y2 = sc.nextDouble();
		
		System.out.print("Introduza a coordenada x do ponto 3: ");
		x3 = sc.nextDouble();
		
		System.out.print("Introduza a coordenada y do ponto 3: ");
		y3 = sc.nextDouble();
		
		System.out.print("Introduza a coordenada x do ponto 4: ");
		x4 = sc.nextDouble();
		
		System.out.print("Introduza a coordenada y do ponto 4: ");
		y4 = sc.nextDouble();
		
		l1 = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
		
		l2 = Math.sqrt(Math.pow(x3-x2,2)+Math.pow(y3-y2,2));
		
		l3 = Math.sqrt(Math.pow(x4-x3,2)+Math.pow(y4-y3,2));
		
		l4 = Math.sqrt(Math.pow(x1-x4,2)+Math.pow(y1-y4,2));
		
		d1 = Math.sqrt(Math.pow(x4-x2,2)+Math.pow(y4-y2,2));
		
		d2 = Math.sqrt(Math.pow(x3-x1,2)+Math.pow(y3-y1,2));
		
		if(l1 == l2 && l2 == l3 && l3 == l4 && l4 == l1){
			
			if(d1 == d2){
				System.out.print("E um quadrado.");
			}
			
			else{
				System.out.print("Nao e um quadrado.");
			}
			
		}
		
		else{
			System.out.print("Nao e um quadrado.");
		}
	}
}

