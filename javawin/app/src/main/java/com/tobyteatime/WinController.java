package com.tobyteatime;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class WinController {
    
    @FXML
    private Label label;

    public void initialize() {

    }

    @FXML
    private void handleButtonAction(ActionEvent event) {
        label.setText("Hello");
    }

}