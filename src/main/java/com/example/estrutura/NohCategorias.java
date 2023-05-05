package com.example.estrutura;

public class NohCategorias {
    private Categorias categoria; //este exemplo armazena números inteiros
    private NohCategorias ant; //destaque para o atributo ant de anterior
    private NohCategorias prox;

    public NohCategorias (Categorias categoria){
        this.categoria = categoria;
        this.ant = null;
        this.prox = null;
    }


    public Categorias getCategoria() {
        return this.categoria;
    }

    public void setcategoria(Categorias categoria) { this.categoria = categoria; }


    public NohCategorias getProx() {
        return this.prox;
    }
    public void setProx(NohCategorias n) { this.prox = n; }
    public NohCategorias getAnt() {
        return this.ant;
    }
    public void setAnt(NohCategorias n) { this.ant = n; }



}
