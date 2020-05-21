import java.util.*;

public class Ex_4_5 {
	static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) {
		int a, b, c, cont=0;
		System.out.print("A: ");
		a = sc.nextInt();
		System.out.print("B: ");
		b = sc.nextInt();
		double hip=0;
		if(a<b){
			hip=Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
		}

		for(int i = a; i < 100; i++){
			for(int j = b; j < 100; j++){
					hip=0;
					if(a<b){
						hip=Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
					}
					if((c==(int)c)&&c!=0){ //verifica se c é inteiro. em caso positivo escreve os valores de a,b e c
						System.out.printf("%d	%d	%d\n",(int)a,(int)b,(int)c);
						b++;
						cont++;
					}
					else{
						b++;
					}
			}
			j = 1;
		}
	}
}
//NOT WORKING WELL