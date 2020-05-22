import java.util.*;
import static java.lang.System.*;
public class p11{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        double n1, n2, res = 0;
        String op;

        out.print("Operacao? ");
        n1 = sc.nextDouble();
        //out.println(n1);
        op = sc.next();
        //out.println(op);
        /*if(op.length() > 1){
            System.err("Adicione apenas um operador");
        }*/
        n2 = sc.nextDouble();
        //out.println(n2);

        if(op.length() == 1 && (op.equals("+") || op.equals("-") || op.equals("/") || op.equals("*"))){
            if(op.equals("+")){
                res = n1 + n2;
            }
            if(op.equals("-")){
                res = n1 - n2;
            }
            if(op.equals("*")){
                res = n1 * n2;
            }
            if(op.equals("/")){
                res = n1 / n2;
            }
            out.print("\nResultado -> ");
            out.print(res);
        }

        else{
            System.err.println("Adicione apenas um operador");
        }
    }
}
