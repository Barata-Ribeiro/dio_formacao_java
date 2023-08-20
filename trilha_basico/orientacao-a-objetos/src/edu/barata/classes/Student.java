package edu.barata.classes;

// Criando a classe Student
// Com todas as características e compartamentos aplicados

public class Student {
  String name;
  int age;
  Color color;
  Sex sex;

  void eating(Lunch lunch) {
    System.out.println(name + " está comendo " + lunch.getFood());
  }

  void drinking(Juice juice) {
    System.out.println(name + " está bebendo suco de " + juice.getFlavor());
  }

  void running() {
    System.out.println(name + " está correndo.");
  }
}
