package com.github.giovannalyssa99.ufg.poo.t10;

import java.util.Date;

public class Concerto {
    private Mecanico mecanico;
    private Bicicleta bicicleta;
    private String descricao;
    private double valor;
    private Date dataInicio;
    private Date dataFim;

    public void setBicicleta(Bicicleta bicicleta) {
        this.bicicleta = bicicleta;
    }

    public void setMecanico(Mecanico mecanico) {
        this.mecanico = mecanico;
    }
}