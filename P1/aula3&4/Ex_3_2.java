import java.util.*;

public class Ex_3_2 {
	static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) {
		
		double nr, prod = 1;
		
		do{
			System.out.print("Introduza um numero real ou inteiro (termina a escrita com 0): ");
			nr = sc.nextDouble();
			
			if(nr != 0){
				prod *= nr;
			}
		}while(nr != 0);
		
		System.out.printf("Produto dos seus numeros = %8.2f", prod);
	}
}

