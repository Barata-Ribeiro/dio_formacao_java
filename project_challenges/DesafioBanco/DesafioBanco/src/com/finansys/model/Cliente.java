package com.finansys.model;

/**
 * Classe que representa um cliente com nome e CPF.
 */
public class Cliente {

  private String nome;
  private String cpf;

  /**
   * Construtor da classe Cliente.
   * 
   * @param nome Nome do cliente.
   * @param cpf  CPF do cliente.
   */
  public Cliente(String nome, String cpf) {
    this.nome = nome;
    this.cpf = cpf;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  @Override
  public String toString() {
    return "Cliente [nome=" + nome + ", cpf=" + cpf + "]";
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null || getClass() != obj.getClass())
      return false;

    Cliente cliente = (Cliente) obj;
    return cpf != null ? cpf.equals(cliente.cpf) : cliente.cpf == null;
  }

  @Override
  public int hashCode() {
    return cpf != null ? cpf.hashCode() : 0;
  }

}
