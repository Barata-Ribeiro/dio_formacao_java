package com.barataribeiro.projetofinalpadroes.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Banco {

  @Id
  private String ispb;
  private String name;
  private Integer code;
  private String fullName;
}
