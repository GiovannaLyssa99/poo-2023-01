package com.github.giovannalyssa99.ufg.poo.t11;

public class Funcionario {
    private Lanchonete lanchonete;
    private String cargo;

    public void contratacaoNormal(Lanchonete lanchonete) {
        this.lanchonete = lanchonete;
    }

    public void contratacaoGerente(Lanchonete lanchonete) {
        this.lanchonete = lanchonete;
        lanchonete.setGerente(this);
    }
}