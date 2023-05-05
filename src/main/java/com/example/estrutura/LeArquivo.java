package com.example.estrutura;

import javafx.scene.control.Alert;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeArquivo {
    LDEVeiculos ldeVeiculos = new LDEVeiculos();
    public void LeArquivoVeiculos(){
        try {
            File file = new File("D:\\Documentos\\UNIPAMPA\\EstruturaDeDados\\LocadoraDeVeiculos\\src\\main\\java\\com\\example\\estrutura\\Categorias.csv");
            Scanner scanner = null;
            try {
                scanner = new Scanner(file);
            } catch (FileNotFoundException ex) {
                throw new RuntimeException(ex);
            }

            // Ignora a primeira linha, que contém apenas os nomes das colunas
            scanner.nextLine();

            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine();
                String[] colunas = linha.split(";");

                String placa = colunas[0];
                String modelo = colunas[1];
                String marca = colunas[2];
                int ano = Integer.parseInt(colunas[3]);
                float potencia = Float.parseFloat(colunas[4]);
                int lugares = Integer.parseInt(colunas[5]);
                int idCategoria = Integer.parseInt(colunas[6]);
                Veiculo veiculo = new Veiculo(placa, modelo, ano, potencia, lugares, marca, idCategoria);
                veiculo.setCategoria(idCategoria);
                ldeVeiculos.insereInicio(veiculo);


            }

            scanner.close();
        } catch(Exception e) {
            Alerts.showAlert("Erro ao ler arquivo","Erro ao ler arquivo","", Alert.AlertType.ERROR);
        }
    }
}
