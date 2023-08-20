package edu.barata.classes;

// Criando objetos a partir da classe Student

public class School {
  public static void main(String[] args) throws Exception {
    Student student1 = new Student();
    student1.name = "John";
    student1.age = 12;
    student1.color = Color.FAIR;
    student1.sex = Sex.MALE;

    Lunch lunch1 = new Lunch("sanduíche");
    Juice juice1 = new Juice("laranja");
    student1.eating(lunch1);
    student1.drinking(juice1);
    student1.running();

    Student student2 = new Student();
    student2.name = "Sophia";
    student2.age = 10;
    student2.color = Color.FAIR;
    student2.sex = Sex.FEMALE;

    Lunch lunch2 = new Lunch("salada");
    Juice juice2 = new Juice("uva");
    student2.eating(lunch2);
    student2.drinking(juice2);
    student2.running();

    Student student3 = new Student();
    student3.name = "Lily";
    student3.age = 11;
    student3.color = Color.DARK;
    student3.sex = Sex.FEMALE;

    Lunch lunch3 = new Lunch("pizza");
    Juice juice3 = new Juice("maçã");
    student3.eating(lunch3);
    student3.drinking(juice3);
    student3.running();
  }
}
