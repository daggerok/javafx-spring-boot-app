# javafx-spring-boot-app
Skeleton of simple Spring Boot + JavaFX app

requires Java 13

_SpringBootJavaFXApp.java_

```java
@SpringBootApplication
public class SpringBootJavaFXApp extends Application {

    private ConfigurableApplicationContext applicationContext;

    @Override
    public void init() throws Exception {
        applicationContext = new SpringApplicationBuilder(SpringBootJavaFXApp.class).run();
    }

    @Override
    public void start(Stage primaryStage) {
        applicationContext.publishEvent(new StageStartedEvent(primaryStage));
    }

    public static void main(String[] args) {
        Application.launch(SpringBootJavaFXApp.class, args);
    }
}
```

links:

* [YouTube: Fully Reactive: Spring, Kotlin, and JavaFX Playing Together](https://www.youtube.com/watch?v=Lse51SpfKHo)
