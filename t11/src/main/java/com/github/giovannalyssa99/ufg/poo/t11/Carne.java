package com.github.giovannalyssa99.ufg.poo.t11;

import java.util.List;

public class Carne {
    private Compra compra;
    private List<Prestacoes> parcelas;
    protected double numParcelas = this.parcelas.size();
    protected double valorCarne = this.compra.valorCompra;
}