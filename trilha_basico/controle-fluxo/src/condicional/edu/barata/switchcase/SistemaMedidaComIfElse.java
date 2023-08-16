package condicional.edu.barata.switchcase;

// Modo condicional if/else
public class SistemaMedidaComIfElse {
  public static void main(String[] args) {
    String sigla = "G";

    if (sigla == "P")
      System.out.println("PEQUENO");
    else if (sigla == "M")
      System.out.println("MÉDIO");
    else if (sigla == "G")
      System.out.println("GRANDE");
    else
      System.out.println("INDEFINIDO");

  }
}
