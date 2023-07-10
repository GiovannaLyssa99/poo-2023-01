package com.github.giovannalyssa99.ufg.poo.t11;

import java.util.List;

public class Arvore {
    protected List<Folha> folhas;
    protected List<Floresta> florestas;

    public void adicionarFolha(Folha folha) {
        folhas.add(folha);
        folha.setArvore(this);
    }

    public void adicionarFloresta(Floresta floresta) {
        florestas.add(floresta);
    }
}