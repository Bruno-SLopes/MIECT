import static java.lang.System.*;
import java.io.*;
import java.util.Scanner;

public class SortInts
{
  public static void main(String[] args) throws IOException {
    if(args.length == 0){
      out.println("Usage: java -ea SortInts file1 ...");
    }

    SortedListInt numbers = new SortedListInt();
    File f;

    for(String s: args){
      f = new File(s);
      assert f.isFile();
      numbers = insertNumber(numbers, new Scanner(f));
      assert numbers.isSorted();
    }
  }

  static SortedListInt insertNumber(SortedListInt numbers, Scanner read){
    if(!read.hasNext()){
      return numbers;
    }
    try{
      int elem = Integer.parseInt(read.nextLine());
      numbers.insert(elem);
    }catch(NumberFormatException e){

    }
    return insertNumber(numbers, read);
  }
}


