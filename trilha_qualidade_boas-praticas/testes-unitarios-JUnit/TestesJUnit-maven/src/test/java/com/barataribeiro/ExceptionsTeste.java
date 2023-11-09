package com.barataribeiro;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionsTeste {

  @Test
  void validarCenarioDeExcecaoNaTransferencia() {
    Conta contaOrigem = new Conta("2348798-7234", 0);
    Conta contaDestino = new Conta("1293085-0928", 500);

    TransferenciaEntreContas transferenciaEntreContas = new TransferenciaEntreContas();

    Assertions.assertDoesNotThrow(() -> transferenciaEntreContas.transferir(contaOrigem, contaDestino, 20));
  }
}
