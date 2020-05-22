import java.util.*;
public class Ex_6_4{
	static int person, notas[];
    static Scanner sc = new Scanner (System.in);
    public static void main(String []args){
        int person;
        int[] notas;

        do{
            System.out.print("Numero de pessoas: ");
            person = sc.nextInt();
        }while(person < 0 || person > 50);
        notas = new int[person];
        for(int i = 0; i < person; i++){
			notas[i] = escreverNotas();
		}
		System.out.printf("Histograma de notas\n");
		System.out.printf("-----------------------------\n");
		for(int i = 20; i >= 0; i--){
			System.out.printf("%2d | ", i);
			for(int j = 0; j < notas.length; j++){
				if(notas[j] == i)System.out.print("*");
			}
			System.out.println();
		}
    }
    public static int escreverNotas(){
        int nota;
        do{
			System.out.print("Nota: ");
			nota = sc.nextInt();
			
		}while(nota<0||nota>20);
        return nota;
    }
}
