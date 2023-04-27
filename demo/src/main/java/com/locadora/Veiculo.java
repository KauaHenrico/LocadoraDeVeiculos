package com.locadora;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Veiculo {

    private String nome;
    private int categoria;
    private String placa;
    private String modelo;
    private int ano;
    private float potencia;
    private int lugares;
    private String marca;
    private int idCategoria;
    
    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    private Map<Integer, String> categorias = new HashMap<>();

   

    public Veiculo(String placa, String modelo, int ano, float potencia, int lugares, String marca, int categoria) {
        if (placa == null || placa.trim().isEmpty()) {
            throw new IllegalArgumentException("A placa do veículo não pode ser nula ou vazia.");
        } else {
            this.placa = placa;
        }
        if (modelo == null || modelo.trim().isEmpty()) {
            throw new IllegalArgumentException("O modelo do veículo não pode ser nulo ou vazio.");
        } else {
            this.modelo = modelo;
        }
        if (ano < 0) {
            throw new IllegalArgumentException("O ano do veículo não pode ser negativo.");
        } else {
            this.ano = ano;
        }
        if (potencia < 0) {
            throw new IllegalArgumentException("A potência do veículo não pode ser negativa.");
        } else {
            this.potencia = potencia;
        }
        if (lugares < 0) {
            throw new IllegalArgumentException("O número de lugares do veículo não pode ser negativo.");
        } else {
            this.lugares = lugares;
        }
        if (marca == null || marca.trim().isEmpty()) {
            throw new IllegalArgumentException("A marca do veículo não pode ser nula ou vazia.");
        } else {
            this.marca = marca;
        }
        if (categoria < 1000 || categoria > 1050) {
            throw new IllegalArgumentException("A categoria do veículo deve estar entre 1 e 5.");
        } else {
            this.categoria = categoria;
        }
        
        try {
            File file = new File("C:\\Users\\André\\OneDrive\\Documentos\\Unipampa\\EstruturaDeDados\\LocadoraDeVeiculos\\demo\\src\\main\\java\\com\\locadora\\Categorias.csv");
            Scanner scanner = new Scanner(file);
    
            // Ignora a primeira linha, que contém apenas os nomes das colunas
            scanner.nextLine();
    
            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine();
                String[] colunas = linha.split(";");
    
                int id = Integer.parseInt(colunas[0]);
                String nomeCategoria = colunas[1];
    
                categorias.put(id, nomeCategoria);
                if (id == this.categoria) {
                    this.idCategoria = id;
                }
            }
    
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }



    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

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

    public Map<Integer, String> getCategorias() {
        return categorias;
    }

    public void setCategorias(Map<Integer, String> categorias) {
        this.categorias = categorias;
    }

 

    

}
   