import java.util.*;

public class Ex_3_8 {
	static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) {
            int nota, soma = 0, cont = 0;
            double media;

            do{
                System.out.print("Nota? ");
                nota = sc.nextInt();

                if(nota >= 0){
                    soma += nota;
                    cont++;
                }
            }while(nota >= 0);
            media = (double)soma/cont;

            System.out.printf("Soma = %d", soma);
            System.out.printf("\nMédia = %6.2f", media);
    }
}