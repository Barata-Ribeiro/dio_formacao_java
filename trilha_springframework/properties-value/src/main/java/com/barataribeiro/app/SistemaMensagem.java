package com.barataribeiro.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SistemaMensagem implements CommandLineRunner {
  @Value("${nome}") // @Value("${name:NoReply-BarataRibeiro}")
  private String nome;
  @Value("${email}")
  private String email;
  @Value("${telefones}")
  private List<Long> telefones = new ArrayList<>(Arrays.asList(new Long[] { 24976581234L }));

  @Override
  public void run(String... args) throws Exception {
    System.out.println("Mensagem enviada por: " + nome
        + "\nE-mail:" + email
        + "\nCom telefones para contato: " + telefones);
    System.out.println("Seu cadastro foi aprovado");
  }
}
