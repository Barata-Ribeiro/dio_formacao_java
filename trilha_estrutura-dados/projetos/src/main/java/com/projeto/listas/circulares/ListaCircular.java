package com.projeto.listas.circulares;

public class ListaCircular<T> {

  private No<T> cabeca;
  private No<T> cauda;
  private int tamanhoLista;

  public boolean isEmpty() {
    return this.tamanhoLista == 0 ? true : false;
  }

  public int size() {
    return this.tamanhoLista;
  }

}
