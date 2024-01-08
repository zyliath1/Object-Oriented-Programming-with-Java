package com.example.teema6t3;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class MainController {
    // FXML-annotaatiot yhdistävät FXML-tiedoston komponentit Java-koodiin
    @FXML private TextField nameField;
    @FXML private ComboBox<String> typeComboBox;
    @FXML private DatePicker datePicker;
    @FXML private TextField priceField;
    @FXML private TextField buyerField;
    @FXML private Button saveButton;
    @FXML private Button closeButton;
}

