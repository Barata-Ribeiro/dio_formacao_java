package com.barataribeiro.gof.singleton;

/**
 * Singleton "Lazy Holder"
 * 
 * @see <a href="https://stackoverflow.com/a/24018148">Referência</a>
 * 
 * @author Barata-Ribeiro
 */
public class SingletonLazyHolder {

  private static class InstanceHolder {
    public static SingletonLazyHolder instancia = new SingletonLazyHolder();
  }

  // Construtor privado para não ser acessado externamente
  private SingletonLazyHolder() {
    super();
  }

  public static SingletonLazyHolder getInstance() {
    return InstanceHolder.instancia;
  }
}
