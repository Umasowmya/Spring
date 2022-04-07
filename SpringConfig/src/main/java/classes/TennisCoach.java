package classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


@Component
@Scope("prototype")
public class TennisCoach implements coach{

    @Autowired
    @Qualifier("happyFortuneService")
    private FortuneService f;


    /*
    @Autowired
    public void crazy(FortuneService f){
        System.out.println("inside crazy method");
            this.f=f;
    }
*/

    @Override
    public String getDaily() {
        return "practice for two hours";
    }

    @Override
    public String getDailyFortune() {
        return f.getFortune();
    }

    @PostConstruct
    public void doStartUpStuff(){
        System.out.println("starting up stuff");
    }

    @PreDestroy
    public void doCleanUpStuff(){
        System.out.println("cleaning up stuff");
    }

}

