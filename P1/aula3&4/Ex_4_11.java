import java.util.*;

public class Ex_4_11{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        
        for(int i = 8; i >= 1; i--){
            for(int j = 0; j <= 7; j++){
                char letra = (char)('a'+j);
                System.out.printf("%c%d ", letra, i);
            }
            System.out.printf("\n");
        }
    }
}