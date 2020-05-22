import java.io.*;
import java.util.*;
public class Ex_7_5{
    static Scanner sc = new Scanner (System.in);
    public static void main(String []args)throws IOException{
        String choice;

        System.out.print("Escolha um ficheiro java para o abrirmos no terminal: ");
        choice = sc.nextLine();

        File fin = new File(choice);
        File fout = new File("withoutCommentary.txt");
        if(verify(fin)){
            Scanner scf = new Scanner(fin);
            PrintWriter pw = new PrintWriter(fout);

            while(scf.hasNextLine()){
                String just = scf.nextLine();
                if(!just.contains("//")){
                    pw.println(just);
                }
            }
            scf.close();
            pw.close();
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