import java.util.*;

public class Ex_4_7{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int height, large;
        System.out.print("Altura:");
        height = sc.nextInt();
        System.out.print("\nLargura: ");
        large = sc.nextInt();
        for(int i = 1; i <= height; i++){
            System.out.print("\n*");
            if(i == 1 && i == height){
                for(int j = 1; j < large; j++){
                    System.out.print("*");

                    if(j == large-1){
                        for(int h = 1; h <= height; h++){
                            System.out.print("\n*"); 
                        }
                    }
                }
            }
        }
    }
}
//NOT WORKING AS WELL