# javafx-spring-boot-app
Skeleton of simple Spring Boot + JavaFX app

requires Java 13

_JavaFXApp.java_

```java
@SpringBootApplication
public class JavaFXApp extends Application {

    private ConfigurableApplicationContext applicationContext;

    @Override
    public void init() throws Exception {
        applicationContext = new SpringApplicationBuilder(JavaFXApp.class).run();
    }

    @Override
    public void start(Stage primaryStage) {
        applicationContext.publishEvent(new StageStartedEvent(primaryStage));
    }
}
```

_SpringBootApp.java_

```java
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
```

links:

* [YouTube: Fully Reactive: Spring, Kotlin, and JavaFX Playing Together](https://www.youtube.com/watch?v=Lse51SpfKHo)
