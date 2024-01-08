import java.util.Scanner;

public class T2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kysytään käyttäjältä suorakaiteen mitat ja piirtomerkki
        System.out.print("Anna korkeus: ");
        int korkeus = input.nextInt();
        System.out.print("Anna leveys: ");
        int leveys = input.nextInt();
        System.out.print("Anna piirtomerkki: ");
        input.nextLine(); // Tyhjennetään rivinvaihto
        char merkki = input.nextLine().charAt(0);
        System.out.print("Täytetty vai ei (k=kyllä, e=ei): ");
        char taytetty = input.nextLine().charAt(0);

        // Piirretään suorakaide
        for (int i = 0; i < korkeus; i++) {
            for (int j = 0; j < leveys; j++) {
                // Tarkistetaan, piirretäänkö reuna vai sisältö
                if (taytetty == 'k' || i == 0 || i == korkeus - 1 || j == 0 || j == leveys - 1) {
                    System.out.print(merkki);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

