import java.util.*;

public class Ex_2_1 {
	static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) {
		
		double tp1, tp2, api, ep, nf;
		
		System.out.print("Nota do TP1:");
		tp1 = sc.nextDouble();
		
		System.out.print("Nota do TP2:");
		tp2 = sc.nextDouble();
		
		System.out.print("Nota do API:");
		api = sc.nextDouble();
		
		System.out.print("Nota do EP:");
		ep = sc.nextDouble();
		
		nf = (tp1*0.1) + (tp2*0.1) + (api*0.3) + (ep*0.5);
		
		if(nf <= 20 && nf >= 0){
			
			if(nf >= 9.5){
				System.out.printf("O aluno foi aprovado com media de %4.2f valores.", nf);
			}
			
			else{
				System.out.printf("O aluno foi reprovado com media de %4.2f valores.", nf);
			}
		}
		
		else{
			System.out.print("Nota invalida.");
		}
	}
}

