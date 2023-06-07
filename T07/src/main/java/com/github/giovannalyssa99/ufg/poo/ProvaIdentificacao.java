package com.github.giovannalyssa99.ufg.poo;

class ProvaIdentificacao implements Identificacao {
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
