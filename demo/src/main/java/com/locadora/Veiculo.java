package com.locadora;
public class Veiculo {
    private String nome;
    private int id;

    public Veiculo(String nome, int id) {
        if (id < 0) {
            throw new IllegalArgumentException("O ID do veículo não pode ser negativo.");
        }else {
            this.id = id;
        }
        if(nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome do veículo não pode ser nulo ou vazio.");
        }else {
            this.nome = nome;
        }
     
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    

}
