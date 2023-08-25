package edu.dio.praticapilares;

import java.util.Scanner;

import edu.dio.praticapilares.apps.FacebookMessenger;
import edu.dio.praticapilares.apps.MSNMessenger;
import edu.dio.praticapilares.apps.ServicoMensagemInstantanea;
import edu.dio.praticapilares.apps.Telegram;

public class Computador {
  public static void main(String[] args) {

    ServicoMensagemInstantanea smi = null;

    /*
     * NÃO SE SABE QUAL APP
     * MAS QUALQUER UM DEVERÁ ENVIAR E RECEBER MENSAGEM
     */
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite o nome do aplicativo que deseja usar:");
    String appEscolhido = sc.nextLine();

    if (appEscolhido.equals("msn")) {
      System.out.println("Voc\u00EA abriu o MSN Messenger");
      smi = new MSNMessenger();
    } else if (appEscolhido.equals("fbm")) {
      System.out.println("Voc\u00EA abriu o Facebook Messenger");
      smi = new FacebookMessenger();
    } else if (appEscolhido.equals("tlg")) {
      System.out.println("Voc\u00EA abriu o Telegram");
      smi = new Telegram();
    }

    smi.enviarMensagem();
    smi.receberMensagem();
  }
}
