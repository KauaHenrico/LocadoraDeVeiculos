package com.locadora;

import java.util.NoSuchElementException;

public class LDEClientes {
    private NohClientes primeiro;
    private NohClientes ultimo;
    private int tamanho;

    // Construtor
    public LDEClientes() {
        this.primeiro = null;
        this.ultimo = null;
        this.tamanho = 0;
    }

    // Verifica se a lista está vazia
    public boolean vazia() {
        return this.primeiro == null;
    }

    // Retorna o tamanho da lista
    public int tamanho() {
        return this.tamanho;
    }

    // Insere um novo cliente no início da lista
    public void insereInicio(Cliente cliente) {
        NohClientes novoNoh = new NohClientes(cliente);
        if (this.vazia()) {
            this.primeiro = novoNoh;
            this.ultimo = novoNoh;
        } else {
            novoNoh.setProximo(this.primeiro);
            this.primeiro.setAnterior(novoNoh);
            this.primeiro = novoNoh;
        }
        this.tamanho++;
    }

    // Insere um novo cliente no fim da lista
    public void insereFim(Cliente cliente) {
        NohClientes novoNoh = new NohClientes(cliente);
        if (this.vazia()) {
            this.primeiro = novoNoh;
            this.ultimo = novoNoh;
        } else {
            novoNoh.setAnterior(this.ultimo);
            this.ultimo.setProximo(novoNoh);
            this.ultimo = novoNoh;
        }
        this.tamanho++;
    }

    // Insere um novo cliente em uma posição específica
    public void inserePosicao(Cliente cliente, int posicao) throws IndexOutOfBoundsException {
        if (posicao < 0 || posicao > this.tamanho) {
            throw new IndexOutOfBoundsException("Posição inválida!");
        }
        if (posicao == 0) {
            this.insereInicio(cliente);
        } else if (posicao == this.tamanho) {
            this.insereFim(cliente);
        } else {
            NohClientes novoNoh = new NohClientes(cliente);
            NohClientes nohAtual = this.primeiro;
            for (int i = 0; i < posicao - 1; i++) {
                nohAtual = nohAtual.getProximo();
            }
            novoNoh.setAnterior(nohAtual);
            novoNoh.setProximo(nohAtual.getProximo());
            nohAtual.getProximo().setAnterior(novoNoh);
            nohAtual.setProximo(novoNoh);
            this.tamanho++;
        }
    }

    // Remove o primeiro cliente da lista
    public void removeInicio() throws NoSuchElementException {
        if (this.vazia()) {
            throw new NoSuchElementException("A lista está vazia!");
        }
        if (this.tamanho == 1) {
            this.primeiro = null;
            this.ultimo = null;
        } else {
            this.primeiro = this.primeiro.getProximo();
            this.primeiro.setAnterior(null);
        }
        this.tamanho--;
    }

     // Remove o último nó da lista
     public void removeFim() {
        if (this.vazia()) {
            throw new IndexOutOfBoundsException("A lista está vazia!");
        } else if (this.tamanho == 1) {
            this.primeiro = null;
            this.ultimo = null;
            this.tamanho--;
        } else {
            NohClientes atual = this.ultimo;
            this.ultimo = atual.getAnterior();
            this.ultimo.setProximo(null);
            atual.setAnterior(null);
            this.tamanho--;
        }
    }

    // Remove um nó da lista, dado o CPF do cliente
    public void remove(String cpf) {
        if (this.vazia()) {
            throw new IndexOutOfBoundsException("A lista está vazia!");
        } else {
            NohClientes atual = this.primeiro;

            while (atual != null) {
                if (atual.getCliente().getCpf().equals(cpf)) {
                    if (atual == this.primeiro) {
                        this.removeInicio();
                    } else if (atual == this.ultimo) {
                        this.removeFim();
                    } else {
                        atual.getAnterior().setProximo(atual.getProximo());
                        atual.getProximo().setAnterior(atual.getAnterior());
                        atual.setProximo(null);
                        atual.setAnterior(null);
                        this.tamanho--;
                    }

                    return;
                }

                atual = atual.getProximo();
            }

            throw new IllegalArgumentException("O CPF informado não está na lista!");
        }
    }



    public boolean existeCliente(String cpf) {
        NohClientes aux = primeiro;
        while (aux != null) {
            if (aux.getCliente().getCpf().equals(cpf)) {
                return true;
            }
            aux = aux.getProximo();
        }
        return false;
    }
}
