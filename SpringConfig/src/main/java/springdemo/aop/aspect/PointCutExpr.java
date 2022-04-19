package springdemo.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import springdemo.aop.aspect.PointCutExpr;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
@Component
public class PointCutExpr {

    @Pointcut("execution( *  springdemo.dao.*.*(..))")
    public void pointCut(){}

    @Pointcut("execution( *  springdemo.dao.*.get*(..))")
    public void getter(){}

    @Pointcut("execution( *  springdemo.dao.*.set*(..))")
    public void setter(){}

    @Pointcut("pointCut() && !(getter() || setter())")
    public void NoSetGet(){}


}
