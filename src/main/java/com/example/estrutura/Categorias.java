package com.example.estrutura;

import java.util.HashMap;
import java.util.Map;

public class Categorias {
    private int id;
    private String nome;

    public Categorias(int id, String nome){
        this.id = id;
        this.nome = nome;
    }

    private Map<Integer, String> categorias = new HashMap<>();

    public Map<Integer, String> getCategorias() {
        return categorias;
    }
    public void setCategorias(Map<Integer, String> categorias) {
        this.categorias = categorias;
    }
    public int getId(){
        return this.id;
    }
    public String getNome(){
        return this.nome;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Categorias{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
    

    

}
