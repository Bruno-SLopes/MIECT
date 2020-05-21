import java.util.*;

public class Ex_3_4 {
	static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) {
		
		int n, cont = 0;
		int secret = (int)(100.0*Math.random()) + 1;
		System.out.print("Vamos jogar ao jogo do AltoBaixo");
		System.out.print("\n--------------------------------");
		System.out.print("\nTente adivinhar o numero escolhido pela CPU");
		do{
			System.out.print("\nIntroduza a sua tentativa: ");
			n = sc.nextInt();
			
			if(n != secret){
				
				if(n > secret){
					System.out.print("Secreto inferior ao seu.");
				}
				else if(n < secret){
					System.out.print("Secreto superior ao seu.");
				}
			}
			cont++;
		}while(n != secret);
		
		System.out.printf("Acertou no número em %d tentativas.", cont);
	}
}

