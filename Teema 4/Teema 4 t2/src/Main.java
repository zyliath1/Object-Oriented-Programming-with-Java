import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Luodaan Scanner-olio syötteen lukemista varten
        Scanner scanner = new Scanner(System.in);
        // Lista henkilöiden tallentamiseen
        List<Henkilo> henkilot = new ArrayList<>();

        // Pääsilmukka, joka pyörii kunnes käyttäjä päättää lopettaa
        while (true) {
            // Kysytään käyttäjältä, haluaako hän syöttää uuden henkilön
            System.out.print("Syötetäänkö uuden henkilön tiedot (k/e)? ");
            String vastaus = scanner.nextLine();
            if (!vastaus.equalsIgnoreCase("k")) {
                break; // Jos vastaus ei ole "k", silmukka lopetetaan
            }

            // Kysytään onko henkilö opiskelija vai henkilökuntaa
            System.out.print("Onko henkilö opiskelija vai henkilökuntaa (o/h)? ");
            String tyyppi = scanner.nextLine();

            // Yhteiset kysymykset kaikille henkilöille
            System.out.print("Nimi: ");
            String nimi = scanner.nextLine();
            System.out.print("Osoite: ");
            String osoite = scanner.nextLine();
            System.out.print("Syntymäaika: ");
            String syntymaaika = scanner.nextLine();

            // Jos henkilö on opiskelija, kysytään opiskelijakohtaiset tiedot
            if (tyyppi.equalsIgnoreCase("o")) {
                System.out.print("Opiskelijanumero: ");
                int opiskelijanumero = Integer.parseInt(scanner.nextLine());
                System.out.print("Aloituspaiva: ");
                String aloituspaiva = scanner.nextLine();
                henkilot.add(new Opiskelija(nimi, osoite, syntymaaika, opiskelijanumero, aloituspaiva));
            }
            // Jos henkilö on henkilökuntaa, kysytään henkilökuntakohtaiset tiedot
            else if (tyyppi.equalsIgnoreCase("h")) {
                System.out.print("Työntekijänumero: ");
                String tyontekijanumero = scanner.nextLine();
                System.out.print("Toimipaikka: ");
                String toimipaikka = scanner.nextLine();
                System.out.print("Titteli: ");
                String titteli = scanner.nextLine();
                henkilot.add(new Henkilokunta(nimi, osoite, syntymaaika, tyontekijanumero, toimipaikka, titteli));
            }
        }

        // Tulostetaan kaikki opiskelijat listalta
        System.out.println("\nOpiskelijat:");
        for (Henkilo henkilo : henkilot) {
            if (henkilo instanceof Opiskelija) {
                Opiskelija op = (Opiskelija) henkilo;
                op.tulostaOpiskelija();
            }
        }

        // Tulostetaan kaikki henkilökuntaan kuuluvat henkilöt listalta
        System.out.println("\nHenkilökunta:");
        for (Henkilo henkilo : henkilot) {
            if (henkilo instanceof Henkilokunta) {
                Henkilokunta hk = (Henkilokunta) henkilo;
                hk.tulostaHenkilokunta();
            }
        }
    }
}

