package classes;

public class Baseball_coach implements coach{
   private FortuneService f;

   Baseball_coach(FortuneService f){
       this.f=f;
   }

    @Override
    public String getDaily() {
        return "do workout for 1 hour";
    }

    public String getDailyFortune(){
        return f.getFortune();
    }
}
