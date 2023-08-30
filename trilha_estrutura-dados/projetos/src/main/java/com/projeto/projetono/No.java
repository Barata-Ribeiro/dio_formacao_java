package com.projeto.projetono;

public class No<T> {

  private T conteudo;
  private No<T> proximoNo;

  public No(T conteudo) {
    this.proximoNo = null;
    this.conteudo = conteudo;
  }

  // GETTERS AND SETTERS
  public T getConteudo() {
    return conteudo;
  }

  public void setConteudo(T conteudo) {
    this.conteudo = conteudo;
  }

  public No<T> getProximoNo() {
    return proximoNo;
  }

  public void setProximoNo(No<T> proximoNo) {
    this.proximoNo = proximoNo;
  }

  // TO STRING
  @Override
  public String toString() {
    return "No{" +
        "conteudo='" + conteudo + '\'' +
        '}';
  }

}
