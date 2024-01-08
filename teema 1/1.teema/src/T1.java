import java.util.Scanner;

public class T1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kysytään käyttäjältä osakkeen nimi
        System.out.print("Anna osake: ");
        String osake = input.nextLine();

        // Kysytään osinkoprosentti
        System.out.print("Anna osinkoprosentti: ");
        double osinkoprosentti = input.nextDouble();

        // Kysytään sijoitettava rahamäärä
        System.out.print("Anna sijoitus: ");
        int sijoitus = input.nextInt();

        // Lasketaan tuotto
        double tuotto = sijoitus * osinkoprosentti / 100;

        // Tulostetaan tulos
        System.out.printf("Osakkeen %s tuotto pääomalle %d on %.2f", osake, sijoitus, tuotto);
    }
}

