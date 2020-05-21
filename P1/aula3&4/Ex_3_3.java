import java.util.*;

public class Ex_3_3 {
	static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) {
		
		double n1r, nr, media;
		
		System.out.print("Introduza um numero (Atencao, termina escrita quando inserir numero igual a este): ");
		n1r = sc.nextDouble();
		
		int cont = 1;
		double maxVal = n1r, minVal = n1r, soma = n1r;
		
		do{
			System.out.print("Introduza outro numero: ");
			nr = sc.nextDouble();
			
			if(nr != n1r){
				
				soma += nr;
				cont++;
				if(nr > maxVal){
					maxVal = nr;
				}
				
				else if(nr < minVal){
					minVal = nr;
				}
				
			}
			
		}while(nr != n1r);
		media = soma/cont;
		
		System.out.printf("Valor maximo = %6.2f", maxVal);
		System.out.printf("\nValor minimo = %6.2f", minVal);
		System.out.printf("\nMedia = %6.2f", media);
		System.out.printf("\nNumero de elementos da lista = %d", cont);
	}
}

