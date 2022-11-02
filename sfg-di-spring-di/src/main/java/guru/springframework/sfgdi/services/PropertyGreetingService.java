package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class PropertyGreetingService implements  GreetingService{
    @Override
    public String sayGreeting() {
        return "property";
    }
}
