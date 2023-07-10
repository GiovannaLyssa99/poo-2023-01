package com.github.giovannalyssa99.ufg.poo.t10;

import java.util.List;

public class Passeio {
    private List<Cliente> participantes;
    private Guia guia;
    private String descricao;
    private String duracao;
    private double valor;
    private List<Equipamento> equipamentos;

    public void setGuia(Guia guia) {
        this.guia = guia;
    }

    public void adicionarParticipante(Cliente cliente) {
        cliente.adicionarPasseio(this);
        participantes.add(cliente);
    }

    public void adicionarEquipamento(Equipamento equipamento){
        equipamentos.add(equipamento);
    }
}