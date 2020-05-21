import java.util.*;

public class Ex_4_2 {
	static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) {
        int n;

        System.out.print("Numero (0 <= n <= 100): ");
        n = sc.nextInt();

        System.out.print("\n-------------------");
        System.out.print("\n| Tabuada dos ## |");
        System.out.print("\n-------------------");
        for(int i = 1; i <= 10; i++){
            System.out.printf("\n| %d x %d | %d |", n, i, n*i);
        }
        System.out.print("\n-------------------");
	}
}
