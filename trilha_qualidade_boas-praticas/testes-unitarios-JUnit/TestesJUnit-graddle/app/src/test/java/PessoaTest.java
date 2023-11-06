import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import testes.unitarios.junit.Pessoa;

public class PessoaTest {

  @Test
  void validarCalculoDeIdade() {
    Pessoa pessoa = new Pessoa("Jason", LocalDate.of(1999, 5, 10));
    Assertions.assertEquals(24, pessoa.getIdade());
  }
}
