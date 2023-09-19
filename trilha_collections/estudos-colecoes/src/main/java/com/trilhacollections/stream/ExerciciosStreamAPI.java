package com.trilhacollections.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExerciciosStreamAPI {

  public static void main(String[] args) {
    List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

    System.out.println("Imprima todos os elementos dessa lista de String: ");
    numerosAleatorios.forEach(System.out::println);

    System.out.println();

    System.out.println("Pegue os 5 primeiros números e coloque dentro de um Set:");
    numerosAleatorios.stream()
        .limit(5)
        .collect(Collectors.toSet())
        .forEach(System.out::println);

    System.out.println();

    System.out.println("Transforme esta lista de String em uma lista de números inteiros.");
    List<Integer> listaNumerosInteiros = numerosAleatorios.stream()
        .map(Integer::parseInt)
        .collect(Collectors.toList());
    listaNumerosInteiros.forEach(System.out::println);

    System.out.println();

    System.out.println("Pegue os números pares e maiores que 2 e coloque em uma lista:");
    List<Integer> listaParesMaioresQueDois = numerosAleatorios.stream()
        .map(Integer::parseInt)
        .filter(i -> i % 2 == 0 && i > 2)
        .collect(Collectors.toList());
    listaParesMaioresQueDois
        .forEach(System.out::println);

    System.out.println();

    System.out.println("Mostre a média dos números: ");
    numerosAleatorios.stream()
        .mapToInt(Integer::parseInt)
        .average()
        .ifPresent(System.out::println);

    System.out.println("Remova os valores ímpares: ");
    listaNumerosInteiros.removeIf(integer -> integer % 2 != 0);
    System.out.println(listaNumerosInteiros);

    System.out.println();

    // Para você
    System.out.println("Ignore os 3 primeiros elementos da lista e imprima o restante:");

    System.out.println("Retirando os números repetidos da lista, quantos números ficam? ");

    System.out.print("Mostre o menor valor da lista: ");

    System.out.print("Mostre o maior valor da lista: ");

    System.out.println("Pegue apenas os números pares e some: ");

    System.out.println("Mostre a lista na ordem númerica: ");

    System.out.println("Agrupe os valores ímpares múltiplos de 3 ou de 5:");
  }

}
