package me.dio.academia.digital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import me.dio.academia.digital.entity.AvaliacaoFisica;
import me.dio.academia.digital.entity.form.AvaliacaoFisicaForm;
import me.dio.academia.digital.entity.form.AvaliacaoFisicaUpdateForm;
import me.dio.academia.digital.service.impl.AvaliacaoFisicaServiceImpl;

@RestController
@RequestMapping("/avaliacoes")
public class AvaliacaoFisicaController {

  @Autowired
  private AvaliacaoFisicaServiceImpl service;

  @PostMapping
  public AvaliacaoFisica createAvaliacaoFisica(@RequestBody AvaliacaoFisicaForm form) {
    return service.create(form);
  }

  @GetMapping
  public List<AvaliacaoFisica> getAllAvaliacaoFisica() {
    return service.getAll();
  }

  @GetMapping("/{id}")
  public AvaliacaoFisica getAvaliacaoFisicaById(@PathVariable Long id) {
    return service.get(id);
  }

  @PutMapping("/{id}")
  public AvaliacaoFisica updateAvaliacaoFisica(@PathVariable Long id, @RequestBody AvaliacaoFisicaUpdateForm form) {
    return service.update(id, form);
  }

  @DeleteMapping("/{id}")
  public void deleteAvaliacaoFisica(@PathVariable Long id) {
    service.delete(id);
  }
}
