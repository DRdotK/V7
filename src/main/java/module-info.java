module com.example.v7 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.v7 to javafx.fxml;
    exports com.example.v7;
}