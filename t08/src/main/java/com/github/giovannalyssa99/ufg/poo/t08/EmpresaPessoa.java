package com.github.giovannalyssa99.ufg.poo.t08;

import java.util.List;

public class EmpresaPessoa {
    private String nome;
    private List<PessoaEmpresa> empregados;

    public void adicionarEmpregado(PessoaEmpresa pessoa) {
        empregados.add(pessoa);
    }
}