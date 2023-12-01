package com.barataribeiro.projetofinalpadroes.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.barataribeiro.projetofinalpadroes.model.Banco;
import com.barataribeiro.projetofinalpadroes.repository.BancoRepository;
import com.barataribeiro.projetofinalpadroes.service.BancoService;
import com.barataribeiro.projetofinalpadroes.service.BrasilApiService;

@Service
public class BancoServiceImpl implements BancoService {
  @Autowired
  private BancoRepository bancoRepository;
  @Autowired
  private BrasilApiService brasilApiService;

  @Override
  public Iterable<Banco> buscarTodos() {
    Iterable<Banco> bancos = bancoRepository.findAll();
    if (!bancos.iterator().hasNext()) {
      bancos = brasilApiService.obterBancos();
      bancoRepository.saveAll(bancos);
    }
    return bancos;
  }

  @Override
  public Banco buscarPorCodigo(Integer codigo) {
    Optional<Banco> banco = bancoRepository.findById(String.valueOf(codigo));
    if (!banco.isPresent()) {
      banco = Optional.ofNullable(brasilApiService.obterBancoPorCodigo(String.valueOf(codigo)));
      banco.ifPresent(bancoRepository::save);
    }
    return banco.orElse(null);
  }
}
