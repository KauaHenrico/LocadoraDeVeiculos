package com.locadora;
public interface Lista {
    public void insereInicio(Object info);
    public void insereFim(Object info);
    public boolean estahVazia();
    public boolean remove(int id);
    public int tamanho();
    public void imprime();
    public boolean busca(Object nome);
    }