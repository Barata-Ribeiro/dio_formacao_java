package me.dio.academia.digital.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import me.dio.academia.digital.entity.Aluno;
import me.dio.academia.digital.entity.AvaliacaoFisica;
import me.dio.academia.digital.entity.form.AlunoForm;
import me.dio.academia.digital.entity.form.AlunoUpdateForm;
import me.dio.academia.digital.service.impl.AlunoServiceImpl;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

  @Autowired
  private AlunoServiceImpl service;

  @PostMapping
  public Aluno createAluno(@Valid @RequestBody AlunoForm form) {
    return service.create(form);
  }

  @GetMapping
  public List<Aluno> getAllAlunos() {
    return service.getAll();
  }

  @GetMapping("/{id}")
  public Aluno getAlunoById(@PathVariable Long id) {
    return service.get(id);
  }

  @PutMapping("/{id}")
  public Aluno updateAluno(@RequestBody AlunoUpdateForm form, @PathVariable Long id) {
    return service.update(id, form);
  }

  @DeleteMapping("/{id}")
  public void deleteAluno(@PathVariable Long id) {
    service.delete(id);
  }

  @GetMapping("/avaliacoes/{id}")
  public List<AvaliacaoFisica> getAllAvaliacaoFisicaById(@PathVariable Long id) {
    return service.getAllAvaliacaoFisicaById(id);
  }
}
