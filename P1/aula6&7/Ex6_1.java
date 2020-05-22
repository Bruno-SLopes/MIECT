import java.util.*;
public class Ex_6_1{

    static Scanner sc = new Scanner (System.in);
    public static void main(String []args){
        int[] n;
        System.out.println("Quantos elementos vai ter a lista?");
        int a = sc.nextInt();

        n = new int[a];

        for(int i = 0; i < n.length; i++){
            System.out.printf("Elemento na posicao %d vai ser: ", i);
            int elem = sc.nextInt();
            n[i] = elem;
        }
        //System.out.print(elem);
        System.out.println("\nElementos por ordem normal:");
        for(int z : n){
            System.out.println(z);
            //System.out.print(invert(z));
        }
        System.out.println("\n----------------------------");
        System.out.println("\nElementos por ordem inversa:");
        invert(n);
    }

    public static void invert(int[] x){
        for(int j = x.length-1; j >= 0; j--){
            System.out.println(x[j]);
        }
    }
}
