package com.github.giovannalyssa99.ufg.poo.t09;

import java.util.List;

public class Cidade {
    public String nome;
    public List<Armazem> armazens;

    public void adicionarArmazem(Armazem armazem) {
        armazem.setCidade(this);
        armazens.add(armazem);
    }
}