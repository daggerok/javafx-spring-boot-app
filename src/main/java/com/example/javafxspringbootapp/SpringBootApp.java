package com.example.javafxspringbootapp;

import javafx.application.Application;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Log4j2
@Component
public class SpringBootApp {

    @EventListener
    public void listen(StageStartedEvent event) {
        log.info("FX app started.");
    }

    public static void main(String[] args) {
        Application.launch(JavaFXApp.class, args);
    }
}
