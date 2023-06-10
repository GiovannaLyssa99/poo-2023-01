package com.github.giovannalyssa99.ufg.poo;

import java.util.List;

public class Religiao {
    private List<Devoto> devotos;

    public void novoFiel(Devoto d) {
        devotos.add(d);
    }
}