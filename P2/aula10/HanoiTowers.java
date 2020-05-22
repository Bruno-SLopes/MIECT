import static java.lang.System.*;
import java.util.Scanner;
import p2utils.Stack;

public class HanoiTowers<E>
{
  private int num_disks;
  private int moves;
  private Stack<Integer> t1 = new Stack<Integer>();
  private Stack<Integer> t2 = new Stack<Integer>();
  private Stack<Integer> t3 = new Stack<Integer>();
  public HanoiTowers(int n){
    for(int i = n; i > 0; i--){
      t1.push(i);
    }
    this.num_disks = n;
    this.moves = 0;
  }

  public void printInfo(){
    out.printf("After %d moves:\n", moves);
    out.println("A: "+ t1.toString());
    out.println("B: "+ t2.toString());
    out.println("C: "+ t3.toString() + "\n");
  }

  public void solve(){
    out.println();
    printInfo();
    moveDisks(this.num_disks, t1, t3, t2);
  }

  public void moveDisks(int n, Stack<Integer> origem, Stack<Integer> destino, Stack<Integer> auxiliar){
    assert n >= 0;

    if(n > 0){
      moveDisks(n-1, origem, auxiliar, destino);

      destino.push(origem.top());
      origem.pop();

      moves++;
      printInfo();

      moveDisks(n-1, auxiliar, destino, origem);
    }
  }

  public int numberOfMoves(){
    return moves;
  }
}
