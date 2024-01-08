import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Anna etunimi: ");
        String etunimi = scanner.nextLine();

        System.out.print("Anna sukunimi: ");
        String sukunimi = scanner.nextLine();

        System.out.print("Anna opiskelijanumero: ");
        String opiskelijanumero = scanner.nextLine();

        System.out.print("Anna osoite: ");
        String osoite = scanner.nextLine();

        Opiskelija opiskelija = new Opiskelija(etunimi, sukunimi, opiskelijanumero, osoite);
        Opiskelija tarkastettuOpiskelija = OpiskelijaUtils.tarkastaTiedot(opiskelija);

        if (tarkastettuOpiskelija == null) {
            System.out.println("Virhe opiskelijan tiedoissa.");
        } else {
            System.out.println("Opiskelijan tiedot:");
            System.out.println("Etunimi: " + tarkastettuOpiskelija.getEtunimi());
            System.out.println("Sukunimi: " + tarkastettuOpiskelija.getSukunimi());
            System.out.println("Opiskelijanumero: " + tarkastettuOpiskelija.getOpiskelijanumero());
            System.out.println("Osoite: " + tarkastettuOpiskelija.getOsoite());
        }
    }
}
