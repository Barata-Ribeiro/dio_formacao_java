package com.barataribeiro.gof.strategy;

/**
 * Essa classe define uma estratégia de movimentação agressiva.
 * 
 * @author Barata-Ribeiro
 */
public class ComportamentoAgressivo implements Comportamento {

  /**
   * Método responsável por implementar a estratégia de movimentação agressiva.
   */
  @Override
  public void mover() {
    System.out.println("Movendo-se agressivamente...");
  }

}
