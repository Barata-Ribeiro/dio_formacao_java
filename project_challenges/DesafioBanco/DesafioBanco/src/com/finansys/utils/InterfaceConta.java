package com.finansys.utils;

public interface InterfaceConta {
  /**
   * Método para sacar um valor da conta de um determinado cliente.
   * 
   * @param valor - valor a ser sacado
   */
  void sacar(double valor);

  /**
   * Método para depositar um valor da conta de um determinado cliente.
   * 
   * @param valor - valor a ser depositado
   */
  void depositar(double valor);

  /**
   * Método para realizar transferência de um valor da conta para uma outra
   * determinada conta.
   * 
   * @param contaDestino - conta a ser transferida.
   * @param valor        - valor a ser transferido.
   */
  void transferir(InterfaceConta contaDestino, double valor);

  /**
   * Método para imprimir em um formato simulado de JSON o extrato bancário da
   * conta. Utilizando do método formatarNome para definir o tipo de conta
   * corretamente.
   * 
   * Exemplo:
   * {
   * "Extrato da conta": "Tipo da Conta",
   * "Titular": "Nome do Cliente",
   * "Agencia": 1,
   * "Número": 1,
   * "Saldo": "$valor,00"
   * }
   */
  void imprimirExtrato();
}
