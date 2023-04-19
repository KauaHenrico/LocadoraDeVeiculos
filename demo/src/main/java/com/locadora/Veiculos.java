package com.locadora;

public class Veiculos implements Eveiculos {
    
    Veiculo veiculo = new Veiculo();
    Veiculos [] veiculos = new Veiculos[10];

    public void vetorDinamico(){
        if(vetorCheio(veiculos)){
            Veiculos [] novoVetor = new Veiculos[veiculos.length + 10];
            for(int i = 0; i < veiculos.length; i++) {
                novoVetor[i] = veiculos[i];
            }
            veiculos = novoVetor;
        }
    }

    public boolean vetorCheio(Veiculos veiculos[]){
        for(int i = 0; i < veiculos.length; i++) {
            if(veiculos[i] == null) {
                return false;
            }
        }


        return true;

    }


    @Override
    public void cadastrarVeiculo(Object veiculo) {
        if(veiculo instanceof Veiculo) {
            for(int i = 0; i < veiculos.length; i++) {
                if(veiculos[i] == null) {
                    veiculos[i] = (Veiculos) veiculo;
                    break;
                }
            }


        } else {
            System.out.println("Veiculo não cadastrado!");
        }
    }
    @Override
    public void listarVeiculos(int id) {
        for(int i = 0; i < veiculos.length; i++) {
            if(veiculos[i] != null) {
                System.out.println(veiculos[i]);
            }
        }

    }
    @Override
    public void buscarVeiculo(int id) {
        for(int i = 0; i < veiculos.length; i++) {
            if(veiculos[i] != null) {
                if(veiculos[i].equals(id)) {
                    System.out.println(veiculos[i]);
                    System.out.println("Veiculo encontrado!");
                }
            }
        }

    }
    @Override
    public void editarVeiculo(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'editarVeiculo'");
    }
    @Override
    public void excluirVeiculo(int id) {
        if(veiculo instanceof Veiculo) {
            for(int i = 0; i < veiculos.length; i++) {
                if(veiculos[i] != null) {
                    if(veiculos[i].equals(id)) {
                        veiculos[i] = null;
                        System.out.println("Veiculo excluido!");
                    }
                }
            }
        } else {
            System.out.println("Veiculo não encontrado!");
        }
    }





}
