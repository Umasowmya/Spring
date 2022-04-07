package classes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemo {
    public static void main(String args[]){
        ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");

        coach c = context.getBean("tennisCoach",coach.class);

        System.out.println(c.getDaily());

        System.out.println(c.getDailyFortune());

        context.close();

    }
}
