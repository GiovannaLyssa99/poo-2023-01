package com.github.giovannalyssa99.ufg.poo;

import java.util.List;

public class Paragrafo {
    public List<Sentenca> sentencas;

    public void novaSentenca(Sentenca sentenca){
        sentencas.add(sentenca);
    }
}