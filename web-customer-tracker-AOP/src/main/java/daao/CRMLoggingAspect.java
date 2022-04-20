package daao;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
public class CRMLoggingAspect {

    private Logger myLogger = Logger.getLogger(getClass().getName());
    @Pointcut("execution(* daao.*.*(..))")
    private void forBefore(){}
    @Before("forBefore()")
    public void beforeLogging(JoinPoint joinPoint){
        System.out.println("===>>> in the method "+joinPoint.getSignature().toString());
    }
}