package me.dio.academia.digital.entity.form;

import java.util.Optional;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AvaliacaoFisicaUpdateForm {

  private Optional<Double> peso;

  private Optional<Double> altura;
}
