package com.barataribeiro.gof.strategy;

/**
 * Essa classe define uma estratégia de movimentação defensiva.
 * 
 * @author Barata-Ribeiro
 */
public class ComportamentoDefensivo implements Comportamento {

  /**
   * Método responsável por implementar a estratégia de movimentação defensiva.
   */
  @Override
  public void mover() {
    System.out.println("Movendo-se defensivamente...");
  }

}
