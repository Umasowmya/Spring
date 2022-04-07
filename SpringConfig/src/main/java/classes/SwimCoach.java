package classes;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements coach{
    private FortuneService f;

    @Value("${foo.email}")
    private String email;

    @Value("${foo.team}")
    private String team;

    public SwimCoach(FortuneService f){
        this.f=f;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getTeam() {
        return team;
    }

    @Override
    public String getDaily() {
        return "practice swimming for two hours";
    }

    @Override
    public String getDailyFortune() {
        return f.getFortune();
    }
}
