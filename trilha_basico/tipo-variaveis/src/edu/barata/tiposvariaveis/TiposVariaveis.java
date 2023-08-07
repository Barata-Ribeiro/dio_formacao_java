package edu.barata.tiposvariaveis;

public class TiposVariaveis {

  // Declaração de Variáveis
  int idade; // Tipo "int", nome "idade", com nenhum valor atribuído.
  int anoFabricacao = 2021; // tipo "int", nome "anoFabricacao", com valor 2021.
  double salarioMinimo = 2500; // tipo "double", nome "salarioMinimo", valor 2500.
  // Cuidado!! 2.500 = 2,5

  public static void main(String[] args) {
    byte idade = 123;
    short ano = 2021;
    int cep = 21070333; // se começar com zero, talvez tenha que ser outro tipo
    long cpf = 98765432109L; // se começar com zero, talvez tenha que ser outro tipo
    float pi = 3.14F;
    double salario = 1275.33;

    short numeroCurto = 1;
    int numeroNormal = numeroCurto;
    // short numeroCurto2 = numeroNormal; // Isso o Java não irá permitir!
    short numeroCurto2 = (short) numeroNormal; // Possível solução

    // Constantes
    final double VALOR_DE_PI = 3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679;

    int numero = 5;
    numero = 10; // Sem "final" a varíavel pode ser alterada.
    System.out.println(numero);
  }
}
