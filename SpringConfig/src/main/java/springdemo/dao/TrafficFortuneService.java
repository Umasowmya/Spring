package springdemo.dao;

import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;


@Component
public class TrafficFortuneService {

    public String getFortune(){

        try {

            TimeUnit.SECONDS.sleep(5);

        }

        catch(Exception e){
            e.printStackTrace();
        }

        return "Heavy traffic";
    }

    public String getFortune(boolean t){
        if(t){
            throw  new RuntimeException("Big accident turn down th  power");
        }

        return getFortune();
    }

}
