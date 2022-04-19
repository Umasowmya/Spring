package springdemo.aop.aspect;

import springdemo.aop.aspect.PointCutExpr;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class LoginToCloud {

    @Before("springdemo.aop.aspect.PointCutExpr.NoSetGet()")
    public void LoggingToCloud(){
        System.out.println("Logging into cloud");
    }

}
