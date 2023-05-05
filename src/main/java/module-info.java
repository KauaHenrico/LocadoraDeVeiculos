module com.example.estrutura {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.estrutura to javafx.fxml;
    exports com.example.estrutura;
}