package com.github.giovannalyssa99.ufg.poo.T08;

import java.util.List;

public class PessoaEmprego {
    private String nome;
    private List<Emprego> empregos;

    public void adicionarEmprego(Emprego emprego) {
        empregos.add(emprego);
        emprego.setEmpregado(this);
    }
}