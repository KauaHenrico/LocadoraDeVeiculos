package com.example.estrutura;


public class Cliente {
    private String nome;
    private String cpf;
    private String telefone;
    private String cnh;

    public Cliente(String nome, String cpf, String telefone, String cnh) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.cnh = cnh;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCnh() {
        return this.cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }
    public String toString(){
        return "Nome: "+nome+";\nCPF: "+cpf+";\nTelefone: "+telefone+";\nCNH: "+cnh+".";
    }
}

