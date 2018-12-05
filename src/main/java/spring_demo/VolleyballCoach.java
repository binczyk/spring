package spring_demo;

public class VolleyballCoach implements Coach {

    private SomeService someService;

    public VolleyballCoach(SomeService someService) {
        this.someService = someService;
    }

    @Override
    public String getPlan() {
        String reps = someService.numberOfReps();
        return "Podbij " + reps + " razy piłkę";
    }
}
