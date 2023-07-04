package com.github.giovannalyssa99.ufg.poo.T08;

import java.util.List;

public class Arquivo {
    private String nome;
    private List<Permissao> permissoes;

    public void adicionarPermissao(Permissao permissao) {
        permissoes.add(permissao);
    }
}