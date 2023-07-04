package com.github.giovannalyssa99.ufg.poo.t07;

public class Prova {
    private byte numQuestoes;

    public byte getNumQuestoes() {
        return numQuestoes;
    }

    public void setNumQuestoes (byte n) {
        if (n > 0) {
            numQuestoes = n;
        }
    }
}