package classes;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemo {
    public static void main(String args[]){
         AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        coach theCoach = context.getBean("tennisCoach",coach.class);

        System.out.println(theCoach.getDaily());

        System.out.println(theCoach.getDailyFortune());

        context.close();

    }

}
