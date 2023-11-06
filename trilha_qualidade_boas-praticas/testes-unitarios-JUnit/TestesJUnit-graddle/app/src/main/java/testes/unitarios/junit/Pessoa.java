package testes.unitarios.junit;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pessoa {
  private String nome;
  private LocalDate nascimento;

  /**
   * @param nome
   * @param nascimento
   */
  public Pessoa(String nome, LocalDate nascimento) {
    this.nome = nome;
    this.nascimento = nascimento;
  }

  /**
   * @return the nome
   */
  public String getNome() {
    return nome;
  }

  /**
   * @param nome the nome to set
   */
  public void setNome(String nome) {
    this.nome = nome;
  }

  /**
   * @return the nascimento
   */
  public LocalDate getNascimento() {
    return nascimento;
  }

  /**
   * @param nascimento the nascimento to set
   */
  public void setNascimento(LocalDate nascimento) {
    this.nascimento = nascimento;
  }

  /**
   * @return a idade de um pessoa
   */
  public int getIdade() {
    return (int) ChronoUnit.YEARS.between(this.nascimento, LocalDate.now());
  }

}
