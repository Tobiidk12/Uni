
/**
 * Beschreiben Sie hier die Klasse Neu.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Neu
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int x;
    int[] numbers = new int[] {1,2,3,4,5,6,7,8,9,10};
    /**
     * Konstruktor für Objekte der Klasse Neu
     */
    public Neu()
    {
        // Instanzvariable initialisieren
        x = 0;
    }

    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    public int beispielMethode(int y)
    {
        // tragen Sie hier den Code ein
        return x + y;
    }
    public int crossTotal(int n){
        int sum = 0;
        
        while (n > 0) {

            sum += n % 10;
            
            n /= 10;
        }
        
        return sum;
    }
    
 
    
    public void test1(){
        //Hier ist nur der Rumpf einer Methode zu schreiben
    String[] spruch;
    spruch = new String[] {"ich", "finde", "Java", "Spitze"};
    System.out.println(spruch[0]);
    System.out.println(spruch[1]);
    System.out.println(spruch[2]);
    System.out.println(spruch[3]);
    }
    public void printNumbers(int[] numbers){
        for (int array : numbers)
        {
            System.out.println(array);
        }   
    }
    public class PrimeTester{
    public void divisors(int n){
        System.out.print("Teiler von " + n + " sind");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                if (i == n){
                    System.out.print(" " + i);
                }
                else{
                    System.out.print(" "+ i + ",");
                }
            }
        }
        System.out.println();
    }

    public void properDivisors(int n){
        System.out.print("Echte Teiler von " + n + " sind");
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                if (i == n/2){
                    System.out.print(" " + i);
                    break;
                }
                System.out.print(" " + i + ",");
            }
        }
        System.out.println();
    }

    public boolean isPrime(int n){
            boolean isPrime = true;
            int i = 2;
            while (i < n) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
                i++;
            }
            return n == 2 || (n > 2 && isPrime);
    }
}
public int crossTotal2(int n){
        int crossTotal = 0;
        boolean done = false;
        while (done != true){
            int last = n % 10;
            for (int i = 50;i > 0;i--){
                last = n % 10;
                if (last != 0){
                    break;
                }
                else{
                    n = n / 10;
                }
                if (i == 1){
                    done = true;
                }
            }
            crossTotal = crossTotal + last;
            n = n / 10;
        }
        return crossTotal;
    }

    public int repeatedCrossTotal(int n){
        int crossTotal = 0;
        boolean done = false;
        while (done != true){
            int last = n % 10;
            for (int i = 50;i > 0;i--){
                last = n % 10;
                if (last != 0){
                    break;
                }
                else{
                    n = n / 10;
                }
                if (i == 49){
                    done = true;
                }
            }
            crossTotal = crossTotal + last;
            n = n / 10;
        }
        if (crossTotal > 9){
            repeatedCrossTotal(crossTotal);
        }
        else{
            return crossTotal;
        }
        return repeatedCrossTotal(crossTotal);
    }

    public int totalLength(String[] words){
    int sum = 0;
    for (int i = 0; i < words.length; i++){
        if (words[i]!= null){
        sum =words[i].length() + sum;}
    }
    return sum;

}
}


