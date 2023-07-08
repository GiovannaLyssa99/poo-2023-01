package com.github.giovannalyssa99.ufg.poo.t08;

import java.util.List;

public class ProjetoPessoa {
    private String nome;
    private List<Pessoa> pessoas;

    public void adicionarPessoa(Pessoa pessoa){
        pessoas.add(pessoa);
    }
}