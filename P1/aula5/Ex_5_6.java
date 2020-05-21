import java.util.*;
public class Ex_5_6 {
	
	static Scanner sc = new Scanner(System.in);
	public static void main (String args[]) {
        int num, i;
        
        num = verifyValue();

        System.out.print("-------------------");
        System.out.printf("\n| Tabuada dos %3d |", num);
        System.out.print("\n-------------------");
        for(i = 1; i < 11; i++){
            System.out.printf("\n| %3d x %2d | %4d |", num, i, TabValue(num, i));
        }
        System.out.print("\n-------------------");
    }
    
    public static int verifyValue(){
        int a=0,b=100,value=0;
		do{
			System.out.print("Tabuada dos: ");
			value = sc.nextInt();
			if(value>=b||value<=a) System.out.println("Introduzir valor pertencente a ]0,100[");
		}while(value>=b||value<=a);
		return value; 
    }

    public static int TabValue(int number, int multi){
        int res;
        res = number * multi;
        return res;
    }
}