import java.util.*;

public class Ex_4_9{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int n, soma = 0, sum = 0;

        System.out.print("Introduza N :");
        n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            soma += 2;
            if((2*i) % 2 == 0){
                sum += (2*i);
            }
            System.out.printf("%d\n", soma);
        }
        System.out.printf("A soma destes numeros sera %d", sum);
        System.out.printf("\nEstes são os %d primeiros numeros pares positivos.", n);
    }
}