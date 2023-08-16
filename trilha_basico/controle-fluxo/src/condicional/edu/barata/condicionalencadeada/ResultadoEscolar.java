package condicional.edu.barata.condicionalencadeada;

// ResultadoEscolar.java
public class ResultadoEscolar {
  public static void main(String[] args) {
    int nota = 6;

    if (nota >= 7) // Retorna true ou false
      System.out.println("Aprovado");
    else if (nota >= 5 && nota < 7) // Retorna true ou false
      System.out.println("Recuperação");
    else // Se for false, então executa o código abaixo
      System.out.println("Reprovado");
  }
}
