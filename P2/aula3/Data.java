import static java.lang.System.*;
import java.util.Calendar;

public class Data {
  private int dia, mes, ano;

  /** Inicia esta data com o dia de hoje. */
  public Data() {
    // Aqui usamos a classe Calendar da biblioteca standard para obter a data atual.
    Calendar today = Calendar.getInstance();
    dia = today.get(Calendar.DAY_OF_MONTH);
    mes = today.get(Calendar.MONTH) + 1;
    ano = today.get(Calendar.YEAR);
  }

  /** Inicia a data a partir do dia, mes e ano dados. */
  public Data(int dia, int mes, int ano) {
    this.dia = dia;
    this.mes = mes;
    this.ano = ano;
    
  }

  public Data(String date){
    String[] tmp = date.split("-");
    if(dataValida(Integer.parseInt(tmp[2]), Integer.parseInt(tmp[1]), Integer.parseInt(tmp[0])) == false){
      System.exit(1);
    }
    dia = Integer.parseInt(tmp[2]);
    mes = Integer.parseInt(tmp[1]);
    ano = Integer.parseInt(tmp[0]);
  }

  /** Devolve esta data segundo a norma ISO 8601. */
  public String toString() {
    return String.format("%04d-%02d-%02d", ano, mes, dia);
  }

  /** Indica se ano é bissexto. */
  public static boolean bissexto(int ano) {
    return ano%4 == 0 && ano%100 != 0 || ano%400 == 0;
  }

  // Crie métodos para obter o dia, mes e ano da data.
  //...
  public int dia(){
    return dia;
  }
  public int mes(){
    return mes;
  }
  public int ano(){
    return ano;
  }

  /** Dimensões dos meses num ano comum. */
  private static final
  int[] diasMesComum = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

  /** Devolve o número de dias do mês dado. */
  public static int diasDoMes(int mes, int ano) {
    int number_of_days;
    if(bissexto(ano)){
      if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
        number_of_days = diasMesComum[mes-1];
      }
      else if(mes == 4 || mes == 6 || mes == 9 || mes == 11){
        number_of_days = diasMesComum[mes-1];
      }
      else{
        number_of_days = diasMesComum[mes-1]+1;
      }
    }

    else{
      if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
        number_of_days = diasMesComum[mes-1];
      }
      else if(mes == 4 || mes == 6 || mes == 9 || mes == 11){
        number_of_days = diasMesComum[mes-1];
      }
      else{
        number_of_days = diasMesComum[mes-1];
      }
    }

    return number_of_days;
  }

  private static final String[] month = {"Janeiro", "Fevereiro", "Mar\u00e7o", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
  /** Devolve o mes da data por extenso. */
  public String mesExtenso() {
    return month[mes-1];
  }


  /** Devolve esta data por extenso. */
  public String extenso() {
    String ext = dia + " de " + month[mes-1] + " de " + ano;
    return ext;
  }

  /** Indica se um terno (dia, mes, ano) forma uma data válida. */
  public static boolean dataValida(int dia, int mes, int ano) {
    boolean valid = false;
    if(bissexto(ano) && ano >= 0 && (mes > 0 && mes <= 12) && (dia > 0 && dia <= diasMesComum[mes-1]+1)){
      valid = true;
    }
    else if(bissexto(ano) == false && ano >= 0 && (mes > 0 && mes <= 12) && (dia > 0 && dia <= diasMesComum[mes-1])){
      valid = true;
    }
    else{
      valid = false;
    }
    return valid;
  }


  public void seguinte() {
    if(bissexto(ano)){
      if(month[mes-1].equals("Fevereiro") && dia == 29){
        dia = 1;
        mes += 1;
      }
      else if(dia == diasMesComum[mes-1] && !month[mes - 1].equals("Dezembro")){
        dia = 1;
        mes += 1;
      }
      else if(dia == diasMesComum[mes-1] && month[mes - 1].equals("Dezembro")){
        dia = 1;
        mes = 1;
        ano += 1;
      }
      else{
        dia += 1;
      }
    }
    else{
      if(month[mes-1].equals("Fevereiro") && dia == 28){
        dia = 1;
        mes += 1;
      }
      else if(dia == diasMesComum[mes-1] && !month[mes - 1].equals("Dezembro")){
        dia = 1;
        mes += 1;
      }
      else if(dia == diasMesComum[mes-1] && month[mes - 1].equals("Dezembro")){
        dia = 1;
        mes = 1;
        ano += 1;
      }
      else{
        dia += 1;
      }
    }
  }

  public int compareTo(Data d1){
    int comp = 1;
    //int tmp1;
    if(dia == d1.dia() && mes == d1.mes() && ano == d1.ano()){
      comp = 0;
    }
    else if(ano < d1.ano()){
      comp = -1;
    }
    else if(ano == d1.ano()){
      if(mes < d1.mes()){
        comp = -1;
      }
      else if(mes == d1.mes()){
        if(dia < d1.dia()){
          comp = -1;
        }
        else{
          comp = 1;
        }
      }
      else{
        comp = 1;
      }
    }

    else{
      comp = 1;
    }
    return comp;
  }


}

