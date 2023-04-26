package com.locadora;
import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class TestCliente {

    //criação do teste para criação do cliente
    @Test
    public void testCliente(){
        Cliente cliente = new Cliente("João", "12345678910", "999999999", "12345678910");
        assertEquals("João", cliente.getNome());
        assertEquals("12345678910", cliente.getCpf());
        assertEquals("999999999", cliente.getTelefone());
        assertEquals("12345678910", cliente.getCnh());
    }

    //teste da função com a remoção do cliente
    @Test
    public void testRemoverCliente(){
        LDEClientes lista = new LDEClientes();
        Cliente cliente = new Cliente("João", "12345678910", "999999999", "12345678910");
        lista.insereInicio(cliente);
        lista.remove("12345678910");
        assertEquals(0, lista.tamanho());
    }

    //teste de listar todos os clientes (5 clientes cadastrados)
    @Test
    public void testListaClientes(){
    LDEClientes lista = new LDEClientes();
    Cliente cliente = new Cliente("João", "12345678910", "999999999", "12345678910");
    lista.insereInicio(cliente);
    Cliente cliente2 = new Cliente("Maria", "12345678911", "999999998", "12345678911");
    lista.insereInicio(cliente2);
    Cliente cliente3 = new Cliente("Pedro", "12345678912", "999999997", "12345678912");
    lista.insereInicio(cliente3);
    Cliente cliente4 = new Cliente("Ana", "12345678913", "999999996", "12345678913");
    lista.insereInicio(cliente4);
    Cliente cliente5 = new Cliente("Julia", "12345678914", "999999995", "12345678914");
    lista.insereInicio(cliente5);
    assertEquals(5, lista.tamanho());
}
}
