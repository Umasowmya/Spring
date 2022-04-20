/*package daao;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
public class CRMLoggingAspect {

    private static Logger myLogger  =Logger.getLogger(CRMLoggingAspect.class.getName());


    @Pointcut("execution(* daao.CustomerController.*(..))")
    private void forController(){

    }

    @Pointcut("execution(* daao.CustomerDAOImpl.*(..))")
    private void forDAO(){

    }

    @Pointcut("execution(* daao.CustomerServiceImpl.*(..))")
    private void forService(){

    }



    @Before("execution(* daao.*.*(..))")
    public void before(JoinPoint theJoinPoint) {

        String method = theJoinPoint.getSignature().toShortString();
        myLogger.info("Calling method  " + method);

        // get the arguments
        Object[] args = theJoinPoint.getArgs();

        // loop thru and display args
        for (Object tempArg : args) {
            myLogger.info("=====>> argument: " + tempArg);
        }
    }

        // add @AfterReturning advice
        @AfterReturning(pointcut="forAppFlow()", returning="theResult")
        public void afterReturning(JoinPoint theJoinPoint, Object theResult) {

            // display method we are returning from
            String theMethod = theJoinPoint.getSignature().toShortString();
            myLogger.info("=====>> in @AfterReturning: from method: " + theMethod);

            // display data returned
            myLogger.info("=====>> result: " + theResult);

        }

}*/

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

