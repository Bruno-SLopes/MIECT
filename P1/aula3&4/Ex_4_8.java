import java.util.*;

public class Ex_4_8{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int a, b;

        System.out.print("Minimo positivo do intervalo: ");
        a = sc.nextInt();

        System.out.print("Maximo positivo do intervalo: ");
        b = sc.nextInt();
        System.out.printf("[%d]", a);
        for(int i = a + 1; i < b; i++){
            if(i % 2 != 0){
                System.out.printf(" %d ", i);
            }
        }
        System.out.printf("[%d] ", b);
        System.out.println("\n +\"\"\"\"\"+ ");
        System.out.println("[| o o |]");
        System.out.println(" |  ^  | ");
        System.out.println(" | '-' | ");
        System.out.println(" +-----+ ");
    }
}