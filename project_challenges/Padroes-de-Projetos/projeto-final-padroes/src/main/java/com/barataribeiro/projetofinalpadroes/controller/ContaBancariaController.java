package com.barataribeiro.projetofinalpadroes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.barataribeiro.projetofinalpadroes.model.ContaBancaria;
import com.barataribeiro.projetofinalpadroes.model.CriarContaRequest;
import com.barataribeiro.projetofinalpadroes.service.ContaBancariaService;

@RestController
@RequestMapping("/contas")
public class ContaBancariaController {

  @Autowired
  private ContaBancariaService contaBancariaService;

  @PostMapping
  public ResponseEntity<ContaBancaria> criarConta(@RequestBody CriarContaRequest request) {
    ContaBancaria novaConta = contaBancariaService.criarConta(request.getClienteId(), request.getNumeroConta(),
        request.getSaldoInicial(), request.getCodigoBanco());
    return ResponseEntity.ok(novaConta);
  }
}