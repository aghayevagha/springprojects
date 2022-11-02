package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("languages")
public class Spanish implements GreetingService{
    @Override
    public String sayGreeting() {
        return "spanish";
    }
}
