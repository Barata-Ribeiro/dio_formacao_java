package com.barataribeiro;

import java.util.logging.Logger;

public class BancoDeDados {
  private static final Logger LOGGER = Logger.getLogger(BancoDeDados.class.getName());

  public static void iniciarConexao() {
    LOGGER.info("Iniciou a conexao...");
  }

  public static void finalizarConexao() {
    LOGGER.info("Finalizou a conexao...");
  }

  public static void inserirDados(Pessoa pessoa) {
    LOGGER.info("Inserindo pessoa ao banco de dados...");
  }

  public static void removerDados(Pessoa pessoa) {
    LOGGER.info("Removendo pessoa ao banco de dados...");
  }
}
