package com.projeto.arvorebinaria;

import com.projeto.arvorebinaria.model.Obj;

public class Main {

  public static void main(String[] args) {

    ArvoreBinaria<Obj> minhaAvore = new ArvoreBinaria<>();

    minhaAvore.inserir(new Obj(13));
    minhaAvore.inserir(new Obj(10));
    minhaAvore.inserir(new Obj(25));
    minhaAvore.inserir(new Obj(2));
    minhaAvore.inserir(new Obj(12));
    minhaAvore.inserir(new Obj(20));
    minhaAvore.inserir(new Obj(31));
    minhaAvore.inserir(new Obj(29));
    minhaAvore.inserir(new Obj(32));

    minhaAvore.exibirInOrdem();
    minhaAvore.exibirPreOrdem();
    minhaAvore.exibirPosOrdem();

  }

}
