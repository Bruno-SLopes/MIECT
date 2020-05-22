import p2utils.KeyValueList;
import static java.lang.System.*;
import java.util.Scanner;
import java.io.*;
import java.util.NoSuchElementException;

public class CheckPasswd{
    static Scanner ld = new Scanner(System.in);
    public static void main(String[] args)throws IOException{
        if(args.length != 1){
            err.printf("Usage: java -ea CheckPasswd text-file\n");
            exit(1);
        }
        KeyValueList<String> map = new KeyValueList<String>();
        File f = new File(args[0]);

        Scanner sc = new Scanner(f);

        while(sc.hasNextLine()){
            String[] just = sc.nextLine().split(" ");
            map.set(just[0], just[1]);
        }

        authentication(map);
    }

    public static void authentication(KeyValueList<String> list){
        boolean finished = false;
        do{
            try{
                out.print("Username: ");
                String user = ld.nextLine();
                if(!list.contains(user)){
                    out.println("Authentication failed");
                }
                out.print("Password: ");
                String pass = ld.nextLine();

                if(list.get(user).equals(pass)){
                    out.println("Authentication: successful");
                }
                else{
                    out.println("Authentication failed");
                }
                out.println();
            }catch(NoSuchElementException e){
                finished = true;
            }
        }while(finished == false);
    }
}
