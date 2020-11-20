public class Zahlenraten {

    public static void main(String[] args) {
        Zufallszahl zufallszahl = new Zufallszahl();
        Benutzerinteraktion benutzerinteraktion = new Benutzerinteraktion();
        benutzerinteraktion.initaleAusgabe();
        int vergleichsErgebnis;

        do {
            int benutzereingabe = benutzerinteraktion.getBenutzereingabe();
            vergleichsErgebnis = zufallszahl.zahlenVergleich(benutzereingabe);

            if (vergleichsErgebnis == 1) {
                benutzerinteraktion.eingabeZuGross();
            } else if (vergleichsErgebnis == -1) {
                benutzerinteraktion.eingabeZuKlein();
            } else if (vergleichsErgebnis == 0) {
                benutzerinteraktion.richtigeZahl();
            }
        } while (vergleichsErgebnis != 0);
    }

    //Methoden und Variablen sind selbsterklärend benannt
    //Keine Redundanzen vorhanden
    //Methoden sind sehr einfach gehalten und beinhalten wenig Code mit wenig Aufgabe (KISS)
    //Nur wirklich notwendige Funktionen implementiert
    //Versionskontrollsystem eingesetzt
    //Code zur besseren Lesbarkeit nach bestimmten Regeln formatiert

}
