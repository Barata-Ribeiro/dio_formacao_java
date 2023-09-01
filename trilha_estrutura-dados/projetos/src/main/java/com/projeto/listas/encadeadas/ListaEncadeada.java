package com.projeto.listas.encadeadas;

public class ListaEncadeada<T> {

  No<T> referenciaEntrada;

  public ListaEncadeada() {
    this.referenciaEntrada = null;
  }

  public void add(T conteudo) {
    No<T> novoNo = new No<T>(conteudo);

    if (this.isEmpty()) {
      this.referenciaEntrada = novoNo;
      return;
    }

    No<T> noAuxiliar = this.referenciaEntrada;
    for (int i = 0; i < size() - 1; i += 1) {
      noAuxiliar = noAuxiliar.getProximoNo();
    }

    noAuxiliar.setProximoNo(novoNo);
  }

  public T get(int index) {
    return this.getNo(index).getConteudo();
  }

  private No<T> getNo(int index) {

    validaIndice(index);

    No<T> noAuxiliar = this.referenciaEntrada;
    No<T> noRetorno = null;

    for (int i = 0; i <= index; i += 1) {
      noRetorno = noAuxiliar;
      noAuxiliar = noAuxiliar.getProximoNo();
    }

    return noRetorno;
  }

  public T remove(int index) {
    No<T> noPivot = this.getNo(index);
    if (index == 0) {
      this.referenciaEntrada = noPivot.getProximoNo();
      return noPivot.getConteudo();
    }

    No<T> noAnterior = getNo(index - 1);
    noAnterior.setProximoNo(noPivot.getProximoNo());

    return noPivot.getConteudo();
  }

  public int size() {
    int tamanhoLista = 0;

    No<T> referenciaAux = this.referenciaEntrada;
    while (true) {

      if (referenciaAux != null) {
        tamanhoLista += 1;

        if (referenciaAux.getProximoNo() != null) {
          referenciaAux = referenciaAux.getProximoNo();
        } else
          break;

      } else
        break;
    }

    return tamanhoLista;
  }

  private void validaIndice(int index) {
    if (index >= size()) {
      int ultimoIndice = this.size() - 1;
      throw new IndexOutOfBoundsException("Não existe conteúdo no índice " + index
          + " desta lista. Esta lista só vai até o índice " + ultimoIndice + ".");
    }
  }

  public boolean isEmpty() {
    return this.referenciaEntrada == null ? true : false;
  }

  @Override
  public String toString() {
    String strRetorno = "";

    No<T> noAuxiliar = this.referenciaEntrada;
    for (int i = 0; i < this.size(); i += 1) {
      strRetorno += "[No{ conteudo=" + noAuxiliar.getConteudo() + "}] --->";
      noAuxiliar = noAuxiliar.getProximoNo();
    }

    strRetorno += "NULL";

    return strRetorno;
  }

}
