package springdemo.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import springdemo.aop.Account;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Locale;
import java.util.logging.Logger;

@Aspect
@Component
@Order(2)
public class MyDemoLoginAspect {
    
    private static Logger myLogger = Logger.getLogger(MyDemoLoginAspect.class.getName());

    @Before("springdemo.aop.aspect.PointCutExpr.NoSetGet()")
    public void BeforeAdvice(JoinPoint theJoinPoint) {

        MethodSignature theMethod = (MethodSignature) theJoinPoint.getSignature();

        myLogger.info("Method signature  " + theMethod);

        Object args[] = theJoinPoint.getArgs();

        for (Object temp : args) {
            myLogger.info(temp.toString());

            if (temp instanceof Account) {
                Account a = (Account) temp;
                myLogger.info("First name is " + a.getName());
                myLogger.info("Level is " + a.getLevel());
            }
        }

        myLogger.info("excluding getter and setter annotation");
    }

    @Before("springdemo.aop.aspect.PointCutExpr.getter()")
    public void AdviceBefore2() {
        myLogger.info("Executing getter annotation");
    }

    @Before("springdemo.aop.aspect.PointCutExpr.setter()")
    public void AdviceBefore3() {
        myLogger.info("Executing setter annotation");
    }

    @AfterReturning(pointcut = "execution(* springdemo.dao.AccountDAO.findAccounts(..))", returning = "result")
    public void AdviceBefore4(JoinPoint theJoinPoint, List<Account> result) {

        String m = theJoinPoint.getSignature().toShortString();

        myLogger.info(m);

        myLogger.info("Before modification " + result);

        for (Account temp : result) {

            temp.setName(temp.getName().toUpperCase(Locale.ROOT));
        }

        myLogger.info("After modification " + result);

        myLogger.info("Executing setter annotation");
    }

    @AfterThrowing(pointcut = "execution(* springdemo.dao.AccountDAO.findAccounts(..))", throwing = "theExce")
    public void AdviceBefore5(JoinPoint theJoinPoint, Exception theExce) {

        String method = theJoinPoint.getSignature().toShortString();
        myLogger.info("Executing @AfterThrowing on method "+method);

        myLogger.info("The exception is "+theExce);
    }


    @After("execution(* springdemo.dao.AccountDAO.findAccounts(..))")
    public void AdviceBefore5(JoinPoint theJoinPoint) {

        String method = theJoinPoint.getSignature().toShortString();
        myLogger.info("Executing @After on method "+method);


    }

    @Around("execution(* springdemo.dao.TrafficFortuneService.getFortune(..))")
    public Object  AdviceBefore6(ProceedingJoinPoint theJoinPoint )throws Throwable
    {
        long begin = System.currentTimeMillis();

        Object result = null;
        try {
             theJoinPoint.proceed();
        }

        catch(Exception e){

            myLogger.warning(e.getMessage());

            throw e;

        }
        long end = System.currentTimeMillis();

        long duration = end-begin;

        myLogger.info("Duration "+duration/1000 +"  seconds");

        return result;
    }

}