package com.github.giovannalyssa99.ufg.poo.t10;

import java.util.List;

public class Atendente extends Funcionario {
    private List<Atendimento> atendimentos;

    public void adicionarAtendimento(Atendimento atendimento) {
        atendimento.setAtendente(this);
        atendimentos.add(atendimento);
    }
}