import static java.lang.System.*;
import java.util.Scanner;

public class p16 {
  public static final Scanner in = new Scanner(System.in);

  public static void main(String[] args){
      int secret = (int)(Math.random()*(100+1));
      int choice;
      int cont = 0;
      do{
          out.print("Tentativa: ");
          choice = in.nextInt();

          if(choice > secret){
              out.print("Maior que o secreto!");
              out.println();
              cont++;
          }
          else if(choice < secret){
            out.print("Menor que o secreto!");
            out.println();
            cont++;
          }
          else{
            cont++;
            break;
          }
      }while(choice != secret);

      out.printf("Pontuacao -> %d", cont);
  }
}