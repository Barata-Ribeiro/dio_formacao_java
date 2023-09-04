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

  public void remove(int index) {
    if (index == 0) {
      this.primeiroNo = this.primeiroNo.getNoProximo();
      if (this.primeiroNo != null) {
        this.primeiroNo.setNoAnterior(null);
      }
    } else {
      NoDuplo<T> noAuxiliar = getNo(index);
      noAuxiliar.getNoAnterior().setNoProximo(noAuxiliar.getNoProximo());
      if (noAuxiliar != this.ultimoNo) {
        noAuxiliar.getNoProximo().setNoAnterior(noAuxiliar.getNoAnterior());
      } else {
        this.ultimoNo = noAuxiliar;
      }
    }

    this.tamanhoLista -= 1;
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

  @Override
  public String toString() {
    String strRetorno = "";

    NoDuplo<T> noAuxiliar = this.primeiroNo;

    for (int i = 0; i < size(); i += 1) {
      strRetorno += "[No{conteudo=" + noAuxiliar.getConteudo() + "}] --->";
      noAuxiliar = noAuxiliar.getNoProximo();
    }

    strRetorno += "Null";

    return strRetorno;
  }

}
