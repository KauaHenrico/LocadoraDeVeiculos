package com.locadora;



public interface ListaLocação {
    public void cadastra(locacao locacao);
    // public void insereFim(locacao locacao);
    public boolean estahVazia();
    public boolean remove(String placa);
    public int tamanho();
    public void imprime();
    public boolean busca(String placa);
   
    
}
