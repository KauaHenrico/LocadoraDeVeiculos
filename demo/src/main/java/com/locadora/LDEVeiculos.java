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
  
    /**
     * This Java function returns the number of nodes in a linked list of vehicles.
     * 
     * @return The method `tamanho()` returns an integer value which represents the number of nodes in
     * a linked list of vehicles.
     */
    public int tamanho() { 
        int cont = 0;
        NohVeiculos aux = inicio;
        while (aux != null){
            cont++;
            aux = aux.getProx();
        }
        return cont;
     }


    /**
     * This function prints information about vehicles stored in a linked list.
     */
     public void imprime() {
        NohVeiculos aux = inicio;
        while (aux != null){
            if(aux.getInfo() instanceof Veiculo){
                Veiculo a = (Veiculo) aux.getInfo();
                System.out.println(a.getNome());
                if(a.getAno() == 0){
                    System.out.println("Ano não informado");}
                else{
                System.out.println(a.getAno());}
                if(a.getMarca() == null){
                    System.out.println("Marca não informada");}
                else{

                System.out.println(a.getMarca());
               
                }
                if(a.getPlaca() == null){
                    System.out.println("Placa não informada");}
                else{
                System.out.println(a.getPlaca());
                }
            }
            aux = aux.getProx();
        }
    }



    /**
     * This function searches for a vehicle by name in a linked list and returns true if found,
     * otherwise false.
     * 
     * @param nome The parameter "nome" is an Object representing the name of a vehicle that is being
     * searched for in a linked list of vehicles.
     * @return The method returns a boolean value, either true if the object with the given name is
     * found in the linked list, or false if it is not found.
     */
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

  /**
   * This function removes a node from a doubly linked list of vehicles based on its ID.
   * 
   * @param id an integer representing the ID of the vehicle to be removed from a linked list of
   * vehicles.
   * @return The method returns a boolean value. It returns true if the element with the given id was
   * found and removed from the linked list, and false if the element was not found in the linked list.
   */
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
