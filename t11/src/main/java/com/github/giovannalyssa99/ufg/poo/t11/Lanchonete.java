package com.github.giovannalyssa99.ufg.poo.t11;

import java.util.List;

public class Lanchonete {
    private Funcionario gerente;
    private List<Funcionario> funcionarios;
    
    public void testeQuantidadeFuncionarios(){
        if(this.funcionarios.size() < 2){
            System.out.println("Uma lanchonete deve possuir pelo menos dois funcionarios");
        }
    }

    public void contratarFuncionario(Funcionario funcionario){
        funcionario.contratacaoNormal(this);
        funcionarios.add(funcionario);
    }

    public void setGerente(Funcionario gerente) {
        this.gerente = gerente;
    }
}