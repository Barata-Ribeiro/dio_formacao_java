package edu.barata.operadores;

public class Operadores {
  public static void main(String[] args) {

    // Atribuição
    String nome = "Barata";
    int idade = 27;
    double peso = 89.7;
    char sexo = 'M';
    boolean doadorOrgao = false;
    // Date dataNascimento = new Date();

    // Aritiméticos
    double soma = 10.5 + 15.7;
    int subtração = 113 - 25;
    int multiplicacao = 20 * 7;
    int divisao = 15 / 3;
    int modulo = 18 % 3;
    double resultado = (10 * 7) + (20 / 4);

    // classe Operadores.java
    String nomeCompleto = "LINGUAGEM" + "JAVA";
    System.out.println(nomeCompleto);

    // qual o resultado das expressoes abaixo?
    String concatenacao = "?";

    concatenacao = 1 + 1 + 1 + "1"; // 31
    System.out.println(concatenacao);

    concatenacao = 1 + "1" + 1 + 1; // 1111
    System.out.println(concatenacao);

    concatenacao = 1 + "1" + 1 + "1"; // 1111
    System.out.println(concatenacao);

    concatenacao = "1" + 1 + 1 + 1; // 1111
    System.out.println(concatenacao);

    concatenacao = "1" + (1 + 1 + 1); // 13
    System.out.println(concatenacao);
  }
}
