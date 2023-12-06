package me.dio.academia.digital.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.dio.academia.digital.entity.Aluno;
import me.dio.academia.digital.entity.AvaliacaoFisica;
import me.dio.academia.digital.entity.form.AvaliacaoFisicaForm;
import me.dio.academia.digital.entity.form.AvaliacaoFisicaUpdateForm;
import me.dio.academia.digital.repository.AlunoRepository;
import me.dio.academia.digital.repository.AvaliacaoFisicaRepository;
import me.dio.academia.digital.service.IAvaliacaoFisicaService;

@Service
public class AvaliacaoFisicaServiceImpl implements IAvaliacaoFisicaService {

  @Autowired
  private AvaliacaoFisicaRepository repository;

  @Autowired
  private AlunoRepository alunoRepository;

  @Override
  public AvaliacaoFisica create(AvaliacaoFisicaForm form) {
    AvaliacaoFisica avaliacaoFisica = new AvaliacaoFisica();
    Aluno aluno = alunoRepository.findById(form.getAlunoId()).get();

    avaliacaoFisica.setAluno(aluno);
    avaliacaoFisica.setPeso(form.getPeso());
    avaliacaoFisica.setAltura(form.getAltura());

    return repository.save(avaliacaoFisica);
  }

  @Override
  public AvaliacaoFisica get(Long id) {
    return repository.findById(id).get();
  }

  @Override
  public List<AvaliacaoFisica> getAll() {
    return repository.findAll();
  }

  @Override
  public AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateForm formUpdate) {
    AvaliacaoFisica avaliacaoFisica = repository.findById(id).get();

    formUpdate.getPeso().ifPresent(peso -> {
      if (peso <= 0)
        throw new IllegalArgumentException("O peso precisa ser positivo.");

      avaliacaoFisica.setPeso(peso);
    });

    formUpdate.getAltura().ifPresent(altura -> {
      if (altura <= 0)
        throw new IllegalArgumentException("A altura precisa ser positiva.");
      if (altura > 0 && altura <= 150)
        throw new IllegalArgumentException("A altura precisa ser no minimo 150.");

      avaliacaoFisica.setAltura(altura);
    });

    return repository.save(avaliacaoFisica);
  }

  @Override
  public void delete(Long id) {
    repository.deleteById(id);
  }

}
