package com.barataribeiro.springpadroesprojeto.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.barataribeiro.springpadroesprojeto.model.Cliente;
import com.barataribeiro.springpadroesprojeto.model.Endereco;
import com.barataribeiro.springpadroesprojeto.repository.ClienteRepository;
import com.barataribeiro.springpadroesprojeto.repository.EnderecoRepository;
import com.barataribeiro.springpadroesprojeto.service.ClienteService;
import com.barataribeiro.springpadroesprojeto.service.ViaCepService;

@Service
public class ClienteServiceImpl implements ClienteService {

  // Singleton: Injetar os componentes do Spring com @Autowired.
  @Autowired
  private ClienteRepository clienteRepository;
  @Autowired
  private EnderecoRepository enderecoRepository;
  @Autowired
  private ViaCepService viaCepService;

  // Strategy: Implementar os métodos definidos na interface.
  // Facade: Abstrair integrações com subsistemas, provendo uma interface
  // simples.

  @Override
  public Iterable<Cliente> buscarTodos() {
    // Buscar todos os Clientes:
    return clienteRepository.findAll();
  }

  @Override
  public Cliente buscarPorId(Long id) {
    // Buscar Cliente por ID:
    Optional<Cliente> cliente = clienteRepository.findById(id);
    return cliente.get();
  }

  @Override
  public void inserir(Cliente cliente) {
    // Inserir Cliente:
    salvarClienteComCep(cliente);
  }

  @Override
  public void atualizar(Long id, Cliente cliente) {
    // Atualizar cliente:
    Optional<Cliente> clienteAtual = clienteRepository.findById(id);
    if (clienteAtual.isPresent())
      salvarClienteComCep(cliente);
  }

  @Override
  public void deletar(Long id) {
    // Deletar Cliente por ID:
    clienteRepository.deleteById(id);
  }

  /**
   * Salva um cliente com o CEP consultado através do ViaCEP.
   *
   * @param cliente cliente a ser salvo
   */
  private void salvarClienteComCep(Cliente cliente) {
    String cep = cliente.getEndereco().getCep();

    /**
     * Recupera o endereço com o CEP fornecido, ou consulta o ViaCEP e salva o
     * endereço se não existir.
     */
    Endereco endereco = enderecoRepository.findById(cep).orElseGet(() -> {
      Endereco novoEndereco = viaCepService.consultarCep(cep);
      enderecoRepository.save(novoEndereco);
      return novoEndereco;
    });

    /**
     * Atualiza o endereço do cliente com o endereço recuperado ou salvo.
     */
    cliente.setEndereco(endereco);

    /**
     * Salva o cliente com o endereço atualizado.
     */
    clienteRepository.save(cliente);
  }
}