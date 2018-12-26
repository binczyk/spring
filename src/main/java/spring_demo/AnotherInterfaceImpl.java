package spring_demo;

import org.springframework.stereotype.Component;

@Component
public class AnotherInterfaceImpl implements AnotherInterface {

    @Override
    public String addSomeText() {
        return "public String addSomeText";

    }
}
