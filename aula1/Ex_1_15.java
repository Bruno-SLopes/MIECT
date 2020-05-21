import java.util.*;
import java.lang.*;

public class Ex_1_15 {
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
		
		nf = (tp1*0.15)+(tp2*0.15)+(api*0.3)+(ep*0.4);
		
		System.out.printf("Nota Final: %f", nf);
		
	}
}

