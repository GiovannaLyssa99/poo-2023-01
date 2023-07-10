package com.github.giovannalyssa99.ufg.poo.t10;

import java.util.Date;

public class Atendimento {
    private Atendente atendente;
    private Cliente cliente;
    private Date data;

    public void setAtendente(Atendente atendente) {
        this.atendente = atendente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}