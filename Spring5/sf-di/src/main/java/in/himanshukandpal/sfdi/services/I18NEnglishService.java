package in.himanshukandpal.sfdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"EN", "default"})
@Service("i18nservice")
public class I18NEnglishService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World - English service";
    }
}
