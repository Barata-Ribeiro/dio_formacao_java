package com.trilhacollections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*Faça um programa que receba a temperatura média os 6 primeiros meses do ano e armazene-as em uma lista.
Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
*/

public class ExercicioPropostoUm {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    List<Double> temperaturas = new ArrayList<>();
    String[] meses = { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro",
        "Outubro", "Novembro", "Dezembro" };

    for (int i = 0; i < 6; i += 1) {
      System.out.println("Digite a temperatura do mês de " + meses[i] + ": ");
      temperaturas.add(input.nextDouble());
    }

    Iterator<Double> it = temperaturas.iterator();
    Double soma = 0d;
    while (it.hasNext())
      soma += it.next();

    Double media = soma / temperaturas.size();

    System.out.println("A média semestral das temperaturas é: " + media);
    for (int i = 0; i < temperaturas.size(); i += 1) {
      if (temperaturas.get(i) > media) {
        System.out.println(
            "A temperatura do mês de " + meses[i] + " está acima da média semestral. Temperatura: "
                + temperaturas.get(i));
      }
    }

  }

}
