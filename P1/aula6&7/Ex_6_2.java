import java.util.*;
public class Ex_6_2{

    static Scanner sc = new Scanner (System.in);
    public static void main(String []args){
        int[] array = new int[100];
        int find;
        int j = 0;

        System.out.print("Numero para contagem de aparecimentos: ");
        find = sc.nextInt();
        for(int i = 0; i <= array.length; i++){
            int b;
            System.out.printf("Elemento na posicao %d -> ", i);
            b = sc.nextInt();

            if(b < 0){
                break;
            }
            
            if(b == find){
                j++;
            }
            //System.out.printf("O numero %d foi escrito %d vezes.", find, j);
        }
        System.out.printf("O numero %d foi escrito %d vezes.", find, j);
    }
}