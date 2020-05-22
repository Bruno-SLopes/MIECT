import java.util.*;
import static java.lang.System.*;
public class Ex_9_5{

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int numero;
        int base;

        do{
            out.print("\nEscolha um numero para ser representado noutras bases: ");
            numero = sc.nextInt();

            out.print("\nEscolha a base: ");
            base = sc.nextInt();

            if(base == 10){
                System.out.print(numToBase(numero, base));
            }

            else{
                System.out.print(invertString(numToBase(numero, base)));
            }
        }while(numero <= 0 || (base >= 2 && base <= 10));
    }
    public static String numToBase(int num, int base){
        String rest = "";
        int resto;
        int equa = num;
        if(base == 10){
            rest = rest + num;
            return rest;
        }
        else{
            do{
                resto = equa % base;
                out.println("resto -> "+resto);
                equa = equa / base;
                out.println("resultado -> "+equa);
                rest = rest + resto;
                out.println("resto string -> "+rest);
            }while(equa != 0);
            return rest;
        }
    }

    public static String invertString(String s){
        String send = "";
        for(int i = s.length()-1; i >= 0; i--){
            send = send + s.charAt(i);
        }
        return send;
    }
}