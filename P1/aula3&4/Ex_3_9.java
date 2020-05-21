import java.util.*;

public class Ex_3_9{
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args){
        int n, cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0;

        do {
            System.out.print("Insira o seu numero: ");
            n = sc.nextInt();

            if(n > 0){
                cont1++;
                if(n >= 100 && n <= 1000){
                    cont3++;
                }
            }
            else if(n < 0){
                cont2++;
                if(n >= -1000 && n <= -100){
                    cont4++;
                }
            }
        }while(n != 0);
        System.out.printf("Quantidade de numeros positivos: %d", cont1);
        System.out.printf("\nQuantidade de numeros negativos: %d", cont2);
        System.out.printf("\nQuantidade de numeros entre [100...1000]: %d", cont3);
        System.out.printf("\nQuantidade de numeros entre [-1000...-100]: %d", cont4);
    }
}