import java.util.*;

public class Ex_3_10 {
	static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) {
		int n1, n2, maxVal, minVal;

		System.out.print("Numero inteiro positivo: ");
		n1 = sc.nextInt();

		maxVal = n1;
		minVal = n1;

		if(n1 > 0){
			do{
				System.out.print("Numero inteiro positivo: ");
				n2 = n1;
				n1 = sc.nextInt();
				if(n1 > 0){
					if(n1 > maxVal){
						maxVal = n1;
					}
					else if(n1 < minVal){
						minVal = n1;
					}
				}
				else{
					System.out.print("Numero deve ser inteiro positivo.");
				}
				//n1 = sc.nextInt();
			}while(n1 != 2*n2 && n1 > 0);
			System.out.printf("\nValor de paragem: %d",n1);
			System.out.printf("\nMaximo: %d",maxVal);
			System.out.printf("\nMinimo: %d",minVal);
		}
		else{
			System.out.print("Numero deve ser inteiro positivo.");
		}
	}
}

