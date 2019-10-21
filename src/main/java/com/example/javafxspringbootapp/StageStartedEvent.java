package com.example.javafxspringbootapp;

import javafx.stage.Stage;
import org.springframework.context.ApplicationEvent;

public class StageStartedEvent extends ApplicationEvent {
    public StageStartedEvent(Stage stage) {
        super(stage);
    }
}
