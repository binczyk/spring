package spring_demo;

public class VolleyballCoach implements Coach {

    private SomeService someService;
    private String someText;

    private VolleyballCoach() {
        this.someText = "Podbij ";
    }

    public VolleyballCoach(SomeService someService) {
        this.someService = someService;
    }

    @Override
    public String getPlan() {
        String reps = someService.numberOfReps();
        return this.someText + reps + " razy piłkę";
    }

    public SomeService getSomeService() {
        return someService;
    }

    public void setSomeService(SomeService someService) {
        this.someService = someService;
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
