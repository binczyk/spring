package spring_demo;

import org.springframework.stereotype.Component;

@Component
public class HoundredService implements SomeService {

    @Override
    public String numberOfReps() {
        return "100";
    }
}
