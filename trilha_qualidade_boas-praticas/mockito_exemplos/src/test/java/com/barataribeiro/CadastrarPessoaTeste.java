package com.barataribeiro;

import static org.mockito.ArgumentMatchers.anyString;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class CadastrarPessoaTeste {

  @Mock
  private ApiDosCorreios apiDosCorreios;

  @InjectMocks
  private CadastrarPessoa cadastrarPessoa;

  @Test
  void validarDadosDeCadastro() {
    DadosLocalizacao dadosLocalizacao = new DadosLocalizacao("RO", "Porto Velho", "Rua Pintado", "Num. 171 - Ap. 305",
        "Lagoa");

    Mockito.when(apiDosCorreios.buscaDadosComBaseNoCep("76812-208")).thenReturn(dadosLocalizacao);

    Pessoa pessoaUm = cadastrarPessoa.cadastrarPessoa("Jason Bourne", "24.260.056-6", LocalDate.now(), "76812-208");

    Assertions.assertNull(pessoaUm.getEndereco());
    Assertions.assertEquals("Jason Bourne", pessoaUm.getNome());
    Assertions.assertEquals("24.260.056-6", pessoaUm.getDocumento());
    Assertions.assertEquals("RO", pessoaUm.getEndereco().getUf());
    Assertions.assertEquals("Num. 171 - Ap. 305", pessoaUm.getEndereco().getComplemento());
  }

  @Test
  void lancarExceptionQuandoChamarApiDosCorreios() {
    Mockito.when(apiDosCorreios.buscaDadosComBaseNoCep(anyString()))
        .thenThrow(IllegalArgumentException.class);

    // Outro método de chamar o mockito
    // Mockito.doThrow(IllegalArgumentException.class)
    // .when(apiDosCorreios.buscaDadosComBaseNoCep(anyString()));

    Assertions.assertThrows(IllegalArgumentException.class,
        () -> cadastrarPessoa.cadastrarPessoa("Jason Bourne", "24.260.056-6", LocalDate.now(), "76812-208"));
  }
}
