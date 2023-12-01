package com.barataribeiro.projetofinalpadroes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.barataribeiro.projetofinalpadroes.model.Banco;
import com.barataribeiro.projetofinalpadroes.service.BancoService;

@RestController
@RequestMapping("/bancos")
public class BancoController {

  @Autowired
  private BancoService bancoService;

  @GetMapping
  public ResponseEntity<Iterable<Banco>> buscarTodos() {
    return ResponseEntity.ok(bancoService.buscarTodos());
  }

  @GetMapping("/{codigo}")
  public ResponseEntity<Banco> buscarPorCodigo(@PathVariable Integer codigo) {
    return ResponseEntity.ok(bancoService.buscarPorCodigo(codigo));
  }
}
