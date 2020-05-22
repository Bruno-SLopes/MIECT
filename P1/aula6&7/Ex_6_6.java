import java.util.*;
public class Ex_6_6{
    static Scanner sc = new Scanner (System.in);
    public static void main(String []args){
		String phrase;
		
		char[] alpha = new char[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','x','y','w','z'};
		
		System.out.print("Escreva uma frase: ");
		phrase = sc.nextLine();
		
		boolean[] exists = new boolean[alpha.length];
		/*for(int i = 0; i < phrase.length(); i++){
				System.out.printf("\nsentence.charAt(%d) -> %s", i, phrase.charAt(i));
		}*/
		for(int i = 0; i < phrase.length(); i++){
			for(int j = 0; j < phrase.length(); j++){
				if(Character.toLowerCase(phrase.charAt(i)) == alpha[j]){
					exists[j] = true;
				}
			}
		}
		
		for(int k = 0; k < alpha.length; k++){
			if(exists[k]==true){
				System.out.println(alpha[k]);
			}
		}
	}
}
