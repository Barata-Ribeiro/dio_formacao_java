/**
 * Pacote de desafio relacionado ao controle de fluxo.
 */
package desafio;

import java.util.Scanner;

/**
 * Classe Contador responsável por obter dois números inteiros do usuário
 * e imprimir os números incrementados entre os valores informados.
 */
public class Contador {

  /**
   * Método principal que executa o programa.
   *
   * @param args Argumentos da linha de comando (não utilizados aqui).
   */
  public static void main(String[] args) {
    Scanner terminal = new Scanner(System.in);

    System.out.println("Digite o primeiro parâmetro");
    int parametroUm = terminal.nextInt();

    System.out.println("Digite o segundo parâmetro");
    int parametroDois = terminal.nextInt();

    try {
      // chamando o método contendo a lógica de contagem
      contar(parametroUm, parametroDois);
    } catch (ParametrosInvalidosException e) {
      // imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
      System.out.println(e.getMessage());
    } finally {
      terminal.close();
    }
  }

  /**
   * Método que realiza a contagem e impressão dos números entre os parâmetros
   * informados. Se o primeiro parâmetro for maior que o segundo, uma exceção será
   * lançada.
   *
   * @param parametroUm   O número inicial para a contagem.
   * @param parametroDois O número final para a contagem.
   * @throws ParametrosInvalidosException Se o primeiro número for maior que o
   *                                      segundo.
   */
  static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
    // validar se parametroUm é MAIOR que parametroDois e lançar a exceção
    if (parametroUm > parametroDois) {
      throw new ParametrosInvalidosException();
    }

    System.out.println(String.format("Contando de %s até %s", parametroUm, parametroDois));

    // realizar o for para imprimir os números com base nos parâmetros fornecidos
    for (int i = parametroUm; i <= parametroDois; i += 1) {
      System.out.println("Imprimindo o número " + i);
    }
  }
}
