package com.projeto.fila;

public class Fila {

  private No refNoEntradaFila;

  public Fila() {
    this.refNoEntradaFila = null;
  }

  public void enqueue(No novoNo) {
    novoNo.setRefNo(this.refNoEntradaFila);
    this.refNoEntradaFila = novoNo;
  }

  public No first() {
    if (!this.isEmpty()) {
      No primeiroNo = this.refNoEntradaFila;
      while (true) {
        if (primeiroNo.getRefNo() != null) {
          primeiroNo = primeiroNo.getRefNo();
        } else
          break;
      }
    }
    return null;
  }

  public No dequeue() {
    if (!this.isEmpty()) {
      No primeiroNo = this.refNoEntradaFila;
      No noAuxiliar = this.refNoEntradaFila;
      while (true) {
        if (primeiroNo.getRefNo() != null) {
          noAuxiliar = primeiroNo;
          primeiroNo = primeiroNo.getRefNo();
        } else {
          noAuxiliar.setRefNo(null);
          break;
        }
      }
      return primeiroNo;
    }
    return null;
  }

  public boolean isEmpty() {
    return this.refNoEntradaFila == null ? true : false;
  }

  @Override
  public String toString() {
    String stringRetorno = "";
    No noAuxiliar = this.refNoEntradaFila;

    if (this.refNoEntradaFila != null) {
      while (true) {
        stringRetorno += "[No{objeto=" + noAuxiliar.getObject() + "}]--->";
        if (noAuxiliar.getRefNo() != null) {
          noAuxiliar = noAuxiliar.getRefNo();
        } else {
          stringRetorno = "Null";
          break;
        }
      }
    } else
      stringRetorno = "Null";

    return stringRetorno;
  }

}
