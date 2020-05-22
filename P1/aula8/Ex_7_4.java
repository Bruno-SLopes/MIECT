import java.io.*;
import java.util.*;
public class Ex_7_4{
    static Scanner sc = new Scanner (System.in);
    public static void main(String []args)throws IOException{
        System.out.print("Indique o nome do ficheiro que pretende abrir: ");
        String choice = sc.nextLine();
        File fin = new File(choice);
        if(verify(fin)){
            Scanner scf = new Scanner(fin);

            int[] notas_cont = new int[21];

            for(int i = 0; i < notas_cont.length; i++){
                scf = new Scanner(fin);
                while(scf.hasNextInt()){
                    if(scf.nextInt()==i){
                        notas_cont[i]++;
                    }
                }
            }
            scf.close();

            printHistogram(notas_cont);
        }
    }
    public static boolean verify(File nameIn){
        if(!nameIn.exists()){
            System.out.println("ERROR: input file " + nameIn + " does not exist!");
            return false;
        }
        if(nameIn.isDirectory()){
            System.out.println("ERROR: input file " + nameIn + " is a directory!");
            return false;
        }
        if(!nameIn.canRead()){
            System.out.println("ERROR: cannot read from input file " + nameIn+ "!");
            return false;
        }
        return true;
        /*int person;
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
		}*/
    }

    public static void printHistogram(int[] contador){
        System.out.print("Histograma de notas\n");
        System.out.print("-----------------------------\n");
        for(int i = 20; i >= 0; i--){
            System.out.printf("%2d | ", i);
            for(int j = 0; j < contador[i]; j++){
			    System.out.print("*");
			}
			System.out.println();
        }
    }
}