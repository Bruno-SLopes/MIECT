import java.util.*;

public class Ex_3_11{
    static Scanner sc = new Scanner(System.in);
    public static void main (String[] args){
        int n, cont1 = 0, cont2 = 0;

        do{
            System.out.print("Numero inteiro positivo: ");
            n = sc.nextInt();

            if((n % 2 == 0) && (n != 0 && n > 0)){
                cont1++;
            }
            else if((n % 2 != 0) && (n != 0 && n > 0)){
                cont2++;
            }
        }while(n != 0 && n > 0);

        if(cont1 > 0 && cont2 == 0){
            System.out.print("A sequencia de numeros e exclusivamente constituida por numeros pares");
        }
        else if(cont2 > 0 && cont1 == 0){
            System.out.print("A sequencia de numeros e exclusivamente constituida por numeros impares");
        }
        else{
            System.out.print("A sequencia de numeros e constituida por numeros impares e pares");
        }
    }
}
