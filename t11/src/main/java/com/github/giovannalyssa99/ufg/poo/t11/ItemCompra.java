package com.github.giovannalyssa99.ufg.poo.t11;

public class ItemCompra {
    protected Produto item;
    protected int quantidade;
    protected double valorTotal = this.item.preco*this.quantidade;
}