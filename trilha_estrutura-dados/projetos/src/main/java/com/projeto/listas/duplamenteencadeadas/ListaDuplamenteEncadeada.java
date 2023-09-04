package com.projeto.listas.duplamenteencadeadas;

public class ListaDuplamenteEncadeada<T> {

  private NoDuplo<T> primeiroNo;
  private NoDuplo<T> ultimoNo;

  private int tamanhoLista;

  public ListaDuplamenteEncadeada() {
    this.primeiroNo = null;
    this.ultimoNo = null;
    this.tamanhoLista = 0;
  }

  public T get(int index) {
    return this.getNo(index).getConteudo();
  }

  private NoDuplo<T> getNo(int index) {
    NoDuplo<T> noAuxiliar = this.primeiroNo;

    for (int i = 0; (i < index) && (noAuxiliar != null); i += 1) {
      noAuxiliar = noAuxiliar.getNoProximo();
    }

    return noAuxiliar;
  }

  public int size() {
    return this.tamanhoLista;
  }

}
