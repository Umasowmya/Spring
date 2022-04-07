package classes;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService{

    public String getFortune(){

        return "Lucky day";
    }
}
