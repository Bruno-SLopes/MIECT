import java.util.*;

public class Ex_6_7{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		int[] a = new int[100];
		int number;
		do{
			System.out.print("Numero para array: ");
			number = sc.nextInt();
		}while(a.length <= 100 || number < 0);
		for(int i = 0; i < a.length; i++){
			a[i] = number;
		}
		System.out.print(a);
	}
}
