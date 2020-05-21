import java.util.*;

public class Ex_3_1 {
	static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) {
		
		int n, cont = 0;
		
		do{
			
			System.out.print("Introduza um numero: ");
			n = sc.nextInt();
			
			if(n >= 0){
				cont++;
			}
			
		}while(n >= 0);
		
		System.out.printf("O utilizador introduziu %d numeros.", cont);
	}
}
