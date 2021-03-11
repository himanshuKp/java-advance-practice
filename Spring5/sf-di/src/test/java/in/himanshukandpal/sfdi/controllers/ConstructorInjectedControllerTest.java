package in.himanshukandpal.sfdi.controllers;

import in.himanshukandpal.sfdi.services.ConstructorBasedGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {

    private ConstructorInjectedController constructorInjectedController;

    @BeforeEach
    void setUp() {
        constructorInjectedController = new ConstructorInjectedController(new ConstructorBasedGreetingService());
    }

    @Test
    void getGreeting() {
        System.out.println(constructorInjectedController.getGreetingService());
    }
}