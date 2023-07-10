package com.github.giovannalyssa99.ufg.poo.t10;

import java.util.List;

public class Mecanico extends Funcionario {
    private List<Concerto> concertos;

    public void adicionarConcerto(Concerto concerto) {
        concerto.setMecanico(this);
        concertos.add(concerto);
    }
}