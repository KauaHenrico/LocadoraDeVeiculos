package com.example.estrutura;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.io.IOException;

public class MenuVeiculosController {
    private Button btIncluirVeiculo;
    private Button btExcluirVeiculo;
    private Button btEditarVeiculo;
    private Button btListarVeiculo;
    private Button btVoltar1;
    private Button btEditarVeiculoFinal;
    @FXML
    private TextField placaVeiculoExcluido;
    @FXML
    private TextField placaAtual;
    @FXML
    private TextField marcaNova;
    @FXML
    private TextField anoNovo;
    @FXML
    private TextField placaNova;
    @FXML
    private TextField modeloNovo;
    @FXML
    private TextField potenciaNova;
    @FXML
    private TextField lugaresNovo;
    @FXML
    private TextField categoriaNova;
    @FXML
    private TextField placaVeiculo;
    @FXML
    private TextField modeloVeiculo;
    @FXML
    private TextField anoVeiculo;
    @FXML
    private TextField potenciaVeiculo;
    @FXML
    private TextField lugaresVeiculo;
    @FXML
    private TextField marcaVeiculo;
    private Button btIncluirVeiculoFinal;
    @FXML
    private TextField categoriaVeiculo;
    @FXML
    protected void onBtIncluirVeiculo() throws IOException{
        HelloApplication.changeScene(9);
    }
    @FXML
    protected void onBtExcluirVeiculo() throws IOException{
        HelloApplication.changeScene(11);
    }
    @FXML
    protected void onBtEditarVeiculo() throws IOException{
        HelloApplication.changeScene(10);
    }
    @FXML
    protected void onBtListarVeiculo() throws IOException{
        Alerts.showAlert("Informações dos veículos:","Informações dos veículos:",HelloApplication.ldeVeiculos.toString(), Alert.AlertType.INFORMATION);
        System.out.println("Informações dos veículos: \n"+HelloApplication.ldeVeiculos.toString());
    }
    @FXML
    protected void onBtIncluirVeiculoFinal() throws IOException{
        boolean conf = true;
        int anoVei = -1, lugaresVei = -1, categoriaVei = -1;
        float potenciaVei = -1;
        try{
            categoriaVei = Integer.parseInt(categoriaVeiculo.getText());
        }catch (Exception e){
            Alerts.showAlert("O número da categoria precisa ser inteiro","O número da categoria precisa ser inteiro","Confira se o número informado na categoria é um inteiro", Alert.AlertType.ERROR);
            conf = false;
        }
        String placaVei = placaVeiculo.getText();
        String modeloVei = modeloVeiculo.getText();
        try{
            anoVei = Integer.parseInt(anoVeiculo.getText());
        }catch (Exception e){
            Alerts.showAlert("O número do ano do veículo precisa ser inteiro","O número do ano do veículo precisa ser inteiro","Confira se o número informado no ano do veículo é um inteiro", Alert.AlertType.ERROR);
            conf = false;
        }
        try{
            potenciaVei = Float.parseFloat(potenciaVeiculo.getText());
        }catch (Exception e){
            Alerts.showAlert("A potência do veículo precisa ser um número","A potência do veículo precisa ser um número","Confira se o número informado na potência é um número", Alert.AlertType.ERROR);
            conf = false;
        }
        try{
            lugaresVei = Integer.parseInt(lugaresVeiculo.getText());
        }catch (Exception e){
            Alerts.showAlert("O número de lugares do veículo precisa ser inteiro","O número de lugares do veículo precisa ser inteiro","Confira se o número informado no número de lugares do veículo é um inteiro", Alert.AlertType.ERROR);
            conf = false;
        }
        String marcaVei = marcaVeiculo.getText();
        if(placaVei.equals("")){
            Alerts.showAlert("Informe a placa do veículo","Informe a placa do veículo","Campo da placa de veículo está vazio", Alert.AlertType.ERROR);
            conf = false;
        }
        if(modeloVei.equals("")){
            Alerts.showAlert("Informe o modelo do veículo","Informe o modelo do veículo","Campo do modelo do veículo está vazio", Alert.AlertType.ERROR);
            conf = false;
        }
        if(marcaVei.equals("")){
            Alerts.showAlert("Informe a marca do veículo","Informe a marca do veículo","Campo da marca do veículo está vazio", Alert.AlertType.ERROR);
            conf = false;
        }
        if(!HelloApplication.ldeVeiculos.buscaCategoria(categoriaVei)){
            Alerts.showAlert("A categoria escolhida não existe","A categoria escolhida não existe","Escolha uma categoria válida", Alert.AlertType.ERROR);
        }
        if(conf){
            Veiculo v = new Veiculo(placaVei,modeloVei,anoVei,potenciaVei,lugaresVei,marcaVei,categoriaVei);
            HelloApplication.ldeVeiculos.insereInicio(v);
            Alerts.showAlert("Veículo criado com sucesso","Veículo criado com sucesso","Informações:\n"+v.toString(), Alert.AlertType.INFORMATION);
            HelloApplication.changeScene(1);
        }
    }
    @FXML
    protected void onBtEditarVeiculoFinal() throws IOException{
        String placa = placaAtual.getText();
        Veiculo veiculo = null;
        if(HelloApplication.ldeVeiculos.existeVeiculo(placa)){
            veiculo = HelloApplication.ldeVeiculos.getVeiculo(placa);
        }else{
            Alerts.showAlert("Não existe carro com a placa informada","Não existe carro com a placa informada","Informe uma placa válida", Alert.AlertType.ERROR);
        }
        boolean houveAlteracao = false;
        // Verifica se o campo da marca foi preenchido e se é uma String
        if (!marcaNova.getText().isEmpty()) {
            try {
                veiculo.setMarca(marcaNova.getText());
                houveAlteracao = true;
            } catch (IllegalArgumentException e) {
                Alerts.showAlert("Erro", "Marca inválida", e.getMessage(), Alert.AlertType.ERROR);
            }
        }

        // Verifica se o campo do ano foi preenchido e se é um número inteiro
        if (!anoNovo.getText().isEmpty()) {
            try {
                veiculo.setAno(Integer.parseInt(anoNovo.getText()));
                houveAlteracao = true;
            } catch (NumberFormatException e) {
                Alerts.showAlert("Erro", "Ano inválido", "Informe um número inteiro para o ano", Alert.AlertType.ERROR);
            }
        }

        // Verifica se o campo da placa foi preenchido e se é uma String
        if (!placaNova.getText().isEmpty()) {
            try {
                veiculo.setPlaca(placaNova.getText());
                houveAlteracao = true;
            } catch (IllegalArgumentException e) {
                Alerts.showAlert("Erro", "Placa inválida", e.getMessage(), Alert.AlertType.ERROR);
            }
        }

        // Verifica se o campo do modelo foi preenchido e se é uma String
        if (!modeloNovo.getText().isEmpty()) {
            try {
                veiculo.setModelo(modeloNovo.getText());
                houveAlteracao = true;
            } catch (IllegalArgumentException e) {
                Alerts.showAlert("Erro", "Modelo inválido", e.getMessage(), Alert.AlertType.ERROR);
            }
        }

        // Verifica se o campo da potência foi preenchido e se é um número decimal
        if (!potenciaNova.getText().isEmpty()) {
            try {
                veiculo.setPotencia(Float.parseFloat(potenciaNova.getText()));
                houveAlteracao = true;
            } catch (NumberFormatException e) {
                Alerts.showAlert("Erro", "Potência inválida", "Informe um número decimal para a potência", Alert.AlertType.ERROR);
            }
        }

        // Verifica se o campo dos lugares foi preenchido e se é um número inteiro
        if (!lugaresNovo.getText().isEmpty()) {
            try {
                veiculo.setLugares(Integer.parseInt(lugaresNovo.getText()));
                houveAlteracao = true;
            } catch (NumberFormatException e) {
                Alerts.showAlert("Erro", "Número de lugares inválido", "Informe um número inteiro para o número de lugares", Alert.AlertType.ERROR);
            }
        }

        // Verifica se o campo da categoria foi preenchido e se é um número inteiro
        if (!categoriaNova.getText().isEmpty()) {
            try {
                veiculo.setCategoria(Integer.parseInt(categoriaNova.getText()));
                houveAlteracao = true;
            } catch (NumberFormatException e) {
                Alerts.showAlert("Erro", "Categoria inválida", "Informe um número inteiro para a categoria", Alert.AlertType.ERROR);
            }
        }

        // Verifica se houve pelo menos uma alteração ou se todos os campos estão vazios
        if (!houveAlteracao) {
            Alerts.showAlert("Nenhum campo preenchido corretamente","Nenhum campo preenchido corretamente","Preencha ao menos um dos campos corretamente para que seja possível alterar o veículo", Alert.AlertType.ERROR);
        }else{
            Alerts.showAlert("Veículo alterado","Veículo alterado","Novas informações do veículo:\n"+veiculo.toString(), Alert.AlertType.INFORMATION);
        }
    }
    @FXML
    protected void onBtExcluirVeiculoFinal() throws IOException{
        String placaRemovida = placaVeiculoExcluido.getText();
        try{
            HelloApplication.ldeVeiculos.remove(placaRemovida);
            Alerts.showAlert("Veículo excluído","Veículo excluído","O veículo foi excluído com sucesso", Alert.AlertType.INFORMATION);
            HelloApplication.changeScene(1);
        }catch (Exception e){
            Alerts.showAlert("Não foi possível excluir o veículo","Não foi possível excluir o veículo","Confira se a placa foi informada corretamente e se não há nenhum locação no veículo.", Alert.AlertType.ERROR);
        }

    }
    @FXML
    protected void onBtVoltar() throws IOException{
        HelloApplication.changeScene(1);
    }
    @FXML void onBtVoltar1() throws IOException{
        HelloApplication.changeScene(2);
    }
}
