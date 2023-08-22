package edu.barata.visibilidade.lanchonete;

import edu.barata.visibilidade.lanchonete.area.cliente.Cliente;
import edu.barata.visibilidade.lanchonete.atendimento.Atendente;
import edu.barata.visibilidade.lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
  public static void main(String[] args) {
    Cozinheiro cozinheiro = new Cozinheiro();
    // ações que estabelecimento precisa ter ciência
    cozinheiro.adicionarSucoNoBalcao();
    cozinheiro.adicionarLancheNoBalcao();
    cozinheiro.adicionarComboNoBalcao();

    Atendente atendente = new Atendente();
    atendente.servindoMesa();
    atendente.receberPagamento();

    Cliente cliente = new Cliente();
    cliente.escolherLanche();
    cliente.fazerPedido();
    cliente.pagarConta();

    // não deveria, mas o estabelecimento
    // ainda não definiu normas de atendimento
    // cliente.pegarPedidoBalcao();
  }
}