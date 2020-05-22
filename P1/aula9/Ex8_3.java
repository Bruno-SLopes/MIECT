import java.io.*;
import java.util.*;
public class Ex_8_3{

    static Scanner sc = new Scanner (System.in);
    public static void main(String []args)throws IOException{
        int esc;
        int[] a = new int[50];

        do{
            System.out.print("\nAnalise de uma sequencia de numeros inteiros");
            System.out.print("\n1 - Ler a sequencia");
            System.out.print("\n2 - Escrever a sequencia");
            System.out.print("\n3 - Calcular o maximo da sequencia");
            System.out.print("\n4 - Calcular o minimo da sequencia");
            System.out.print("\n5 - Calcular a media da sequencia");
            System.out.print("\n6 - Detetar se e uma sequencia so constituida por numeros pares");
            System.out.print("\n7 - Ler uma sequência de números de um ficheiro de texto");
            System.out.print("\n8 - Adicionar números à sequência existente");
            System.out.print("\n9 - Gravar a sequência atual de número num ficheiro");
            System.out.print("\n10 - Estatisticas de valores");
            System.out.print("\n0 - Terminar o programa");
            System.out.print("\nOpcao -> ");
            esc = sc.nextInt();

            if(esc == 1){
                lerSeq(a);
            }
            else if(esc == 2){
                escSeq(a);
            }
            else if(esc == 3){
               System.out.printf("\nMaximo -> %d",  maxSeq(a));
               System.out.print("\n");
            }
            else if(esc == 4){
                System.out.printf("\nMinimo -> %d",  minSeq(a));
                System.out.print("\n");
             }
             else if(esc == 5){
                 System.out.printf("\nMedia -> %8.2f", mediaSeq(a));
                 System.out.print("\n");
             }
             else if(esc == 6){
                 System.out.print(parSeq(a));
                 System.out.print("\n");
             }
             else if(esc == 7){
                 System.out.print("Escolha um ficheiro de texto com numeros escritos: ");
                 String t = sc.next();
                 lerText(t);
             }
             else if(esc == 8){
                 System.out.print("Escolha um ficheiro de texto com numeros escritos: ");
                 String t = sc.next();
                 escText(t);
             }
             else if(esc == 9){
                 System.out.print("Escolha um ficheiro de texto com numeros escritos: ");
                 String text = sc.next();
                 File fin = new File(text);
                 savSeq(a, fin);
             }
             else if(esc == 10){
                System.out.print("Escolha um ficheiro de texto com numeros escritos: ");
                String text = sc.next();
                stats(text);
             }
             else if(esc == 0){
                 break;
             }
        }while(esc != 1 || esc != 2 || esc != 3 || esc != 4 || esc != 5 || esc != 6 || esc != 7 || esc != 8 || esc != 9 || esc != 10);


    }

    public static int[] lerSeq(int[] z){
        int x;
        //System.out.print("Escreva um número: ");
        for(int i = 0; i < z.length; i++){
            System.out.printf("\nEscreva um %dº numero: ", i+1);
            x = sc.nextInt();
            if(x == 0){
                break;
            }
            z[i] = x;
        }
        return z;
    }

    public static void escSeq(int[] z){
        for(int i = 0; i < z.length; i++){
            if(z[i] == 0){
                break;
            }
            System.out.printf("\n%dº elemento: %d", i+1, z[i]);
        }
        System.out.print("\n");
    }

    public static int maxSeq(int[] z){
        int max = 0;
        for(int i = 0; i < z.length; i++){
            if(z[i] > max){
                max = z[i];
            }
        }
        return max;
    }

    public static int minSeq(int[] z){
        int min = 1000000000;
        for(int i = 0; i < z.length; i++){
            if(z[i] < min && z[i] != 0){
                min = z[i];
            }
        }
        return min;
    }

    public static double mediaSeq(int[] z){
        int count = 0;
        int soma = 0;
        for(int i = 0; i < z.length; i++){
            if(z[i] == 0){
                break;
            }
            soma += z[i];
            count++;
        }
        return (double)soma/count;
    }

    public static boolean parSeq(int[] z){
        boolean par = true;
        for(int i = 0; i < z.length; i++){
            if(z[i] % 2 != 0){
                par = false;
            }
        }
        return par;
    }

    public static void lerText(String texto)throws IOException{
        File fin = new File(texto);
        if(verify(fin)){
            Scanner read_from_file = new Scanner(fin);
            while(read_from_file.hasNextInt()){
                System.out.println(read_from_file.nextInt());
            }
            read_from_file.close();
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

    public static void escText(String texto)throws IOException{
        File fin = new File(texto);
        if(verify(fin)){
            PrintWriter pw = new PrintWriter(fin);
            for(;;) {
                System.out.print("Numero para escrever: ");
                int number = sc.nextInt();
                if (number <= 0){
                    break;
                }
                pw.println(number);
            }
            pw.close();
        }
    }

    public static void savSeq(int[] z, File t)throws IOException{
        PrintWriter write = new PrintWriter(t);
        for(int i = 0; i < z.length; i++){
            write.println(z[i]);
        }
        write.close();
        System.out.print("\nSequencia imprimida para um ficheiro!");
    }

    public static void stats(String t)throws IOException{
        File fin = new File(t);
        int cont = 0, max = 0, minimo = 100000000;
        double media, soma = 0, soma_2 = 0;

        Scanner scf = new Scanner(fin);
        while(scf.hasNextInt()){
            int just = scf.nextInt();
            soma += just;
            soma_2 += Math.pow(just, 2);
            if(just > max){
                max = just;
            }
            if(just < minimo){
                minimo = just;
            }
            cont++;
        }
        media = (double)soma / cont;

        System.out.printf("\nMedia -> %f", media);
        System.out.printf("\nMaximo -> %d", max);
        System.out.printf("\nMinimo -> %d", minimo);
        System.out.printf("\nContagem de valores -> %d", cont);
        System.out.printf("\nSomatorio -> %f", soma);
        System.out.printf("\nSomatorio ao quadrado -> %f", soma_2);
        System.out.println();
    }
}
