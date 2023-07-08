package com.github.giovannalyssa99.ufg.poo.t08;

import java.util.Date;

public class Emprego {
    private Empresa empresa;
    private PessoaEmprego empregado;
    private double salario;
    private Date inicio;
    private Date fim;

    public void setEmpregado(PessoaEmprego empregado) {
        this.empregado = empregado;
    }
}