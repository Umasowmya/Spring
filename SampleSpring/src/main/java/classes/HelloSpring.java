package classes;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {
    public static void main(String args[]){
        ClassPathXmlApplicationContext c = new ClassPathXmlApplicationContext("applicationContext.xml");
        Cricket_coach co = c.getBean("myCricket",Cricket_coach.class);
        System.out.println(co.getDaily());
        System.out.println(co.getDailyFortune());
        System.out.println(co.getEmailAddress());
        System.out.println(co.getTeam_Number());
        c.close();
    }
}
