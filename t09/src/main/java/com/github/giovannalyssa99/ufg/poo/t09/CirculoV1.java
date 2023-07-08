package com.github.giovannalyssa99.ufg.poo.t09;

public class CirculoV1 {
    private double centroX;
    private double centroY;
    private double raio;

    public void transladar (double dx, double dy){
        this.centroX = this.centroX + dx;
        this.centroY = this.centroY + dy;
    }
}