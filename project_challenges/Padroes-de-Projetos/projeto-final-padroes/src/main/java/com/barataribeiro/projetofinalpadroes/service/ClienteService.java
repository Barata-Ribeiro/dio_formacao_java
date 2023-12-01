package com.barataribeiro.projetofinalpadroes.service;

import com.barataribeiro.projetofinalpadroes.model.Cliente;

/**
 * Interface that defines the <b>Strategy</b> standard in the client domain.
 * With
 * so, if necessary, we can have multiple implementations of the same
 * interface.
 *
 * @author falvojr
 */
public interface ClienteService {
  Iterable<Cliente> buscarTodos();

  Cliente buscarPorId(Long id);

  void inserir(Cliente cliente);

  void atualizar(Long id, Cliente cliente);

  void deletar(Long id);
}
