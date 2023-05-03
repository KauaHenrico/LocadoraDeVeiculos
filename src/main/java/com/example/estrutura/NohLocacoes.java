package com.example.estrutura;

public class NohLocacoes {
    private Locacao locacao; //este exemplo armazena números inteiros
    private NohLocacoes ant; //destaque para o atributo ant de anterior
    private NohLocacoes prox;

    public NohLocacoes (Locacao locacao){
        this.locacao = locacao;
        this.ant = null;
        this.prox = null;
    }


    public Locacao getlocacao() {
        return this.locacao;
    }

    public void setlocacao(Locacao locacao) { this.locacao = locacao; }


    public NohLocacoes getProx() {
        return this.prox;
    }
    public void setProx(NohLocacoes n) { this.prox = n; }
    public NohLocacoes getAnt() {
        return this.ant;
    }
    public void setAnt(NohLocacoes n) { this.ant = n; }
}
