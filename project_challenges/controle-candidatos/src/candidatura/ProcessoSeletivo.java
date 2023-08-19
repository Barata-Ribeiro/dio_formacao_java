package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
  public static void main(String[] args) {
    selecaoCandidatos();
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
