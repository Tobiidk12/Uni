/**
 * Die Klasse Ticketautomat modelliert einfache Ticketautomaten,
 * die Tickets zu einem Einheitspreis herausgeben.
 * Der Preis für die Tickets eines Automaten kann über den Konstruktor
 * festgelegt werden.
 * Ein Ticketautomat ist insofern 'naiv', dass er seinen Benutzern
 * vertraut, dass sie genügend Geld einwerfen, bevor sie sich ein Ticket
 * ausdrucken lassen.
 * AuÃŸerdem nimmt er an, dass sinnvolle Beträge eingeworfen werden.
 *
 * @author David J. Barnes und Michael Kölling
 * @version 2003.05.15
 */
public class Ticketautomat {
    // Der Preis eines Tickets dieses Automaten.
    private int preis;
    
    public int status;
    
    
    // Der Betrag, der bisher vom Automatenbenutzer eingeworfen wurde.
    private int bisherGezahlt;
    // Die Geldsumme, die bisher von diesem Automaten eingenommen wurde.
    private int gesamtsumme;

    /**
     * Erzeuge eine Maschine, die Tickets zum angegebenen Preis
     * (in Cent) ausgibt.
     * Zu beachten: Der Preis muss größer als Null sein,
     * der Automat überprüt dies jedoch nicht.
     */
    public Ticketautomat(int ticketpreis) {
        preis = ticketpreis;
        bisherGezahlt = 0;
        gesamtsumme = 0;
    }

    /**
     * Gibt den Preis eines Tickets zurÃ¼ck
     */
    public int getPreis() {
        return preis;
    }

    /**
     * Liefere die Höhe des Betrags, der fÃ¼r das nÃ¤chste Ticket bereits
     * eingeworfen wurde.
     */
    public int getBisherGezahlt() {
        return bisherGezahlt;
    }

    /**
     * Wirf die angegebene Menge an Cents in den Automaten
     */
    public void geldEinwerfen(int betrag) {

        if (betrag >= 0) {
        bisherGezahlt = bisherGezahlt + betrag;}
        else { System.out.println("sie haben versucht "+ betrag * -1 +" cent zu stehlen. Die Polizei kommt.");}
    }

    public void get_rückgeld () {
        System.out.println("Ihr Rückgeld ist " + bisherGezahlt + " cent.");
        bisherGezahlt = 0;
    }
    /**
     * Drucke ein Ticket.
     * Aktualisiere die eingenommene Gesamtsumme und setze den gezahlten
     * Betrag auf Null.
     */
    public void ticketDrucken() {
        // Den Ausdruck eines Tickets simulieren.
        int wechselgeld = bisherGezahlt - preis;
        if (bisherGezahlt >= preis) { 
        System.out.println("##################");
        System.out.println("# Die BlueJ-Linie");
        System.out.println("# Ticket");
        System.out.println("# " + preis + " Cent.");
        System.out.println("##################");
        System.out.println();

        // Die Gesamtsumme mit dem eingezahlten Betrag aktualisieren.
        gesamtsumme += bisherGezahlt;
        // Die bisherige Bezahlung zurÃ¼cksetzen.
        bisherGezahlt -= preis;
        
        
    }
    else {System.out.println("bitte werfen sie noch mindestens " + (preis - bisherGezahlt) + " cent ein");
    }
    }
}
