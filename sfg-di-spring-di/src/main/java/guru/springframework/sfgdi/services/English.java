package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Profile("EN")
@Service("languages")
public class English implements GreetingService{
    @Override
    public String sayGreeting() {
        return "english";
    }
}

