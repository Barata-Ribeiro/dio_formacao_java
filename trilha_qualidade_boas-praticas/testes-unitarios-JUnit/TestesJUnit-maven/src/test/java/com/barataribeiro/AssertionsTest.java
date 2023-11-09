package com.barataribeiro;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

public class AssertionsTest {
  @Test
  void validarLancamentos() {
    int[] primeiroLancamento = { 10, 20, 30, 40, 50 };
    int[] segundoLancamento = { 10, 5, 2, 3, 10 };

    assertArrayEquals(primeiroLancamento, segundoLancamento);
    // Assertions.assertNotEquals(primeiroLancamento, segundoLancamento);
  }

  @Test
  void validarSeObjectEstaNulo() {
    Pessoa pessoa = null;

    assertNull(pessoa);

    pessoa = new Pessoa("Jack", LocalDateTime.now());

    assertNotNull(pessoa);
  }

  @Test
  void validarNumerosDeTiposDiferentes() {

    double valor = 5.0;
    double outroValor = 5.0;

    assertEquals(valor, outroValor);
  }
}
