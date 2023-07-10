package com.github.giovannalyssa99.ufg.poo.t11;

import java.util.List;

public class Pessoa {
    public String nome;
    private String genero;
    private List<Cadeira> cadeiras;

    public void adicionarCadeira(Cadeira cadeira) {
        cadeira.setDono(this);
        cadeiras.add(cadeira);
    }
}