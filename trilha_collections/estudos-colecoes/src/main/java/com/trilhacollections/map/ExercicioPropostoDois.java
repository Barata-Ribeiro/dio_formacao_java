package com.trilhacollections.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/*
Faça um programa que simule um lançamento de dados. Lance o dado 100 vezes e armazene.
Depois, mostre quantas vezes cada valor foi conseguido.
 */

public class ExercicioPropostoDois {

  public static void main(String[] args) {

    int quantidadeLancamentos = 100;
    List<Integer> valoresLancamentos = new ArrayList<>();
    Random numeroRandomico = new Random();
    for (int i = 0; i < quantidadeLancamentos; i += 1) {
      int numero = numeroRandomico.nextInt(6) + 1;
      valoresLancamentos.add(numero);
    }

    Map<Integer, Integer> lancamentos = new HashMap<>();
    for (int valor : valoresLancamentos) {
      if (lancamentos.containsKey(valor))
        lancamentos.put(valor, lancamentos.get(valor) + 1);
      else
        lancamentos.put(valor, 1);
    }

    System.out.print("Jogando");
    for (int i = 0; i < 3; i += 1) {
      try {
        Thread.sleep(1000);
        System.out.print(".");
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }

    System.out.println();
    System.out.println("\nValor " + " Quantidade de vezes");
    for (Map.Entry<Integer, Integer> entry : lancamentos.entrySet()) {
      System.out.printf("%3d %12d\n", entry.getKey(), entry.getValue());
    }
  }
}
