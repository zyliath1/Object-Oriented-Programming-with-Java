import java.util.ArrayList;
import java.util.Scanner;

// Pääohjelma, jossa käyttäjä voi lisätä osakkeita ja laskea niiden arvon
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Osake> osakkeet = new ArrayList<>();

        // Käyttäjän syöttämä osakkeiden lisäys
        while (true) {
            System.out.print("Lisätäänkö uusi osake (k/e)? ");
            String vastaus = scanner.nextLine();
            if (vastaus.equalsIgnoreCase("e")) {
                break;
            }

            System.out.print("Anna osakkeen nimi: ");
            String nimi = scanner.nextLine();

            System.out.print("Anna osakkeen ostohinta: ");
            double ostohinta = Double.parseDouble(scanner.nextLine());

            osakkeet.add(new Osake(nimi, ostohinta));
        }

        // Kysytään kasvuprosentti ja ajanjakson vuosien määrä
        System.out.print("Anna kasvuprosentti (esim. 0.05 vastaa 5%): ");
        double kasvuprosentti = Double.parseDouble(scanner.nextLine());

        System.out.print("Anna ajanjakson vuosien määrä: ");
        int vuodet = Integer.parseInt(scanner.nextLine());

        // Lasketaan ja tulostetaan kaikkien osakkeiden yhteisarvo
        double kokonaistuotto = 0;
        for (Osake osake : osakkeet) {
            kokonaistuotto += osake.tulostaArvo(kasvuprosentti, vuodet);
        }

        System.out.println("Kaikkien osakkeiden yhteisarvo " + vuodet + " vuoden jälkeen: " + kokonaistuotto);
    }
}