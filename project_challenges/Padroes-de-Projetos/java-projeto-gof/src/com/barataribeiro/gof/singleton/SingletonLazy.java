package com.barataribeiro.gof.singleton;

/**
 * Singleton "Preguiçoso"
 * 
 * @author Barata-Ribeiro
 */
public class SingletonLazy {

  private static SingletonLazy instancia;

  // Construtor privado para não ser acessado externamente
  private SingletonLazy() {
    super();
  }

  public static SingletonLazy getInstance() {
    return instancia == null ? (instancia = new SingletonLazy()) : instancia;
  }
}
