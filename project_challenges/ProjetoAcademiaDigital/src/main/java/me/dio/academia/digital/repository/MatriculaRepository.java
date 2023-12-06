package me.dio.academia.digital.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import me.dio.academia.digital.entity.Matricula;

public interface MatriculaRepository extends JpaRepository<Matricula, Long> {

  /**
   * @param bairro: passa o parâmetro bairro de referência para o filtro
   * @return lista de launos matriculos que residem no bairro passado como
   *         parâmetro
   */

  // @Query(value = "SELECT * FROM tb_matriculas m " +
  // "INNER JOIN tb_alunos a ON m.aluno_id = a.id " +
  // "WHERE a.bairro = :bairro", nativeQuery = true)
  // @Query("FROM Matricula m WHERE m.aluno.bairro = :bairro ")
  // List<Matricula> findAlunosMatriculadosBairro(String bairro);
  List<Matricula> findAlunoByBairro(String bairro);
}
