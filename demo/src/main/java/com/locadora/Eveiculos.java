package com.locadora;
public interface Eveiculos {
    
    public void cadastrarVeiculo(Veiculo veiculo);
    public void listarVeiculos(int id);
    public void buscarVeiculo(int id);
    public void editarVeiculo(int id);
    public void excluirVeiculo(int id);


}