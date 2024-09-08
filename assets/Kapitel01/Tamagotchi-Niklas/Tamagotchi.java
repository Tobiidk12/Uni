public class Tamagotchi {
     private int hunger;
    private int mood;
    private int fatigue;
    private int maxHunger;
    private int maxMood;
    private int maxFatigue;

    /**
     
Konstruktor für Objekte der Klasse Tamagotchi*/
  public Tamagotchi(int hungry, int happy, int tired){
      hunger = 0;
      mood = 0;
      fatigue = 0;
      maxHunger = hungry;
      maxMood = happy;
      maxFatigue = tired;}
  public void play () {
      if (hunger <= maxHunger){
          hunger = hunger + 2;
          mood = mood + 2;
          fatigue = fatigue + 3;} else {
      }
  }
  public void eat () {
      if (fatigue <= maxFatigue){
          hunger = hunger - 3;
          fatigue = fatigue + 2;} else {
      }
  }
  public void sleep () {
if (hunger <= maxHunger){
            hunger = hunger + 1;
            mood = mood + 1;
            fatigue = 0;
        } else {
            hunger = hunger + 1;
            mood = mood - 1;
            fatigue = 0;
        }
    }
    public void pet () {
        hunger = hunger + 1;
        mood = mood + 2;
    }
    public String getGeneralCondition () {
        if (fatigue > maxFatigue) {
                    return "tired";
                } else {
            if (hunger > maxHunger) {
                return "hungry";
            } else {
                if (mood > maxMood) {
                    return "happy";
                } else {
                    return "indifferent";
                }
            }
        }
    }
    public void makeHappy () {
        eat ();
        sleep ();
    }
}