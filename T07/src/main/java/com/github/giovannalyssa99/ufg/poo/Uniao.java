package com.github.giovannalyssa99.ufg.poo;

import java.util.List;
import java.util.Objects;

public class Uniao {
    private List<PessoaDataNome> filhos;
    private PessoaDataNome[] parceiros;

    public void novoFilho(PessoaDataNome filho){
        filhos.add(filho);
    }

    public Uniao(PessoaDataNome a, PessoaDataNome b) {
        Objects.requireNonNull(a);
        Objects.requireNonNull(b);
        parceiros = new PessoaDataNome[] {a, b};
    }
}
