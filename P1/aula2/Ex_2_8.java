import java.util.*;

public class Ex_2_8 {
	static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) {
		
		int n1, n2, n3;
		
		System.out.print("Numero 1: ");
		n1 = sc.nextInt();
		
		System.out.print("Numero 2: ");
		n2 = sc.nextInt();
		
		System.out.print("Numero 3: ");
		n3 = sc.nextInt();
		
		if(n1 > n2 && n1 > n3){
			
			if(n2 > n3){
				System.out.printf("%d < %d < %d", n3, n2, n1);
			}
			
			else{
				System.out.printf("%d < %d < %d", n2, n3, n1);
			}
			
		}
		
		else if(n2 > n1 && n2 > n3){
			
			if(n1 > n3){
				System.out.printf("%d < %d < %d", n3, n1, n2);
			}
			
			else{
				System.out.printf("%d < %d < %d", n1, n3, n2);
			}
			
		}
		
		else{
			
			if(n2 > n1){
				System.out.printf("%d < %d < %d", n1, n2, n3);
			}
			
			else{
				System.out.printf("%d < %d < %d", n2, n1, n3);
			}
			
		}
	}
}

