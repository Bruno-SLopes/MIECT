import java.util.*;

public class Ex_1_9{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira uma largura:");
		int l = sc.nextInt();
		
		System.out.print("Insira um comprimento:");
		int c = sc.nextInt();
		
		int p = (l*2)+(c*2);
		int a = l*c;
		
		System.out.printf("Perimetro: %d", p);
		System.out.printf("\nArea: %d", a);
	}
}
