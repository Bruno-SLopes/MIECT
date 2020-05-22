import java.util.*;
import static java.lang.System.*;
public class Ex_9_9{

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        String s;

        do{
            out.print("\nEscreva: ");
            s = sc.nextLine();

            if(readChar(s) == false){
                out.print("\nA linha nao tem apenas um carater.");
            }
            else{
                out.print("\nA linha tem apenas um carater.");
            }
        }while(!s.equals("") && readChar(s) == false);
    }

    public static boolean readChar(String frase){
        boolean is;

        if(frase.length() == 1){
            is = true;
        }
        else{
            is = false;
        }
        return is;
    }
}