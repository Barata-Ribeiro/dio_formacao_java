package com.barataribeiro.gof.facade;

import subsistema1.crm.CrmService;
import subsistema2.cep.ApiCep;

public class Facade {
  public void migrarCliente(String nome, String cep) {
    String cidade = ApiCep.getInstance().recuperarCidade(cep);
    String estado = ApiCep.getInstance().recuperarEstado(cep);

    CrmService.gravarCliente(nome, cep, cidade, estado);
  }
}
