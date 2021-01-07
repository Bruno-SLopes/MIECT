import java.util.*;
import static java.lang.System.*;
import MPEI.*;
@SuppressWarnings("unused")
public class App{
    public static AppData data;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int opt;
        out.println("Welcome To Bloom Supermarket");
        out.print("\n---------------------");
        out.print("\n| Bloom Supermarket |");
        out.print("\n---------------------");
        out.print("\n|1 - Login          |");
        out.print("\n|2 - Registar       |");
        out.print("\n|0 - Sair           |");
        out.print("\n---------------------");
        do{
            out.print("\nQue deseja fazer: ");
            opt = sc.nextInt();
            data = AppData.getInstance();
            if(opt == 1){
                //Chama-se Login
                login();
                Snd_login();
            }

            if(opt == 2){
                //Chama-se Register
                register();
                Snd_login();
            }

            if(opt == 0){
                System.exit(0);
            }
        }while(opt != 1 || opt != 2 || opt != 0);
    }

    public static void login(){
        out.print("Email: ");
        String email = sc.next();
		out.print("Password: ");
        String password = sc.next();
        if(data.users.isMember(new Utilizador(email, password))) {
			System.out.println("Login confirmado.");
			data.setCurrentUser(email);
			Application.start();
		}
		else {
			System.out.print("Utilizador não registado. Pretende registar-se? (S/N) ");
			char choice = sc.nextLine().charAt(0);
			System.out.println();
			if(Character.toLowerCase(choice) == 's') {
				register();
			}
			else {
				System.exit(0);
			}
		}
    }

    public static void override() {
		data.setCurrentUser("bruno25@ua.pt");
		App.Snd_login();
    }
    
    public static Utilizador register(){
        String nome, email, pass, district;
        int age;

        out.print("Nome: ");
		nome = sc.next();
		
		out.print("Email: ");
		email = sc.next();
		
		out.print("Password: ");
		pass = sc.next();
		
		out.print("Distrito: ");
		district = sc.next();

        out.print("Idade (maior ou igual a 18): ");
        age = sc.nextInt();

        Utilizador user = new Utilizador(nome, email, pass, district, age);
		data.users.insert(user);
		out.println("\nUtilizador registado com sucesso!\n");
		return user;
    }

    public static void Snd_login(){
        out.print("\n---------------------");
        out.print("\n| Bloom Supermarket |");
        out.print("\n---------------------");
        out.print("\n|1 - Comprar        |");
        out.print("\n|2 - Area de Admin  |");
        out.print("\n|3 - Historico(???) |");
        out.print("\n|4 - Ver Produtos   |");
        out.print("\n|0 - Sair           |");
        out.print("\n---------------------");

        int opt_ins;

        do{
            out.print("\nQue deseja fazer: ");
            opt_ins = sc.nextInt();
            
            if(opt_ins == 1){
                //Chama-se Comprar
            }

            if(opt_ins == 2){
                //Chama-se Admin_Area
                if (data.admins.isMember(data.currentUser)) {
                    Admin_Area.start(); 
                }
                else {
                    System.out.println("Area restrita a administradores");
                }
            }

            if(opt_ins == 3){
                //Utiliza-se codigo para ver produtos ja comprados
            }

            if(opt_ins == 4){
                //Chama-se Store
            }

            if(opt_ins == 0){
                System.exit(0);
            }
        }while(opt_ins != 1 || opt_ins != 2 || opt_ins != 3 || opt_ins != 4 || opt_ins != 0);
    }
}