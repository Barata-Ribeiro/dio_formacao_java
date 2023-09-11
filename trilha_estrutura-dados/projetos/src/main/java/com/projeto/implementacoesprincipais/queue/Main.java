package com.projeto.implementacoesprincipais.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

  public static void main(String[] args) {

    Queue<Carro> queueCarros = new LinkedList<>();

    queueCarros.add(new Carro("Fusca"));
    queueCarros.add(new Carro("Ford"));
    queueCarros.add(new Carro("Renault"));
    queueCarros.add(new Carro("Fiat"));

    System.out.println(queueCarros);
    System.out.println(queueCarros.add(new Carro("Volvo")));
    System.out.println(queueCarros);

    System.out.println(queueCarros.offer(new Carro("Mitsubishi")));
    System.out.println(queueCarros);

    System.out.println(queueCarros.peek());
    System.out.println(queueCarros);
    
    System.out.println(queueCarros.poll());
    System.out.println(queueCarros);

    System.out.println(queueCarros.isEmpty());
    System.out.println(queueCarros.size());

  }

}
