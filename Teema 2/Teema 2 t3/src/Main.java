import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Opiskelija> opiskelijat = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Anna nimi (tyhjä lopettaa): ");
            String nimi = sc.nextLine();
            if (nimi.isEmpty()) {
                break;
            }

            System.out.print("Anna viikkotehtävien tehtäväpisteet: ");
            int viikkotehtavapisteet = sc.nextInt();
            System.out.print("Anna kokeen pisteet: ");
            int koepisteet = sc.nextInt();
            sc.nextLine(); // Tyhjentää rivinvaihdon

            Opiskelija opiskelija = new Opiskelija(nimi);
            opiskelija.lisaaSuoritus(new Suoritus(viikkotehtavapisteet, koepisteet));
            opiskelijat.add(opiskelija);
        }

        for (Opiskelija opiskelija : opiskelijat) {
            System.out.println("Henkilö: " + opiskelija.getNimi());
            for (Suoritus suoritus : opiskelija.getSuoritukset()) {
                System.out.println("Viikkotehtävien pisteet: " + suoritus.getViikkotehtavapisteet() +
                        ", Kokeen pisteet: " + suoritus.getKoepisteet() +
                        ", Arvosana: " + suoritus.laskeArvosana());
            }
        }
    }
}