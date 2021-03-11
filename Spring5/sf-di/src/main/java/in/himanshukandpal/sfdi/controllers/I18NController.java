package in.himanshukandpal.sfdi.controllers;

import in.himanshukandpal.sfdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class I18NController {
    private final GreetingService greetingService;

    public I18NController(@Qualifier("i18nservice") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayGreeting(){
        return greetingService.sayGreeting();
    }
}
