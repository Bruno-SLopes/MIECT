import java.util.*;
import MPEI.*;
@SuppressWarnings("unused")
public class Utilizador implements Hashable{
    private String name;
    private String email;
    private String pass;
    private String district;
    private int age;

    public Utilizador(String name, String email, String pass, String district, int age){
        this.name = name;
        this.email = email;
        this.pass = pass;
        this.district = district;
        this.age = age;
    }

    public Utilizador(String email, String pass){
        this.email = email;
        this.pass = pass;
    }

    public String getEmail(){
        return this.email;
    }

    public static Utilizador getRandUtilizador(){
        String[] nomesMas = {"Joao", "Rodrigo", "Francisco", "Martim", "Santiago", "Tomas", "Afonso", "Duarte", "Miguel", "Guilherme",
							 "Tiago", "Gonçalo", "Diogo", "Gabriel", "Pedro", "Rafael", "Salvador", "Dinis", "Lucas", "Simao", 
							 "Gustavo", "David", "Jose", "Vicente", "Lourenco", "Diego", "Daniel", "Antonio", "Andre", "Vasco",
							 "Manuel", "Henrique", "Leonardo", "Bernardo", "Mateus", "Luis", "Eduardo", "Alexandre", "Leandro", "Enzo",
                             "Filipe", "Ricardo", "Matias", "Ruben", "Samuel", "Bruno", "Isaac", "Xavier", "Nuno", "Carlos"};
        
        String[] nomesFem = {"Maria", "Matilde", "Leonor", "Beatriz", "Mariana", "Carolina", "Ana", "Ines", "Sofia", "Margarida",
							 "Lara", "Joana", "Laura", "Francisca", "Diana", "Mafalda", "Madalena", "Clara", "Luana", "Sara",
							 "Bianca", "Alice", "Rita", "Iris", "Constanca", "Laeticia", "Eva", "Gabriela", "Camila", "Yara",
							 "Benedita", "Mara", "Catarina", "Ariana", "Ema", "Vitoria", "Marta", "Carlota", "Iara", "Yasmin",
                             "Luisa", "Nicole", "Daniela", "Nuria", "Bruna", "Victoria", "Alicia", "Rafaela", "Helena", "Jessica"};
                             
        String[] apelidos = {"Silva", "Santos", "Ferreira", "Perreira", "Oliveira", "Costa", "Rodrigues", "Martins", "Jesus", "Sousa",
							 "Fernandes", "Gonçalves", "Gomes", "Lopes", "Marques", "Alves", "Almeida", "Ribeiro", "Pinto", "Carvalho",
							 "Teixeira", "Moreira", "Correia", "Mendes", "Nunes", "Soares", "Vieira", "Monteiro", "Cardoso", "Rocha", 
							 "Neves", "Coelho", "Cruz", "Cunha", "Pires", "Ramos", "Reis", "Simoes", "Antunes", "Matos", "Fonseca",
                             "Machado", "Araujo", "Barbosa", "Tavares", "Lourenco", "Castro", "Figueiredo", "Azevedo", "Freitas"};

        String[] birthPlace = {"Aveiro", "Beja", "Braga", "Braganca", "Castelo Branco", "Coimbra", "Evora", "Faro", "Guarda", "Leiria",
                             "Lisboa", "Portalegre", "Porto", "Santarem", "Setubal", "Viana do Castelo", "Vila Real", "Viseu", "Funchal"};

        String nomeAux = (Math.random() > 0.5) ? (nomesMas[(int)(Math.random()*nomesMas.length)]) : (nomesFem[(int)(Math.random()*nomesFem.length)]);
        String apelidoAux = apelidos[(int)(Math.random()*apelidos.length)];
        String emailAux = nomeAux.toLowerCase() + apelidoAux.toLowerCase() + "@ua.pt";
        nomeAux = nomeAux + " " + apelidoAux;
        int ageAux = 18 + (int)Math.round(Math.random()*83);
        String passAux = nomeAux + ageAux;
        String birthPlaceAux = birthPlace[(int)(Math.random()*birthPlace.length)];
        return new Utilizador(nomeAux, emailAux, passAux, birthPlaceAux, ageAux);
    }

    @Override
	public String toString() {
		return name + " (" + email + ", " + age + ", " + district + ")";
	}
}