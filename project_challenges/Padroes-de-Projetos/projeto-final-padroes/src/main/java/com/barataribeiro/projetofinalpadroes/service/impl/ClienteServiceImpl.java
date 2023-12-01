package com.barataribeiro.projetofinalpadroes.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.barataribeiro.projetofinalpadroes.handler.RequiredFieldException;
import com.barataribeiro.projetofinalpadroes.model.Cliente;
import com.barataribeiro.projetofinalpadroes.model.Endereco;
import com.barataribeiro.projetofinalpadroes.repository.ClienteRepository;
import com.barataribeiro.projetofinalpadroes.repository.EnderecoRepository;
import com.barataribeiro.projetofinalpadroes.service.ClienteService;
import com.barataribeiro.projetofinalpadroes.service.ViaCepService;

@Service
public class ClienteServiceImpl implements ClienteService {

  @Autowired
  private ClienteRepository clienteRepository;
  @Autowired
  private EnderecoRepository enderecoRepository;
  @Autowired
  private ViaCepService viaCepService;

  @Override
  public Iterable<Cliente> buscarTodos() {
    Iterable<Cliente> clientes = clienteRepository.findAll();
    if (!clientes.iterator().hasNext()) {
      throw new IllegalStateException("Nenhum cliente encontrado");
    }
    return clientes;
  }

  @Override
  public Cliente buscarPorId(Long id) {
    Optional<Cliente> cliente = clienteRepository.findById(id);
    return cliente.orElseThrow(() -> new IllegalStateException("Cliente não encontrado"));
  }

  @Override
  public void inserir(Cliente cliente) {
    validarCliente(cliente);
    salvarClienteComCep(cliente);
  }

  @Override
  public void atualizar(Long id, Cliente cliente) {
    validarCliente(cliente);
    Optional<Cliente> clienteAtual = clienteRepository.findById(id);
    clienteAtual.ifPresentOrElse(c -> salvarClienteComCep(cliente),
        () -> {
          throw new IllegalStateException("Cliente não encontrado para atualizar");
        });
  }

  @Override
  public void deletar(Long id) {
    clienteRepository.deleteById(id);
  }

  /**
   * Validates the given customer object, ensuring that it contains all required
   * fields.
   *
   * @param cliente the customer to be validated
   */
  private void validarCliente(Cliente cliente) {
    if (cliente.getNome() == null)
      throw new RequiredFieldException("nome");

    if (cliente.getEndereco().getCep() == null)
      throw new RequiredFieldException("cep");

  }

  /**
   * Saves a new customer with their associated address, using the ViaCep API to
   * retrieve the address information if it is not already stored in the database.
   *
   * @param cliente the customer to be saved
   */
  private void salvarClienteComCep(Cliente cliente) {
    String cep = cliente.getEndereco().getCep();

    Endereco endereco = enderecoRepository.findById(cep).orElseGet(() -> {
      Endereco novoEndereco = viaCepService.consultarCep(cep);
      enderecoRepository.save(novoEndereco);
      return novoEndereco;
    });

    cliente.setEndereco(endereco);
    clienteRepository.save(cliente);
  }
}