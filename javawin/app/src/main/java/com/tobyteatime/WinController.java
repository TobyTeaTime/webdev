package com.tobyteatime;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.paint.Color;
import javafx.event.ActionEvent;


public class WinController {
    
    @FXML
    private Label label;
    @FXML
    private AnchorPane anchorPane;
    
    public void initialize() {
    }

    @FXML
    private void handleMouseHover(MouseEvent event) {
        BackgroundFill backgroundFill1 = new BackgroundFill(Color.BLUE, null, null);
        Background suspended = new Background (backgroundFill1);
        BackgroundFill backgroundFill2 = new BackgroundFill(Color.RED, null, null);
        Background active = new Background (backgroundFill2);

        anchorPane.setBackground(suspended);
        
        anchorPane.setOnMouseExited(exited -> {
            anchorPane.setBackground(active);
        });
        
    }

    @FXML
    private void handleButtonAction(ActionEvent event) {
        model.updateMessage();
    }

    private WinModel model;

    public void initModel(WinModel model) {
        this.model = model;
        label.textProperty().bind(model.messageProperty());

    }
}