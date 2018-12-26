package spring_demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class VolleyballCoach implements Coach {

    private String someText;


    private VolleyballCoach(@Qualifier("tenService") SomeService someService, AnotherInterface anotherInterface) {
        System.out.println("VolleyballCoach(SomeService someService, AnotherInterface anotherInterface)");
        this.someText = someService.numberOfReps() + anotherInterface.addSomeText();
    }

    @Override
    public String getPlan() {
        String reps = "someService.numberOfReps()";
        return this.someText + reps + " razy piłkę";
    }

    public String getSomeText(@Qualifier("tenService") SomeService someService, AnotherInterface anotherInterface) {
        System.out.println("getSomeText(SomeService someService, AnotherInterface anotherInterface)");
        return someService.numberOfReps() + anotherInterface.addSomeText();
    }

    public void setSomeText(String someText) {
        this.someText = someText;
    }

    private void init() {
        System.out.println("private void init()");
    }

    private void destroy() {
        System.out.println("private void destroy()");
    }
}
