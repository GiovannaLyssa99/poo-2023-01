package com.github.giovannalyssa99.ufg.poo.t09;

import java.util.List;

public class Armazem {
    public Cidade localizacao;
    private List<ListaDePedidos> pedidos;

    public void setCidade(Cidade cidade) {
        this.localizacao = cidade;
    }

    public void adicionarLista (ListaDePedidos lista){
        lista.setPedinte(this);
        pedidos.add(lista);
    }
}