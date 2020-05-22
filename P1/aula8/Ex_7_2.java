import java.util.*;
import java.io.*;

public class Ex_7_2{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException{    
        int cont=0;
        File fin = new File(args[0]);
        if(verify(fin)){
            Scanner read_from_file = new Scanner(fin);
            while(read_from_file.hasNextInt() && cont <100){
                int x = read_from_file.nextInt();
                if (x >=0){
                    System.out.println(x);
                    cont++;
                }
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