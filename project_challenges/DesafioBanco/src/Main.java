import com.finansys.model.Cliente;
import com.finansys.model.Conta;
import com.finansys.model.ContaCorrente;
import com.finansys.model.ContaPoupanca;
import com.finansys.dao.Banco;

public class Main {
  public static void main(String[] args) {
    // Criar uma instância do banco
    Banco bancoFinansys = new Banco("FinanSys Bank");

    // Criar cliente
    Cliente jason = new Cliente("Jason Bourne", "292.935.330-90");
    Cliente jane = new Cliente("Jane Doe", "231.132.010-63");

    // Adicionar cliente ao banco
    bancoFinansys.adicionarCliente(jason);
    bancoFinansys.adicionarCliente(jane);

    // Criar contas para o cliente
    Conta contaCorrente = new ContaCorrente(jason);
    Conta contaPoupanca = new ContaPoupanca(jane);

    // Adicionar contas ao banco
    bancoFinansys.adicionarConta(contaCorrente);
    bancoFinansys.adicionarConta(contaPoupanca);

    // Realizar operações
    contaCorrente.depositar(200);
    contaCorrente.imprimirExtrato();

    System.out.println();

    // Transferencia de conta corrente para conta poupanca.
    contaCorrente.transferir(contaPoupanca, 100);

    System.out.println();

    // Imprimir extrato da conta corrente e conta poupanca
    contaCorrente.imprimirExtrato();
    contaPoupanca.imprimirExtrato();

    // Buscar cliente pelo nome e imprimir nome
    try {
      Cliente clienteBuscado = bancoFinansys.buscarClientePorNome("Jason Bourne");
      System.out.println("Cliente encontrado: " + clienteBuscado.getNome());
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

    // Buscar conta pelo número e imprimir saldo
    try {
      Conta contaBuscada = bancoFinansys.buscarContaPorNumero(contaCorrente.getNumero());
      System.out.println("Saldo da conta buscada: " + contaBuscada.getSaldo());
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

    // Listagem dos clientes e contas existentes no banco
    System.out.println(bancoFinansys.getClientes());
    System.out.println(bancoFinansys.getContas());
  }
}
