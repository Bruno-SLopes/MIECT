import java.util.*;
import static java.lang.System.*;
public class Ex_9_3{

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        String aw;
        int count = 0;
        out.print("Escreva uma frase: ");
        aw = sc.nextLine();

        for(int i = 0; i < aw.length(); i++){
            char[] t = new char[aw.length()];
            t[i] = aw.charAt(i);
            if(t[i] == ' '){
                count++;
            }
            else if(t[i] == '\n'){
                count++;
            }
            else if(t[i] == '\t'){
                count++;
            }
        }
        out.printf("\n%s", aw);
        out.printf("\nNumero de palavras na frase -> %d", count);
    }
}