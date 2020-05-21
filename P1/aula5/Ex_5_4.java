import java.util.*;

public class Ex_5_4 {
	static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) {
        int m;

        System.out.print("Numero para Fatorial: ");
        m = sc.nextInt();

        System.out.print(fatorial(m));
    }

    public static int fatorial(int num){
        int fact = 1;

        for(int i = num; i > 0; i--){
            fact *= i;
        }
        return fact;
    }
}