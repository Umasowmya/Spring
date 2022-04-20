package springdemo.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import springdemo.dao.TrafficFortuneService;

import java.util.logging.Logger;

public class AroundDemo2AppLogger {

    private static Logger myLogger = Logger.getLogger(AroundDemo2AppLogger.class.getName());

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);

        TrafficFortuneService t  = context.getBean("trafficFortuneService",TrafficFortuneService.class);

        myLogger.info("calling fortune");

        String s = t.getFortune(true);

        myLogger.info(s);

        context.close();

        }
}
