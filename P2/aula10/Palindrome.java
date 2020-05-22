import static java.lang.System.*;
import java.util.Scanner;
import p2utils.*;

public class Palindrome{
    public static void main(String[] args){
        if (args.length < 1) {
            err.println("Uso: java Palindrome args[0] args[1] ...");
            exit(1);
        }
        Stack<Character> pilha = new Stack<Character>();
        Queue<Character> fila = new Queue<Character>();
        String str = "";
        for(int i = 0; i < args.length; i++){
            for(int j = 0; j < args[i].length(); j++){
                str += Character.toLowerCase(args[i].charAt(j));
            }
        }
        for(int j = 0; j < str.length(); j++){
            if(str.charAt(j) != ' '){
                pilha.push(str.charAt(j));
                fila.in(str.charAt(j));
            }
        }
        boolean answer = true;
        do{
            if(pilha.top().compareTo(fila.peek()) != 0){
                answer = false;
            }
            pilha.pop();
            fila.out();
        }while(!pilha.isEmpty());

        if(answer == true){
            out.printf("'%s' is a palindrome", str);
        }
        else{
            out.printf("'%s' is not a palindrome", str);
        }
    }
}