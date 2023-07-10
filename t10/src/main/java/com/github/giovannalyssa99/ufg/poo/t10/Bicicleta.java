package com.github.giovannalyssa99.ufg.poo.t10;

import java.util.List;

public class Bicicleta {
    private Cliente dono;
    private String marca;
    private int aro;
    private List<Concerto> concertos;

    public void setDono(Cliente cliente) {
        this.dono = cliente;
    }

    public void adicionarConcerto(Concerto concerto) {
        concerto.setBicicleta(this);
        concertos.add(concerto);
    }
}