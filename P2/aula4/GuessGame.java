import static java.lang.System.*;
import java.util.Random;
public class GuessGame {

  private int secretNumber; // to hold the secret
  private int min;
  private int max;
  private int attempt;
  private int numero_j = 0;
  //...

  public GuessGame(int min, int max) {
    this.min = min;
    this.max = max;
    secretNumber = new Random().nextInt((max - min) + 1) + min;
  }

  public int min() {
    return min;
  }

  public int max() {
    return max;
  }

  public boolean validAttempt(int n) {
    attempt = n;
    if(n >= min && n <= max) return true;
    else return false;
  }

  public boolean finished() {
    if(attempt == secretNumber) return true;
    else return false;
  }

  public boolean attemptIsHigher() {
    //assert validAttempt(attempt):"A tentativa nao e valida.";
    if(attempt > secretNumber) return true;
    else return false;
  }

  public boolean attemptIsLower() {
    //assert validAttempt(attempt):"A tentativa nao e valida.";
    if(attempt < secretNumber) return true;
    else return false;
  }

  public void play(int n) {
    assert !finished():"O jogo ja terminou.";
    if(n != secretNumber){
      numero_j++;
    }
  }

  public int numAttempts() {
    int tents = numero_j;
    return tents;
  }

  /**
   * Simple tests of the GuessGame class.
   * This method tests the functionality of the GuessGame class.
   * It should be used by the programmer to test and debug the class.
   * It is not meant to be called in client programs.
   *
   * To run from the command line, use:
   *   java -ea GuessGame
   */
  public static void main(String[] args) {
    requireEA();
    out.println("Starting tests.");
    GuessGame game = new GuessGame(1, 10);
    // initial tests:
    assert !game.finished() : "game should not be finished yet";
    assert game.min() == 1;
    assert game.max() == 10;
    assert game.numAttempts() == 0 : "there should be no attempts yet";
    for(int i = -10; i <= 20; i++) {
      assert game.validAttempt(i) == (i >= 1 && i <= 10);
    }
    // trying all wrong answers:
    int nplay = 0; // how may times play was called
    for(int n = 1; n <= 10; n++) {
      if (n != game.secretNumber) {
        game.play(n); // make a wrong guess
        nplay++;
        assert game.numAttempts() == nplay;
        assert !game.finished() : "game should not be finished yet";
        assert (n < game.secretNumber) == game.attemptIsLower();
        assert (n > game.secretNumber) == game.attemptIsHigher();
      }
    }
    // make the right guess:
    game.play(game.secretNumber);
    nplay++;
    assert game.finished() : "game should be finished now";
    assert game.numAttempts() == nplay;
    out.println("No error detected!");
  }

  /** Check if program is being run with -ea, exit if not. */
  static void requireEA() {
    boolean ea = false;
    assert ea = true; // assert with a side-effect, on purpose!
    if (!ea) {
      err.println("This program must be run with -ea!");
      exit(1);
    }
  }

}

