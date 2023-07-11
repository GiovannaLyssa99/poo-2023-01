package com.github.giovannalyssa99.ufg.poo.t18;

import java.util.ArrayList;
import java.util.List;

public class Partida {
    protected String nome;
    protected List<Lance> lances;

    public Partida(String nome) {
        this.nome = nome;
        this.lances = new ArrayList<Lance>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarLance(Lance lance) {
        this.lances.add(lance);
    }

    public void lePartida() {
        int t = this.lances.size();
        for(int i = 0; i < t; i++){
            Lance l = lances.get(i);
            System.out.println(l.toString());
        }
    }
}