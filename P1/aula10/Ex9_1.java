import java.util.*;
import static java.lang.System.*;

public class Ex_9_1{

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int big=0, small=0, num=0, vowel=0;
        String sent;

        out.print("Escreva uma frase com o que quiser: ");
        sent = sc.nextLine();

        for(int i = 0; i < sent.length(); i++){
            if(Character.isUpperCase(sent.charAt(i))){
                big++;
            }
            if(Character.isLowerCase(sent.charAt(i))){
                small++;
            }
            if(Character.isDigit(sent.charAt(i))){
                num++;
            }
            if(isVowel(sent.charAt(i))==true){
                vowel++;
            }
        }
        out.print("\nAnalise da frase");
        out.printf("\nFrase de entrada -> %s", sent);
        out.printf("\nNumero de caracteres minusculos -> %d", small);
        out.printf("\nNumero de caracteres maiusculos -> %d", big);
        out.printf("\nNumero de caracteres numericos -> %d", num);
        out.printf("\nNumero de vogais -> %d", vowel);
        out.printf("\nNumero de consoantes -> %d", small+big-vowel);
    }

    public static boolean isVowel(char c1){
        char c = Character.toLowerCase(c1);

        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
            return true;
        }
        else{
            return false;
        }
    }
}
