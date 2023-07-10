package com.github.giovannalyssa99.ufg.poo.t10;

import java.util.List;

public class Guia extends Funcionario {
    private List<Passeio> passeios;

    public void adicionarPasseio(Passeio passeio) {
        passeio.setGuia(this);
        passeios.add(passeio);
    }
}