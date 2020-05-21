import java.util.*;

public class Ex_5_2{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int n;
       
        System.out.print("Diga um numero: ");
        n = sc.nextInt();
        
        System.out.printf("f(n)=1/(1+n^2) --> f(%d) = 1/(1+%d^2) = %6.2f", n, n, func(n));

        int n1, n2;

        System.out.print("\nEscolha dois numeros: ");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        System.out.printf("Entre %d e %d o maior e %d.", n1, n2, max(n1, n2));

        double a, b, c, d, x;
        System.out.print("\nCalcular polinomio grau 3");
        System.out.print("\na: ");
        a = sc.nextDouble();
        System.out.print("\nb: ");
        b = sc.nextDouble();
        System.out.print("\nc: ");
        c = sc.nextDouble();
        System.out.print("\nd: ");
        d = sc.nextDouble();
        System.out.print("\nx: ");
        x = sc.nextDouble();

        System.out.printf("f(%6.2f)=%6.2fx^3 + %6.2fx^2 + %6.2fx + %6.2f = %6.2f", x, a, b, c, d, poly3(a, b, c, d, x));

        System.out.print("\nNumero para fatorial: ");
        int f = sc.nextInt();

        System.out.printf("%d! = %d", f, fact(f));

        getIntPos("Em que ano estamos?");

        getInRange("Em que mes estamos?", 1, 12);

        printNtimes(3, "Oi");
        System.out.print("\n");
        printNtimes(2, "Vamos embora");
    }

    public static double func(int x){
        double f;

        f = 1/(1 + Math.pow(x, 2));

        return f;
    }

    public static int max(int x, int y){

        if(x > y){
            return x;
        }

        else{
            return y;
        }
    }

    public static double poly3(double ay, double be, double ce, double de, double ex){
        double f;

        f = ay*Math.pow(ex, 3) + be*Math.pow(ex, 2) + ce*ex + de;

        return f;
    }

    public static int fact(int fatorial){
        int res = 1;
        for(int i = fatorial; i >= 1; i--){
            res *= i;
            //fatorial *= i;
        }
        return res;
        //return fatorial;
    }

    public static int getIntPos(String mens){

        System.out.printf("\n%s", mens);
        int n = sc.nextInt();
        while(n < 0){
            System.out.print("Tem de ser um numero positivo.");
            System.out.printf("\n%s", mens);
            n = sc.nextInt();
        }
        return n;
    }

    public static int getInRange(String mess, int lim1, int lim2){

        int limMin = 0, limMax = 0, n;

        if(lim1 > lim2){
            limMax = lim1;
            limMin = lim2;
        }
        else if(lim2 > lim1){
            limMax = lim2;
            limMin = lim1;
        }

        System.out.printf("\n%s", mess);
        n = sc.nextInt();
        while(n > limMax || n < limMin){
            System.out.printf("Tem de introduzir '%s' pertencente ao intervalo [%d, %d] ", mess, limMin, limMax);
            System.out.printf("\n%s", mess);
            n = sc.nextInt();
        }
        return n;
    }

    public static void printNtimes(int n, String text){
        for(int i = 1; i <= n; i++){
            System.out.printf("%s", text);
        }
    }
}
