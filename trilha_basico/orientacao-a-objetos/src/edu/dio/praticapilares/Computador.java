package edu.dio.praticapilares;

public class Computador {
  public static void main(String[] args) {
    System.out.println("MSN");
    MSNMessenger msn = new MSNMessenger();
    msn.enviarMensagem();
    msn.receberMensagem();

    System.out.println();

    System.out.println("Facebook");
    FacebookMessenger facebook = new FacebookMessenger();
    facebook.enviarMensagem();
    facebook.receberMensagem();

    System.out.println();

    System.out.println("Telegramg");
    Telegram telegram = new Telegram();
    telegram.enviarMensagem();
    telegram.receberMensagem();
  }
}
