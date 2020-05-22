import java.util.*;
import static java.lang.System.*;
public class Ex_9_10{

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        Pessoa p1 = new Pessoa();

        do{
            out.print("\nNome: ");
            p1.nome = sc.nextLine();

            out.print("\nSexo(m/f): ");
            p1.sexo = sc.nextLine();

            out.print("\nIdade: ");
            p1.idade = sc.nextInt();

            out.print("\nPeso(kg): ");
            p1.peso = sc.nextDouble();

            out.print("\nAltura(m): ");
            p1.altura = sc.nextDouble();

            out.print("\n|---------------------------------------------------|");
            out.print("\n| Calculo do Indice de Massa Corporal               |");
            out.print("\n|---------------------------------------------------|");
            out.printf("\n| Nome: %-43s |", p1.nome);
            out.printf("\n| Sexo: %-43s |", p1.sexo);
            out.printf("\n| IMC: %3.1f (kg/m2)%-32s |", IMC(p1.peso, p1.altura), "");
            out.printf("\n| Nome: %-43s |", p1.nome);
            out.printf("\n| Comentario: %-37s |", relatorio(IMC(p1.peso, p1.altura), p1.nome, p1.sexo));
            out.print("\n|---------------------------------------------------|");
        }while(p1.nome.equals("") || p1.idade < 18 || (!p1.sexo.equals("m") && !p1.sexo.equals("f")) || p1.peso < 0 || p1.altura < 0);
    }

    public static double IMC(double p, double a){
        double imc;

        imc = p/(Math.pow(a, 2));

        return imc;
    }

    public static String relatorio(double i, String n, String s){
        String coment = "";
        String ret = "";

        if(s.equals("f")){
            if(i < 19.1){
                coment = "Abaixo do peso";
            }
            else if(i >= 19.1 && i <= 25.8){
                coment = "Peso ideal";
            }
            else if(i >= 25.9 && i <= 27.3){
                coment = "Pouco acima do peso";
            }
            else if(i >= 27.4 && i <= 32.3){
                coment = "Acima do peso";
            }
            else if(i >= 32.4){
                coment = "Obesidade";
            }
            ret = ret + coment;
        }
        else{
            if(i < 20.7){
                coment = "Abaixo do peso";
            }
            else if(i >= 20.7 && i <= 26.4){
                coment = "Peso ideal";
            }
            else if(i >= 26.5 && i <= 27.8){
                coment = "Pouco acima do peso";
            }
            else if(i >= 27.9 && i <= 31.1){
                coment = "Acima do peso";
            }
            else if(i >= 31.2){
                coment = "Obesidade";
            }
            ret = ret + coment;
        }
        return ret;
    }
}

class Pessoa{
    String nome, sexo;
    int idade;
    double peso, altura;
}