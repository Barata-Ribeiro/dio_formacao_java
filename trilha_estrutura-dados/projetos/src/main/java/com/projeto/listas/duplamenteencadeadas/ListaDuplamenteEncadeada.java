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

  public void add(T elemento) {
    NoDuplo<T> novoNo = new NoDuplo<>(elemento);
    novoNo.setNoProximo(null);
    novoNo.setNoAnterior(this.ultimoNo);

    if (this.primeiroNo == null)
      this.primeiroNo = novoNo;
    if (this.ultimoNo != null)
      this.ultimoNo.setNoProximo(novoNo);

    this.ultimoNo = novoNo;
    this.tamanhoLista += 1;
  }

  public void add(int index, T elemento) {
    NoDuplo<T> noAuxiliar = getNo(index);
    NoDuplo<T> novoNo = new NoDuplo<>(elemento);

    novoNo.setNoProximo(noAuxiliar);

    if (novoNo.getNoProximo() != null) {
      novoNo.setNoAnterior(noAuxiliar.getNoAnterior());
      novoNo.getNoProximo().setNoAnterior(novoNo);
    } else {
      novoNo.setNoAnterior(this.ultimoNo);
      this.ultimoNo = novoNo;
    }

    if (index == 0)
      this.primeiroNo = novoNo;
    else
      novoNo.getNoAnterior().setNoProximo(novoNo);

    tamanhoLista += 1;
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
