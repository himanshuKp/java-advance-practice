package in.himanshukandpal.sfdi.controllers;

import in.himanshukandpal.sfdi.services.PrimaryGreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final PrimaryGreetingService primaryGreetingService;

    public MyController(PrimaryGreetingService primaryGreetingService) {
        this.primaryGreetingService = primaryGreetingService;
    }

    public String getPrimaryGreetingService() {
        return primaryGreetingService.sayGreeting();
    }
}
