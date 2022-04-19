package springdemo.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import springdemo.dao.AccountDAO;

import java.util.List;

public class AfterReturningDemoApp {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);

        AccountDAO accountDAO = context.getBean("accountDAO",AccountDAO.class);

        accountDAO.setFname("Uma");
        accountDAO.setLname("Sowmya");

        List<Account> r = accountDAO.findAccounts();

        System.out.println(r);

        context.close();

    }
}
