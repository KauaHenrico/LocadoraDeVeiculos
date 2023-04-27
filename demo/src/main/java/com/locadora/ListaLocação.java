package com.locadora;

import java.util.Date;

import javax.xml.crypto.Data;

public interface ListaLocação {
    public void cadastra(locacao locacao);
    // public void insereFim(locacao locacao);
    public boolean estahVazia();
    public boolean remove(String placa);
    public int tamanho();
    public void imprime();
    public boolean busca(String placa);
    public void locarVeiculo(String placa, String cpf, Date dataLocacao, Date dataDevolucao);
    
}
