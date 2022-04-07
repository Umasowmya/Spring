package classes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleApp {
    public static void main(String args[]){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");

        coach theCoach = context.getBean("myCoach",coach.class);

        System.out.println(theCoach.getDailyFortune());

        System.out.println(theCoach.getDaily());

        context.close();
    }

}
