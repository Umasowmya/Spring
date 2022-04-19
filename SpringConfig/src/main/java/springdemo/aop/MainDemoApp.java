package springdemo.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import springdemo.dao.*;

public class MainDemoApp {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);

        AccountDAO a = context.getBean("accountDAO",AccountDAO.class);

        MembershipDAO m =context.getBean("membershipDAO",MembershipDAO.class);



        a.setFname("Uma");
        a.setLname("Sowmya");
        a.getFname();
        a.getLname();

        a.addAccount(new Account("Uma","Platinum"));
        a.doWork();

        m.addAccount();
        m.goToSleep();

        context.close();

    }

}
