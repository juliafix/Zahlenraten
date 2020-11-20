public class Zufallszahl {

    private int zufallszahl;

    public Zufallszahl() {
        int maxZahl = 10;
        zufallszahl = (int) (Math.random() * maxZahl) + 1;
    }

    public int zahlenVergleich(int vergleichzahl) {
        if (vergleichzahl > zufallszahl) {
            return 1;
        } else if (vergleichzahl < zufallszahl) {
            return -1;
        } else {
            return 0;
        }
    }
}
