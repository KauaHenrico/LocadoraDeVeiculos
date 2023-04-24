package com.locadora;
public interface Lista {
    public void insereInicio(Veiculo veiculo);
    public void insereFim(Veiculo veiculo);
    public boolean estahVazia();
    public boolean remove(Object placa);
    public int tamanho();
    public void imprime();
    public boolean busca(String placa);
    }