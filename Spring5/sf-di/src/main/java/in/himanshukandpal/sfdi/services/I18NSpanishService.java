package in.himanshukandpal.sfdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("i18nservice")
public class I18NSpanishService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World - Spanish service";
    }
}
