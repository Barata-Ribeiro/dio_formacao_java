package me.dio.academia.digital.service.impl;

import java.time.LocalDate;
import java.util.List;

import javax.validation.ValidationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.dio.academia.digital.entity.Aluno;
import me.dio.academia.digital.entity.AvaliacaoFisica;
import me.dio.academia.digital.entity.form.AlunoForm;
import me.dio.academia.digital.entity.form.AlunoUpdateForm;
import me.dio.academia.digital.infra.utils.JavaTimeUtils;
import me.dio.academia.digital.repository.AlunoRepository;
import me.dio.academia.digital.service.IAlunoService;

@Service
public class AlunoServiceImpl implements IAlunoService {

  @Autowired
  private AlunoRepository repository;

  @Override
  public Aluno create(AlunoForm form) {
    Aluno aluno = new Aluno();
    aluno.setNome(form.getNome());
    aluno.setCpf(form.getCpf());
    aluno.setBairro(form.getBairro());
    aluno.setDataDeNascimento(form.getDataDeNascimento());

    return repository.save(aluno);
  }

  @Override
  public Aluno get(Long id) {
    return repository.findById(id).get();
  }

  @Override
  public List<Aluno> getAll(String dataDeNascimento) {
    if (dataDeNascimento == null)
      return repository.findAll();
    else {
      LocalDate data = LocalDate.parse(dataDeNascimento, JavaTimeUtils.LOCAL_DATE_FORMATTER);
      return repository.findByDataDeNascimento(data);
    }
  }

  @Override
  public Aluno update(Long id, AlunoUpdateForm formUpdate) {
    Aluno aluno = repository.findById(id).get();

    formUpdate.getNome().ifPresent(nome -> {
      if (nome.length() < 3 || nome.length() > 50)
        throw new ValidationException("Nome deve estar entre 3 e 50 caracteres.");

      aluno.setNome(nome);
    });

    formUpdate.getBairro().ifPresent(bairro -> {
      if (bairro.length() < 3 || bairro.length() > 50)
        throw new ValidationException("Bairro deve estar entre 3 e 50 caracteres.");

      aluno.setBairro(bairro);
    });

    formUpdate.getDataDeNascimento().ifPresent(dataDeNascimento -> {
      if (dataDeNascimento.isAfter(LocalDate.now()))
        throw new ValidationException("Data de nascimento não pode ser no futuro.");

      aluno.setDataDeNascimento(dataDeNascimento);
    });

    return repository.save(aluno);
  }

  @Override
  public void delete(Long id) {
    repository.deleteById(id);
  }

  @Override
  public List<AvaliacaoFisica> getAllAvaliacaoFisicaById(Long id) {
    Aluno aluno = repository.findById(id).get();

    return aluno.getAvaliacoes();
  }

}
