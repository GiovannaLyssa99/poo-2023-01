package com.github.giovannalyssa99.ufg.poo.T08;

import java.util.List;

public class Grupo {
    private String nome;
    private List<Usuario> usuarios;
    private List<Permissao> permissoes;

    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void adicionarPermissao(Permissao permissao) {
        permissoes.add(permissao);
    }
}