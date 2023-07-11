package com.github.giovannalyssa99.ufg.poo.t18;

public class Posicao {
    protected String x;
    protected String y;

    public String getX() {
        return x;
    }

    public String getY() {
        return y;
    }

    public void setX(String x) {
        this.x = x;
    }

    public void setY(String y) {
        this.y = y;
    }

    public String toString() {
        return x + y;
    }
}