package com.github.giovannalyssa99.ufg.poo.t08;

import java.util.List;

public class Pais {
    public String nome;
    public Cidade capital;
    public List<Cidade> cidades;

    public void adicionarCidade(Cidade cidade) {
        cidade.setPais(this);
        cidades.add(cidade);
    }
}