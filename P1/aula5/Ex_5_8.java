import java.util.*;
public class Ex_5_8 {
	
	static Scanner sc = new Scanner(System.in);
	public static void main (String args[]) {
		int x1, x2;
		
		System.out.print("Escolha x inicial e final: ");
		x1 = sc.nextInt();
		x2 = sc.nextInt();

		System.out.print("------------------------------------\n");
		System.out.print("| x |     5x2+10x+3|   7x3+3x2+5x+2|\n");
		System.out.print("------------------------------------\n");
		for(int i = x1; i < x2+1; i++){
			//System.out.print("------------------------------------\n");
			System.out.printf("| %d | %12.2f | %13.2f |\n", i, SndDg(i), TrdDg(i));
			System.out.print("------------------------------------\n");
		}

	}
	
	public static double SndDg(int x){
		double res = 5*Math.pow(x, 2) + 10*x + 3;
		return res;
	}

	public static double TrdDg(int x){
		double res = 7*Math.pow(x, 3) + 3*Math.pow(x, 2) + 5*x + 2;
		return res;
	}
}