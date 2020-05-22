import java.util.*;
import static java.lang.System.*;

public class Ex_10_2{

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int[] chave = new int[6];
        int elem, i = 0;

        do{
            out.printf("Elemento %d da chave: ", i+1);
            elem = sc.nextInt();
            if(elem >= 1 && elem <= 49){
                chave[i] = elem;
                i++;
            }
        }while(elem > 0 && i < 6);
        lerChave(chave);
        mostrarChave(chave, pertenceChave(chave));
    }

    public static void lerChave(int[] c){
        int j = 1;
        for(int z : c){
            out.printf("\nElemento %d da chave: %d", j, z);
            j++;
        }
    }

    public static String pertenceChave(int[] c){
        int[] todas = new int[49];
        String already = "";
        String tmp1 = "";
        String tmp2 = "";

        for(int i = 0; i < todas.length; i++){
            todas[i] = i+1;
        }

        for(int j = 0 ; j < c.length; j++){
            for(int k = 0; k < todas.length; k++){
                if(c[j] == todas[k]){
                    already += "X";
                }
                else{
                    already += todas[k];
                }
                tmp1 += already;
            }
            tmp2 += tmp1;
        }
        already += tmp2;
        return already;
    }

    public static void mostrarChave(int[] c, String s){
        
    }
}