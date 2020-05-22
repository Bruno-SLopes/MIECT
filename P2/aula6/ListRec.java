import static java.lang.System.*;
import java.io.*;

public class ListRec{

    public static void main(String[] args) {
        if(args.length == 2){
            out.println("Wrong number of arguments");
            exit(1);
        }
        File f = new File(args[0]);
        list_Rec(f);
    }

    public static void list_Rec(File in){
        out.println(in.getPath());
        if(in.isDirectory()){
            File[] out = in.listFiles();
            for(File f : out){
                list_Rec(f);
            }
        }
    }
}