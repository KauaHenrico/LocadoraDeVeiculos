package com.example.estrutura;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

import java.io.IOException;

public class MenuCategoriasController {
    private Button btVoltar;
    private Button btIncluirCategoria;
    private Button btEditarCategoria;
    private Button btExcluirCategoria;
    private Button btListarCategorias;
    private Button nomeCategoria;
    private Button idCategoria;
    @FXML
    protected void onBtIncluirCategoria() throws IOException{
        HelloApplication.changeScene(12);
    }
    @FXML
    protected void onBtEditarCategoria() throws IOException{
        HelloApplication.changeScene(13);
    }
    @FXML
    protected void onBtExcluirCategoria() throws IOException{
    }
    @FXML
    protected void onBtListarCategorias() throws IOException{
        Veiculo v = HelloApplication.ldeVeiculos.getVeiculo("IVY-5357");
        Alerts.showAlert("Categorias:","Categorias:", v.getCategorias().toString(), Alert.AlertType.INFORMATION);
        System.out.println(v.getCategorias());
    }
    @FXML
    protected void onBtVoltar() throws IOException {
        HelloApplication.changeScene(1);
    }
    @FXML
    protected void onBtVoltar1() throws IOException{
        HelloApplication.changeScene(4);
    }
    @FXML
    protected void onBtIncluirCategoriaFinal()throws IOException{

        try{
            String nome = nomeCategoria.toString();
            int id = Integer.parseInt(idCategoria.toString());
            Veiculo v = null;
            v.addCategoria(id, nome);
        }catch (Exception e){
            Alerts.showAlert("id precisa ser inteiro","id precisa ser inteiro","ID precisa ser um número inteiro", Alert.AlertType.ERROR);
        }

    }
    @FXML
    protected void onBtEditarCategoriaFinal() throws IOException{

    }
    @FXML
    protected void onBtExcluirCategoriaFinal() throws IOException{

    }
}
