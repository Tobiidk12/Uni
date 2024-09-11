
/**
 * Beschreiben Sie hier die Klasse test.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class test
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int x;

       String[] array1 = new String[] {"ich", "hab", "keine", "lust"};
    public String[] array2 = new String[4];
    public int[] Array3 = new int[] {4,1,22,9,14,3,9};
    
    
    /**
     * Konstruktor für Objekte der Klasse test
     */
    public test()
    {
        // Instanzvariable initialisieren
        x = 0;
        array2[0] = "ich";
    }
public void teeeeest(){
    String text ="abcdefghijklmnopqrstuvwxyzabcdefghi";
                    String textt ="reglvmglxki";
                    for ( int i = 0; i < textt.length(); i++){
                        for ( int j = 0; j < text.length(); j++){
                            if (i == j){
                                System.out.print(i);
                            }
                        }
                    }}
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

public void printStars (int number)
{
for(int i = 0; i < number; i++)
{System.out.print("*");  
    
}


}

public void printTriangle(int number)
{
for (int i = 1; i <= number; i++)
{
    printStars(i);
    System.out.println("");
}
}

public void divisiors (int n)
{
    for(int i = 2; i < n; i++){ 
    if (n%i==0){
    System.out.println(i);} 
}
}
public void printdiamond(int number){
for (int i = 0; i < 2 * number + 1; i++) {
        if (i <= number) {
            // Obere Hälfte des Diamanten und die Mitte
            // Druckt Leerzeichen
            for (int j = 0; j < number - i; j++) {
                System.out.print(" ");
            }
            // Druckt Sterne
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
        } else {
            // Untere Hälfte des Diamanten
            // Druckt Leerzeichen
            for (int j = 0; j < i - number; j++) {
                System.out.print(" ");
            }
            // Druckt Sterne
            for (int j = 0; j < 2 * (2 * number - i) + 1; j++) {
                System.out.print("*");
            }
        }

        // Gehe zur nächsten Zeile
        System.out.println();
    }}


public void properDivisiors (int n)
{
{
    int i = 1;
    while (i <= n){
    
    if (n%i==0){
    System.out.println(i);}
    i++;
}    
}
}

public boolean prime (int n)
{
for(int i = 2; i < n; i++){ 
    if (n%i==0){
    return false;}
}
 return true;   
}


public void pi (int genauigkeit)
{
 for (int i = 1; i < genauigkeit; i++){
    }
    


}
public void iteration (){
array1[2] = null; 
System.out.println(array1[0].length());
for (String arrays: array1){
    System.out.println(arrays);
}
}
public void callArray(int[] number){
int n = number.length;
for (int i = 0; i < n; i++){
System.out.println(number[i]);
}
}

public void test (){
       for (int i = 12; i < 100; i +=3)
{System.out.println(i);} 
}



int[] kartennummer1 = new int[] {4,5,8,3,4,5,7,8,2,9,3,7,6,5,2};
int[] kartennummer2 = new int[] {4,5,6,3,9,6,0,1,2,2,0,0,1,8,9};
public int luhn (int [] digits){
    int factor;
    int sum = 0;
    int prüfzahl;
    int digit = 0;
    for (int i = 0; i < digits.length; i++){
        factor = i%2;
        if (factor == 0){
            digit = digits[i] * 2;
        }
                if (factor == 1){
            digit = digits[i];
        }
        if (digit > 9){
            digit = digit - 9;
        }
        sum = sum + digit;
    }
    sum= sum%10;
    sum = 10 - sum;
    prüfzahl= sum%10;

return prüfzahl;
}

public boolean[] sieve(int n) {
    boolean[] array = new boolean [n];
    boolean storage = false;
    int count= 0;
    for (int i=2; i <= n; i++){
        for (int m = 1; m < i; m++){
            if (m/i == 0){
                storage = true;
                System.out.println(m);
                System.out.println(i);
                System.out.println("---------------");
            }
            else {
               storage = false; 
                System.out.println(m);
                 System.out.println(i);
                             System.out.println("---------------");
                break;
            }
        
        
        }
        
        array[count] = storage;
        count++; 
    
    
    }
    
    return array;

}
public void test2(){
    System.out.println(0/2);
}

}










