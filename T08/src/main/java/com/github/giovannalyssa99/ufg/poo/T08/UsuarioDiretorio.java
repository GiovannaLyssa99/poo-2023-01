package com.github.giovannalyssa99.ufg.poo.T08;

import java.util.List;

public class UsuarioDiretorio {
    private String nome;
    private List<Diretorio> diretoriosPertencidos;

    public void adicionarDiretorio(Diretorio diretorio) {
        diretoriosPertencidos.add(diretorio);
        diretorio.setDono(this);
    }
}