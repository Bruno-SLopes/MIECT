import static java.lang.System.*;
import java.io.*;

public class FindFile{

    public static void main(String[] args) {
        if (args.length < 1) {
            out.println("USO: java -ea FindFile <padrao> [dir]");
            exit(1);
        }
        String f;
        if(args.length == 2){
            f = args[1];
        }
        else{
            f = ".";
        }
        File fin = new File(f);
        find_file(args[0], fin);
    }

    public static void find_file(String pad, File in_path){
        
        if(in_path.isFile() && in_path.getName().indexOf(pad) >= 0){
            out.println(in_path.getPath());
        }
        if(in_path.isDirectory()){
            File[] out = in_path.listFiles();
            for(File f : out){
                find_file(pad, f);
            }
        }
    }
}