import java.util.*;

public class Ex_2_4 {
	static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) {
		
		int mes, ano, diasdomes;
		
		System.out.print("Mes: ");
		mes = sc.nextInt();
		
		System.out.print("Ano: ");
		ano = sc.nextInt();
		
		if(mes >= 1 && mes <= 12){
			
			if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
				diasdomes = 31;
				System.out.printf("O mes %d do ano %d tem %d dias.", mes, ano, diasdomes);
			}
		
			else if(mes == 4 || mes == 6 || mes == 9 || mes == 11){
				diasdomes = 30;
				System.out.printf("O mes %d do ano %d tem %d dias.", mes, ano, diasdomes);
			}
		
			else{
				if((ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0))){
					diasdomes = 29;
					System.out.printf("O mes %d do ano %d tem %d dias.", mes, ano, diasdomes);
				}
				else{
					diasdomes = 28;
					System.out.printf("O mes %d do ano %d tem %d dias.", mes, ano, diasdomes);
				}
			}
			
		}
		
		else{
			
			System.out.print("Mes invalido");
			
		}
	}
}

