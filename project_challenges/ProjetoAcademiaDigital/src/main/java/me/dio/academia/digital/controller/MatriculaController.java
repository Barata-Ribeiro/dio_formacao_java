package me.dio.academia.digital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import me.dio.academia.digital.entity.Matricula;
import me.dio.academia.digital.entity.form.MatriculaForm;
import me.dio.academia.digital.service.impl.MatriculaServiceImpl;

@RestController
@RequestMapping("/matriculas")
public class MatriculaController {
  @Autowired
  private MatriculaServiceImpl service;

  @PostMapping
  public Matricula createMatricula(@RequestBody MatriculaForm form) {
    return service.create(form);
  }

  @GetMapping("/{id}")
  public Matricula getMatriculaById(@PathVariable Long id) {
    return service.get(id);
  }

  @GetMapping
  public List<Matricula> getAllMatriculas(@RequestParam(value = "bairro", required = false) String bairro) {
    return service.getAll(bairro);
  }

  @DeleteMapping("/{id}")
  public void deleteMatricula(@PathVariable Long id) {
    service.delete(id);
  }
}
