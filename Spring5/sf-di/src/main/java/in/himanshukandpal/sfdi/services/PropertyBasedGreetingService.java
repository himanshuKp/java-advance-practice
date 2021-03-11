package in.himanshukandpal.sfdi.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyBasedGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Property";
    }
}
