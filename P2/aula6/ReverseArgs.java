import static java.lang.System.*;

public class ReverseArgs {

  public static void main(String[] args) {
    printArray(args, 0);
  }

  /** Imprime as N primeiras strings do array, uma por linha. */
  public static void printArray(String[] array, int N) {
    if(N < array.length){
      printArray(array, N+1);
      out.println(array[N]);
    }

  }

}
