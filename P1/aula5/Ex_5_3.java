import java.util.*;

public class Ex_5_3 {
	static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) {
		
		int mes, ano;
		
		System.out.print("Mes: ");
		mes = sc.nextInt();
		
		System.out.print("Ano: ");
		ano = sc.nextInt();
		
		if(ano >= 0){
            if(mes >= 1 && mes <= 12){
			
                if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
                    System.out.printf("O mes %d do ano %d tem %d dias.", mes, ano, diasdomes(mes, ano));
                }
            
                else if(mes == 4 || mes == 6 || mes == 9 || mes == 11){
                    System.out.printf("O mes %d do ano %d tem %d dias.", mes, ano, diasdomes(mes, ano));
                }
            
                else{
                    if(bissexto(ano) == true){
                        System.out.printf("O mes %d do ano %d tem %d dias.", mes, ano, diasdomes(mes, ano));
                    }
                    else{
                        System.out.printf("O mes %d do ano %d tem %d dias.", mes, ano, diasdomes(mes, ano));
                    }
                }
                
            }
            
            else{
                
                System.out.print("Mes invalido");
                
            }
        }
        else{
            System.out.print("Ano inválido");
        }
    }
    public static boolean bissexto(int x){
        boolean biss = false;

        if(x % 400 == 0 || ((x % 4 == 0) && (x % 100 != 0))){
            biss = true;
        }
        else{
            biss = false;
        }
        return biss;
    }

    public static int diasdomes(int m, int a){
        int totalDays;

        if(m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12){
            totalDays = 31;
        }
        else if(m == 4 || m == 6 || m == 9 || m == 11){
            totalDays = 30;
        }
        else{
            if(bissexto(a)){
                totalDays = 29;
            }
            else{
                totalDays = 28;
            }
        }

        return totalDays;
    }
}