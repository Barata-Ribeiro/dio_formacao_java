package com.barataribeiro.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SistemaMensagem implements CommandLineRunner {
  private String nome = "Barata Ribeiro";
  private String email = "contato@barataribeiro.com";
  private List<Long> telefones = new ArrayList<>(Arrays.asList(new Long[] { 24976581234L }));

  @Override
  public void run(String... args) throws Exception {
    System.out.println("Mensagem enviada por: " + nome
        + "\nE-mail:" + email
        + "\nCom telefones para contato: " + telefones);
    System.out.println("Seu cadastro foi aprovado");
  }
}
