package com.github.giovannalyssa99.ufg.poo.T07;

import java.util.Set;

public class Festa {
    private Set<Convidado> convidados;

    public void novoConvidado(Convidado c) {
        convidados.add(c);
    }
    
    public Festa(Convidado c) {
        convidados.add(c);
    }
}