package springdemo.aop.aspect;

import org.aspectj.lang.annotation.AfterReturning;
import springdemo.aop.Account;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Locale;

@Aspect
@Component
@Order(2)
public class MyDemoLoginAspect {

    @Before("springdemo.aop.aspect.PointCutExpr.NoSetGet()")
    public void BeforeAdvice(JoinPoint theJoinPoint){

        MethodSignature theMethod = (MethodSignature) theJoinPoint.getSignature();

        System.out.println("Method signature  "+theMethod);

        Object args[] = theJoinPoint.getArgs();

        for(Object temp :args)
        {
            System.out.println(temp);

            if(temp instanceof Account){
                Account a = (Account) temp;
                System.out.println("First name is "+a.getName());
                System.out.println("Level is "+a.getLevel());
            }
        }

        System.out.println("excluding getter and setter annotation");
    }

    @Before("springdemo.aop.aspect.PointCutExpr.getter()")
    public void AdviceBefore2(){
        System.out.println("Executing getter annotation");
    }

    @Before("springdemo.aop.aspect.PointCutExpr.setter()")
    public void AdviceBefore3(){
        System.out.println("Executing setter annotation");
    }

    @AfterReturning(pointcut = "execution(* springdemo.dao.AccountDAO.findAccounts(..))",returning = "result")
    public void AdviceBefore4(JoinPoint theJoinPoint , List<Account> result){

        String m = theJoinPoint.getSignature().toShortString();

        System.out.println(m);

        System.out.println("Before modification "+result);

        for(Account temp:result){

            temp.setName(temp.getName().toUpperCase(Locale.ROOT));
        }

        System.out.println("After modification "+result);

        System.out.println("Executing setter annotation");
    }


}
