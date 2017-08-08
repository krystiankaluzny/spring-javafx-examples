package example;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.felixroske.jfxsupport.JavaFxSupport;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        JavaFxSupport.launchApp(Main.class, HelloworldView.class, args);
    }
}
