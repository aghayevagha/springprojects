package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Profile("default")
@Service("languages")
public class NoLanguage implements GreetingService{
    @Override
    public String sayGreeting() {
        return "no languages";
    }
}
