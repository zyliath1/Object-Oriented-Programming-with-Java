module com.example.teema6t3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.teema6t3 to javafx.fxml;
    exports com.example.teema6t3;
}