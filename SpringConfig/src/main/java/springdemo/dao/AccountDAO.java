package springdemo.dao;

import org.springframework.stereotype.Component;
import springdemo.aop.Account;

import java.util.ArrayList;
import java.util.List;

@Component
public class AccountDAO {

    private String fname;
    private String lname;

    public String getFname() {

        System.out.println("in get fname");
        return fname;
    }

    public void setFname(String fname) {
        System.out.println("in set fname");
        this.fname = fname;
    }

    public String getLname() {
        System.out.println("in get lname");
        return lname;
    }

    public void setLname(String lname) {
        System.out.println("in set lname");
        this.lname = lname;
    }

    public void addAccount(Account account){
        System.out.println(getClass()+" Doing my db work adding account");

    }

    public void doWork(){
        System.out.println("In do work method ");
    }


    public List<Account> findAccounts(boolean t){

        if(t ==true)
        {
            throw new RuntimeException("No soup for you!!");
        }
        List<Account> myAccounts = new ArrayList<>();

        Account a1 = new Account("Madhu","Platinum");
        Account a2 = new Account("Pavan","Gold");
        Account a3 = new Account("Kiran","Silver");


        myAccounts.add(a1);
        myAccounts.add(a2);
        myAccounts.add(a3);

        return myAccounts;

    }



}
