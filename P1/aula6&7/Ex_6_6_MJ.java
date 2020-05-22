import java.util.*;
public class Ex_6_6_MJ {
	//constantes
	static Scanner sc = new Scanner(System.in);
	
	
	public static void main (String[] args) {
		System.out.print("Insira uma frase: ");
        String frase = sc.nextLine();
		
		char countingArray[] = new char[frase.length()];  
       
        
      
        boolean iguaisCarateres = frequenciaCarateres(frase.length(), countingArray, frase);
		if (iguaisCarateres=true) {
			System.out.print("A sequencia tem pelo menos um elemento ");
			for (int j = 0; j < frase.length(); j++) 
				System.out.print(countingArray[j]);	
		}
	}
        
     public static boolean frequenciaCarateres(int comprimentoFrase, char[] array, String frase){
		  
		for (int i = 0; i < comprimentoFrase; i++) {
			for (int j = 0; j < comprimentoFrase; j++) {
				if (frase.charAt(i)==frase.charAt(j)) {
					array[i]=frase.charAt(j);
					return true;
					
				}
			}
		}
	 return false;
	}
}
