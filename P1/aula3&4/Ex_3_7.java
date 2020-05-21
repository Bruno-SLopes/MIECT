import java.util.*;

public class Ex_3_7 {
	static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) {
		int x, y, soma = 0;

		System.out.print("Escolha um numero: ");
		x = sc.nextInt();
		System.out.print("Escolha outro numero: ");
		y = sc.nextInt();
		System.out.print("----------------------");
		System.out.print("\nVao ser multiplicados");
		do{
				
	
			if(x % 2 != 0){
			
				soma += y;
			}
			
				
			y = y * 2;
			x = x/2;
			
		}while(x >= 1);
		System.out.print("\n----------------------");
		System.out.printf("\nO resultado vai ser %d.", soma);
	}
}

