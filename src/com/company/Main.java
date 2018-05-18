package com.company;

public class Main {
    // Diese Variable beinhaltet den zurückgegebenen Wert der Berechnung
    protected static float prozentsatz;

    public static void main(String[] args) {
        // Initialisierung des Objektes "eingabe" welches die Werte erfasst und speichert
	Eingabe eingabe = new Eingabe();
        System.out.println("Bitte gebe das Kapital an");
	eingabe.setKapital();
        System.out.println("Bitte gebe den Zins an");
	eingabe.setZins();

	// Prüfen ob mit der Eingabe gerechnet werden kann
	if (eingabe.getKapital() <= 0 || eingabe.getZins() <= 0) {
        System.out.println("Falsche Eingabe");
        System.exit(0);
    }
    else {
        // Berechnung des Prozentsatzes
        prozentsatz = Berechnung.berechnung(eingabe);
        // Ausgabe des Ergebnisses
        System.out.println("Die Berechnung ergab: " + prozentsatz + "%");
    }
    }
}
