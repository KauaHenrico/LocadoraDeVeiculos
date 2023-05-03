package com.example.estrutura;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;

import java.io.IOException;

public class  HelloController {
    private Button btMenuVeiculos;
    private Button btMenuClientes;
    private Button btMenuCategorias;
    private Button btMenuLocacoes;

    @FXML
    protected void onBtMenuVeiculos() throws IOException {
        HelloApplication.changeScene(2);
    }
    @FXML
    protected void onBtMenuClientes() throws IOException {
        HelloApplication.changeScene(3);
    }
    @FXML
    protected void onBtMenuCategorias() throws IOException {
        HelloApplication.changeScene(4);
    }
    @FXML
    protected void onBtMenuLocacoes() throws IOException {
        HelloApplication.changeScene(5);
    }
}