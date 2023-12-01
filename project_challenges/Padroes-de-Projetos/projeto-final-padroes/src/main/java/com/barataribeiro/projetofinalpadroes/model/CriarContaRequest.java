package com.barataribeiro.projetofinalpadroes.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CriarContaRequest {
  private Long clienteId;
  private Long numeroConta;
  private Double saldoInicial;
  private Integer codigoBanco;
}
