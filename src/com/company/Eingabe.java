package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Eingabe {
    // Definition der Variablen
    protected float zins;
    protected float kapital;
    // Scanner nur für das Objekt
    protected Scanner sc = new Scanner(System.in);

    public float getZins() {
        return zins;
    }

    public void setZins() {
        try {
            // Eingabe des Zinses
            zins = sc.nextFloat();
        } catch (InputMismatchException e) {
            // Wenn keine Zahl eingegeben wurde
            System.out.println("Falsche Eingabe");
            System.exit(0);
        }
        this.zins = zins;
    }

    public float getKapital() {
        return kapital;
    }

    public void setKapital() {
        try {
            // Eingabe des Kapitals
            kapital = sc.nextFloat();
        } catch (InputMismatchException e){
            // Wenn keine Zahl eingegeben wurde
            System.out.println("Falsche Eingabe");
            System.exit(0);
        }
        this.kapital = kapital;
    }
}
