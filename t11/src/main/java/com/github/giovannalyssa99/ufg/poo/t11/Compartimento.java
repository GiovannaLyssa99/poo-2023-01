package com.github.giovannalyssa99.ufg.poo.t11;

import java.util.List;

public class Compartimento {
    private List<Livro> livros;
    private List<CD> cds;

    public void colocarLivro(Livro livro){
        if(this.livros.size() <= 2){
            livros.add(livro);
        }
        else{
            System.out.println("Não cabem mais livros neste compartimento");
        }
    }

    public void colocarCD(List<CD> cd) {
        int novaQuantidade = this.cds.size() + cd.size();

        if(novaQuantidade == 2 || novaQuantidade == 4 || novaQuantidade >= 7) {
            cds.addAll(cd);
        }
        else {
            System.out.println("Essa quantidade não é aceita");
        }
    }
}