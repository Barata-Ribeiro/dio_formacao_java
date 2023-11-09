package com.barataribeiro;

import java.time.LocalDateTime;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ConsultarDadosDePessoaTest {

  @BeforeAll
  static void configuraConexao() {
    BancoDeDados.iniciarConexao();
    System.out.println("Rodou...");
  }

  @BeforeEach
  void inserirDadosParaTeste() {
    BancoDeDados.inserirDados(new Pessoa("Henrique", LocalDateTime.of(2000, 1, 1, 15, 0, 0)));
  }

  @AfterEach
  void removerDadosDoTeste() {
    BancoDeDados.removerDados(new Pessoa("Henrique", LocalDateTime.of(2000, 1, 1, 15, 0, 0)));
  }

  @Test
  void validarDadosDeRetorno() {
    Assertions.assertTrue(true);
  }

  @Test
  void validarDadosDeRetornoDois() {
    Assertions.assertNull(null);
  }

  @AfterAll
  static void finalizarConexao() {
    BancoDeDados.finalizarConexao();
    System.out.println("Finalizou...");
  }
}
