import java.util.*;

public class Ex_2_2 {
	static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) {
		
		double n1, n2;
		
		System.out.print("Introduza o primeiro numero real: ");
		n1 = sc.nextDouble();
		
		System.out.print("Introduza o segundo numero real: ");
		n2 = sc.nextDouble();
		
		if (n1 > n2){
			System.out.printf("O maior é %6.2f", n1);
		}
		
		else if (n2 > n1){
			System.out.printf("O maior é %6.2f", n2);
		}
		
		else{
			System.out.print("Os dois são iguais");
		}
	}
}

