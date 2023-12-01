package com.barataribeiro.springpadroesprojeto.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Cliente {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String nome;
  @ManyToOne
  private Endereco endereco;

  /**
   * @return the id
   */
  public Long getId() {
    return id;
  }

  /**
   * @param id the id to set
   */
  public void setId(Long id) {
    this.id = id;
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
   * @return the endereco
   */
  public Endereco getEndereco() {
    return endereco;
  }

  /**
   * @param endereco the endereco to set
   */
  public void setEndereco(Endereco endereco) {
    this.endereco = endereco;
  }

}
