package repeticao.edu.barata.forloop;

public class ExemploForArrays {
  public static void main(String[] args) {

    // Em arrays, o indice de elementos começa em 0
    String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

    for (int x = 0; x < alunos.length; x += 1) {
      System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
    }

    // Forma abreviada
    for (String aluno : alunos) {
      System.out.println("Nome do aluno é: " + aluno);
    }

  }
}
