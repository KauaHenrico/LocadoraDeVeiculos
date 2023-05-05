package com.example.estrutura;

public interface ListaLocacao {
    public void cadastra(Locacao locacao);
    // public void insereFim(locacao locacao);
    public boolean estahVazia();
    public boolean remove(String placa);
    public int tamanho();
    public void imprime();
    public boolean busca(String placa);


}
