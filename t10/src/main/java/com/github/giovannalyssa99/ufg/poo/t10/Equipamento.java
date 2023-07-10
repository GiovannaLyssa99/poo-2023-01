package com.github.giovannalyssa99.ufg.poo.t10;

import java.util.List;

public class Equipamento {
    private String tipo;
    private double precoAluguel;
    private List<Cliente> clientes;

    public void adicionarAluguel(Cliente cliente, Passeio passeio) {
        clientes.add(cliente);
        passeio.adicionarEquipamento(this);
        cliente.adicionarEquipamento(this);
    }
}