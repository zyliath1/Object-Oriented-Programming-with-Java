import  java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Takuukorjaus> takuukorjaukset = new ArrayList<>();

        while (true) {
            System.out.println("Anna laitteen tuotekoodi (0 = Lopettaa syötön): ");
            String tuotekoodi = scanner.nextLine();
            if (tuotekoodi.equals("0")) {
                break;
            }

            System.out.println("Anna ongelman kuvaus: ");
            String ongelma = scanner.nextLine();

            System.out.println("Anna ongelman ratkaisu (jos on): ");
            String ratkaisu = scanner.nextLine();

            System.out.println("Anna ongelman ratkaisun kustannnukset (€): ");
            double kustannukset = Double.parseDouble(scanner.nextLine());

            takuukorjaukset.add(new Takuukorjaus(tuotekoodi, ongelma, ratkaisu, kustannukset));

            // Testataan TakuuUtils-luokan toimintaa
            List<Takuukorjaus> haetutTakuukorjaukset = TakuuUtils.palautaTuotteenTakuuasiat(takuukorjaukset, tuotekoodi);
            for (Takuukorjaus korjaus : haetutTakuukorjaukset) {
                System.out.println(korjaus);
            }
        }
    }
}