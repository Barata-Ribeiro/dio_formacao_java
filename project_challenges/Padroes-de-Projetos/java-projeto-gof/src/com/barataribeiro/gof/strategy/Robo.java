package com.barataribeiro.gof.strategy;

/**
 * Classe responsável por representar um robô.
 * 
 * @author Barata-Ribeiro
 */
public class Robo {
  /**
   * Atributo que armazena a estratégia de movimentação do robô.
   */
  private Comportamento comportamento;

  /**
   * Método responsável por definir a estratégia de movimentação do robô.
   * 
   * @param comportamento A estratégia de movimentação a ser atribuída ao robô.
   */
  public void setComportamento(Comportamento comportamento) {
    this.comportamento = comportamento;
  }

  /**
   * Método responsável por chamar a estratégia de movimentação atualmente
   * atribuída ao robô.
   */
  public void mover() {
    comportamento.mover();
  }
}
