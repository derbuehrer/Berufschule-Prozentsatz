package com.company;

public class Berechnung {
    protected static float prozentsatz;

    public static float berechnung(Eingabe eingabe){
        // Errechnung des Prozentsatzes durch Zins * 100 / Kapital
        prozentsatz = (eingabe.getZins() * 100) / eingabe.getKapital();
        return prozentsatz;
    }
}
