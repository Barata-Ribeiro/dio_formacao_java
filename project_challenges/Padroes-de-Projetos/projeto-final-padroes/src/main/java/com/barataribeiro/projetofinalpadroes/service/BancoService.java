package com.barataribeiro.projetofinalpadroes.service;

import com.barataribeiro.projetofinalpadroes.model.Banco;

public interface BancoService {
  Iterable<Banco> buscarTodos();
  Banco buscarPorCodigo(Integer codigo);
}
