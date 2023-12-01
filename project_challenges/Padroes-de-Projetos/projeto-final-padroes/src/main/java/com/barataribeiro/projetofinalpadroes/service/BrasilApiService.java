package com.barataribeiro.projetofinalpadroes.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.barataribeiro.projetofinalpadroes.model.Banco;

@FeignClient(name = "brasilapi", url = "https://brasilapi.com.br/api")
public interface BrasilApiService {
  @GetMapping("/banks/v1")
  List<Banco> obterBancos();

  @GetMapping("/banks/v1/{code}")
  Banco obterBancoPorCodigo(@PathVariable("code") String code);
}
