package com.example.estrutura;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.IOException;

public class MenuCategoriasController {
    private Button btVoltar;
    private Button btIncluirCategoria;
    private Button btEditarCategoria;
    private Button btExcluirCategoria;
    private Button btListarCategorias;
    @FXML
    private TextField nomeCategoria;
    @FXML
    private TextField idCategoria;

    @FXML
    protected void onBtIncluirCategoria() throws IOException {
        HelloApplication.changeScene(12);
    }

    @FXML
    protected void onBtEditarCategoria() throws IOException {
        HelloApplication.changeScene(13);
    }

    @FXML
    protected void onBtExcluirCategoria() throws IOException {
    }

    @FXML
    protected void onBtListarCategorias() throws IOException {
        Veiculo v = HelloApplication.ldeVeiculos.getVeiculo("IVY-5357");
        Alerts.showAlert("Categorias:", "Categorias:", v.getCategorias().toString(), Alert.AlertType.INFORMATION);
        System.out.println(v.getCategorias());
    }

    @FXML
    protected void onBtVoltar() throws IOException {
        HelloApplication.changeScene(1);
    }

    @FXML
    protected void onBtVoltar1() throws IOException {
        HelloApplication.changeScene(4);
    }
    @FXML
    protected void onBtIncluirCategoriaFinal() throws IOException {
        try {
            String nome = nomeCategoria.getText();
            String idStr = idCategoria.getText();
            if (!idStr.matches("\\d+")) {
                Alerts.showAlert("id precisa ser inteiro", "id precisa ser inteiro", "ID precisa ser um número inteiro", Alert.AlertType.ERROR);
                return;
            }
            int id = Integer.parseInt(idStr);
       
            LDECategorias ldec = new LDECategorias();
            ldec.addCategoria(id, nome);
          
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    protected void onBtEditarCategoriaFinal() throws IOException {
        try {
            String nome = nomeCategoria.toString();
            int id = Integer.parseInt(idCategoria.toString());
            LDECategorias ldec = new LDECategorias();
            ldec.addCategoria(id, nome);
        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("id precisa ser inteiro");
            alert.setHeaderText("id precisa ser inteiro");
            alert.setContentText("ID precisa ser um número inteiro");
            alert.showAndWait();
        }

    }

    @FXML
    protected void onBtExcluirCategoriaFinal() throws IOException {
        try {
            int id = Integer.parseInt(idCategoria.toString());
            String nome = nomeCategoria.toString();
            LDECategorias ldec = new LDECategorias();
            ldec.excluiCategoria(id);
        } catch (Exception e) {
            Alerts.showAlert("id precisa ser inteiro", "id precisa ser inteiro", "ID precisa ser um número inteiro",
                    Alert.AlertType.ERROR);
        }
    }
}
