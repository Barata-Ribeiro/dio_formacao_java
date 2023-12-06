package me.dio.academia.digital.service.impl;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;

import me.dio.academia.digital.entity.Matricula;
import me.dio.academia.digital.entity.form.MatriculaForm;
import me.dio.academia.digital.repository.AlunoRepository;
import me.dio.academia.digital.repository.MatriculaRepository;
import me.dio.academia.digital.service.IMatriculaService;

public class MatriculaServiceImpl implements IMatriculaService {

  @Autowired
  private MatriculaRepository matriculaRepository;

  @Autowired
  private AlunoRepository alunoRepository;

  @Override
  public Matricula create(MatriculaForm form) {
    Matricula matricula = new Matricula();
    matricula.setAluno(alunoRepository.findById(form.getAlunoId())
        .orElseThrow(() -> new EntityNotFoundException("Aluno não encontrado")));
    return matriculaRepository.save(matricula);
  }

  @Override
  public Matricula get(Long id) {
    return matriculaRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Matrícula não encontrada"));
  }

  @Override
  public List<Matricula> getAll(String bairro) {
    if (bairro == null)
      return matriculaRepository.findAll();
    else
      return matriculaRepository.findAlunoByBairro(bairro);
  }

  @Override
  public void delete(Long id) {
    matriculaRepository.deleteById(id);
  }

}
