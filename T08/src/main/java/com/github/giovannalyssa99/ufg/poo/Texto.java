package com.github.giovannalyssa99.ufg.poo;

import java.util.List;

public class Texto {
    public List<Paragrafo> paragrafos;

    public void novoParagrafo(Paragrafo paragrafo){
        paragrafos.add(paragrafo);
    }
}