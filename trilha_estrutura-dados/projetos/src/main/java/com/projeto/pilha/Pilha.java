package com.projeto.pilha;

public class Pilha {

  private No refNoEntradaPilha;

  public Pilha() {
    this.refNoEntradaPilha = null;
  }

  public void push(No novoNo) {
    No refAuxiliar = refNoEntradaPilha;
    refNoEntradaPilha = novoNo;
    refNoEntradaPilha.setRefNo(refAuxiliar);
  }

  public No pop() {
    if (!this.isEmpty()) {
      No notPopped = refNoEntradaPilha;
      refNoEntradaPilha = refNoEntradaPilha.getRefNo();
      return notPopped;
    }

    return null;
  }

  public No top() {
    return refNoEntradaPilha;
  }

  public boolean isEmpty() {
    return refNoEntradaPilha == null ? true : false;
  }

}
