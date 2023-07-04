package com.github.giovannalyssa99.ufg.poo.T09;

public class CirculoV1 {
    private int centroX;
    private int centroY;
    private int raio;

    public void transladar (int dx, int dy){
        this.centroX = this.centroX + dx;
        this.centroY = this.centroY + dy;
    }
}