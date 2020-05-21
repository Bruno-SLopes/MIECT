import java.util.*;

public class Ex_4_10{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int n, soma = 0;

        System.out.print("Introduza um numero natural: ");
        n = sc.nextInt();
        System.out.print("Loading |><|");

        for(int i = 1; i < n; i++){
            if(n % i == 0){
                soma += i;
            }
        }
        if(soma == n){
            System.out.printf("\nO seu numero (%d) e perfeito.", n);
        }
        else{
            System.out.printf("\nO seu numero (%d) nao e perfeito.", n);
        }
    }
}