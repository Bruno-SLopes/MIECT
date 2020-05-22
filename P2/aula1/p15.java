import static java.lang.System.*;
import java.util.Scanner;

public class p15 {
  public static final Scanner in = new Scanner(System.in);

  public static void main(String[] args){
      int N;
      out.print("Tamanho do array: ");
      N = in.nextInt();
      int[] array = new int[N];
      out.println();
      double media = 0, soma = 0, value;
      int cont = 0;
      do{
        out.printf("Valor para posicao %d -> ", cont+1);
        value = in.nextDouble();
        out.println();
        if(value != 0){
            soma += value;
            cont++;
        }
      }while(value != 0 && cont < array.length);
      media = soma/cont;
      out.printf("Soma -> %f", soma);
      out.printf("\nMedia -> %f", media);
  }
}