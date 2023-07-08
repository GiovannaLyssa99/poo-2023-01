package com.github.giovannalyssa99.ufg.poo.t09;

import java.util.List;

public class Pessoa {
    public String nome;
    private int idade;
    private List<Habito> habitos;

    public void adicionarHabito(Habito habito){
        habito.setPessoa(this);
        habitos.add(habito);
    }
}