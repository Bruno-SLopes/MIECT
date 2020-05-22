import java.util.*;
public class Ex6_5{
    static Scanner sc = new Scanner (System.in);
    public static void main(String []args){
		int n;
		int[] array;
		int num, cont = 0;
		int soma = 0;
		
		System.out.print("Tamanho do array: ");
		n = sc.nextInt();
		
		array = new int[n];
		for(int i = 0; i < array.length; i++){
			System.out.print("\nNumero: ");
			num = sc.nextInt();
			array[i] = num;
			cont++;
			soma += array[i];
		}
		System.out.printf("\nSoma -> %d", soma);
		System.out.printf("\nNumero de numeros -> %d", cont);
		double media = (double)soma / cont;
		System.out.printf("\nMedia -> %6.2f", media);
		
		for(int ar : array){
			if(ar > media){
				System.out.printf("\nNumero -> %d", ar);
			}
		}
    }    
}
