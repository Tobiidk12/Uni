
/**
 * Beschreiben Sie hier die Klasse Tamagotchi.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Tamagotchi
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int hunger;
    private int mood;
    private int fatigue;
    public int hunger_threshold;
    public int mood_threshold;
    public int fatigue_threshold;
    public String status;
    public boolean slept;

    /**
     * Konstruktor für Objekte der Klasse Tamagotchi
     */
public Tamagotchi(int _hunger_threshold, int _mood_threshold,int _fatigue_threshold )
    {
   hunger = 0;
    mood = 0;
    fatigue = 0;
    hunger_threshold = _hunger_threshold;
    mood_threshold = _mood_threshold;
    fatigue_threshold = _fatigue_threshold;
    status = "indifferent";
    }
public String getGeneralCondition(){
 if (fatigue < fatigue_threshold) {
          status = "tired";
     return status;
 }
if (hunger > hunger_threshold) {
     status = "hungry";
     return status;
}
if (mood < mood_threshold) {
         status = "happy";
     return status;
}
    else {
        status = "indifferent";
        return status;
        
}} 


    
public void play () {
    if  (hunger > hunger_threshold) {
    hunger += 2;
    fatigue += 3;
    mood += 2;
}
else {System.out.println("too Hungry");
}}
public void eat () {
    if  (fatigue <= fatigue_threshold) {
    hunger -= 3;
    fatigue += 2;
}
else {System.out.println("too tired");
}
}
public void sleep () {
    if (slept == false) {
    if  (hunger > hunger_threshold) {
    hunger += 1;
    fatigue = 0;
    mood += 1;
    slept = true;
}
else {
    hunger += 1;
    fatigue = 0;
    mood -= 1;
    slept = true;
}}
else {System.out.println("already slept");
}}
public void pet () {
    hunger += 1;
    mood += 2;
}
public void makeHappy(){
        pet();
        eat();
        sleep();
        getGeneralCondition();
    }

}
