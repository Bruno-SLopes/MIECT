import java.util.*;

public class Ex_1_12 {
	static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) {
		int segundos, h, hresto, m, mresto, s;
		
		System.out.print("Quantos segundos:");
		segundos = sc.nextInt();
		
		h = segundos/3600;
		hresto = segundos%3600;
		m = hresto/60;
		mresto = hresto%60;
		s = mresto%60;
		
		System.out.printf("%d --> %d:%d:%d", segundos, h, m, s);
		
	}
}

