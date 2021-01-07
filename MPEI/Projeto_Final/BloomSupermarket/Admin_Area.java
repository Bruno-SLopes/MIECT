import java.util.*;
import java.lang.System.*;

public class Admin_Area{
    static Scanner sc = new Scanner(System.in);
    static AppData data;
    
    public static void start(){
        data = AppData.getInstance();
        int opt;
        out.print("\n---------------------");
        out.print("\n| Bloom Supermarket |");
        out.print("\n---------------------");
        out.print("\n|    Admin  Area    |");
        out.print("\n---------------------");
        out.print("\n|1 - Encher o stock |");
        out.print("\n|2 - Listar users   |");
        out.print("\n|0 - Sair           |");
        out.print("\n---------------------");

        do{
            out.print("Opção: ");
            opt = sc.nextInt();

            if(opt == 1){
                //data.fillstock()
                //utilizar class Produtos
            }

            if(opt == 2){
                data.listUsers();
				break;
            }
            
            if(opt == 0){
                System.exit(0);
            }
        }while(opt != 1 || opt != 2 || opt != 0);
    }
}
