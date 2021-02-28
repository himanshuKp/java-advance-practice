package in.himanshukandpal.sfdi.controllers;

import in.himanshukandpal.sfdi.services.GreetingService;

public class SetterInjectedController {

    private GreetingService greetingService;

    public String getGreetingService() {
        return greetingService.sayGreeting();
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
