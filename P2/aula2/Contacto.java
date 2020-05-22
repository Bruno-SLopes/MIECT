public class Contacto {
  private String nome;
  private String telefone;
  private String mail;

  public Contacto(String name, String phone_n, String email){
    nome = name;
    telefone = phone_n;
    mail = email;
  }

  public Contacto(String name, String phone_n){
    nome = name;
    telefone = phone_n;
  }

  public String nome(){
    return nome;
  }

  public String telefone(){
    return telefone;
  }

  public String eMail(){
    return mail;
  }
}
