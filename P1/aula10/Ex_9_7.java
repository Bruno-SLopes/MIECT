import java.util.*;
import static java.lang.System.*;
public class Ex_9_7{

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        String s;

        do{
            out.print("\nFrase apenas em minusculas: ");
            s = sc.nextLine();

            out.printf("\n%s", capitalize(s));
        }while(!s.equals(""));
    }

    public static String capitalize(String frase){
        String s1 = "" + Character.toUpperCase(frase.charAt(0));

        for(int i = 1; i < frase.length(); i++){
            if(frase.charAt(i-1)==' '){
                s1 = s1 + Character.toUpperCase(frase.charAt(i));
            }
            else{
                s1 = s1 + frase.charAt(i);
            }
        }
        return s1;
    }
}