import java.util.*;
import java.lang.*;

public class Ex_1_16 {
	static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) {
		
		double dia1, dia2, dia3, dia4, dm;
		
		System.out.print("Quanto gastou no dia 1, em euros:");
		dia1 = sc.nextDouble();
		
		dia2 = dia1 + (dia1*0.2);
		dia3 = dia2 + (dia2*0.2);
		dia4 = dia3 + (dia3*0.2);
		
		dm = (dia1 + dia2 + dia3 + dia4)/4;
		
		System.out.printf("Despesa media diaria : %6.2f euros", dm);
		
	}
}

