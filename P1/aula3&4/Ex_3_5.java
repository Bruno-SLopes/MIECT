import java.util.*;

public class Ex_3_5 {
	static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) {
		int n, r, c = 2; //nº natural, resto, begin
		
		do{
			System.out.print("Verificacao de numeros primos");
			System.out.print("\n-----------------------------");
			System.out.print("\nEscolha o seu número: ");
			n = sc.nextInt();
			
			if(n == 2){
				System.out.print("\nNumero primo");
			}

			else if(n > 0 && n != 2){
				do{
					r=n%c;
					c++;
				}while(r!=0&&c<n);
				if(c==n){
					System.out.println("Numero Primo");
				}else{
					System.out.println("Numero nao primo");
				}
			}
			else{
				System.out.print("\nNumero invalido");
			}
		}while(n <= 0);
	}
}

