import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Asukas> asukkaat = new ArrayList<>();

        while (true) {
            System.out.print("Anna asunnon numero (0 = Lopettaa syötön): ");
            String asunnonNumero = scanner.nextLine();
            if (asunnonNumero.equals("0")) {
                break;
            }

            System.out.print("Anna asujan etunimi: ");
            String etunimi = scanner.nextLine();

            System.out.print("Anna asujan sukunimi: ");
            String sukunimi = scanner.nextLine();

            System.out.print("Anna asujan ikä kuluvana vuonna: ");
            int ika = Integer.parseInt(scanner.nextLine());

            asukkaat.add(new Asukas(etunimi, sukunimi, asunnonNumero, ika));
        }

        // Tulostetaan kaikki asukkaat
        System.out.println("\nAsujat:");
        for (Asukas asukas : asukkaat) {
            System.out.println(asukas);
        }

        // Tulostetaan asukkaiden keski-ikä
        double keskiika = AsuntoUtils.keskiIka(asukkaat);
        System.out.println("\nAsukkaiden keski-ikä: " + keskiika);
    }
}
