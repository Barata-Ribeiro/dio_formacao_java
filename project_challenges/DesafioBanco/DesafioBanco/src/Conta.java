public abstract class Conta implements InterfaceConta {

  private static final int AGENCIA_PADRAO = 1;
  private static int SEQUENCIAL = 1;

  protected int agencia;
  protected int numero;
  protected double saldo;
  protected Cliente cliente;

  public Conta(Cliente cliente) {
    this.agencia = Conta.AGENCIA_PADRAO;
    this.numero = SEQUENCIAL += 1;
    this.cliente = cliente;
  }

  @Override
  public void sacar(double valor) {
    this.saldo -= valor;
  }

  @Override
  public void depositar(double valor) {
    this.saldo += valor;
  }

  @Override
  public void transferir(InterfaceConta contaDestino, double valor) {
    this.sacar(valor);
    contaDestino.depositar(valor);
    System.out.println("Transferencia de $" + valor + " realizada com sucesso!");
  }

  private String formatarNome(String nome) {
    StringBuilder nomeFormatado = new StringBuilder();

    for (int i = 0; i < nome.length(); i++) {
      char c = nome.charAt(i);
      if (i > 0 && Character.isUpperCase(c)) {
        nomeFormatado.append(' ');
      }
      nomeFormatado.append(c);
    }

    return nomeFormatado.toString();
  }

  @Override
  public void imprimirExtrato() {
    String nomeFormatado = formatarNome(this.getClass().getSimpleName());
    String jsonFormat = String.format(
        "{\n" +
            "  \"Extrato da conta\": \"%s\",\n" +
            "  \"Titular\": \"%s\",\n" +
            "  \"Agencia\": %d,\n" +
            "  \"Número\": %d,\n" +
            "  \"Saldo\": \"$%.2f\"\n" +
            "}",
        nomeFormatado, this.cliente.getNome(), this.agencia, this.numero, this.saldo);
    System.out.println(jsonFormat);
  }

  public int getAgencia() {
    return agencia;
  }

  public int getNumero() {
    return numero;
  }

  public double getSaldo() {
    return saldo;
  }

}
