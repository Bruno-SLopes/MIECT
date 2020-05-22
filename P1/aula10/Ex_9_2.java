import java.util.*;
import static java.lang.System.*;
public class Ex_9_2{

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        String aw;

        do{
            out.print("\nEscreva um nome de uma certa organizacao: ");
            aw = sc.nextLine();

            out.print(acronimo(aw));
        }while(!aw.equals(""));
    }

    public static String acronimo(String s){
        String c = "";
        for(int i = 0; i < s.length(); i++){
            if(Character.isUpperCase(s.charAt(i))){
                c = c + s.charAt(i);
            }
            /*if(){

            }*/
        }
        return c;
    }
}