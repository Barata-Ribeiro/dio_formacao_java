package edu.barata.condicaoternaria;

// Cenário 1
public class ResultadoEscolarCenarioUm {
  public static void main(String[] args) {
    int nota = 7;
    String resultado = nota >= 7 ? "Aprovado" : "Reprovado";
    System.out.println(resultado);
  }
}
