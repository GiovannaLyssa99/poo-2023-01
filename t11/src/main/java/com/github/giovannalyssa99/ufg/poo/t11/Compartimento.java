package com.github.giovannalyssa99.ufg.poo.T11;

import java.util.List;

public class Compartimento {
    private List<Livro> livros;
    private List<CD> cds;

    public void colocarLivro(Livro livro){
        if(livros.size() <= 2){
            livros.add(livro);
        }
        else{
            System.out.println("Não cabem mais livros neste compartimento");
        }
    }

    public void colocarCD(CD cd){
        int novaQuantidade = cds.size() + 1;

        if(novaQuantidade == 2 || novaQuantidade == 4 || novaQuantidade >= 7){
            cds.add(cd);
        }
        else{
            System.out.println("Essa quantidade não é aceita");
        }
    }
}