public class Main {
  public static void main(String[] args) {
    Cliente jason = new Cliente();
    jason.setNome("Jason");

    Conta contaCorrente = new ContaCorrente(jason);
    Conta contaPoupanca = new ContaPoupanca(jason);

    contaCorrente.depositar(200);
    contaCorrente.imprimirExtrato();

    System.out.println();

    contaCorrente.transferir(contaPoupanca, 100);
    contaCorrente.imprimirExtrato();
    contaPoupanca.imprimirExtrato();
  }
}
