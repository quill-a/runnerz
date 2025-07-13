package dev.quilla.runnerz;

import org.springframework.stereotype.Component;

@Component
public class WelcomeMessage {

    public String getWelcomeMessage() {
        return "Welcome to the Spring Boot Application!";
    }

    @Override
    public String toString() {
        return "Here is the toString method.";
    }

}
