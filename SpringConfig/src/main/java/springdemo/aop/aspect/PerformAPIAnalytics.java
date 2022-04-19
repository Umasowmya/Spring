package springdemo.aop.aspect;

import springdemo.aop.aspect.PointCutExpr;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@Aspect
@Component
@Order(3)
public class PerformAPIAnalytics {
    @Before("springdemo.aop.aspect.PointCutExpr.NoSetGet()")
    public void PerformApiAnalytics(){
        System.out.println("Performing API Analytics");
    }
}
