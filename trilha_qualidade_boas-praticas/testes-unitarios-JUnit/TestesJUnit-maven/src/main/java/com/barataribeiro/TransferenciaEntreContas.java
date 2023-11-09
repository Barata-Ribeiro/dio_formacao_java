package com.barataribeiro;

public class TransferenciaEntreContas {
  public void transferir(Conta contaOrigem, Conta contaDestino, int valor) {
    if (valor <= 0)
      throw new IllegalArgumentException("Valor deve ser maior que 0.");

    if (contaOrigem.getSaldo() < valor)
      throw new IllegalArgumentException("Saldo insuficiente para transferência.");
  }
}
