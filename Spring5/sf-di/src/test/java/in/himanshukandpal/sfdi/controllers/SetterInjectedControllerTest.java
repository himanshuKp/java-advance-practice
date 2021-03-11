package in.himanshukandpal.sfdi.controllers;

import in.himanshukandpal.sfdi.services.ConstructorBasedGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {

    private SetterInjectedController setterInjectedController;

    @BeforeEach
    void setUp() {
        setterInjectedController = new SetterInjectedController();
        setterInjectedController.setGreetingService(new ConstructorBasedGreetingService());
    }

    @Test
    void getGreetingService() {
        System.out.println(setterInjectedController.getGreetingService());
    }
}