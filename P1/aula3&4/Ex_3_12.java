import java.util.*;

public class Ex_3_12 {
	static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) {
		
		int n, cont = 0;
		//int secret = (int)(100.0*Math.random()) + 1;
        String answer;
		do{
            System.out.print("Vamos jogar ao jogo do AltoBaixo");
		    System.out.print("\n--------------------------------");
            System.out.print("\nTente adivinhar o numero escolhido pela CPU");
            int secret = (int)(100.0*Math.random()) + 1;
		    do{
			    System.out.print("\nIntroduza a sua tentativa: ");
			    n = sc.nextInt();
			
			    if(n != secret){
				
				    if(n > secret){
					    System.out.print("Secreto inferior ao seu.");
				    }
				    else if(n < secret){
					    System.out.print("Secreto superior ao seu.");
				    }
			    }
			    cont++;
            }while(n != secret);
            System.out.printf("Acertou no número em %d tentativas.", cont);
            System.out.println("\nDeseja repetir o jogo? (Yes-y  /  No-n)");
            answer = sc.next();
            if(answer.equals("y")){
                cont = 0;
            }
        }while(answer.equals("y"));
		
        System.out.println("Tenha um bom dia");
        System.out.println(" +\"\"\"\"\"+ ");
        System.out.println("[| o o |]");
        System.out.println(" |  ^  | ");
        System.out.println(" | '-' | ");
        System.out.println(" +-----+ ");
	}
}

