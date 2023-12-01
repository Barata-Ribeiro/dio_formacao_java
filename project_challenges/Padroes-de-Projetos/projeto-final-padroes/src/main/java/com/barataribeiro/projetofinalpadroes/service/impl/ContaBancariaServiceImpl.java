package com.barataribeiro.projetofinalpadroes.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.barataribeiro.projetofinalpadroes.model.Banco;
import com.barataribeiro.projetofinalpadroes.model.Cliente;
import com.barataribeiro.projetofinalpadroes.model.ContaBancaria;
import com.barataribeiro.projetofinalpadroes.repository.ClienteRepository;
import com.barataribeiro.projetofinalpadroes.repository.ContaBancariaRepository;
import com.barataribeiro.projetofinalpadroes.service.BancoService;
import com.barataribeiro.projetofinalpadroes.service.ContaBancariaService;

@Service
public class ContaBancariaServiceImpl implements ContaBancariaService {
  @Autowired
  private ContaBancariaRepository contaBancariaRepository;
  @Autowired
  private ClienteRepository clienteRepository;
  @Autowired
  private BancoService bancoService;

  @Override
  public ContaBancaria criarConta(Long clienteId, Long numeroConta, Double saldoInicial, Integer codigoBanco) {
    Cliente cliente = clienteRepository.findById(clienteId)
        .orElseThrow(() -> new IllegalStateException("Cliente não encontrado"));
    Banco banco = bancoService.buscarPorCodigo(codigoBanco);

    ContaBancaria novaConta = new ContaBancaria();
    novaConta.setCliente(cliente);
    novaConta.setNumeroConta(numeroConta);
    novaConta.setSaldo(saldoInicial);
    novaConta.setBanco(banco);

    return contaBancariaRepository.save(novaConta);
  }
}
