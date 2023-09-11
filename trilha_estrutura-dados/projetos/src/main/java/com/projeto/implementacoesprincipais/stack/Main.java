package com.projeto.implementacoesprincipais.stack;

import java.util.Stack;

public class Main {

  public static void main(String[] args) {

    Stack<Carro> stackCarros = new Stack<>();

    stackCarros.push(new Carro("Fusca"));
    stackCarros.push(new Carro("Chevrolet"));
    stackCarros.push(new Carro("Fiat"));

    System.out.println(stackCarros);
    System.out.println(stackCarros.pop());
    System.out.println(stackCarros);

    System.out.println(stackCarros.peek());
    System.out.println(stackCarros);

    System.out.println("Está vazia? " + stackCarros.empty());

  }

}
