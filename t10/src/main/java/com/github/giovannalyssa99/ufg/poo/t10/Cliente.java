package com.github.giovannalyssa99.ufg.poo.t10;

import java.util.List;

public class Cliente extends Pessoa {
    private double numCadastro;
    private List<Bicicleta> bicicletas;
    private List<Atendimento> atendimentos;
    private List<Passeio> passeios;
    private List<Equipamento> equipamentos;

    public void adicionarBicicleta(Bicicleta bicicleta) {
        bicicleta.setDono(this);
        bicicletas.add(bicicleta);
    }

    public void adicionarAtendimento(Atendimento atendimento) {
        atendimento.setCliente(this);
        atendimentos.add(atendimento);
    }

    public void adicionarPasseio(Passeio passeio){
        passeios.add(passeio);
    }

    public void adicionarEquipamento(Equipamento equipamento) {
        equipamentos.add(equipamento);
    }
}