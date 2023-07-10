package com.github.giovannalyssa99.ufg.poo.t11;

import java.util.List;

public class Floresta {
    public String nome;
    private List<Arvore> arvores;

    public void adicionarArvore(Arvore arvore) {
        arvore.adicionarFloresta(this);
        arvores.add(arvore);
    }
}
