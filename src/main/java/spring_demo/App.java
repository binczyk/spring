package spring_demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        VolleyballCoach coach = context.getBean("coach", VolleyballCoach.class);
        System.out.println(coach.getPlan());
        coach.setSomeText("dasdasdasdasd");
        coach = context.getBean("coach", VolleyballCoach.class);
        System.out.println(coach.getPlan());

        ((ClassPathXmlApplicationContext) context).close();
    }
}
