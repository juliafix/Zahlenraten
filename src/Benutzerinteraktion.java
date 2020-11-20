import java.util.Scanner;

public class Benutzerinteraktion {

    private Scanner scanner = new Scanner(System.in);

    public void initaleAusgabe() {
        System.out.print("Gib eine Zahl zwischen 1 und 10 ein: ");
    }

    public int getBenutzereingabe() {
        return scanner.nextInt();
    }

    public void eingabeZuGross() {
        System.out.println("Diese Zahl ist zu groß.");
        System.out.print("Gib eine neue Zahl ein: ");
    }

    public void eingabeZuKlein() {
        System.out.println("Diese Zahl ist zu klein.");
        System.out.print("Gib eine neue Zahl ein: ");
    }

    public void richtigeZahl() {
        System.out.println("Glückwunsch! Das war die richtige Zahl");
    }
}
