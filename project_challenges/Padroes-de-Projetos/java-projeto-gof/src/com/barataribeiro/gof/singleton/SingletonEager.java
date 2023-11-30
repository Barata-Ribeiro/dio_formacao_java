package com.barataribeiro.gof.singleton;

/**
 * Singleton "Apressado"
 * 
 * @author Barata-Ribeiro
 */
public class SingletonEager {

  private static SingletonEager instancia = new SingletonEager();

  // Construtor privado para não ser acessado externamente
  private SingletonEager() {
    super();
  }

  public static SingletonEager getInstance() {
    return instancia;
  }
}
