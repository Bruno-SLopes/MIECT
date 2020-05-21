import java.util.*;

public class Ex_2_3 {
	static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) {
		
		int idade;
		
		System.out.print("Que idade tem: ");
		idade = sc.nextInt();
		
		if (idade > 0){
			
			if(idade < 6){
				System.out.print("Isento de pagamento");
			}
			
			else if(idade >= 6 && idade <= 12){
				System.out.print("Bilhete de criança");
			}
			
			else if(idade >= 13 && idade <= 65){
				System.out.print("Bilhete normal");
			}
			
			else{
				System.out.print("Bilhete de 3ª idade");
			}
			
		}
		
		else{
			System.out.print("Idade inválida");
		}
	}
}

