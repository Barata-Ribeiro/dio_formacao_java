package com.barataribeiro.app;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "remetente")
public class Remetente {
  private String nome;
  private String email;
  private List<Long> telefones;

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
   * @return the email
   */
  public String getEmail() {
    return email;
  }

  /**
   * @param email the email to set
   */
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * @return the telefones
   */
  public List<Long> getTelefones() {
    return telefones;
  }

  /**
   * @param telefones the telefones to set
   */
  public void setTelefones(List<Long> telefones) {
    this.telefones = telefones;
  }

}
