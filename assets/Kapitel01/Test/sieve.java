
/**
 * Beschreiben Sie hier die Klasse sieve.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class sieve
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int x;

    /**
     * Konstruktor für Objekte der Klasse sieve
     */
    public sieve()
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
    
    public boolean[] sieve1(int n) {
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
            }
        
        
        }
        
        array[count] = storage;
        count++; 
    
    
    }
    
    return array;

}

public boolean[] sieve(int n) {
     
        
        boolean[] array= new boolean[n-1];
        for (int u = 0; u < n-1; u++){
            array[u] = false;
        }
        for (int i = 2; i<n-1; i++){
            for (int m = i+1; m<n+1; m++){
                if (m%i == 0){
                    array[m-2] = true;
                }
                
                
            }
        }
        return array;
    }
public void Test1(){
    System.out.println(3%2);
}
public int[][] chessBoard(){
    int [][] array = new int[8][8]; 
    int count = 0;
    int countForcount = 0;
    int füll = 0;
    for (int i1 = 0; i1 < 8; i1++){
        for (int i2 = 0; i2 < 8; i2++){
            if (count%2 == 0){
                füll = 0;
            }
            else{
                füll = 1;
            }
            array[i1][i2] = füll;
            count++;
        }
        if (countForcount%2 == 0){
                count = 1;
            }
        else{
                count = 0;
            }
        countForcount++; 
    }
    return array;
}

public int[][] bino(int rows){
    //Loop, die ein Array erstellt mit n Zeilen und n+1 Spalten
    int[][] pTriangle = new int[rows][];
    for (int i = 0; i < rows; i++) {
        pTriangle[i] = new int[i+1];
    }
    for (int j = 0; j < rows; j++) {
        // j geht jede Zeile durch
        for (int k = 0;k <= j; k++) {
            // k berechnet den Wert jedes Spalteneintrags
            if (j == k || j == 0 || j > 0 && k == 0) {
                // wenn Index 0,0 oder Zeilenindex = 0 oder Zeilenindex >1 und Spaltenindex = 0, setze Wert auf 1 (das sind die Randwerte links)
                pTriangle[j][k] = 1;
            }
            if (0 < k && k < j) {
                // Die Formel war in Moodle gegeben, berechnet die Zahl für jede einzelne Stelle
                pTriangle[j][k] = pTriangle[j-1][k-1] + pTriangle[j-1][k];
            }
        }
    }
    return pTriangle;
}
}
