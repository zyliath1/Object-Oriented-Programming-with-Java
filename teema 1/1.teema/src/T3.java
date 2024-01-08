import java.util.Scanner;

public class T3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double kokonaistulot = 0;
        double suurinTulo = 0;
        int kuukausienMaara = 0;

        System.out.println("Syötä kuukausikohtaiset tulot.");

        while (true) {
            System.out.printf("Anna %d. kuukauden tulo: ", kuukausienMaara + 1);
            double tulo = input.nextDouble();

            if (tulo < 0) {
                break;
            }

            kokonaistulot += tulo;
            suurinTulo = Math.max(suurinTulo, tulo);
            kuukausienMaara++;
        }

        if (kuukausienMaara > 0) {
            double keskiarvo = kokonaistulot / kuukausienMaara;
            System.out.println("\nKokonaistulot ovat " + kokonaistulot);
            System.out.println("Keskiarvoinen kuukausikohtainen tulo on " + keskiarvo);
            System.out.println("Suurin kuukausikohtainen tulo on " + suurinTulo);
        } else {
            System.out.println("Ei syötettyjä tuloja.");
        }
    }
}
