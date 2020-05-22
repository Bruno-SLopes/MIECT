import static java.lang.System.*;

public class ReverseString{

    public static void main(String[] args) {
        for(int i = 0; i < args.length; i++){
            out.printf("\"%s\"->\"%s\"\n", args[i], reverseString(args[i]));
        }
    }

    public static String reverseString(String array){
       String str = "";
       if(array.length() > 0){
        str = reverseString(array.substring(1)) + array.charAt(0);
       }
       return str;
    }
}