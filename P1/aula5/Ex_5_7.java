import java.util.*;
public class Ex_5_7 {
	
	static Scanner sc = new Scanner(System.in);
	public static void main (String args[]) {
        int n1,n2;
		System.out.printf("N1: ");
		n1 = sc.nextInt();
		System.out.printf("N2: ");
        n2 = sc.nextInt();
        if(n1 > n2){
            System.out.print(bigComDiv(n1, n2));
        }
        else if(n1 == n2){
            System.out.print("Numeros nao podem ser iguais");
        }
        else{
            System.out.print(bigComDiv(n1, n2));
        }
    }
    public static int bigComDiv(int x, int y){
        int maDivCom, mdc;
        if(x>y){
			maDivCom=x%y;
			while(maDivCom!=0){
				x=y;
				y=maDivCom;
				maDivCom=x%y;
			}
			mdc=y;
			return mdc;
		}
        else{
			maDivCom=y%x;
			while(maDivCom!=0){
				y=x;
				x=maDivCom;
				maDivCom=y%x;
			}
			mdc=x;
			return mdc;
		}
    }
}