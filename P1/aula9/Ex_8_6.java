import java.util.*;
import static java.lang.System.*;
public class Ex_8_6{

    static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        //y.min + Math.random() * (y.max - y.min);
        double max_temp = 0;
        double min_temp = 999999999;
        double amp_term;
        int j = 0;
        Temperatura[] t = new Temperatura[24];
        for(int i = 1; i < 6; i++){
            out.printf("\nDia %s:", i);
            do{
                out.printf("\nTemperatura as %d horas: ", j);
                t[j] = sc.nextDouble();
                if(t[j].temp > max_temp){
                    max_temp = t[j].temp;
                }
                if(t[j].temp < min_temp){
                    min_temp = t[j].temp;
                }
                j++;
            }while((max_temp <= 50 && min_temp >= -20) || j < 24);
            amp_term = max_temp - min_temp;
            out.printf("\nAmplitude termica: %f | Temp. Max: %f | Temp. Min: %f | Dia %d", amp_term, max_temp, min_temp, i);
        }

    }
}

class Temperatura{
    double temp;
}