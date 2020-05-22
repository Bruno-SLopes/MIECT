import java.util.*;
import static java.lang.System.*;
public class Ex_9_4{

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        String matricula;

        System.out.print("Matricula(separada por '-'): ");
        matricula = sc.nextLine();

        String[] pattern = new String[3];
        pattern[0] = "AA-00-00";
        pattern[1] = "00-AA-00";
        pattern[2] = "00-00-AA";

        boolean aceite = false;

        for(int i = 0; i < 3; i++){
            if(matchPattern(matricula, pattern[i])){
                aceite = true;
            }
        }

        if(aceite){
            out.printf("A matrícula %s é aceite em Portugal.\n\n", matricula);
        }
        else{
            out.printf("A matrícula %s não é aceite em Portugal.\n\n", matricula);
        }
    }
    public static boolean matchPattern(String mat, String tipo_mat){
        boolean pertence = true;

		for (int i = 0; i < mat.length(); i++) {
			
			if (tipo_mat.charAt(i) == 'A') {
				
				if (Character.isDigit(mat.charAt(i))) {
					
					pertence = false;
				} 
			} else if (tipo_mat.charAt(i) == '0') {
				
				if (!Character.isDigit(mat.charAt(i))) {
					
					pertence = false;
				}
			} else if (tipo_mat.charAt(i) == '-') {
				
				if (mat.charAt(i) != '-') {
					
					pertence = false;
				}
			}
		}

		return pertence;
    }
}