package edu.barata.contabancaria;

import java.util.Locale;
import java.util.Scanner;

/**
 * <h1>ContaTerminal</h1>
 * A classe ContaTerminal é um programa de terminal simples para criar uma nova
 * conta bancária. Desafio proposto pelo professor Gleyson Sampaio, da DIO.me.
 * <p>
 * O usuário é solicitado a fornecer informações como número da conta, agência,
 * nome e saldo inicial.
 * Todas as informações de entrada são validadas para garantir que sejam
 * aceitáveis e em um formato correto.
 * Após inserir todos os detalhes, uma mensagem de agradecimento é exibida com
 * os detalhes da conta.
 * </p>
 * 
 * @author Barata Ribeiro
 * @version 1.0
 * @since 2023-08-12
 */
public class ContaTerminal {

  /**
   * Ponto de entrada principal do programa.
   *
   * @param args Argumentos da linha de comando (não utilizados neste programa)
   */
  public static void main(String[] args) {
    int numero = 0;
    String agencia = "";
    String nomeCliente = "";
    float saldo = 0;

    Scanner input = new Scanner(System.in);
    input.useLocale(Locale.US);

    System.out.println("Vamos cadastrar sua nova conta?");

    // Solicita e valida o número da conta
    do {
      System.out.print("Digite o número da conta: ");
      numero = input.nextInt();
      input.nextLine();
      if (numero <= 0) {
        System.out.println("Número da conta deve ser positivo e não pode estar vazio.");
      }
    } while (numero <= 0);

    // Solicita e valida o número da agência
    do {
      System.out.print("Digite o numero da agência: ");
      agencia = input.nextLine();
      if (agencia.trim().isEmpty()) {
        System.out.println("O número da agência não pode estar vazio.");
      }
    } while (agencia.trim().isEmpty());

    // Solicita e valida o nome do cliente
    do {
      System.out.print("Digite o seu nome: ");
      nomeCliente = input.nextLine();
      if (nomeCliente.trim().isEmpty()) {
        System.out.println("O nome não pode estar vazio.");
      }
    } while (nomeCliente.trim().isEmpty());

    // Solicita e valida o saldo inicial
    do {
      System.out.print("Digite o saldo inicial da conta: ");
      saldo = input.nextFloat();
      input.nextLine();
      if (saldo < 0) {
        System.out.println("O saldo não pode ser negativo.");
      }
    } while (saldo < 0);

    // Exibe a mensagem de confirmação com os detalhes da conta
    String mensagem = String.format(
        "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.",
        nomeCliente, agencia, numero, saldo);

    System.out.println(mensagem);
  }
}
