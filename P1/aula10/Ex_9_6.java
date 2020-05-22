import java.util.*;
import static java.lang.System.*;
public class Ex_9_6{

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        String dial;

        do{
            out.print("\nEscreva uma frase: ");
            dial = sc.nextLine();

            System.out.printf("%s\n", dialeto(dial));
        }while(!dial.equals(""));
    }

    public static String dialeto(String d){
        String inv = "";
        for (int i = 0; i < d.length(); i++) {
            if (d.charAt(i)=='l') {
                inv += "u";
            }
            else if (d.charAt(i)=='r') {
                inv += "";
            }
            else if (d.charAt(i)=='L') {
                inv += "U";
            }
            else if (d.charAt(i)=='R') {
                inv += "";
            }
            else {
                inv += d.charAt(i);
            }
            
        }
        return inv;
    }
}