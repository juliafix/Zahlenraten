import java.util.Scanner;

public class Zahlenraten {

    static Scanner scanner = new Scanner(System.in);
    static int zufallszahl;
    static int benutzereingabe;

    public static void main(String[] args) {

        setZufallszahl();
        setSystemausgabe();
        setBenutzereingabe();
        zahlenVergleich();
        scanner.close();

    }

    private static void zahlenVergleich() {

        while (benutzereingabe <= 10) {

            if (benutzereingabe > zufallszahl) {
                zahlZuGross();
            } else if (benutzereingabe < zufallszahl) {
                zahlZuKlein();
            } else {
                richtigeZahl();
                break;
            }
        }

    }

    private static void richtigeZahl() {

        System.out.println("Glückwunsch! Das war die richtige Zahl");

    }

    private static void zahlZuKlein() {

        System.out.println("Diese Zahl ist zu klein.");
        System.out.print("Gib eine neue Zahl ein: ");
        setBenutzereingabe();

    }

    private static void zahlZuGross() {

        System.out.println("Diese Zahl ist zu groß.");
        System.out.print("Gib eine neue Zahl ein: ");
        setBenutzereingabe();

    }

    private static void setZufallszahl() {

        int maxZahl = 10;
        zufallszahl = (int) (Math.random() * maxZahl) + 1;

    }

    private static void setSystemausgabe() {

        System.out.print("Gib eine Zahl zwischen 1 und 10 ein: ");

    }

    private static void setBenutzereingabe() {

       benutzereingabe = scanner.nextInt();

    }
}
