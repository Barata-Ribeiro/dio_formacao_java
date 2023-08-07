package edu.barata.anatomiadasclasses;

public class Nomenclaturas {

  // Formas incorretas
  double salMedio = 1500.23; // variável abreviada, o que dificulta a compreensão
  String emails = "aluno@escola.com"; // confuso se a variável seria um array ou único e-mail
  String myName = "JOSEPH"; // se idioma pt-BR, o valor poder ser de outro idioma mas o nome da variável não

  // Formas corretas
  double salarioMedio = 1500.23;
  String email = "aluno@escola.com";
  String[] emails2Strings = { "aluno@escola.com", "professor@escola.com" };
  String meuNome = "JOSEPH";

  // Métodos
  public int somar(int n1, int n2) {
    return n1 + n2;
  }

  public void abrirConexao() {
    // Implementação da abertura de conexão
  }

  public void concluirProcessamento() {
    // Implementação da conclusão de processamento
  }

  public Object findById(int id) { // não se assuste, você verá muito método em inglês em sua jornada
    // Implementação da busca por ID e retorno do objeto correspondente
    return null;
  }

  public void calcularEImprimir() { // há algo de errado neste método, ele deveria ter uma única finalidade
    // Método separado para calcular e imprimir o resultado
    int resultado = 42; // Exemplo de cálculo
    System.out.println("O resultado é: " + resultado);
  }

}
