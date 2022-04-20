package springdemo.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import springdemo.dao.AccountDAO;
import springdemo.dao.TrafficFortuneService;

import java.util.List;

public class AroundDemoApp {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);

        TrafficFortuneService t  = context.getBean("trafficFortuneService",TrafficFortuneService.class);

        System.out.println("calling fortune");

        String s = t.getFortune();

        System.out.println(s);

        context.close();

        }
}
