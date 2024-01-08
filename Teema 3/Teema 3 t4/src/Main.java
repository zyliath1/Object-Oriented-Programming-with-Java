import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<LeasingTieto> leasingTiedot = new ArrayList<>();

        while (true) {
            System.out.print("Lisätäänkö uusi tieto (k/e)? ");
            String vastaus = scanner.nextLine();
            if (vastaus.equalsIgnoreCase("e")) {
                break;
            }

            System.out.print("Anna tietokoneen merkki: ");
            String merkki = scanner.nextLine();
            System.out.print("Anna tietokoneen malli: ");
            String malli = scanner.nextLine();
            System.out.print("Anna tietokoneen sarjanumero: ");
            String sarjanumero = scanner.nextLine();
            Tietokone tietokone = new Tietokone(merkki, malli, sarjanumero);

            System.out.print("Anna käyttäjän nimi: ");
            String kayttajanNimi = scanner.nextLine();
            System.out.print("Anna käyttäjän osoite: ");
            String kayttajanOsoite = scanner.nextLine();
            Kayttaja kayttaja = new Kayttaja(kayttajanNimi, kayttajanOsoite);

            LeasingTieto leasingTieto = new LeasingTieto(tietokone, kayttaja, LocalDate.now());
            leasingTiedot.add(leasingTieto);

            // Kopioidaan tiedot uuteen LeasingTieto-olioon, jos käyttäjä haluaa lisätä uuden
            if (vastaus.equalsIgnoreCase("k")) {
                LeasingTieto uusiLeasing = LeasingUtils.kopioiTiedot(leasingTieto);
                System.out.print("Anna uuden tietokoneen sarjanumero: ");
                uusiLeasing.getTietokone().setSarjanumero(scanner.nextLine());
                System.out.print("Anna uuden käyttäjän nimi: ");
                uusiLeasing.getKayttaja().setNimi(scanner.nextLine());
                System.out.print("Anna uuden käyttäjän osoite: ");
                uusiLeasing.getKayttaja().setOsoite(scanner.nextLine());
                leasingTiedot.add(uusiLeasing);
            }
        }

        // Tulostetaan kaikki LeasingTiedot
        for (LeasingTieto tieto : leasingTiedot) {
            System.out.println("\nLeasingTieto:");
            System.out.println(tieto);
        }
    }
}
