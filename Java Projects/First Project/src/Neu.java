public class Neu {
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int x;

    /**
     * Konstruktor für Objekte der Klasse Neu
     */
    public Neu() {
        // Instanzvariable initialisieren
        x = 0;
    }

    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     *
     * @param y ein Beispielparameter für eine Methode
     * @return die Summe aus x und y
     */
    public int beispielMethode(int y) {
        // tragen Sie hier den Code ein
        return x + y;
    }

    public int crossTotal(int n) {
        int sum = 0;

        while (n > 0) {

            sum += n % 10;

            n /= 10;
        }

        return sum;
    }
}