package com.trilhacollections.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
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
    numerosAleatorios.stream()
        .map(Integer::parseInt)
        .skip(3)
        .forEach(System.out::println);

    System.out.println();

    System.out.print("Retirando os números repetidos da lista, quantos números ficam? ");
    System.out.println(numerosAleatorios.stream()
        .map(Integer::parseInt)
        .distinct()
        .count());

    System.out.println();

    System.out.print("Mostre o menor valor da lista: ");
    listaNumerosInteiros.stream()
        .mapToInt(Integer::intValue)
        .min()
        .ifPresent(System.out::println);

    System.out.print("Mostre o maior valor da lista: ");
    listaNumerosInteiros.stream()
        .mapToInt(Integer::intValue)
        .max()
        .ifPresent(System.out::println);

    System.out.println();

    System.out.print("Pegue apenas os números pares e some: ");
    System.out.println(numerosAleatorios.stream()
        .map(Integer::parseInt)
        .filter(i -> i % 2 == 0)
        .mapToInt(Integer::intValue)
        .sum());

    System.out.println();

    System.out.println("Mostre a lista na ordem númerica: ");
    List<Integer> numerosOrdemNumerica = listaNumerosInteiros.stream()
        .sorted(Comparator.naturalOrder())
        .collect(Collectors.toList());
    System.out.println(numerosOrdemNumerica);

    System.out.println();

    System.out.println("Agrupe os valores ímpares múltiplos de 3 ou de 5:");
    Map<Boolean, List<Integer>> valoresImparesMultiplosDe3E5 = listaNumerosInteiros.stream()
        .collect(Collectors.groupingBy(i -> (i % 3 == 0 || i % 5 == 0)));
    System.out.println(valoresImparesMultiplosDe3E5);
  }

}
