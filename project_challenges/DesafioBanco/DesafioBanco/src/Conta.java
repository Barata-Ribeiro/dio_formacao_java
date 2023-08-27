public abstract class Conta implements InterfaceConta {

  private static final int AGENCIA_PADRAO = 1;
  private static int SEQUENCIAL = 1;

  protected int agencia;
  protected int numero;
  protected double saldo;

  public Conta() {
    this.agencia = Conta.AGENCIA_PADRAO;
    this.numero = SEQUENCIAL += 1;
  }

  @Override
  public void sacar(double valor) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'sacar'");
  }

  @Override
  public void depositar(double valor) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'depositar'");
  }

  @Override
  public void transferir(Conta contaDestino, double valor) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'transferir'");
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
