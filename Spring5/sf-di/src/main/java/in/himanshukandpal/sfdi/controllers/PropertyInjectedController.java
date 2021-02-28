package in.himanshukandpal.sfdi.controllers;

import in.himanshukandpal.sfdi.services.GreetingService;

public class PropertyInjectedController {
    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
