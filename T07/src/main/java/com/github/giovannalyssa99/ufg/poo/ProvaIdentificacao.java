package com.github.giovannalyssa99.ufg.poo;

class ProvaIdentificacao implements Identificacao {

    @Override
    public String getNome() {
        return null;
    }

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