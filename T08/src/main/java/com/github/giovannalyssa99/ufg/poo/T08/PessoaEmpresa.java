package com.github.giovannalyssa99.ufg.poo.T08;

import java.util.List;

public class PessoaEmpresa {
    private String nome;
    private List<EmpresaPessoa> empresas;

    public void adicionarEmpresa(EmpresaPessoa empresa) {
        empresas.add(empresa);
    }
}