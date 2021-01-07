import MPEI.*;

import java.util.*;
import static java.lang.System.*;
@SuppressWarnings("unused")

public class AppData{
  static Scanner sc = new Scanner(System.in);
  public List<Utilizador> listUsers;
  public BloomFilter<Utilizador> users;
  public BloomFilter<Utilizador> admins;
  public Utilizador currentUser;
  private int numMaxUsers;
	private int numMaxCars;
  private static AppData current;
    
  public AppData(int numMaxUsers, int numMaxCars) {
		listUsers = new ArrayList<Utilizador>();
		users = new BloomFilter<Utilizador>(numMaxUsers);
		admins = new BloomFilter<Utilizador>(10);
		this.numMaxUsers = numMaxUsers;
		this.numMaxCars = numMaxCars;
		current = this;
  }
    
  public void setCurrentUser(String email) {
		for (Utilizador user : listUsers) {
			if (user.getEmail().equals(email)) {
				this.currentUser = user;
				break;
			}
		}
  }
    
  public static AppData getInstance() {
		return current;
	}

	public Utilizador getCurrentUser() {
		return currentUser;
  }
    
  public void listUsers() {
		System.out.println("Lista de Utilizadores: ");
		for (Utilizador user : listUsers) {
			System.out.println(user);
		}
  }
    
  public void reset() {
		listUsers = new ArrayList<Utilizador>();
		users = new BloomFilter<Utilizador>(numMaxUsers);
	}
}