package com.example.estrutura;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;
import javafx.scene.Parent;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class HelloApplication extends Application {
    public static LDEClientes ldeClientes = new LDEClientes();
    public static LDELocacoes ldeLocacoes = new LDELocacoes();
    public static LDEVeiculos ldeVeiculos = new LDEVeiculos();
    public static LeArquivo leArquivo = new LeArquivo();

    public static LDEClientes getLdeClientes(){
        return ldeClientes;
    }
    public static LDELocacoes getLdeLocacoes(){
        return ldeLocacoes;
    }
    public static LDEVeiculos getLdeVeiculos(){

        return ldeVeiculos;
    }



    public static Stage stage;
    public static Scene helloView;
    public static Scene menuVeiculos;
    public static Scene menuClientes;
    public static Scene menuCategorias;
    public static Scene menuLocacoes;
    public static Scene incluirCliente;
    public static Scene excluirCliente;
    public static Scene editarCliente;
    public static Scene incluirVeiculo;
    public static Scene editarVeiculo;
    public static Scene excluirVeiculo;
    public static Scene incluirCategoria;
    public static Scene editarCategoria;
    public static Scene locarVeiculo;
    public static Scene devolverVeiculo;
    @Override
    public void start(Stage primaryStage) throws IOException{
        try {
            File file = new File("C:\\Users\\Guilherme\\IdeaProjects\\Estrutura\\src\\main\\java\\com\\example\\estrutura\\Veiculos.csv");
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
        stage = primaryStage;
        Parent FXMLHelloView = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("hello-view.fxml")));
        helloView = new Scene(FXMLHelloView);
        Parent FXMLMenuVeiculos = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("MenuVeiculos.fxml")));
        menuVeiculos = new Scene(FXMLMenuVeiculos);
        Parent FXMLMenuClientes = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("MenuClientes.fxml")));
        menuClientes = new Scene(FXMLMenuClientes);
        Parent FXMLMenuCategorias = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("MenuCategorias.fxml")));
        menuCategorias = new Scene(FXMLMenuCategorias);
        Parent FXMLMenuLocacoes = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("MenuLocacoes.fxml")));
        menuLocacoes = new Scene(FXMLMenuLocacoes);
        Parent FXMLIncluirCliente = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("IncluirCliente.fxml")));
        incluirCliente = new Scene(FXMLIncluirCliente);
        Parent FXMLExcluirCliente = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("ExcluirCliente.fxml")));
        excluirCliente = new Scene(FXMLExcluirCliente);
        Parent FXMLEditarCliente = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("EditarCliente.fxml")));
        editarCliente = new Scene(FXMLEditarCliente);
        Parent FXMLIncluirVeiculo = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("IncluirVeiculo.fxml")));
        incluirVeiculo = new Scene(FXMLIncluirVeiculo);
        Parent FXMLEditarVeiculo = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("EditarVeiculo.fxml")));
        editarVeiculo = new Scene(FXMLEditarVeiculo);
        Parent FXMLExcluirVeiculo = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("ExcluirVeiculo.fxml")));
        excluirVeiculo = new Scene(FXMLExcluirVeiculo);
        Parent FXMLIncluirCategoria = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("IncluirCategoria.fxml")));
        incluirCategoria = new Scene(FXMLIncluirCategoria);
        Parent FXMLEditarCategoria = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("EditarCategoria.fxml")));
        editarCategoria = new Scene(FXMLEditarCategoria);
        Parent FXMLLocarVeiculo = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("LocarVeiculo.fxml")));
        locarVeiculo = new Scene(FXMLLocarVeiculo);
        Parent FXMLDevolverVeiculo = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("DevolverVeiculo.fxml")));
        devolverVeiculo = new Scene(FXMLDevolverVeiculo);

        stage.setScene(helloView);
        stage.show();
    }
    /**
     * @param num
     * @throws IOException
     * switch para trocar de cena
     */
    protected static void changeScene (int num) throws IOException {
        switch (num){
            case 1:
                stage.setScene(helloView);
                stage.show();
            break;
            case 2:
                stage.setScene(menuVeiculos);
                stage.show();
            break;
            case 3:
                stage.setScene(menuClientes);
                stage.show();
            break;
            case 4:
                stage.setScene(menuCategorias);
                stage.show();
            break;
            case 5:
                stage.setScene(menuLocacoes);
                stage.show();
            break;
            case 6:
                stage.setScene(incluirCliente);
                stage.show();
            break;
            case 7:
                stage.setScene(excluirCliente);
                stage.show();
            break;
            case 8:
                stage.setScene(editarCliente);
                stage.show();
            break;
            case 9:
                stage.setScene(incluirVeiculo);
                stage.show();
            break;
            case 10:
                stage.setScene(editarVeiculo);
                stage.show();
            break;
            case 11:
                stage.setScene(excluirVeiculo);
                stage.show();
            break;
            case 12:
                stage.setScene(incluirCategoria);
                stage.show();
            break;
            case 13:
                stage.setScene(editarCategoria);
                stage.show();
            break;
            case 14:
                stage.setScene(locarVeiculo);
                stage.show();
            break;
            case 15:
                stage.setScene(devolverVeiculo);
                stage.show();
            break;
        }

    }

    public static void main(String[] args) {
        launch();
    }
}