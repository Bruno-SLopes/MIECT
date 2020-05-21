import java.util.*;
public class Ex_5_9 {
	
	static Scanner sc = new Scanner(System.in);
	public static void main (String args[]) {
		int m;

        System.out.print("Numero para verificar se e primo: ");
        m = sc.nextInt();

        for(int i = 1; i < m + 1; i++){
            System.out.printf("\n%d -> %b", i, isPrime(i));
        }
    }
    
    public static boolean isPrime(int n) {
        for(int i=2;i<n;i++) {
            if(n%i==0)
                return false;
        }
        return true;
    }
}