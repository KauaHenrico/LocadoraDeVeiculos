package com.locadora;

import java.util.Date;

import javax.print.DocFlavor.STRING;

public class LDELocacao implements ListaLocação {
    private NohLocacoes inicio;
    private NohLocacoes fim;
    

    public LDELocacao() {
        this.inicio = null;
        this.fim = null;
    }
    @Override
    public void cadastra(locacao locacao) { //info = 5
        if(locacao instanceof locacao ){ 
        NohLocacoes novo = new NohLocacoes(locacao);
        if (inicio == null){
        inicio = novo;
        fim = novo;
        }else {
        novo.setProx(inicio);
        inicio.setAnt(novo);
        inicio = novo;}
        }else {
            System.out.println("Não é um veiculo");}
        }

   


    @Override
    public boolean estahVazia() {
         if (inicio == null){
            return true;
        }else {
            return false;
        }
        
    }
    @Override
    public boolean remove(String placa) {
        if(placa.isEmpty()){
            throw new IllegalArgumentException("O nome do veículo não pode ser nulo ou vazio.");
        }
        NohLocacoes aux = inicio;
        while (aux != null) {

            if(aux.getlocacao() instanceof locacao){
                locacao a = (locacao) aux.getlocacao();
                if(a.getVeiculo().equals(placa)) {
                    if (aux == inicio) {
                        inicio = inicio.getProx();
                        if (inicio != null) {
                            inicio.setAnt(null);
                        } else {
                            fim = null;
                        }
                    } else if (aux == fim) {
                        fim = fim.getAnt();
                        fim.setProx(null);
                    } else {
                        aux.getAnt().setProx(aux.getProx());
                        aux.getProx().setAnt(aux.getAnt());
                    }
                    return true; // retorna true se o elemento foi removido
                }
               
            }
            aux = aux.getProx();
        }
        return false; // retorna false se o elemento não foi removido
    }
        
       

    
    @Override
    public int tamanho() {
        int cont = 0;
        NohLocacoes aux = inicio;
        while (aux != null){
            cont++;
            aux = aux.getProx();
        }
        return cont;
     }
    


    @Override
    public void imprime() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'imprime'");
    }
    @Override
    public boolean busca(String placa) {
        if (placa == null || placa.toString().trim().isEmpty()) {
            throw new IllegalArgumentException("O nome do veículo não pode ser nulo ou vazio.");
        }
        NohLocacoes aux = inicio;
        boolean encontrado = false;
        while(aux != null){
            if(aux.getlocacao() instanceof locacao){
                locacao a = (locacao) aux.getlocacao();
                if(a.getVeiculo().equals(placa)) {
                    System.out.println("Locação encontrada:");
                    System.out.println("Cliente: " + a.getCliente());
                    System.out.println("Veiculo: "+a.getVeiculo());
                    System.out.println("Data de locação: "+a.getDataLocacao());
                    System.out.println("Data de devolução: "+a.getDataDevolucao());
                    System.out.println("Valor da locação: "+a.getValorLocacao());

                   
                    encontrado = true;
                    break;
                }
            }
            aux = aux.getProx();
        }
        if (!encontrado) {
            System.out.println("Veiculo não encontrado");
        }
        return encontrado;
    }
    
    @Override
    public void locarVeiculo(String placa, String cpf) {
        if (placa == null || placa.toString().trim().isEmpty()) {
            throw new IllegalArgumentException("O nome do veículo não pode ser nulo ou vazio.");
        }
        if (cpf == null || cpf.toString().trim().isEmpty()) {
            throw new IllegalArgumentException("O nome do cliente não pode ser nulo ou vazio.");
        }
      
        NohLocacoes aux = inicio;
        boolean encontrado = false;
        while(aux != null){
            if(aux.getlocacao() instanceof locacao){
                locacao a = (locacao) aux.getlocacao();
                if(a.getVeiculo().equals(placa)) {
                    System.out.println("Veiculo encontrado:");
                    System.out.println("Cliente: " + a.getCliente());
                    System.out.println("Veiculo: "+a.getVeiculo());
                    System.out.println("Data de locação: "+a.getDataLocacao());
                    System.out.println("Data de devolução: "+a.getDataDevolucao());
                    System.out.println("Valor da locação: "+a.calcularValorTotal());
                    encontrado = true;
                    break;
                }
            }
            aux = aux.getProx();
        }
        if (!encontrado) {
            System.out.println("Veiculo não encontrado");
        }
    }





   

}
