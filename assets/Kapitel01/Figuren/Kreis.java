import java.awt.*;
import java.awt.geom.*;

/**
 * Ein Kreis, der manipuliert werden kann und sich selbst auf einer Leinwand
 * zeichnet.
 * 
 * @author Michael Kölling und David J. Barnes
 * @version 2016.02.29
 */

public class Kreis {
    private int durchmesser;

    private int xPosition;

    private int yPosition;

    private String farbe;

    private boolean istSichtbar;

    /**
     * Erzeuge einen neuen Kreis an einer Standardposition mit einer
     * Standardfarbe.
     */
    public Kreis() {
        durchmesser = 68;
        xPosition = 230;
        yPosition = 90;
        farbe = "blau";
    }

    /**
     * Mache diesen Kreis sichtbar. Wenn er bereits sichtbar ist, tue nichts.
     */
    public void sichtbarMachen() {
        istSichtbar = true;
        zeichnen();
    }

    /**
     * Mache diesen Kreis unsichtbar. Wenn er bereits unsichtbar ist, tue
     * nichts.
     */
    public void unsichtbarMachen() {
        loeschen();
        istSichtbar = false;
    }

    /**
     * Bewege diesen Kreis einige Bildschirmpunkte nach rechts.
     */
    public void nachRechtsBewegen() {
        horizontalBewegen(20);
    }

    /**
     * Bewege diesen Kreis einige Bildschirmpunkte nach links.
     */
    public void nachLinksBewegen() {
        horizontalBewegen(-20);
    }

    /**
     * Bewege diesen Kreis einige Bildschirmpunkte nach oben.
     */
    public void nachObenBewegen() {
        vertikalBewegen(-20);
    }

    /**
     * Bewege diesen Kreis einige Bildschirmpunkte nach unten.
     */
    public void nachUntenBewegen() {
        vertikalBewegen(20);
    }

    /**
     * Bewege diesen Kreis horizontal um 'entfernung' Bildschirmpunkte.
     */
    public void horizontalBewegen(int entfernung) {
        loeschen();
        xPosition += entfernung;
        zeichnen();
    }

    /**
     * Bewege diesen Kreis vertikal um 'entfernung' Bildschirmpunkte.
     */
    public void vertikalBewegen(int entfernung) {
        loeschen();
        yPosition += entfernung;
        zeichnen();
    }

    /**
     * Bewege diesen Kreis langsam horizontal um 'entfernung' Bildschirmpunkte.
     */
    public void langsamHorizontalBewegen(int entfernung) {
        int delta;

        if (entfernung < 0) {
            delta = -1;
            entfernung = -entfernung;
        } else {
            delta = 1;
        }

        for (int i = 0; i < entfernung; i++) {
            xPosition += delta;
            zeichnen();
        }
    }

    /**
     * Bewege diesen Kreis langsam vertikal um 'entfernung' Bildschirmpunkte.
     */
    public void langsamVertikalBewegen(int entfernung) {
        int delta;

        if (entfernung < 0) {
            delta = -1;
            entfernung = -entfernung;
        } else {
            delta = 1;
        }

        for (int i = 0; i < entfernung; i++) {
            yPosition += delta;
            zeichnen();
        }
    }
    
public void langsamBewegen_besser(int schritte, int entfernungx, int entfernungy  ) {
    int delta_Y;
    int delta_X;

        if (entfernungy < 0) {
            delta_Y = -1;
            entfernungy = -entfernungy;
        } else {
            delta_Y = 1;
        }
        
        if (entfernungx < 0) {
            delta_X = -1;
            entfernungx = -entfernungx;
        } else {
            delta_X = 1;
        }

        for (int ix = 0; ix < schritte; ix++) {
            xPosition += entfernungx/schritte*delta_X;
            
            zeichnen();
        }
        
         for (int iy = 0; iy < schritte; iy++) {
            yPosition += entfernungy/schritte*delta_Y;
            zeichnen();
        }
    
}
public void langsamBewegen_meins(int schritte, int Richtung_X, int Richtung_Y  ) {

    
    if (schritte* Richtung_X + xPosition+ durchmesser > 500) {
        Richtung_X = Richtung_X * -1 ;
    }
    else if ( schritte * Richtung_Y + yPosition + durchmesser  > 300 ) {
        Richtung_Y = Richtung_Y * -1 ;
    }
    else if ( schritte * Richtung_Y + yPosition+ durchmesser  < 0 ) {
        Richtung_Y = Richtung_Y * -1 ;
    }
    else if (schritte* Richtung_X + xPosition+ durchmesser   < 0) {
        Richtung_X = Richtung_X * -1 ;
    }
    
        for (int i = 0; i < schritte; i++) {
            xPosition += Richtung_X;
            yPosition += Richtung_Y;
            zeichnen();
        }
    
}
public void langsamBewegen(int schritte, int xRichtung, int yRichtung) {
        for (int i = 0; i < schritte; i++) {
            if (xPosition + xRichtung <= 0 || xPosition + xRichtung + durchmesser >= 500) {
                xRichtung = -xRichtung;
            }
            if (yPosition + yRichtung <= 0 || yPosition + yRichtung + durchmesser >= 300) {
                yRichtung = -yRichtung;
            }
        
            xPosition += xRichtung;
            yPosition += yRichtung;
            zeichnen();
        }
    }
    /**
     * Ändere den Durchmesser dieses Kreises in 'neuerDurchmesser' (Angabe in
     * Bildschirmpunkten). 'neuerDurchmesser' muss größer gleich null sein.
     */
    public void groesseAendern(int neuerDurchmesser) {
        loeschen();
        durchmesser = neuerDurchmesser;
        zeichnen();
    }

    /**
     * Ändere die Farbe dieses Kreises in 'neueFarbe'. Gültige Angaben sind
     * "rot", "gelb", "blau", "gruen", "lila" und "schwarz".
     */
    public void farbeAendern(String neueFarbe) {
        farbe = neueFarbe;
        zeichnen();
    }

    /**
     * Zeichne diesen Kreis mit seinen aktuellen Werten auf den Bildschirm.
     */
    private void zeichnen() {
        if (istSichtbar) {
            Leinwand leinwand = Leinwand.gibLeinwand();
            leinwand.zeichne(this, farbe, new Ellipse2D.Double(xPosition,
                    yPosition, durchmesser, durchmesser));
            leinwand.warte(10);
        }
    }

    /**
     * Lösche diesen Kreis vom Bildschirm.
     */
    private void loeschen() {
        if (istSichtbar) {
            Leinwand leinwand = Leinwand.gibLeinwand();
            leinwand.entferne(this);
        }
    }

}
