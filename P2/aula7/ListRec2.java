import static java.lang.System.*;
import java.io.File;

import p2utils.LinkedList;

public class ListRec2 {

  public static void main(String[] args) {
    if (args.length != 1) {
      err.println("Uso: java -ea ListRec2 <dir>");
      exit(1);
    }

    File dir = new File(args[0]);

    // Verificar entrada
    if (!dir.exists()) {
      err.printf("ERRO: %s nao existe!\n", dir);
      exit(2);
    }

    LinkedList<File> files = recListFiles(dir);
    files.print();
  }

  /** Devolve uma lista com o conteúdo de um directório f
   *  e de todos os seus subdirectórios recursivamente.
   */
  public static LinkedList<File> recListFiles(File f) {
    LinkedList<File> flist = new LinkedList<>();
    if(f.exists()){
      flist.addLast(f);
      if(f.isDirectory() && f.canRead()){
        File[] dir = f.listFiles();
        for(int i = 0; i < dir.length; i++){
          flist = flist.concatenate(recListFiles(dir[i]));
        }
      }
    }
    return flist;
  }
}
