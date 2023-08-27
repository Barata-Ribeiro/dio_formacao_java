public interface InterfaceConta {
  void sacar(double valor);

  void depositar(double valor);

  void transferir(InterfaceConta contaDestino, double valor);

  void imprimirExtrato();
}
