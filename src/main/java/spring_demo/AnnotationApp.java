package spring_demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationApp {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConf.class);
        AnnotationCoachImpl coach = context.getBean("annotationCoach", AnnotationCoachImpl.class);

        System.out.println(coach.getPlan());
    }
}
