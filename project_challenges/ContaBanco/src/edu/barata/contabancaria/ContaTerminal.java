package edu.barata.contabancaria;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
  public static void main(String[] args) {
    int numero = 0;
    String agencia = "";
    String nomeCliente = "";
    float saldo = 0;

    Scanner input = new Scanner(System.in);
    input.useLocale(Locale.US);

    System.out.println("Vamos cadastrar sua nova conta?");

    do {
      System.out.print("Digite o número da conta: ");
      numero = input.nextInt();
      input.nextLine();
      if (numero <= 0) {
        System.out.println("Número da conta deve ser positivo e não pode estar vazio.");
      }
    } while (numero <= 0);

    do {
      System.out.print("Digite o numero da agência: ");
      agencia = input.nextLine();
      if (agencia.trim().isEmpty()) {
        System.out.println("O número da agência não pode estar vazio.");
      }
    } while (agencia.trim().isEmpty());

    do {
      System.out.print("Digite o seu nome: ");
      nomeCliente = input.nextLine();
      if (nomeCliente.trim().isEmpty()) {
        System.out.println("O nome não pode estar vazio.");
      }
    } while (nomeCliente.trim().isEmpty());

    do {
      System.out.print("Digite o saldo inicial da conta: ");
      saldo = input.nextFloat();
      input.nextLine();
      if (saldo < 0) {
        System.out.println("O saldo não pode ser negativo.");
      }
      
    } while (saldo < 0);

    String mensagem = String.format(
        "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.",
        nomeCliente, agencia, numero, saldo);

    System.out.println(mensagem);
  }
}
