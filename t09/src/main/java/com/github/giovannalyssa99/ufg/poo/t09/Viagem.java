package com.github.giovannalyssa99.ufg.poo.t09;

import java.util.List;

public class Viagem {
    private CaixeiroViajante viajante;
    private List<Cidade> paradas;
    private List<ListaDePedidos> listas;

    public void adicionarParada(Cidade parada){
        paradas.add(parada);
    }

    public void adicionarLista(ListaDePedidos lista){
        listas.add(lista);
    }
}