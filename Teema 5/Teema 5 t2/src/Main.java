import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OmatJaYhteisetTilit tilit = new OmatJaYhteisetTilit();

        // Kysytään tietoja omalle tilille
        System.out.print("Anna oman tilin numero: ");
        String omaTilinumero = scanner.nextLine();
        System.out.print("Anna oman tilin omistaja: ");
        String omaOmistaja = scanner.nextLine();
        System.out.print("Anna oman tilin saldo: ");
        double omaSaldo = Double.parseDouble(scanner.nextLine());
        double omaKorko = kysyKorko(scanner, "Anna oman tilin korkoprosentti: ");

        tilit.omaTili = new Saastotili(omaTilinumero, omaOmistaja, omaSaldo, omaKorko);

        // Kysytään tietoja yhteiselle tilille
        System.out.print("Anna yhteisen tilin numero: ");
        String yhteinenTilinumero = scanner.nextLine();
        System.out.print("Anna yhteisen tilin omistaja: ");
        String yhteinenOmistaja = scanner.nextLine();
        System.out.print("Anna yhteisen tilin saldo: ");
        double yhteinenSaldo = Double.parseDouble(scanner.nextLine());
        double yhteinenKorko = kysyKorko(scanner, "Anna yhteisen tilin korkoprosentti: ");

        tilit.yhteinenTili = new SuperSaastoTili(yhteinenTilinumero, yhteinenOmistaja, yhteinenSaldo, yhteinenKorko);

        // Tulostetaan tilien tiedot
        tilit.omaTili.tulostaTilinTiedot();
        tilit.yhteinenTili.tulostaTilinTiedot();
    }

    // Kysyy käyttäjältä korkoprosentin ja palauttaa sen double-muodossa
    private static double kysyKorko(Scanner scanner, String viesti) {
        double korko;
        while (true) {
            try {
                System.out.print(viesti);
                korko = Double.parseDouble(scanner.nextLine());
                if (korko < 0) {
                    throw new ArithmeticException("Korkoprosentti ei voi olla negatiivinen");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Virheellinen syöte. Anna numero.");
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        }
        return korko;
    }
}
