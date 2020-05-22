import static java.lang.System.*;
import java.util.Scanner;

public class p14 {
  public static final Scanner in = new Scanner(System.in);

  public static void main(String[] args){
      out.print("Escreva uma frase -> ");
      String phrase = in.nextLine();
      String dial = "";
      for(int i = 0; i < phrase.length(); i++){
          if(phrase.toLowerCase().charAt(i) == 'r'){
              dial += "";
          }
          else if(phrase.charAt(i) == 'l'){
              dial += "u";
          }
          else if(phrase.charAt(i) == 'L'){
              dial += "U";
          }
          else{
              dial += phrase.charAt(i);
          }
      }
      out.printf("\n%s", dial);
  }
}
