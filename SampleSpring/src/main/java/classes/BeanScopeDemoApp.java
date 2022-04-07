package classes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
    public static void main(String args[]){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanConfig-applicationContext.xml");

        coach theCoach = context.getBean("myCoach",coach.class);

        coach alphaCoach = context.getBean("myCoach",coach.class);

        boolean result = theCoach == alphaCoach;

        System.out.println("\n Pointing to same object  "+result);

        System.out.println("\nMemory location for object 1 "+theCoach);

        System.out.println("\nMemory location for object 2 "+alphaCoach);

        context.close();
    }

}
