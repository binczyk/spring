package spring_demo;

public class BasketBallCoach implements Coach {

    private SomeService someService;

    public BasketBallCoach(SomeService someService) {
        this.someService = someService;
    }

    @Override
    public String getPlan() {

        String resp = someService.numberOfReps();
        return "Traf " + resp + " razy do kosza";
    }
}
