package spring_demo;

import org.springframework.stereotype.Component;

@Component
public class TenService implements SomeService {

    @Override
    public String numberOfReps() {
        return "10";
    }
}
