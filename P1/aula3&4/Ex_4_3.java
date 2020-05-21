import java.util.*;

public class Ex_4_3 {
	static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) {
        int factorial, prod = 1;
        System.out.print("Numero entre 1 e 10: ");
        factorial = sc.nextInt();
        for(int i = 1; i <= factorial; i++){
            prod *= i;
            System.out.printf("\n %d! = %d", i, prod);
        }
	}
}
