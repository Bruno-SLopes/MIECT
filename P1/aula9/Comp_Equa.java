import java.util.*;
import static java.lang.System.*;
public class Comp_Equa{

    static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        Complex ponto1 = new Complex();
        Complex ponto2 = new Complex();
        char operation;

        do {
            out.print("\nOperacao: ");
            operation = sc.next().charAt(0);

            out.print("\nIntroduza um numero complexo: ");
            out.print("\nParte real:");
            ponto1.real = sc.nextDouble();
            out.print("\nParte imag:");
            ponto1.imag = sc.nextDouble();

            out.print("\nIntroduza um numero complexo: ");
            out.print("\nParte real:");
            ponto2.real = sc.nextDouble();
            out.print("\nParte imag:");
            ponto2.imag = sc.nextDouble();

            doComplex(ponto1.real, ponto1.imag, ponto2.real, ponto2.imag, operation);
            
        }while(operation != '=' && (operation == '+' || operation == '-' || operation == '*' || operation == '/'));
    }

    public static void doComplex(double p1r, double p1i, double p2r, double p2i, char op){
        double conta_r, conta_i;

        if(op == '+'){
            conta_r = p1r + p2r;
            conta_i = p1i + p2i;
            out.printf("\n"+p1r+"+"+p1i+"i %c "+p2r+"+"+p2i+"i = "+conta_r+"+"+conta_i+"i", op);
        }
        else if(op == '-'){
            conta_r = p1r - p2r;
            conta_i = p1i - p2i;
            out.printf("\n"+p1r+"+"+p1i+"i %c "+p2r+"+"+p2i+"i = "+conta_r+""+conta_i+"i", op);
        }
        else if(op == '*'){
            conta_r = p1r*p2r - p1i*p2i;
            conta_i = p1i*p2r + p1r*p2i;
            out.printf("\n("+p1r+"+"+p1i+"i) %c ("+p2r+"+"+p2i+"i) = ("+conta_r+")+("+conta_i+")i", op);
            
        }
        else if(op == '/'){
            conta_r = (p1r*p2r +p1i*p2i)/(Math.pow(p2r, 2)+Math.pow(p2i, 2));
            conta_i = (p1i*p2r +p1r*p2i)/(Math.pow(p2r, 2)+Math.pow(p2i, 2));
            out.printf("\n("+p1r+"+"+p1i+"i) %c ("+p2r+"+"+p2i+"i) = ("+conta_r+")+("+conta_i+")i", op);
        }
    }
}

class Complex{
    double real;
    double imag;
}