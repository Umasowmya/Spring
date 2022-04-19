package springdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {

    public boolean addAccount(){
        System.out.println(getClass()+" Doing my job adding a membership account");
        return true;
    }

    public void goToSleep(){
        System.out.println("in sleep method");
    }
}
