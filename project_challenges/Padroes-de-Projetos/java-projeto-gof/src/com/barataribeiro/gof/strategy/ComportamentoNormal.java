package com.barataribeiro.gof.strategy;

/**
 * Essa classe define uma estratégia de movimentação normal.
 * 
 * @author Barata-Ribeiro
 */
public class ComportamentoNormal implements Comportamento {

  /**
   * Método responsável por implementar a estratégia de movimentação normal.
   */
  @Override
  public void mover() {
    System.out.println("Movendo-se normalmente...");
  }

}
