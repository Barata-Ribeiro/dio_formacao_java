package edu.barata.gettersesetters;

public class Escola {
  public static void main(String[] args) {
    Aluno felipe = new Aluno();
    felipe.setNome("Felipe");
    felipe.setIdade(8);
    felipe.setSexo("Masculino");

    System.out.println(
        "O aluno " + felipe.getNome() + " tem " + felipe.getIdade() + " anos e seu sexo é " + felipe.getSexo() + ".");

    Aluno Alice = new Aluno();
    Alice.setNome("Alice");
    Alice.setIdade(10);
    Alice.setSexo("Feminino");
    System.out.println(
        "A aluna " + Alice.getNome() + " tem " + Alice.getIdade() + " anos e seu sexo é " + Alice.getSexo() + ".");
  }
}
