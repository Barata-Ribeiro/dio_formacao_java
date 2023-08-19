/**
 * Pacote de desafio relacionado ao controle de fluxo.
 */
package desafio;

/**
 * Classe de exceção que representa uma situação em que os parâmetros fornecidos
 * são inválidos.
 */
public class ParametrosInvalidosException extends Exception {

  /**
   * Construtor da classe de exceção que define uma mensagem padrão.
   */
  public ParametrosInvalidosException() {
    super("O segundo parâmetro deve ser maior que o primeiro.");
  }
}
