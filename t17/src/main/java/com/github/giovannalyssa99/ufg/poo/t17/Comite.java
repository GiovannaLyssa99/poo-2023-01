package com.github.giovannalyssa99.ufg.poo.t17;

import java.util.List;

public class Comite {
    private List<PessoaComite> membros;
    private List<PessoaComite> presidentes;

    public void testaQuantidadePresidentes() {
        if(presidentes.size() != 2 && presidentes.size() != 3){
            System.out.println("Um comitê deve ter dois ou três presidentes.");
        }
    }
}