package com.barataribeiro;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ServicoEnvioEmailTeste {

  @Mock
  private PlataformaDeEnvio plataforma;

  @InjectMocks
  private ServicoEnvioEmail servico;

  @Captor
  private ArgumentCaptor<Email> emailCaptor;

  @Test
  void validarDadosEnviadosParaAPlataforma() {

    String enderecoEmail = "contato@example.com";
    String mensagem = "Mensagem de teste";
    boolean emFormatoHtml = false;

    servico.enviaEmail(enderecoEmail, mensagem, emFormatoHtml);

    Mockito.verify(plataforma).enviaEmail(emailCaptor.capture());

    Email emailCapturado = emailCaptor.getValue();

    Assertions.assertEquals(enderecoEmail, emailCapturado.getEnderecoEmail());
    Assertions.assertEquals(mensagem, emailCapturado.getMensagem());
    Assertions.assertEquals(Formato.TEXTO, emailCapturado.getFormato());
  }
}
