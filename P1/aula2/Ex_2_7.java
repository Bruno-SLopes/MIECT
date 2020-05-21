import java.util.*;

public class Ex_2_7 {
	static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) {
		
		int n1, n2, n3;
		
		System.out.print("Numero 1: ");
		n1 = sc.nextInt();
		
		System.out.print("Numero 2: ");
		n2 = sc.nextInt();
		
		System.out.print("Numero 3: ");
		n3 = sc.nextInt();
		
		if(n1 != n2 && n2 != n3 && n3 != n1){
			if(n1 > n2 && n1 > n3){
				System.out.print("O seu primeiro numero e o maior.");
			}
		
			else if(n2 > n1 && n2 > n3){
				System.out.print("O seu segundo numero e o maior.");
			}
		
			else{
				System.out.print("O seu terceiro numero e o maior.");
			}
		}
		
		else{
			System.out.print("Next time choose different numbers xD");
		}
	}
}

