import java.util.*;
import java.lang.*;

public class Ex_1_17 {
	static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) {
		
		double valorproduto, iva, desconto, total;
		
		System.out.print("Quanto gastou em produtos, em euros:");
		valorproduto = sc.nextDouble();
		
		System.out.print("Qual o valor do IVA, em percentagem:");
		iva = sc.nextDouble();
		
		System.out.print("Quanto de desconto, em euros:");
		desconto = sc.nextDouble();
		
		total = (valorproduto+(valorproduto*(iva/100)))-desconto;
		
		System.out.printf("Total final: %8.2f euros", total);
	}
}

