package number;

/**
 * Tipo de dados representando uma fracção.
 * Nesta versão pretende-se garantir um invariante (interno) mais forte:
 * as frações armazenadas devem ter sempre denominador positivo.
 * Isto permite simplificar alguns métodos.
 *
 * AVISO: Vários métodos podem dar erros devidos a overflow.
 * (Não deve haver problemas com numeradores e denominadores até 46430.)
 *
 * @author João Manuel Rodrigues
 * 2007--2018
 */

public class Fraction implements Comparable<Fraction>
{
  private int num;
  private int den;
  public static Fraction ZERO = new Fraction(0, 1);
  public static Fraction ONE = new Fraction(1, 1);

  /** Cria uma nova fracção a partir de um par (numerador, denominador).
   *  @param num numerador da nova fracção.
   *  @param den denominador da nova fracção.
   *  <b>Exige (pré-condição):</b> den != 0.
   */
  public Fraction(int num, int den) {
    assert den != 0; // check precondition
    if(den < 0){
      this.num = -num;
      this.den = -den;
    }
    else{
      this.num = num;
      this.den = den;
    }
    //System.out.print(den);
    assert invariant(); // check object invariant
  }

  /* Testa o invariante do objeto.
   * Ou seja, a propriedade que define a validade de uma fração.
   * É para testar em asserções nos métodos.
   */
  public boolean invariant() {
    return den > 0;   // O denominador não pode ser nulo!
  }

  /** Converte uma string numa fracção.
   *  @param str String no formato {@code "inteiro/inteiro"}
   *             representando uma fracção válida.
   *  @return fracção correspondente a {@code str}.
   */
  public static Fraction parseFraction(String str) {
    String[] p = str.split("/", 2);  // divide a string em até 2 partes
    int n = Integer.parseInt(p[0]);  // extrai numerador
    int d = (p.length==2)? Integer.parseInt(p[1]) : 1;
        // se tem 2 partes, extrai denominador, senão fica d=1
    if (d == 0) return null;
    return new Fraction(n, d);
  }

  /** Converte a fracção numa string.
   *  @return string com a representação desta fracção.
   */
  public String toString() {
    // Com um invariante mais forte, podemos simplificar este método!
    String s = num + "/" + den;
    /*if (den > 0)
      s = num + "/" + den;
    else
      s = (-num) + "/" + (-den);*/
    return s;
  }

  /** Devolve o numerador da fracção.
   *  @return numerador desta fração.
   */
  public int num() { return num; }

  /** Devolve o denominador da fracção.
   *  @return denominador desta fração.
   */
  public int den() { return den; }

  /** Multiplica esta fracção por outra (this * b).
   *  @param b multiplicando.
   *  @return fracção produto de this * b.
   */
  public Fraction multiply(Fraction b) {
    int n = num*b.num;
    int d = den*b.den;
    Fraction p = new Fraction(n, d); // product
    return p;
  }

  /** Adiciona esta fracção com outra (this + b).
   *  @param b fracção a adicionar a esta.
   *  @return fracção soma de this + b.
   */
  public Fraction add(Fraction b) {
    int n = num*b.den + den*b.num;
    int d = den*b.den;
    Fraction s = new Fraction(n, d); // sum
    return s;
  }

  public Fraction divide(Fraction b) {
    assert (num != 0):"Denominador tem de ser maior que zero.";
    int n = num*b.den;
    int d = den*b.num;
    Fraction fra = new Fraction(n, d);
    int multi = fra.multiply(b).den()/this.den;
    Fraction help = new Fraction(multi, multi);
    assert (fra.multiply(b).equals(this.multiply(help))):"Nao cumpre com lei matematica.";
    return fra;
  }

  public Fraction subtract(Fraction b) {
    int n;
    int d;
    if(den == b.den()){
      n = num - b.num();
      d = den;
    }
    else{
      n = num*b.den() - den*b.num();
      d = den*b.den();
    }
    int dif = num - b.num();
    assert (num == dif + b.num()):"Nao cumpre com lei matematica.";
    Fraction s = new Fraction(n, d);
    return s;
  }

  public boolean equals(Fraction b) {
    boolean answer = false;
    if(num == b.num() && den == b.den()) answer = true;
    else{
      int num_a = num * b.den();
      int den_a = den * b.den();
      int num_b = b.num() * den;
      int den_b = b.den() * den;
      if(num_a == num_b && den_a == den_b) answer = true;
      else answer = false;
    }
    return answer;
  }

  public int compareTo(Fraction b) {
    int resultado = 0;
    if(num == b.num() && den == b.den()) resultado = 0;
    else{
      int num_a = num * b.den();
      int den_a = den * b.den();
      int num_b = b.num() * den;
      int den_b = b.den() * den;
      if(num_a == num_b && den_a == den_b) resultado = 0;
      else{
        if(den_a == den_b && num_a > num_b){
          resultado = 1;
        }
        else{
          resultado = -1;
        }
      }
    }
    return resultado;
  }

  /*public int mdc (int dividendo, int divisor){
    if ((dividendo % divisor == 0 )){
        return divisor;
    }
    else{
    return mdc(divisor,(dividendo % divisor));
    } 
  }*/
}
