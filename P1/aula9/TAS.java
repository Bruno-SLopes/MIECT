import java.util.*;
import static java.lang.System.*;
public class TAS{

    static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        Pessoa person1 = new Pessoa();

        out.print("\nNome:");
        person1.nome = sc.nextLine();
        out.print("\nSexo(m ou f):");
        person1.sex = sc.nextLine();
        out.print("\nPeso:");
        person1.peso = sc.nextDouble();
        out.print("\nQuantidade de bebida ingerida:");
        person1.qbi = sc.nextDouble();
        out.print("\nTeor alcoólico da bebida:");
        person1.tab = sc.nextDouble();
        out.print("\nBebeu em jejum(s ou n):");
        person1.ans = sc.next();

        double T_A_S;
        double coef;

        if(person1.ans.equals("s") && person1.sex.equals("m")){
            coef = 0.7;
            T_A_S = (0.8*person1.qbi*(person1.tab/100))/(person1.peso*coef);
            out.printf("TAS = %f | Nome: %s | Sexo: %s | Peso: %f | Quantidade de bebida ingerida: %f | Teor alcoólico da bebida: %f | Bebeu em jejum(s ou n): %s", T_A_S, person1.nome, person1.sex, person1.peso, person1.qbi, person1.tab, person1.ans);
        }
        else if(person1.ans.equals("s") && person1.sex.equals("f")){
            coef = 0.6;
            T_A_S = (0.8*person1.qbi*(person1.tab/100))/(person1.peso*coef);
            out.printf("TAS = %f | Nome: %s | Sexo: %s | Peso: %f | Quantidade de bebida ingerida: %f | Teor alcoólico da bebida: %f | Bebeu em jejum(s ou n): %s", T_A_S, person1.nome, person1.sex, person1.peso, person1.qbi, person1.tab, person1.ans);
        }
        else if(person1.ans.equals("n")){
            coef = 0.6;
            T_A_S = (0.8*person1.qbi*(person1.tab/100))/(person1.peso*coef);
            out.printf("TAS = %f | Nome: %s | Sexo: %s | Peso: %f | Quantidade de bebida ingerida: %f | Teor alcoólico da bebida: %f | Bebeu em jejum(s ou n): %s", T_A_S, person1.nome, person1.sex, person1.peso, person1.qbi, person1.tab, person1.ans);
        }
    }
}

class Pessoa{
    String nome;
    String sex;
    double peso;
    double qbi;
    double tab;
    String ans;
}