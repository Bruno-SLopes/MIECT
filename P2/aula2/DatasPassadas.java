import static java.lang.System.*;

public class DatasPassadas {

  public static void main(String[] args) {
    Data atual = new Data();
    int year = atual.ano();
    Data natal = new Data(25, 12, year-1);
    out.printf("%s\n", natal.extenso());

    do{
      natal.seguinte();
      out.printf("%s\n", natal.extenso());
      //out.printf("%s\n", atual.extenso());
      //out.println(natal.compare(atual));
    }while((natal.dia() != atual.dia()) || (natal.mes() != atual.mes()) || (natal.ano() != atual.ano()));
  }

}

