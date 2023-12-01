package com.barataribeiro.projetofinalpadroes.service;

import com.barataribeiro.projetofinalpadroes.model.ContaBancaria;

public interface ContaBancariaService {
  ContaBancaria criarConta(Long clienteId, Long numeroConta, Double saldoInicial, Integer codigoBanco);
}
