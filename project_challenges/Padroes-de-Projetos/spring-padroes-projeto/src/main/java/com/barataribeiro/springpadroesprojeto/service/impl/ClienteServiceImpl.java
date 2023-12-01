package com.barataribeiro.springpadroesprojeto.service.impl;

import org.springframework.stereotype.Service;

import com.barataribeiro.springpadroesprojeto.model.Cliente;
import com.barataribeiro.springpadroesprojeto.service.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService {

  // TODO Singleton: Injetar os componentes do Spring com @Autowired.
  // TODO Strategy: Implementar os métodos definidos na interface.
  // TODO Facade: Abstrair integrações com subsistemas, provendo uma interface
  // simples.

  @Override
  public Iterable<Cliente> buscarTodos() {
    // FIXME Buscar todos os Clientes.
    return null;
  }

  @Override
  public Cliente buscarPorId(Long id) {
    // FIXME Buscar Cliente por ID.
    return null;
  }

  @Override
  public void inserir(Cliente cliente) {
    // FIXME Inserir Cliente...
  }

  @Override
  public void atualizar(Long id, Cliente cliente) {
    // FIXME Buscar Cliente por ID, caso exista:
  }

  @Override
  public void deletar(Long id) {
    // FIXME Deletar Cliente por ID.
  }

}