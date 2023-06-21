package com.github.giovannalyssa99.ufg.poo.T08;

import java.util.List;

public class Diretorio {
    private String nome;
    private List<UsuarioDiretorio> usuariosAutorizados;
    private UsuarioDiretorio dono;

    public void adicionarAutorizacao(UsuarioDiretorio usuario) {
        usuariosAutorizados.add(usuario);
    }

    public void setDono(UsuarioDiretorio usuario){
        this.dono = usuario;
    }
}