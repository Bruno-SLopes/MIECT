import static java.lang.System.*;

import java.util.Scanner;

public class TestComplex {
  static Scanner sc = new Scanner(System.in);
  // Exemplo simples de utilização da class Complex
  public static void main(String[] args) {
    if(args.length == 2){
      Complex a = new Complex(Double.parseDouble(args[0]), Double.parseDouble(args[1]));

      // Vamos usar métodos do objeto a
      out.println("(" + a.real() + " + " + a.imag() + "i)");
      out.println("  parte real = " + a.real());
      out.println("  parte imaginaria = " + a.imag());
      out.println("  modulo = " + a.abs());
      out.printf("  argumento =  %2.2f\n", a.arg());
    }
    else{
      out.print("Re: ");
      double reality = sc.nextDouble();
      out.println();
      out.print("Im: ");
      double imagine = sc.nextDouble();
      out.println();
      Complex a = new Complex(reality, imagine);

      // Vamos usar métodos do objeto a
      out.println("(" + a.real() + " + " + a.imag() + "i)");
      out.println("  parte real = " + a.real());
      out.println("  parte imaginaria = " + a.imag());
      out.println("  modulo = " + a.abs());
      out.printf("  argumento =  %2.2f\n", a.arg());
    }
  }

}
