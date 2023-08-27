package com.finansys.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.finansys.exceptions.ClienteNotFoundException;
import com.finansys.exceptions.ContaNotFoundException;
import com.finansys.model.Cliente;
import com.finansys.model.Conta;

/**
 * Classe que representa um banco.
 */
public class Banco {

  private String nome;
  private List<Conta> contas;
  private List<Cliente> clientes;

  /**
   * Construtor da classe Banco.
   * Possui um parâmetro para receber o nome do banco.
   * Embora não receba como parâmetro, possui duas listas distintas contendo os
   * clientes e contas respectivamentes.
   * 
   * @param nome - parâmetro para receber o nome do banco.
   */
  public Banco(String nome) {
    this.nome = nome;
    this.clientes = new ArrayList<>();
    this.contas = new ArrayList<>();
  }

  /**
   * Adiciona um cliente ao banco.
   * Se o cliente já existir na lista, ele não será adicionado novamente.
   * 
   * @param cliente O cliente a ser adicionado.
   */
  public void adicionarCliente(Cliente cliente) {
    if (!this.clientes.contains(cliente)) {
      this.clientes.add(cliente);
    }
  }

  /**
   * Adiciona uma conta ao banco.
   * Se a conta já existir na lista, ele não será adicionada novamente.
   * 
   * @param conta A conta a ser adicionada.
   */
  public void adicionarConta(Conta conta) {
    if (!this.contas.contains(conta)) {
      this.contas.add(conta);
    }
  }

  /**
   * Busca um cliente pelo nome.
   * 
   * @param nome - parâmetro para receber o nome do cliente a ser buscado.
   * @return - retorna o cliente com o nome informado.
   * @throws ClienteNotFoundException - Exceção para caso o cliente não seja
   *                                  encontrado.
   */
  public Cliente buscarClientePorNome(String nome) throws ClienteNotFoundException {
    for (Cliente cliente : this.clientes) {
      if (cliente.getNome().equals(nome)) {
        return cliente;
      }
    }
    throw new ClienteNotFoundException("Cliente com nome " + nome + " não encontrado.");
  }

  /**
   * Busca uma conta pelo número.
   * 
   * @param numero - parâmetro para receber o número da conta a ser buscada.
   * @return - retorna a conta com o número informado.
   * @throws ContaNotFoundException - Exceção para caso a conta não seja
   *                                encontrada.
   */
  public Conta buscarContaPorNumero(int numero) {
    for (Conta conta : this.contas) {
      if (conta.getNumero() == numero) {
        return conta;
      }
    }
    throw new ContaNotFoundException("Conta com numero " + numero + " não encontrada.");
  }

  /**
   * @return - retorna uma lista com todos os clientes do banco
   */
  public List<Cliente> getClientes() {
    return Collections.unmodifiableList(clientes);
  }

  /**
   * @return - retorna uma lista com todos os contas do banco.
   */
  public List<Conta> getContas() {
    return Collections.unmodifiableList(contas);
  }

  /**
   * @return - retorna o nome do banco.
   */
  public String getNome() {
    return nome;
  }

}
