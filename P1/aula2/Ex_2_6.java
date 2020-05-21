import java.util.*;

public class Ex_2_6 {
	static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) {
		
		int n;
		
		System.out.print("Numero: ");
		n = sc.nextInt();
		
		if(n % 2 == 0){
			System.out.printf("O numero %d é par.", n);
		}
		
		else{
			System.out.printf("O numero %d é impar.", n);
		}
	}
}

