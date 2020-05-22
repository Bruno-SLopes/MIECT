import java.util.*;
public class Ex_6_3{

    static Scanner sc = new Scanner (System.in);
    public static void main(String []args){
        int esc;
        int[] a = new int[50];

        do{
            System.out.print("\nAnalise de uma sequencia de numeros inteiros");
            System.out.print("\n1 - Ler a sequencia");
            System.out.print("\n2 - Escrever a sequencia");
            System.out.print("\n3 - Calcular o maximo da sequencia");
            System.out.print("\n4 - Calcular o minimo da sequencia");
            System.out.print("\n5 - Calcular a media da sequencia");
            System.out.print("\n6 - Detetar se e uma sequencia so constituida por numeros pares");
            System.out.print("\n10 - Terminar o programa");
            System.out.print("\nOpcao -> ");
            esc = sc.nextInt();

            if(esc == 1){
                lerSeq(a);
            }
            else if(esc == 2){
                escSeq(a);
            }
            else if(esc == 3){
               System.out.printf("\nMaximo -> %d",  maxSeq(a));
               System.out.print("\n");
            }
            else if(esc == 4){
                System.out.printf("\nMinimo -> %d",  minSeq(a));
                System.out.print("\n");
             }
             else if(esc == 5){
                 System.out.printf("\nMedia -> %8.2f", mediaSeq(a));
                 System.out.print("\n");
             }
             else if(esc == 6){
                 System.out.print(parSeq(a));
                 System.out.print("\n");
             }
             else if(esc == 10){
                break;
             }
        }while(esc != 1 || esc != 2 || esc != 3 || esc != 4 || esc != 5 || esc != 6 || esc != 10);


    }

    public static int[] lerSeq(int[] z){
        int x;
        //System.out.print("Escreva um número: ");
        for(int i = 0; i < z.length; i++){
            System.out.printf("\nEscreva um %dº numero: ", i+1);
            x = sc.nextInt();
            if(x == 0){
                break;
            }
            z[i] = x;
        }
        return z;
    }

    public static void escSeq(int[] z){
        for(int i = 0; i < z.length; i++){
            if(z[i] == 0){
                break;
            }
            System.out.printf("\n%dº elemento: %d", i+1, z[i]);
        }
        System.out.print("\n");
    }

    public static int maxSeq(int[] z){
        int max = 0;
        for(int i = 0; i < z.length; i++){
            if(z[i] > max){
                max = z[i];
            }
        }
        return max;
    }

    public static int minSeq(int[] z){
        int min = 1000000000;
        for(int i = 0; i < z.length; i++){
            if(z[i] < min && z[i] != 0){
                min = z[i];
            }
        }
        return min;
    }

    public static double mediaSeq(int[] z){
        int count = 0;
        int soma = 0;
        for(int i = 0; i < z.length; i++){
            if(z[i] == 0){
                break;
            }
            soma += z[i];
            count++;
        }
        return (double)soma/count;
    }

    public static boolean parSeq(int[] z){
        boolean par = true;
        for(int i = 0; i < z.length; i++){
            if(z[i] % 2 != 0){
                par = false;
            }
        }
        return par;
    }
}