package classes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
    public static void main(String args[]){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        coach theCoach = context.getBean("tennisCoach",coach.class);

        System.out.println(theCoach.getDaily());

        System.out.println(theCoach.getDailyFortune());

        context.close();

    }

}
