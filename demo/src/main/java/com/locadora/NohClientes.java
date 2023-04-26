package com.locadora;

public class NohClientes {
    private Cliente cliente;
    private NohClientes proximo;
    private NohClientes anterior;

    public NohClientes(Cliente cliente) {
        this.cliente = cliente;
        this.proximo = null;
        this.anterior = null;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public NohClientes getProximo() {
        return proximo;
    }

    public void setProximo(NohClientes proximo) {
        this.proximo = proximo;
    }

    public NohClientes getAnterior() {
        return anterior;
    }

    public void setAnterior(NohClientes anterior) {
        this.anterior = anterior;
    }
}

