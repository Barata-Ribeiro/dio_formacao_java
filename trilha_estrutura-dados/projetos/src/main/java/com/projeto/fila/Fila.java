package com.projeto.fila;

public class Fila<T> {

  private No<T> refNoEntradaFila;

  public Fila() {
    this.refNoEntradaFila = null;
  }

  public void enqueue(T object) {
    No<T> novoNo = new No<>(object);
    novoNo.setRefNo(this.refNoEntradaFila);
    this.refNoEntradaFila = novoNo;
  }

  public T first() {
    if (!this.isEmpty()) {
      No<T> primeiroNo = this.refNoEntradaFila;
      while (true) {
        if (primeiroNo.getRefNo() != null) {
          primeiroNo = primeiroNo.getRefNo();
        } else
          break;
      }
      return (T) primeiroNo.getObject();
    }
    return null;
  }

  public T dequeue() {
    if (!this.isEmpty()) {
      No<T> primeiroNo = this.refNoEntradaFila;
      No<T> noAuxiliar = this.refNoEntradaFila;
      while (true) {
        if (primeiroNo.getRefNo() != null) {
          noAuxiliar = primeiroNo;
          primeiroNo = primeiroNo.getRefNo();
        } else {
          noAuxiliar.setRefNo(null);
          break;
        }
      }
      return (T) primeiroNo.getObject();
    }
    return null;
  }

  public boolean isEmpty() {
    return this.refNoEntradaFila == null ? true : false;
  }

  @Override
  public String toString() {
    String stringRetorno = "";
    No<T> noAuxiliar = this.refNoEntradaFila;

    if (this.refNoEntradaFila != null) {
      while (true) {
        stringRetorno += "[No{objeto=" + noAuxiliar.getObject() + "}]--->";
        if (noAuxiliar.getRefNo() != null) {
          noAuxiliar = noAuxiliar.getRefNo();
        } else {
          stringRetorno += "Null";
          break;
        }
      }
    } else
      stringRetorno = "Null";

    return stringRetorno;
  }

}
