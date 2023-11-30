package subsistema2.cep;

public class ApiCep {
  private static ApiCep instancia = new ApiCep();

  private ApiCep() {
    super();
  }

  public static ApiCep getInstance() {
    return instancia;
  }

  public String recuperarCidade(String cep) {
    return "Rio de Janeiro";
  }

  public String recuperarEstado(String cep) {
    return "RJ";
  }
}
