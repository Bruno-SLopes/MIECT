import static java.lang.System.*;
import java.util.Scanner;

// Complete o programa para calcular a nota final NF de
// um aluno de Programação 2 (2017-2018) na época normal.
public class p12
{
  public static final Scanner in = new Scanner(System.in);

  public static void main(String[] args)
  {
    double ap1 = readInRange("AP1? ", 0.0, 20.0);
    double ap2 = readInRange("AP2? ", 0.0, 20.0);
    double atp1 = readInRange("ATP1? ", 0.0, 20.0);
    double atp2 = readInRange("ATP2? ", 0.0, 20.0);
    double atp3 = readInRange("ATP3? ", 0.0, 20.0);
    double ctp = (atp1 + atp2 + atp3)/3;
    double cp = (ap1 + ap2)/2;
    double nf = 0.3 * ctp + 0.7 * cp;

    out.printf("NF = %.1f\n", nf);
    if (nf < 9.5)
      out.println("REPROVADO!");
    else
      out.println("APROVADO!");
  }

  // Reads a double that must be in the range [min, max].
  // Shows the prompt, reads a double value.
  // If the value is not in the range, prints a warning and repeats.
  public static double readInRange(String prompt, double min, double max)
  {
    assert min <= max : "max must be at least as large as min!";
    double value;
    do{
      out.printf("%s", prompt);
      value = in.nextDouble();
      out.println();
      if(value < min || value > max){
        out.printf("Value must be in range [%3.1f, %3.1f]!\n", min, max);
      }
    }while(value < min || value > max);
    return value;
  }
}
