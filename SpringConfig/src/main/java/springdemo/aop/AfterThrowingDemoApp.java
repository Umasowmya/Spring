package springdemo.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import springdemo.dao.AccountDAO;

import java.util.List;

public class AfterThrowingDemoApp {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);

        AccountDAO accountDAO = context.getBean("accountDAO",AccountDAO.class);

        accountDAO.setFname("Uma");
        accountDAO.setLname("Sowmya");


        List<Account> r = null;
        try
        {
             boolean t = true;
             accountDAO.findAccounts(t);
             System.out.println(r);
             context.close();
        }

        catch(Exception e){

            System.out.println("Exception is caught "+e);

        }

        }
}
