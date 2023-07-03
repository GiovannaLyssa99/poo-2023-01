package com.github.giovannalyssa99.ufg.poo.T11;

import java.util.List;

public class Lanchonete {
    private Funcionario gerente;
    private List<Funcionario> funcionarios;
    
    public void testeQuantidadeFuncionarios(){
        if(funcionarios.size() < 2){
            System.out.println("Uma lanchonete deve possuir pelo menos dois funcionarios");
        }
    }
}