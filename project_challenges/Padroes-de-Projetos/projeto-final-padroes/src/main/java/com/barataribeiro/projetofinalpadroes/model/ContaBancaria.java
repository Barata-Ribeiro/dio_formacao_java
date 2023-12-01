package com.barataribeiro.projetofinalpadroes.model;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ContaBancaria {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private UUID id;
  private Long numeroConta;
  private Double saldo;

  @ManyToOne
  private Banco banco;

  @ManyToOne
  private Cliente cliente;
}
