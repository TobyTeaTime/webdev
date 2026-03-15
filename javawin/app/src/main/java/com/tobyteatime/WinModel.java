package com.tobyteatime;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class WinModel {
    StringProperty message = new SimpleStringProperty("Hello");

    public String getMessage() {
        return message.get();
    }

    public void setMessage(String value) {
        message.set(value);
    }

    public StringProperty messageProperty() {
        return message;
    }

    public void updateMessage() {
        setMessage("welcome");
    }
}