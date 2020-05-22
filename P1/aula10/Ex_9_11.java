import java.util.*;
import static java.lang.System.*;
public class Ex_9_11{

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        String nome, ans;
        int mod, s_horas, fam, mens;

        do{
            out.print("\nNome: ");
            nome = sc.next();
    
            out.print("\nModalidade a frequentar(1-Iniciacao    2-Aperfeicoamento): ");
            mod = sc.nextInt();
    
            out.print("\nNumero de horas semanais de pratica: ");
            s_horas = sc.nextInt();
    
            out.print("\nNumero de familiares a frequentar o clube(0 se nao tiver nenhum): ");
            fam = sc.nextInt();
    
            out.print("\nPrimeira vez a frequentar o clube(S/N ou s/n): ");
            ans = sc.next();
    
            out.print("\nQuantas mensalidades quer pagar: ");
            mens = sc.nextInt();

            //insc_Value(ans);
            //mensalidade(mod, fam, s_horas);

            out.print("\nNova Inscricao para o Clube de Natacao");
            out.printf("\nNome: %s", nome);
            if(ans.equals("S") || ans.equals("s")){
                out.print("\nPrimeira Vez");
            }
            else{
                out.print("\nNao E Primeira Vez");
            }
            if(mod == 1){
                out.printf("\n%d horas de iniciacao", s_horas);
            }
            else{
                out.printf("\n%d horas de aperfeicoamento", s_horas);
            }
            if(fam == 1){
                out.printf("\n%d Familiar", fam);
            }
            else{
                out.printf("\n%d Familiares", fam);
            }
            double total = insc_Value(ans) + mens*mensalidade(mod, fam, s_horas);
            out.print("\n---------------------------------------------------");
            out.print("\nItem                 Quantidade               Valor");
            out.printf("\nInscricao                     1 %19.2f", insc_Value(ans));
            out.printf("\nMensalidade %19d %19.2f", mens, mens*mensalidade(mod, fam, s_horas));
            out.print("\n---------------------------------------------------");
            out.printf("\nTotal %45.2f", total);
        }while(!nome.equals("") || mod == 1 || mod == 2 || s_horas > 0 || fam >= 0 || ans.equals("S") || ans.equals("s") || ans.equals("N") || ans.equals("n") || mens > 0);
    }

    public static double insc_Value(String s){
        if(s.equals("S") || s.equals("s")){
            return 50;
        }
        else{
            return 30;
        }
    }

    public static double mensalidade(int m, int f, int s_h){
        double men = 0;

        if(f == 0){
            if(m == 1){
                men = men + (4*(4 * s_h));
            }

            else{
                men = men + (4*(6 * s_h));
            }
            return men;
        }

        else if(f == 1){
            if(m == 1){
                men = men + (4*(4 * s_h)) - (0.1*(4*(4 * s_h)));
            }

            else{
                men = men + (4*(6 * s_h)) - (0.1*(4*(6 * s_h)));
            }
            return men;
        }

        else{
            if(m == 1){
                men = men + (4*(4 * s_h)) - (0.25*(4*(4 * s_h)));
            }

            else{
                men = men + (4*(6 * s_h)) - (0.25*(4*(6 * s_h)));
            }
            return men;
        }
    }
}