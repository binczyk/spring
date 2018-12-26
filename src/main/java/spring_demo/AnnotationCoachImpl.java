package spring_demo;

public class AnnotationCoachImpl implements Coach {

    @Override
    public String getPlan() {
        return this.getClass().toString();
    }
}
