package springdemo.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import springdemo.aop.DemoConfig;
import springdemo.dao.TrafficFortuneService;

import java.util.logging.Logger;

public class AroundDemoAppLogger {

    private static Logger myLogger = Logger.getLogger(AroundDemoAppLogger.class.getName());

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);

        TrafficFortuneService t  = context.getBean("trafficFortuneService",TrafficFortuneService.class);

        myLogger.info("calling fortune");

        String s = t.getFortune();

        myLogger.info(s);

        context.close();

        }
}
