package com.github.giovannalyssa99.ufg.poo.t07;

import java.util.Objects;

public class Nota implements Comparable<Nota> {
    private double pontos;
    private Prova prova;

    public Nota(Prova prova, double pontos) {
        Objects.requireNonNull(prova);
        this.prova = prova;
        this.pontos = pontos;
    }

    @Override
    public int compareTo(Nota o) {
        if (prova == null || o.prova == null) {
            throw new IllegalArgumentException("A prova não foi identificada");
        }

        if (prova != o.prova) {
            throw new IllegalArgumentException("Provas diferentes não podem ser comparadas");
        }

        double d = pontos - o.pontos;

        if (Math.abs(d) < 0.01) {
            return 0;
        }

        return d < 0 ? -1 : 1;
       }

       @Override
       public String toString() {
        return "Nota{" + "valor=" + pontos + "}";
       }
}