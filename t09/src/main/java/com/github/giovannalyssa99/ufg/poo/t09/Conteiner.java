package com.github.giovannalyssa99.ufg.poo.t09;

import java.util.List;

public class Conteiner extends Elemento {
    private List<Objeto> conteudo;

    public void colocarItem(Objeto item){
        conteudo.add(item);
    }

    public void retirarItem(Objeto item){
        conteudo.remove(item);
    }
}