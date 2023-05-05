package com.example.estrutura;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MenuLocacoesController {
    private Button btVoltar1;
    private Button btLocarVeiculoFinal;
    @FXML
    private TextField cnhCLiente;
    @FXML
    private TextField dataRetirada;
    @FXML
    private TextField dataDevolucao;
    @FXML
    private TextField valorLocacao;
    @FXML
    private TextField placaVeiculo;
    @FXML
    protected void onBtVoltar1() throws IOException{
        HelloApplication.changeScene(1);
    }
    @FXML
    protected void onBtLocarVeiculo() throws IOException{
        HelloApplication.changeScene(14);
    }
    @FXML
    protected void onBtDevolverVeiculo() throws IOException{
        HelloApplication.changeScene(15);
    }
    @FXML
    protected void onBtListarLocacoes() throws IOException{

    }

    @FXML
    protected void onBtLocarVeiculoFinal() throws IOException, ParseException {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        boolean confere = true;
        String cnh = cnhCLiente.getText();
        String placa = placaVeiculo.getText();
        try{
            Date dataR = formato.parse(dataRetirada.getText());
            Date dataD = formato.parse(dataDevolucao.getText());
        }catch (Exception e){
            Alerts.showAlert("Datas inválidas","Datas inválidas","Informe datas válidas", Alert.AlertType.ERROR);
        }

        try{
            float valor = Float.parseFloat(valorLocacao.getText());
        }catch (Exception e){
            Alerts.showAlert("Valor informado deve ser numérico","Valor inválido","Informe um valor numérico", Alert.AlertType.ERROR);
            confere = false;
        }




    }
    @FXML
    protected void onBtDevolverVeiculoFinal() throws IOException{

    }
}
