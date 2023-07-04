package com.github.giovannalyssa99.ufg.poo.T08;

import java.util.List;

public class Pais {
    private String nome;
    private Cidade capital;
    private List<Cidade> cidades;

    public void adicionarCidade(Cidade cidade) {
        cidade.setPais(this);
        cidades.add(cidade);
    }
}