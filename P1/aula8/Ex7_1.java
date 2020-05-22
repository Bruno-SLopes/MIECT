import java.util.*;
import java.io.*;

public class Ex_7_1{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException{
        String name_of_file;
        File dir = new File(".");
        File[] filesList = dir.listFiles();
        for (File file : filesList) {
            if (file.isFile()) {
                System.out.println(file.getName());
            }
        }

        System.out.print("Nome do ficheiro para abrir com tipo(ex: ect.txt): ");
        name_of_file = sc.nextLine();

        File fin = new File(name_of_file);

        if(verify(fin)){
            Scanner read_from_file = new Scanner(fin);
            while(read_from_file.hasNextLine()){
                System.out.println(read_from_file.nextLine());
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
}
