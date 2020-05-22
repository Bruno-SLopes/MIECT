import static java.lang.System.*;

import java.io.*;
import java.util.Scanner;

public class p17 {
  public static final Scanner in = new Scanner(System.in);

  public static void main(String[] args)throws IOException{
      File fin = new File(args[0]);
      File fout = new File(args[1]);
      if(verify(fin)){
        Scanner rff = new Scanner(fin);
        if(fout.exists()){
            PrintWriter pw = new PrintWriter(fout);
            while(rff.hasNextLine()){
                String just = rff.nextLine();
                pw.printf("%s", just);
            }
            rff.close();
            pw.close();
        }
        else{
            PrintWriter pw = new PrintWriter(fout);
            while(rff.hasNextLine()){
                String just = rff.nextLine();
                pw.printf("%s", just);
            }
            rff.close();
            pw.close();
        }
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