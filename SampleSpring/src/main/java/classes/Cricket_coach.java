package classes;

public class Cricket_coach implements coach{
    private FortuneService f;
    private  String Email;
    private int Team_no;

    public Cricket_coach(){}

    public void setEmailAddress(String Email){
        this.Email=Email;
    }

    public String getEmailAddress(){
        return Email;
    }

    public void setTeam_Number(int Team_no){
        this.Team_no=Team_no;
    }

    public int getTeam_Number(){
        return Team_no;
    }


    public void setFortuneService(FortuneService f){
        this.f=f;
    }

    @Override
    public String getDaily() {
        return "Practice cricket for 1 hour";
    }

    @Override
    public String getDailyFortune() {
        return f.getFortune();
    }
}
