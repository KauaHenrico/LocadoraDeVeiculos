package com.example.estrutura;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.IOException;

public class MenuClientesController {
    private Button btIncluirCliente;
    private Button btExcluirCliente;
    private Button btEditarCliente;
    private Button btListarClientes;
    private Button btVoltar1;
    private Button btVoltar2;
    @FXML
    private TextField cpfAtual;
    @FXML
    private TextField novoNome;
    @FXML
    private TextField novoCpf;
    @FXML
    private TextField novoCnh;
    @FXML
    private TextField novoTelefone;
    @FXML
    private TextField nomeCliente;
    @FXML
    private TextField telefoneCliente;
    @FXML
    private TextField cnhCliente;
    @FXML
    private TextField cpfCliente;
    @FXML
    private TextField cpfClienteExcluido;
    private Button btEditarClienteFinal;
    private Button btExcluirClienteFinal;
    @FXML
    protected void onBtExcluirClienteFinal() throws IOException {
        String cpf = cpfClienteExcluido.getText();
        if(cpf.equals("")){
            Alerts.showAlert("Campo do CPF vazio","Campo do CPF vazio","Informe o CPF do cliente que deseja excluir", Alert.AlertType.ERROR);
        }else{
            try{
                HelloApplication.ldeClientes.remove(cpf);
                Alerts.showAlert("Cliente removido","Cliente removido","Cliente do CPF "+cpf+" foi removido com sucesso", Alert.AlertType.INFORMATION);
            }catch (Exception e){
                Alerts.showAlert("Erro ao excluir cliente","Erro ao excluir cliente","Confira se as informações estão corretas", Alert.AlertType.ERROR);
            }
        }
    }
    @FXML
    protected void onBtIncluirCliente() throws IOException {
        HelloApplication.changeScene(6);
    }
    @FXML
    protected void onBtIncluirClienteFinal() throws IOException {
        String nome = nomeCliente.getText();
        String cpf = cpfCliente.getText();
        String telefone = telefoneCliente.getText();
        String cnh = cnhCliente.getText();
            if(!nome.equals("")&&!cpf.equals("")&&!telefone.equals("")&&!cnh.equals("")){
                Cliente c = new Cliente(nome, cpf, telefone, cnh);
                HelloApplication.getLdeClientes().insereInicio(c);
                Alerts.showAlert("Cliente criado com sucesso","Cliente criado com sucesso","Informações do cliente:\n"+c.toString(), Alert.AlertType.INFORMATION);
                limpaCampos();
                HelloApplication.changeScene(1);
            } else{
                Alerts.showAlert("Não foi possível incluir cliente","Não foi possível incluir cliente","Confira se todas as informações foram preenchidas", Alert.AlertType.ERROR);
            }
        if(nome.equals("")){
            Alerts.showAlert("Nome vazio","Nome vazio","O nome não foi informado. Informe o nome do cliente", Alert.AlertType.ERROR);
        }
        if(cpf.equals("")){
            Alerts.showAlert("CPF vazio","CPF vazio", "O CPF não foi informado. Informe o CPF do cliente", Alert.AlertType.ERROR);
        }
        if(telefone.equals("")){
            Alerts.showAlert("Telefone vazio","Telefone vazio", "O telefone não foi informado. Informe o telefone do cliente", Alert.AlertType.ERROR);
        }
        if(cnh.equals("")){
            Alerts.showAlert("CNH vazio","CNH vazio", "A CNH não foi informada. Informe a CNH do cliente", Alert.AlertType.ERROR);
        }
    }
    @FXML
    protected void onBtEditarClienteFinal() throws IOException{
        String cpf = cpfAtual.getText();
        String cpfNovo = novoCpf.getText();
        String nomeNovo = novoNome.getText();
        String telefoneNovo = novoTelefone.getText();
        String cnhNovo = novoCnh.getText();
        boolean testa = false;
        if(cpf.equals("")){
            Alerts.showAlert("Informe o CPF atual do cliente.","Caixa de CPF vazia","Informe o CPF atual do cliente.", Alert.AlertType.ERROR);
        }else{
            try{
                if(!cpfNovo.equals("")) {
                    HelloApplication.ldeClientes.getCliente(cpf).setCpf(cpfNovo);
                    testa = true;
                }
                if(!nomeNovo.equals("")) {
                    HelloApplication.ldeClientes.getCliente(cpf).setNome(nomeNovo);
                    testa = true;
                }
                if(!telefoneNovo.equals("")) {
                    HelloApplication.ldeClientes.getCliente(cpf).setTelefone(telefoneNovo);
                    testa = true;
                }
                if(!cnhNovo.equals("")) {
                    HelloApplication.ldeClientes.getCliente(cpf).setCnh(cnhNovo);
                    testa = true;
                }
                if(testa){
                    Alerts.showAlert("Cliente alterado com sucesso","Cliente alterado com sucesso","Novas informações do cliente:\n"+HelloApplication.ldeClientes.getCliente(cpf).toString(), Alert.AlertType.INFORMATION);
                    HelloApplication.changeScene(1);
                }
            }catch(Exception e){
                Alerts.showAlert("Erro ao mudar informações do cliente","Erro ao mudar informações do cliente","Não foi possível mudar informações do cliente. Confira se o CPF foi informado corretamente.", Alert.AlertType.ERROR);
            }
        }
    }
    @FXML
    protected void onBtExcluirCliente() throws IOException {
        HelloApplication.changeScene(7);
    }
    @FXML
    protected void onBtEditarCliente() throws IOException {
        HelloApplication.changeScene(8);

    }
    @FXML
    protected void onBtListarClientes() throws IOException {
        Alerts.showAlert("Lista de clientes: ","Lista de clientes: ",HelloApplication.getLdeClientes().imprimeClientes(), Alert.AlertType.INFORMATION);
        System.out.println("Lista de clientes: \n"+HelloApplication.getLdeClientes().imprimeClientes());
    }
    @FXML
    protected void onBtVoltar() throws IOException {
        HelloApplication.changeScene(1);
    }
    @FXML
    protected void onBtVoltar2() throws IOException {
        HelloApplication.changeScene(3);
    }
    protected void limpaCampos() throws IOException{
        nomeCliente.setText("");
        cpfCliente.setText("");
        telefoneCliente.setText("");
        cnhCliente.setText("");
    }
}
