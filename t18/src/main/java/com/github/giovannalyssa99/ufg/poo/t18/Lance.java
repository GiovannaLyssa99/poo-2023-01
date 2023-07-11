package com.github.giovannalyssa99.ufg.poo.t18;

public class Lance {
    protected String numero;
    protected Jogador jogador;
    protected Peca peca = new Peca();
    protected Posicao posicaoOrigem = new Posicao();
    protected Posicao posicaoDestino = new Posicao();

    public String getNumero() {
        return numero;
    }

    public Jogador getJogador() {
        return jogador;
    }

    public Peca getPeca() {
        return peca;
    }

    public Posicao getPosicaoOrigem() {
        return posicaoOrigem;
    }

    public Posicao getPosicaoDestino() {
        return posicaoDestino;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }

    public void setPeca(String tipo) {
        this.peca.tipo = tipo;
    }

    public void setPosicaoOrigem(String x, String y) {
        this.posicaoOrigem.x = x;
        this.posicaoOrigem.y = y;
    }

    public void setPosicaoDestino(String x, String y) {
        this.posicaoDestino.x = x;
        this.posicaoDestino.y = y;
    }

    public String toString() {
        return numero + this.jogador.toString() + " moveu a peça " + this.peca.toString() + " da casa " + this.posicaoOrigem.toString() + " para a casa " + this.posicaoDestino.toString() + "\n";
    }
}