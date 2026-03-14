package com.tobyteatime;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class WinModel extends Application {

    @Override 
    public void start (Stage stage) throws Exception{
    //stage is top level container, extends Window
    //stage is initialized, must be on Application thread
    //scene is rendered onto a stage

        Parent root = FXMLLoader.load(getClass().getResource("WinView.fxml"));
        //root is a node with no parents, extends Node

        Scene scene = new Scene(root);
        //root is the 'parent node' the scene is built from, extends Object implements EventTarget
        //scene is container for content in scene graph
        //background of scene is specified by fill property

        stage.setScene(scene);
        //sets the scene Scene (from root Parent) to the stage 
        stage.show();
        //renders the stage
    }
 
    public static void main (String[] args) {
       launch(args);
    }


}
