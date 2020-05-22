import java.util.*;
import static java.lang.System.*;
import java.io.*;

import java.io.IOException;

public class Ex_10_3{

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException{
        int esc;
        String fich_texto;
        out.print("\nFicheiro: ");
        fich_texto = sc.next();
        do{
            out.print("\n");
            out.print("\nAnalisador de pH");
            out.print("\n   1 - Ler valores de pH de um ficheiro");
            out.print("\n   2 - Escrever valores de pH no terminal");
            out.print("\n   3 - Calcular o pH medio das amostras");
            out.print("\n   4 - Calcular o numero de amostras acidas e basicas");
            out.print("\n   5 - Calcular o numero de amostras de pH superior a media");
            out.print("\n   6 - Escrever valores de pH no terminal ordenados de modo crescente");
            out.print("\n   7 - Terminar o programa");
            out.print("\nOpcao -> ");
            esc = sc.nextInt();

            if(esc == 1){
                out.printf("\nExistem %d valores de pH validos.", lerValores(fich_texto));
            }
            else if(esc == 2){
                escreverValores(fich_texto);
            }
            else if(esc == 3){
                out.printf("\nMedia: %5.2f", pH_medio(fich_texto));
            }
            else if(esc == 4){
                number_basic_acid(fich_texto);
            }
            else if(esc == 5){
                n_pH_above(fich_texto, pH_medio(fich_texto));
            }
            else if(esc == 6){
                ordValores(fich_texto, lerValores(fich_texto));
            }
            else{
                System.exit(0);
            }
        }while(esc != 1 || esc != 2 || esc != 3 || esc != 4 || esc != 5 || esc != 6 || esc != 7);
    }

    public static int lerValores(String fin) throws IOException{
        int valid = 0;
        int retornar = 0;

        File f = new File(fin);
        if(verify(f)){
            Scanner scf = new Scanner(f);

            while(scf.hasNextInt()){
                //out.printf("%s", scf.nextLine());
                //out.printf("%d\n", Integer.parseInt(scf.nextLine()));
                int just = scf.nextInt();
                if(just > -1 && just < 15 ){
                    valid++;
                }
            }
            scf.close();
            retornar += valid;
        }
        return retornar;
    }

    public static void escreverValores(String fin) throws IOException{
        File f = new File(fin);
        if(verify(f)){
            Scanner scf = new Scanner(f);

            while(scf.hasNextInt()){
                int just = scf.nextInt();
                if(just > -1 && just < 15 ){
                    out.printf("%d\n", just);
                }
            }
            scf.close();
        }
    }

    public static double pH_medio(String fin) throws IOException{
        double media = 0;
        double media_returned = 0;
        int soma = 0, valid = 0;

        File f = new File(fin);
        if(verify(f)){
            Scanner scf = new Scanner(f);

            while(scf.hasNextInt()){
                int just = scf.nextInt();
                if(just > -1 && just < 15 ){
                    soma += just;
                    valid++;
                }
            }
            media = (double)soma / valid;
            scf.close();
        }
        media_returned += media;
        return media_returned;
    }

    public static void number_basic_acid(String fin) throws IOException{
        int acid = 0, basic = 0, neutral = 0;

        File f = new File(fin);
        if(verify(f)){
            Scanner scf = new Scanner(f);

            while(scf.hasNextInt()){
                int just = scf.nextInt();
                if(just > -1 && just < 15 ){
                    if(just >= 0 && just <= 5.5){
                        acid++;
                    }
                    else if(just > 5.5 && just < 8.0){
                        neutral++;
                    }
                    else{
                        basic++;
                    }
                }
            }
            out.printf("\nNumero de acidos: %d", acid);
            out.printf("\nNumero de neutros: %d", neutral);
            out.printf("\nNumero de basicos: %d", basic);
            scf.close();
        }
    }

    public static void ordValores(String fin, int n) throws IOException{
        int[] seq = array(fin, n);
        int nlo = 0;
        boolean trocas;
        File f = new File(fin);
        if(verify(f)){
            Scanner scf = new Scanner(f);
    
            while(scf.hasNextInt()){
                int just = scf.nextInt();
                if(just > -1 && just < 15 ){
                    do{
                        trocas = false;
                        for(int i = 0; i < n - 1 -nlo; i++){
                            if(seq[i] > seq[i+1]){
                                just = seq[i];
                                seq[i] = seq[i+1];
                                seq[i+1] = just;
                                trocas = true;
                            }
                        }
                        nlo++;
                    }while(trocas);
                }
            }
            for(int z : seq){
                out.printf("\n%d", z);
            }
            scf.close();
        }
    }

    public static int[] array(String fin, int n)throws IOException{
        int i = 0;
        int[] a = new int[n];
        File f = new File(fin);
        if(verify(f)){
            Scanner scf = new Scanner(f);
    
            while(scf.hasNextInt()){
                int just = scf.nextInt();
                if(just > -1 && just < 15 ){
                    a[i] = just;
                    i++;
                }
            }
            scf.close();
        }
        return a;
    }

    public static void n_pH_above(String fin, double med) throws IOException{
        int above_media = 0;
        File f = new File(fin);
        if(verify(f)){
            Scanner scf = new Scanner(f);
    
            while(scf.hasNextInt()){
                int just = scf.nextInt();
                if(just > -1 && just < 15 ){
                    if(just > med){
                        above_media++;
                    }
                }
            }
            out.printf("\nNumero de valores de pH acima da media: %d", above_media);
            scf.close();
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
    }
}