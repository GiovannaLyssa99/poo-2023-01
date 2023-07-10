package com.github.giovannalyssa99.ufg.poo.t11;

import java.util.Date;

public class Prestacoes {
    private Carne carne;
    private Date vencimento;
    private double valor = this.carne.valorCarne/this.carne.numParcelas;
}