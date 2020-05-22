import java.util.*;
import static java.lang.System.*;
public class Ex_9_8{

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        String numero;
        int base;

        do{
            out.print("\nEscolha um numero de uma base: ");
            numero = sc.next();

            out.print("\nEscolha a sua base: ");
            base = sc.nextInt();

            System.out.print(baseToNum(numero, base));
        }while(Integer.parseInt(numero) <= 0 || (base >= 2 && base <= 10));
    }

    public static int baseToNum(String n, int b){
        int num = 0;
        int j = n.length()-1;
        for(int i = 0; i < n.length(); i++){
            num = num + (int)(Integer.parseInt(Character.toString(n.charAt(i))) * Math.pow(b, j));
            j--;
        }
        return num;
    }
}