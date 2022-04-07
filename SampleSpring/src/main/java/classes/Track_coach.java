package classes;

public class Track_coach implements coach{
    private FortuneService f;

    public Track_coach(FortuneService f){
        this.f=f;
    }

    @Override
    public String getDaily() {
        return "Tracking coach daily";
    }

   public String getDailyFortune(){
        return f.getFortune();
   }
}
