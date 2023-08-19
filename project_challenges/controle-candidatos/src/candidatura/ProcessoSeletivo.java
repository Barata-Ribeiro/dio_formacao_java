package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
  public static void main(String[] args) {
    imprimirSelecionados();
  }

  static void imprimirSelecionados() {
    String[] candidatos = { "FELIPE", "MÁRCIA", "JULIA", "PAULO" };

    System.out.println("Imprimindo a lista de candidatos informando o índice do elemento");

    for (int indice = 0; indice < candidatos.length; indice += 1) {
      System.out.println(String.format("O candidato de nº %s é %s", (indice + 1), candidatos[indice]));
    }

    System.out.println("Utilizando a forma abreviada for each");
    for (String candidato : candidatos) {
      System.out.println(String.format("O candidato selecionado foi %s", candidato));
    }

  }

  static void selecaoCandidatos() {
    String[] candidatos = { "FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO", "MÔNICA", "FABRÍCIO", "MIRELA", "DANIELA",
        "JORGE" };

    int candidatosSelecionados = 0;
    int candidatoAtual = 0;
    double salarioBase = 2000.0;

    while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
      String candidato = candidatos[candidatoAtual];
      double salarioPretendido = valorPretendido();

      System.out
          .println(String.format("O Candidato %s solicitou este valor de salário: %.2f", candidato, salarioPretendido));
      if (salarioBase >= salarioPretendido) {
        System.out.println(String.format("O candidato %s foi selecionado.", candidato));
        candidatosSelecionados += 1;
      }
      candidatoAtual += 1;
    }
  }

  static double valorPretendido() {
    double valor = ThreadLocalRandom.current().nextDouble(1800, 2200);
    return Math.round(valor * 100.0) / 100.0;
  }

  static void analisarCandidato(double salarioPretendido) {
    double salarioBase = 2000.0;
    if (salarioBase > salarioPretendido) {
      System.out.println("Ligar para o candidato");
    } else if (salarioBase == salarioPretendido) {
      System.out.println("Ligar para o candidato com contra proposta");
    } else {
      System.out.println("Aguardando o resultado dos demais candidatos");
    }
  }
}
