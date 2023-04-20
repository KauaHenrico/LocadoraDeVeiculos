package com.locadora;
public class Veiculo {
    private String nome;
    private int id;
    private String placa;
    private String modelo;
    private int ano;
    private float potencia;
    private int lugares;
    private String marca;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public float getPotencia() {
        return potencia;
    }

    public void setPotencia(float potencia) {
        this.potencia = potencia;
    }

    public int getLugares() {
        return lugares;
    }

    public void setLugares(int lugares) {
        this.lugares = lugares;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

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

    public Veiculo(String nome, int id , String placa, String modelo, int ano, float potencia, int lugares, String marca) {
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
        if(placa == null || placa.trim().isEmpty()) {
            throw new IllegalArgumentException("A placa do veículo não pode ser nula ou vazia.");
        }else {
            this.placa = placa;
        }
        if(modelo == null || modelo.trim().isEmpty()) {
            throw new IllegalArgumentException("O modelo do veículo não pode ser nulo ou vazio.");
        }else {
            this.modelo = modelo;
        }
        if(ano < 0) {
            throw new IllegalArgumentException("O ano do veículo não pode ser negativo.");
        }else {
            this.ano = ano;
        }
        if(potencia < 0) {
            throw new IllegalArgumentException("A potência do veículo não pode ser negativa.");
        }else {
            this.potencia = potencia;
        }
        if(lugares < 0) {
            throw new IllegalArgumentException("O número de lugares do veículo não pode ser negativo.");
        }else {
            this.lugares = lugares;
        }
        if(marca == null || marca.trim().isEmpty()) {
            throw new IllegalArgumentException("A marca do veículo não pode ser nula ou vazia.");
        }else {
            this.marca = marca;
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
