package com.github.giovannalyssa99.ufg.poo.T09;

import java.util.List;

public class Pessoa {
    public String nome;
    private int idade;
    List<Habito> habitos;

    public void adicionarHabito(Habito habito){
        habito.setPessoa(this);
        habitos.add(habito);
    }
}