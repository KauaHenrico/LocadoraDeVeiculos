package com.example.estrutura;


public class LDELocacoes implements ListaLocacao {
    private NohLocacoes inicio;
    private NohLocacoes fim;
    private LDEVeiculos veiculos;
    private LDEClientes clientes;
    public LDELocacoes() {
        this.inicio = null;
        this.fim = null;

    }
    @Override
    public void cadastra(Locacao locacao) { //info = 5
        if(locacao instanceof Locacao ){
            System.out.println("Cadastro realizado com sucesso -- Cliente: "+locacao.getCpf()+" Veiculo: "+locacao.getPlaca());
            System.out.println("Cliente: "+locacao.getCpf()+"Veiculo: "+locacao.getPlaca());
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

            if(aux.getlocacao() instanceof Locacao){
                Locacao a = (Locacao) aux.getlocacao();
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
        NohLocacoes aux = inicio;
        System.out.println("Placas:");
        while (aux != null){
            if(aux.getlocacao() instanceof Locacao){
                Locacao a = (Locacao) aux.getlocacao();

                System.out.println(a.getCodLocacao());



            }
            aux = aux.getProx();
        }

    }
    @Override
    public boolean busca(String placa ) {
        if (placa == null || placa.toString().trim().isEmpty()) {
            throw new IllegalArgumentException("O nome do veículo não pode ser nulo ou vazio.");
        }
        NohLocacoes aux = inicio;
        boolean encontrado = false;
        while(aux != null){
            if(aux.getlocacao() instanceof Locacao){
                Locacao a = (Locacao) aux.getlocacao();
                if(a.getPlaca().equals(placa)) {
                    System.out.println("Locação encontrada:");
                    System.out.println("Cliente: " + a.getCpf());
                    System.out.println("Veiculo: "+a.getPlaca());
                    System.out.println("Data de locação: "+a.getDataLocacao());
                    System.out.println("Data de devolução: "+a.getDataDevolucao());
                    System.out.println("Valor da locação: "+a.getValorLocacao());
                    System.out.println("Tempo de Locação: "+a.calcularTempoLocacao());
                    System.out.println("Valor total da locação: "+a.calcularValorTotal());


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

    public boolean busca(int codLocacao ) {
        if (codLocacao == 0 ) {
            throw new IllegalArgumentException("O codigo de locação não pode ser nulo ou vazio.");
        }
        NohLocacoes aux = inicio;
        boolean encontrado = false;
        while(aux != null){
            if(aux.getlocacao() instanceof Locacao){
                Locacao a = (Locacao) aux.getlocacao();
                if(a.getCodLocacao() == codLocacao) {
                    System.out.println("Locação encontrada:");
                    System.out.println("Cliente: " + a.getCpf());
                    System.out.println("Veiculo: "+a.getPlaca());
                    System.out.println("Data de locação: "+a.getDataLocacao());
                    System.out.println("Data de devolução: "+a.getDataDevolucao());
                    System.out.println("Valor da locação: "+a.getValorLocacao());
                    System.out.println("Tempo de Locação: "+a.calcularTempoLocacao());
                    System.out.println("Valor total da locação: "+a.calcularValorTotal());


                    encontrado = true;
                    break;
                }
            }
            aux = aux.getProx();
        }
        if (!encontrado) {
            System.out.println("Locação não encontrada");
        }
        return encontrado;
    }

    public boolean buscaCpf(String cpf ) {
        if (cpf == null || cpf.toString().trim().isEmpty()) {
            throw new IllegalArgumentException("O cpf de locação não pode ser nulo ou vazio.");
        }
        NohLocacoes aux = inicio;
        boolean encontrado = false;
        while(aux != null){
            if(aux.getlocacao() instanceof Locacao){
                Locacao a = (Locacao) aux.getlocacao();
                if(a.getCpf() == cpf) {
                    System.out.println("Locação encontrada:");
                    System.out.println("Cliente: " + a.getCpf());
                    System.out.println("Veiculo: "+a.getPlaca());
                    System.out.println("Data de locação: "+a.getDataLocacao());
                    System.out.println("Data de devolução: "+a.getDataDevolucao());
                    System.out.println("Valor da locação: "+a.getValorLocacao());
                    System.out.println("Tempo de Locação: "+a.calcularTempoLocacao());
                    System.out.println("Valor total da locação: "+a.calcularValorTotal());


                    encontrado = true;
                    break;
                }
            }
            aux = aux.getProx();
        }
        if (!encontrado) {
            System.out.println("Locação não encontrada");
        }
        return encontrado;
    }









}
