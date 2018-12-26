package spring_demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConf {

    @Bean
    public Coach annotationCoach() {
        return new AnnotationCoachImpl();
    }


}
