package com.github.giovannalyssa99.ufg.poo.T08;

import java.util.List;

public class Curva {
    private List<Ponto> pontos;

    public void adicionarPonto(Ponto ponto) {
        pontos.add(ponto);
    }

    public void verificarPontosSuficientes() {
        if (pontos.size() < 2) {
            throw new IllegalArgumentException("Uma curva deve ter pelo menos 2 pontos.");
        }
}
}