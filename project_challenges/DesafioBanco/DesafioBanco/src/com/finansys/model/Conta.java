package com.finansys.model;

import com.finansys.utils.InterfaceConta;

/**
 * Classe que representa uma conta de um cliente.
 */
public abstract class Conta implements InterfaceConta {

  private static final int AGENCIA_PADRAO = 1;
  private static int SEQUENCIAL = 1;

  protected int agencia;
  protected int numero;
  protected double saldo;
  protected Cliente cliente;

  /**
   * Construtor padrão da conta, que recebe um cliente para que seja criada uma
   * conta.
   * Possui um agência padrão de inicia em 1 e um número de conta também iniciado
   * em 1. Este último é incrementado conforme novos clientes são criados.
   * 
   * @param cliente - Cliente da conta.
   */
  public Conta(Cliente cliente) {
    this.agencia = Conta.AGENCIA_PADRAO;
    this.numero = SEQUENCIAL += 1;
    this.cliente = cliente;
  }

  @Override
  public void sacar(double valor) {
    this.saldo -= valor;
  }

  @Override
  public void depositar(double valor) {
    this.saldo += valor;
  }

  @Override
  public void transferir(InterfaceConta contaDestino, double valor) {
    this.sacar(valor);
    contaDestino.depositar(valor);
    System.out.println("Transferencia de $" + valor + " realizada com sucesso!");
  }

  /**
   * @param nome - Nome da Classe, esta subclasse de conta que herda de 'Conta'
   *             (como 'ContaCorrente', 'ContaPoupanca', etc.).
   * @return - Nome da subclasse formatado, Exemplo: "NomeClasse" para "Nome
   *         Classe"
   */
  private String formatarNome(String nome) {
    StringBuilder nomeFormatado = new StringBuilder();

    for (int i = 0; i < nome.length(); i++) {
      char c = nome.charAt(i);
      if (i > 0 && Character.isUpperCase(c)) {
        nomeFormatado.append(' ');
      }
      nomeFormatado.append(c);
    }

    return nomeFormatado.toString();
  }

  @Override
  public void imprimirExtrato() {
    String nomeFormatado = formatarNome(this.getClass().getSimpleName());
    String jsonFormat = String.format(
        "{\n" +
            "  \"Extrato da conta\": \"%s\",\n" +
            "  \"Titular\": \"%s\",\n" +
            "  \"Agencia\": %d,\n" +
            "  \"Número\": %d,\n" +
            "  \"Saldo\": \"$%.2f\"\n" +
            "}",
        nomeFormatado, this.cliente.getNome(), this.agencia, this.numero, this.saldo);
    System.out.println(jsonFormat);
  }

  /**
   * @return - retorna a agência da conta.
   */
  public int getAgencia() {
    return agencia;
  }

  /**
   * @return - retorna o número da conta.
   */
  public int getNumero() {
    return numero;
  }

  /**
   * @return - retorna o saldo da conta.
   */
  public double getSaldo() {
    return saldo;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null || getClass() != obj.getClass())
      return false;

    Conta conta = (Conta) obj;
    return numero == conta.numero;
  }

  @Override
  public int hashCode() {
    return numero;
  }

}
