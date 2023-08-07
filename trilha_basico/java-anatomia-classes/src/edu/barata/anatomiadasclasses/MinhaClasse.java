package edu.barata.anatomiadasclasses;

public class MinhaClasse {
  public static void main(String[] args) {

    // int ano = 2021;
    // ano = 2023;
    // int ESTADOS_BRASILEIRO = 27; // Convenção, imutável
    // final String BR = "Brasil"; // Convenção, imutável

    // NOMENCLATURAS VARIAVEIS
    // int numero$um = 1;
    // String nomePessoa = "João";
    // String _sobrenome = "Bourne";
    // int $idade = 27;

    // TIPO - nomeBemDefinido - valor (correspondente à tipagem)
    // String meuNome = "Barata";
    // int anoFabricacao = 2022;
    // boolean verdadeira = true;
    // boolean falsa = false;
    // anoFabricacao = anoFabricacao + 1; // 2023

    // Metodos...
    String primeiroNome = "Barata";
    String segundoNome = "Ribeiro";
    String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
    System.out.println(nomeCompleto);
  }

  public static String nomeCompleto(String primeiroNome, String segundoNome) {
    return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
  }
}
