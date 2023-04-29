package com.locadora;

public class LDEVeiculos implements Lista{
    private NohVeiculos inicio;
    private NohVeiculos fim;
    public LDEVeiculos (){
    this.inicio = null;
    this.fim = null;
    }

    public void insereInicio(Veiculo veiculo) { //info = 5
        if(veiculo instanceof Veiculo ){ 
        NohVeiculos novo = new NohVeiculos(veiculo);
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


        
        
    public void insereFim(Veiculo veiculo) {
        if(veiculo instanceof Veiculo ){ 
        NohVeiculos novo = new NohVeiculos(veiculo);
        if (inicio == null){
        inicio = novo;
        fim = novo;
        }else {
            novo.setAnt(fim);
            fim.setProx(novo);
            fim = novo;
            
        } 
    }else {
            System.out.println("Não é um veiculo");}



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
        System.out.println("Placas:");
        while (aux != null){
            if(aux.getVeiculo() instanceof Veiculo){
                Veiculo a = (Veiculo) aux.getVeiculo();
            
                System.out.println(a.getPlaca());
            

              
            }
            aux = aux.getProx();
        }
    }



    public boolean busca(String placa) {
        if (placa == null || placa.toString().trim().isEmpty()) {
            throw new IllegalArgumentException("O nome do veículo não pode ser nulo ou vazio.");
        }
        NohVeiculos aux = inicio;
        boolean encontrado = false;
        while(aux != null){
            if(aux.getVeiculo() instanceof Veiculo){
                Veiculo a = (Veiculo) aux.getVeiculo();
                if(a.getPlaca().equals(placa)) {
                    System.out.println("Veiculo encontrado");
                    System.out.println("Placa: " + a.getPlaca());
                    System.out.println("Marca: "+a.getMarca());
                    System.out.println("Modelo: " + a.getModelo());
                    System.out.println("Ano: "+a.getAno());
                    System.out.println("Lugares: "+a.getLugares());
                    System.out.println("Potencia "+ a.getPotencia());
                    int idCategoria = a.getIdCategoria();
                    String nomeCategoria = a.getCategorias().get(idCategoria);
                    System.out.println("Categoria: " + idCategoria + " - " + nomeCategoria);
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


    public boolean remove(String placa) {
        if(placa.isEmpty()){
            throw new IllegalArgumentException("O nome do veículo não pode ser nulo ou vazio.");
        }
        NohVeiculos aux = inicio;
        while (aux != null) {
        
            if(aux.getVeiculo() instanceof Veiculo){
                Veiculo a = (Veiculo) aux.getVeiculo();
                if(a.getPlaca().equals(placa)) {
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


    public boolean buscaCategoria(int id){
        NohVeiculos aux = inicio;
        boolean encontrado = false;
        while(aux != null){
            if(aux.getVeiculo() instanceof Veiculo){
                Veiculo a = (Veiculo) aux.getVeiculo();
                if(a.getCategoria() == id) {
                    System.out.println("Categoria encontrada");
                    System.out.println(a.getCategoria());
                    
                    String nomeCategoria =a.getCategorias().get(id);
                    System.out.println("Categoria do veículo: " + id + " - " + nomeCategoria);
                
                    encontrado = true;
                    break;
                }
            }
            aux = aux.getProx();
        }
        if (!encontrado) {
            System.out.println("Carro não encontrado");
        }
        return encontrado;
    }

    public boolean existeVeiculo(String placa) {
    NohVeiculos aux = inicio;
    while (aux != null) {
        if (aux.getVeiculo().getPlaca().equals(placa)) {
            return true;
        }
        aux = aux.getProx();
    }
    return false;
}




}
