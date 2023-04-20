package com.locadora;

public class LDEVeiculos implements Lista{
    private NohVeiculos inicio;
    private NohVeiculos fim;
    public LDEVeiculos (){
    this.inicio = null;
    this.fim = null;
    }

    public void insereInicio(Object info) { //info = 5
        if(info instanceof Veiculo ){ 
        NohVeiculos novo = new NohVeiculos(info);
        if (inicio == null){
        inicio = novo;
        fim = novo;
        }else {
        novo.setProx(inicio);
        inicio.setAnt(novo);
        inicio = novo;}
        }else {
            System.out.println("Não é um aluno");}
        }


        
        
    public void insereFim(Object info) {
        if(info instanceof Veiculo ){ 
        NohVeiculos novo = new NohVeiculos(info);
        if (inicio == null){
        inicio = novo;
        fim = novo;
        }else {
            novo.setAnt(fim);
            fim.setProx(novo);
            fim = novo;
            
        } }else {
            System.out.println("Não é um aluno");}



      }
    public boolean estahVazia() {  
        if (inicio == null){
            return true;
        }else {
            return false;
        }
        
    }
  
    public int tamanho() { 
        int cont = 0;
        NohVeiculos aux = inicio;
        while (aux != null){
            cont++;
            aux = aux.getProx();
        }
        return cont;
     }


     public void imprime() {
        NohVeiculos aux = inicio;
        while (aux != null){
            if(aux.getInfo() instanceof Veiculo){
                Veiculo a = (Veiculo) aux.getInfo();
                System.out.println(a.getNome());
            }
            aux = aux.getProx();
        }
    }



    public boolean busca(Object nome){
        if (nome == null || nome.toString().trim().isEmpty()) {
            throw new IllegalArgumentException("O nome do veículo não pode ser nulo ou vazio.");
        }
        NohVeiculos aux = inicio;
        while(aux != null){
            if(aux.getInfo() instanceof Veiculo){
                Veiculo a = (Veiculo) aux.getInfo();
                if(a.getNome().equals(nome)) {
                    return true;
                }
            } 
            aux = aux.getProx();
        }
        return false; // Retorna false se não encontrar o elemento
    }

    public boolean remove(int id){
        NohVeiculos aux = inicio;
        while (aux != null) {
            if(aux.getInfo() instanceof Veiculo){
                Veiculo a = (Veiculo) aux.getInfo();
                if(a.getId() == id) {
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
}
